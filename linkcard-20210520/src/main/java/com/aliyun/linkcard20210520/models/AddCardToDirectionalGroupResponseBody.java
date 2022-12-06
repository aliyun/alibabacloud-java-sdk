// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddCardToDirectionalGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddCardToDirectionalGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddCardToDirectionalGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCardToDirectionalGroupResponseBody self = new AddCardToDirectionalGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCardToDirectionalGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddCardToDirectionalGroupResponseBody setData(AddCardToDirectionalGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddCardToDirectionalGroupResponseBodyData getData() {
        return this.data;
    }

    public AddCardToDirectionalGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddCardToDirectionalGroupResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public AddCardToDirectionalGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCardToDirectionalGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddCardToDirectionalGroupResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        @NameInMap("SerialNo")
        public String serialNo;

        public static AddCardToDirectionalGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddCardToDirectionalGroupResponseBodyData self = new AddCardToDirectionalGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddCardToDirectionalGroupResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

        public AddCardToDirectionalGroupResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

    }

}
