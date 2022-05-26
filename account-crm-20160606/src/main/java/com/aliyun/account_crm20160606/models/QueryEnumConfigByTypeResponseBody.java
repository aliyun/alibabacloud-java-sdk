// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEnumConfigByTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEnumConfigByTypeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEnumConfigByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnumConfigByTypeResponseBody self = new QueryEnumConfigByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnumConfigByTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEnumConfigByTypeResponseBody setData(QueryEnumConfigByTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEnumConfigByTypeResponseBodyData getData() {
        return this.data;
    }

    public QueryEnumConfigByTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEnumConfigByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnumConfigByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnumConfigByTypeResponseBodyDataEnumConfig extends TeaModel {
        @NameInMap("enumName")
        public String enumName;

        @NameInMap("enumValue")
        public String enumValue;

        public static QueryEnumConfigByTypeResponseBodyDataEnumConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEnumConfigByTypeResponseBodyDataEnumConfig self = new QueryEnumConfigByTypeResponseBodyDataEnumConfig();
            return TeaModel.build(map, self);
        }

        public QueryEnumConfigByTypeResponseBodyDataEnumConfig setEnumName(String enumName) {
            this.enumName = enumName;
            return this;
        }
        public String getEnumName() {
            return this.enumName;
        }

        public QueryEnumConfigByTypeResponseBodyDataEnumConfig setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class QueryEnumConfigByTypeResponseBodyData extends TeaModel {
        @NameInMap("EnumConfig")
        public java.util.List<QueryEnumConfigByTypeResponseBodyDataEnumConfig> enumConfig;

        public static QueryEnumConfigByTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEnumConfigByTypeResponseBodyData self = new QueryEnumConfigByTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEnumConfigByTypeResponseBodyData setEnumConfig(java.util.List<QueryEnumConfigByTypeResponseBodyDataEnumConfig> enumConfig) {
            this.enumConfig = enumConfig;
            return this;
        }
        public java.util.List<QueryEnumConfigByTypeResponseBodyDataEnumConfig> getEnumConfig() {
            return this.enumConfig;
        }

    }

}
