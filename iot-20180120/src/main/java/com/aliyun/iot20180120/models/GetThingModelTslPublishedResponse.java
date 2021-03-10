// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslPublishedResponse extends TeaModel {
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
    public GetThingModelTslPublishedResponseData data;

    public static GetThingModelTslPublishedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslPublishedResponse self = new GetThingModelTslPublishedResponse();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslPublishedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingModelTslPublishedResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetThingModelTslPublishedResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingModelTslPublishedResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingModelTslPublishedResponse setData(GetThingModelTslPublishedResponseData data) {
        this.data = data;
        return this;
    }
    public GetThingModelTslPublishedResponseData getData() {
        return this.data;
    }

    public static class GetThingModelTslPublishedResponseData extends TeaModel {
        @NameInMap("TslStr")
        @Validation(required = true)
        public String tslStr;

        @NameInMap("TslUri")
        @Validation(required = true)
        public String tslUri;

        public static GetThingModelTslPublishedResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetThingModelTslPublishedResponseData self = new GetThingModelTslPublishedResponseData();
            return TeaModel.build(map, self);
        }

        public GetThingModelTslPublishedResponseData setTslStr(String tslStr) {
            this.tslStr = tslStr;
            return this;
        }
        public String getTslStr() {
            return this.tslStr;
        }

        public GetThingModelTslPublishedResponseData setTslUri(String tslUri) {
            this.tslUri = tslUri;
            return this;
        }
        public String getTslUri() {
            return this.tslUri;
        }

    }

}
