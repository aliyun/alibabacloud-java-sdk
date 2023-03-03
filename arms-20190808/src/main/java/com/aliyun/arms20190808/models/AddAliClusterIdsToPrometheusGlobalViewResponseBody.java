// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddAliClusterIdsToPrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public AddAliClusterIdsToPrometheusGlobalViewResponseBodyData data;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAliClusterIdsToPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAliClusterIdsToPrometheusGlobalViewResponseBody self = new AddAliClusterIdsToPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAliClusterIdsToPrometheusGlobalViewResponseBody setData(AddAliClusterIdsToPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddAliClusterIdsToPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public AddAliClusterIdsToPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddAliClusterIdsToPrometheusGlobalViewResponseBodyData extends TeaModel {
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
         * <p>Indicates whether the request was successful.</p>
         * <br>
         * <p>*   `true`: The request was successful.</p>
         * <p>*   `false`: The request failed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AddAliClusterIdsToPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddAliClusterIdsToPrometheusGlobalViewResponseBodyData self = new AddAliClusterIdsToPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddAliClusterIdsToPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public AddAliClusterIdsToPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddAliClusterIdsToPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
