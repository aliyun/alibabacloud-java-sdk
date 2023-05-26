// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewByAliClusterIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusGlobalViewByAliClusterIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewByAliClusterIdsResponseBody self = new AddPrometheusGlobalViewByAliClusterIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setData(AddPrometheusGlobalViewByAliClusterIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData getData() {
        return this.data;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrometheusGlobalViewByAliClusterIdsResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static AddPrometheusGlobalViewByAliClusterIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewByAliClusterIdsResponseBodyData self = new AddPrometheusGlobalViewByAliClusterIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
