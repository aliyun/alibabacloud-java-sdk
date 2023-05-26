// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public RemoveSourcesFromPrometheusGlobalViewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSourcesFromPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromPrometheusGlobalViewResponseBody self = new RemoveSourcesFromPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setData(RemoveSourcesFromPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveSourcesFromPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveSourcesFromPrometheusGlobalViewResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Msg")
        public String msg;

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
