// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromPrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public RemoveSourcesFromPrometheusGlobalViewResponseBodyData data;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSourcesFromPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromPrometheusGlobalViewResponseBody self = new RemoveSourcesFromPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setData(RemoveSourcesFromPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveSourcesFromPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveSourcesFromPrometheusGlobalViewResponseBodyData extends TeaModel {
        /**
         * <p>The Info-level information.</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <br>
         * <p>*   `true`: The call was successful.</p>
         * <p>*   `false`: The call failed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RemoveSourcesFromPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveSourcesFromPrometheusGlobalViewResponseBodyData self = new RemoveSourcesFromPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveSourcesFromPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public RemoveSourcesFromPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public RemoveSourcesFromPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
