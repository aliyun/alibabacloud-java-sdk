// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetThingModelTslResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetThingModelTslResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslResponseBody self = new GetThingModelTslResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingModelTslResponseBody setData(GetThingModelTslResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThingModelTslResponseBodyData getData() {
        return this.data;
    }

    public GetThingModelTslResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingModelTslResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingModelTslResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingModelTslResponseBodyData extends TeaModel {
        @NameInMap("TslStr")
        public String tslStr;

        @NameInMap("TslUri")
        public String tslUri;

        public static GetThingModelTslResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingModelTslResponseBodyData self = new GetThingModelTslResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingModelTslResponseBodyData setTslStr(String tslStr) {
            this.tslStr = tslStr;
            return this;
        }
        public String getTslStr() {
            return this.tslStr;
        }

        public GetThingModelTslResponseBodyData setTslUri(String tslUri) {
            this.tslUri = tslUri;
            return this;
        }
        public String getTslUri() {
            return this.tslUri;
        }

    }

}
