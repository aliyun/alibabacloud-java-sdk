// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerCategoryDictionaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomerCategoryDictionaryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerCategoryDictionaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerCategoryDictionaryResponseBody self = new GetCustomerCategoryDictionaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerCategoryDictionaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerCategoryDictionaryResponseBody setData(GetCustomerCategoryDictionaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerCategoryDictionaryResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerCategoryDictionaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerCategoryDictionaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerCategoryDictionaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerCategoryDictionaryResponseBodyDataEnumConfig extends TeaModel {
        @NameInMap("enumName")
        public String enumName;

        @NameInMap("enumValue")
        public String enumValue;

        public static GetCustomerCategoryDictionaryResponseBodyDataEnumConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerCategoryDictionaryResponseBodyDataEnumConfig self = new GetCustomerCategoryDictionaryResponseBodyDataEnumConfig();
            return TeaModel.build(map, self);
        }

        public GetCustomerCategoryDictionaryResponseBodyDataEnumConfig setEnumName(String enumName) {
            this.enumName = enumName;
            return this;
        }
        public String getEnumName() {
            return this.enumName;
        }

        public GetCustomerCategoryDictionaryResponseBodyDataEnumConfig setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class GetCustomerCategoryDictionaryResponseBodyData extends TeaModel {
        @NameInMap("EnumConfig")
        public java.util.List<GetCustomerCategoryDictionaryResponseBodyDataEnumConfig> enumConfig;

        public static GetCustomerCategoryDictionaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerCategoryDictionaryResponseBodyData self = new GetCustomerCategoryDictionaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerCategoryDictionaryResponseBodyData setEnumConfig(java.util.List<GetCustomerCategoryDictionaryResponseBodyDataEnumConfig> enumConfig) {
            this.enumConfig = enumConfig;
            return this;
        }
        public java.util.List<GetCustomerCategoryDictionaryResponseBodyDataEnumConfig> getEnumConfig() {
            return this.enumConfig;
        }

    }

}
