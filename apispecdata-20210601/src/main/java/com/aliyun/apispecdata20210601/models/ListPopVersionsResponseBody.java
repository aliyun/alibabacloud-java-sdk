// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListPopVersionsResponseBody extends TeaModel {
    // page number
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // page size
    @NameInMap("PageSize")
    public Integer pageSize;

    // 数组，返回示例目录。
    @NameInMap("PopVersions")
    public java.util.List<ListPopVersionsResponseBodyPopVersions> popVersions;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPopVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPopVersionsResponseBody self = new ListPopVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPopVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPopVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPopVersionsResponseBody setPopVersions(java.util.List<ListPopVersionsResponseBodyPopVersions> popVersions) {
        this.popVersions = popVersions;
        return this;
    }
    public java.util.List<ListPopVersionsResponseBodyPopVersions> getPopVersions() {
        return this.popVersions;
    }

    public ListPopVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPopVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPopVersionsResponseBodyPopVersionsDefaultErrorCode extends TeaModel {
        // 错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 错误消息
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // HTTP状态码
        @NameInMap("HttpStatusCode")
        public Integer httpStatusCode;

        public static ListPopVersionsResponseBodyPopVersionsDefaultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListPopVersionsResponseBodyPopVersionsDefaultErrorCode self = new ListPopVersionsResponseBodyPopVersionsDefaultErrorCode();
            return TeaModel.build(map, self);
        }

        public ListPopVersionsResponseBodyPopVersionsDefaultErrorCode setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListPopVersionsResponseBodyPopVersionsDefaultErrorCode setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListPopVersionsResponseBodyPopVersionsDefaultErrorCode setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

    }

    public static class ListPopVersionsResponseBodyPopVersionsErrorCodes extends TeaModel {
        // 后端错误码
        @NameInMap("Code")
        public String code;

        // 错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 错误消息
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // HTTP状态码
        @NameInMap("HttpStatusCode")
        public Integer httpStatusCode;

        public static ListPopVersionsResponseBodyPopVersionsErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListPopVersionsResponseBodyPopVersionsErrorCodes self = new ListPopVersionsResponseBodyPopVersionsErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListPopVersionsResponseBodyPopVersionsErrorCodes setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListPopVersionsResponseBodyPopVersionsErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListPopVersionsResponseBodyPopVersionsErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListPopVersionsResponseBodyPopVersionsErrorCodes setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

    }

    public static class ListPopVersionsResponseBodyPopVersions extends TeaModel {
        // API风格
        @NameInMap("ApiStyle")
        public String apiStyle;

        // 后端错误码名称
        @NameInMap("CodeField")
        public String codeField;

        // 默认错误码
        @NameInMap("DefaultErrorCode")
        public ListPopVersionsResponseBodyPopVersionsDefaultErrorCode defaultErrorCode;

        // 后端动态错误码名称
        @NameInMap("DynamicCodeField")
        public String dynamicCodeField;

        // 后端动态错误信息
        @NameInMap("DynamicMessageField")
        public String dynamicMessageField;

        // 错误码列表
        @NameInMap("ErrorCodes")
        public java.util.List<ListPopVersionsResponseBodyPopVersionsErrorCodes> errorCodes;

        // 错误判断条件
        @NameInMap("ErrorExpression")
        public String errorExpression;

        // 后端错误信息名称
        @NameInMap("ErrorMessageField")
        public String errorMessageField;

        // 后端httpcode名称
        @NameInMap("HttpStatusCodeField")
        public String httpStatusCodeField;

        // 安全隔离类型
        @NameInMap("IsolationType")
        public String isolationType;

        // 最后修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // POP产品名称
        @NameInMap("PopProduct")
        public String popProduct;

        // POP版本名称
        @NameInMap("PopVersion")
        public String popVersion;

        public static ListPopVersionsResponseBodyPopVersions build(java.util.Map<String, ?> map) throws Exception {
            ListPopVersionsResponseBodyPopVersions self = new ListPopVersionsResponseBodyPopVersions();
            return TeaModel.build(map, self);
        }

        public ListPopVersionsResponseBodyPopVersions setApiStyle(String apiStyle) {
            this.apiStyle = apiStyle;
            return this;
        }
        public String getApiStyle() {
            return this.apiStyle;
        }

        public ListPopVersionsResponseBodyPopVersions setCodeField(String codeField) {
            this.codeField = codeField;
            return this;
        }
        public String getCodeField() {
            return this.codeField;
        }

        public ListPopVersionsResponseBodyPopVersions setDefaultErrorCode(ListPopVersionsResponseBodyPopVersionsDefaultErrorCode defaultErrorCode) {
            this.defaultErrorCode = defaultErrorCode;
            return this;
        }
        public ListPopVersionsResponseBodyPopVersionsDefaultErrorCode getDefaultErrorCode() {
            return this.defaultErrorCode;
        }

        public ListPopVersionsResponseBodyPopVersions setDynamicCodeField(String dynamicCodeField) {
            this.dynamicCodeField = dynamicCodeField;
            return this;
        }
        public String getDynamicCodeField() {
            return this.dynamicCodeField;
        }

        public ListPopVersionsResponseBodyPopVersions setDynamicMessageField(String dynamicMessageField) {
            this.dynamicMessageField = dynamicMessageField;
            return this;
        }
        public String getDynamicMessageField() {
            return this.dynamicMessageField;
        }

        public ListPopVersionsResponseBodyPopVersions setErrorCodes(java.util.List<ListPopVersionsResponseBodyPopVersionsErrorCodes> errorCodes) {
            this.errorCodes = errorCodes;
            return this;
        }
        public java.util.List<ListPopVersionsResponseBodyPopVersionsErrorCodes> getErrorCodes() {
            return this.errorCodes;
        }

        public ListPopVersionsResponseBodyPopVersions setErrorExpression(String errorExpression) {
            this.errorExpression = errorExpression;
            return this;
        }
        public String getErrorExpression() {
            return this.errorExpression;
        }

        public ListPopVersionsResponseBodyPopVersions setErrorMessageField(String errorMessageField) {
            this.errorMessageField = errorMessageField;
            return this;
        }
        public String getErrorMessageField() {
            return this.errorMessageField;
        }

        public ListPopVersionsResponseBodyPopVersions setHttpStatusCodeField(String httpStatusCodeField) {
            this.httpStatusCodeField = httpStatusCodeField;
            return this;
        }
        public String getHttpStatusCodeField() {
            return this.httpStatusCodeField;
        }

        public ListPopVersionsResponseBodyPopVersions setIsolationType(String isolationType) {
            this.isolationType = isolationType;
            return this;
        }
        public String getIsolationType() {
            return this.isolationType;
        }

        public ListPopVersionsResponseBodyPopVersions setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPopVersionsResponseBodyPopVersions setPopProduct(String popProduct) {
            this.popProduct = popProduct;
            return this;
        }
        public String getPopProduct() {
            return this.popProduct;
        }

        public ListPopVersionsResponseBodyPopVersions setPopVersion(String popVersion) {
            this.popVersion = popVersion;
            return this;
        }
        public String getPopVersion() {
            return this.popVersion;
        }

    }

}
