// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAppConfigResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public AddAppConfigResponseBodyData data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAppConfigResponseBody self = new AddAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAppConfigResponseBody setData(AddAppConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddAppConfigResponseBodyData getData() {
        return this.data;
    }

    public AddAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddAppConfigResponseBodyData extends TeaModel {
        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_pro_agent_01</p>
         */
        @NameInMap("AppId")
        public String appId;

        public static AddAppConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddAppConfigResponseBodyData self = new AddAppConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddAppConfigResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
