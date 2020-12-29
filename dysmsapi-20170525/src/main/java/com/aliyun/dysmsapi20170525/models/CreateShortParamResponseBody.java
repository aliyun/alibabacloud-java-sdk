// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateShortParamResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateShortParamResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static CreateShortParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateShortParamResponseBody self = new CreateShortParamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateShortParamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateShortParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateShortParamResponseBody setData(CreateShortParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateShortParamResponseBodyData getData() {
        return this.data;
    }

    public CreateShortParamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateShortParamResponseBodyData extends TeaModel {
        @NameInMap("PhoneNumbers")
        public String phoneNumbers;

        @NameInMap("ShortParam")
        public String shortParam;

        @NameInMap("ParamDetail")
        public String paramDetail;

        public static CreateShortParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateShortParamResponseBodyData self = new CreateShortParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateShortParamResponseBodyData setPhoneNumbers(String phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public String getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public CreateShortParamResponseBodyData setShortParam(String shortParam) {
            this.shortParam = shortParam;
            return this;
        }
        public String getShortParam() {
            return this.shortParam;
        }

        public CreateShortParamResponseBodyData setParamDetail(String paramDetail) {
            this.paramDetail = paramDetail;
            return this;
        }
        public String getParamDetail() {
            return this.paramDetail;
        }

    }

}
