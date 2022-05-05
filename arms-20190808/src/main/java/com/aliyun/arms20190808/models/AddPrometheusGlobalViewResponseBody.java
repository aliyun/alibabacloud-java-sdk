// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddPrometheusGlobalViewResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewResponseBody self = new AddPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewResponseBody setData(AddPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public AddPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrometheusGlobalViewResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static AddPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewResponseBodyData self = new AddPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public AddPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
