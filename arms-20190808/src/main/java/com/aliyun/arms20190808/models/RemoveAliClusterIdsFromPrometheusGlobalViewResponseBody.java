// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("Data")
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData data;

    // The ID of the request. You can use the ID to query logs and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody self = new RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody setData(RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData extends TeaModel {
        // The Info-level information.
        @NameInMap("Info")
        public String info;

        // The additional information.
        @NameInMap("Msg")
        public String msg;

        // Indicates whether the call was successful. Valid values:
        // 
        // *   `true`: The call was successful.
        // *   `false`: The call failed.
        @NameInMap("Success")
        public Boolean success;

        public static RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData self = new RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
