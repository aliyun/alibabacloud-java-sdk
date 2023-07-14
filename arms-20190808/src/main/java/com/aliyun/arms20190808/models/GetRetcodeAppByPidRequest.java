// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeAppByPidRequest extends TeaModel {
    /**
     * <p>The PID of the application. To obtain the PID of the application, perform the following steps: Log on to the Application Real-Time Monitoring Service (ARMS) console. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of the application. The URL in the address bar contains the PID of the application. The PID is in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with the at sign (@) to obtain xxx@74xxx.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetRetcodeAppByPidRequestTags> tags;

    public static GetRetcodeAppByPidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeAppByPidRequest self = new GetRetcodeAppByPidRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeAppByPidRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRetcodeAppByPidRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRetcodeAppByPidRequest setTags(java.util.List<GetRetcodeAppByPidRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetRetcodeAppByPidRequestTags> getTags() {
        return this.tags;
    }

    public static class GetRetcodeAppByPidRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRetcodeAppByPidRequestTags build(java.util.Map<String, ?> map) throws Exception {
            GetRetcodeAppByPidRequestTags self = new GetRetcodeAppByPidRequestTags();
            return TeaModel.build(map, self);
        }

        public GetRetcodeAppByPidRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRetcodeAppByPidRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
