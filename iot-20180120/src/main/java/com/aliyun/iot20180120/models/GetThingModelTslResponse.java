// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetThingModelTslResponseData data;

    public static GetThingModelTslResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslResponse self = new GetThingModelTslResponse();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingModelTslResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetThingModelTslResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingModelTslResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingModelTslResponse setData(GetThingModelTslResponseData data) {
        this.data = data;
        return this;
    }
    public GetThingModelTslResponseData getData() {
        return this.data;
    }

    public static class GetThingModelTslResponseData extends TeaModel {
        @NameInMap("TslStr")
        @Validation(required = true)
        public String tslStr;

        @NameInMap("TslUri")
        @Validation(required = true)
        public String tslUri;

        public static GetThingModelTslResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetThingModelTslResponseData self = new GetThingModelTslResponseData();
            return TeaModel.build(map, self);
        }

        public GetThingModelTslResponseData setTslStr(String tslStr) {
            this.tslStr = tslStr;
            return this;
        }
        public String getTslStr() {
            return this.tslStr;
        }

        public GetThingModelTslResponseData setTslUri(String tslUri) {
            this.tslUri = tslUri;
            return this;
        }
        public String getTslUri() {
            return this.tslUri;
        }

    }

}
