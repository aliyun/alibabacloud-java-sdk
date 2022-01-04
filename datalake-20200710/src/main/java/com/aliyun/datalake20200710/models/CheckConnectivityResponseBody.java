// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckConnectivityResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckConnectivityResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityResponseBody self = new CheckConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityResponseBody setData(CheckConnectivityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckConnectivityResponseBodyData getData() {
        return this.data;
    }

    public CheckConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConnectivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckConnectivityResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("IsValid")
        public Boolean isValid;

        @NameInMap("Msg")
        public String msg;

        public static CheckConnectivityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckConnectivityResponseBodyData self = new CheckConnectivityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckConnectivityResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CheckConnectivityResponseBodyData setIsValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        public Boolean getIsValid() {
            return this.isValid;
        }

        public CheckConnectivityResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

}
