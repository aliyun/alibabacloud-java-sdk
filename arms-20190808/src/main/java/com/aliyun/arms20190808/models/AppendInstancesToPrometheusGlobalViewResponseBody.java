// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AppendInstancesToPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Data")
    public AppendInstancesToPrometheusGlobalViewResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AppendInstancesToPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppendInstancesToPrometheusGlobalViewResponseBody self = new AppendInstancesToPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public AppendInstancesToPrometheusGlobalViewResponseBody setData(AppendInstancesToPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppendInstancesToPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public AppendInstancesToPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppendInstancesToPrometheusGlobalViewResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static AppendInstancesToPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppendInstancesToPrometheusGlobalViewResponseBodyData self = new AppendInstancesToPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppendInstancesToPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public AppendInstancesToPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AppendInstancesToPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
