// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddAliClusterIdsToPrometheusGlobalViewResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("Data")
    public AddAliClusterIdsToPrometheusGlobalViewResponseBodyData data;

    // The ID of the request. You can use the ID to query logs and troubleshoot issues.
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
        // The Info-level information.
        @NameInMap("Info")
        public String info;

        // The additional information.
        @NameInMap("Msg")
        public String msg;

        // Indicates whether the data sources are added.
        // 
        // *   `true`: yes
        // *   `false`: no
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
