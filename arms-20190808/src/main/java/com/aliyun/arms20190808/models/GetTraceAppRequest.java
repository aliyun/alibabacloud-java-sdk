// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppRequest extends TeaModel {
    /**
     * <p>The process identifier (PID) of the application. For more information about how to obtain the PID, see <a href="https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr">Obtain the PID of an application</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b590lhguqs@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetTraceAppRequestTags> tags;

    public static GetTraceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppRequest self = new GetTraceAppRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetTraceAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTraceAppRequest setTags(java.util.List<GetTraceAppRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetTraceAppRequestTags> getTags() {
        return this.tags;
    }

    public static class GetTraceAppRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTraceAppRequestTags build(java.util.Map<String, ?> map) throws Exception {
            GetTraceAppRequestTags self = new GetTraceAppRequestTags();
            return TeaModel.build(map, self);
        }

        public GetTraceAppRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceAppRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
