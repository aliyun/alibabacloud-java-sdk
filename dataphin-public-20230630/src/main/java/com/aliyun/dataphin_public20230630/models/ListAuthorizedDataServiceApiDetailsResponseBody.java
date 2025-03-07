// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAuthorizedDataServiceApiDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>非法入参</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListAuthorizedDataServiceApiDetailsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ListAuthorizedDataServiceApiDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDataServiceApiDetailsResponseBody self = new ListAuthorizedDataServiceApiDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDataServiceApiDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizedDataServiceApiDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAuthorizedDataServiceApiDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizedDataServiceApiDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedDataServiceApiDetailsResponseBody setResult(ListAuthorizedDataServiceApiDetailsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAuthorizedDataServiceApiDetailsResponseBodyResult getResult() {
        return this.result;
    }

    public ListAuthorizedDataServiceApiDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example1</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAuthorized")
        public Integer isAuthorized;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <strong>example:</strong>
         * <p>description1</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters self = new ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters setIsAuthorized(Integer isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Integer getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example1</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAuthorized")
        public Integer isAuthorized;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <strong>example:</strong>
         * <p>description1</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters self = new ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters setIsAuthorized(Integer isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Integer getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListAuthorizedDataServiceApiDetailsResponseBodyResultData extends TeaModel {
        /**
         * <p>API_ID</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>GetData</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <strong>example:</strong>
         * <p>使用权限</p>
         */
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("AuthorizedDevReturnParameters")
        public java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters> authorizedDevReturnParameters;

        @NameInMap("AuthorizedProdReturnParameters")
        public java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters> authorizedProdReturnParameters;

        /**
         * <strong>example:</strong>
         * <p>Description1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2035-12-31</p>
         */
        @NameInMap("DevAuthPeriod")
        public String devAuthPeriod;

        /**
         * <strong>example:</strong>
         * <p>2035-12-31</p>
         */
        @NameInMap("ProdAuthPeriod")
        public String prodAuthPeriod;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ListAuthorizedDataServiceApiDetailsResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDataServiceApiDetailsResponseBodyResultData self = new ListAuthorizedDataServiceApiDetailsResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setAuthorizedDevReturnParameters(java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters> authorizedDevReturnParameters) {
            this.authorizedDevReturnParameters = authorizedDevReturnParameters;
            return this;
        }
        public java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedDevReturnParameters> getAuthorizedDevReturnParameters() {
            return this.authorizedDevReturnParameters;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setAuthorizedProdReturnParameters(java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters> authorizedProdReturnParameters) {
            this.authorizedProdReturnParameters = authorizedProdReturnParameters;
            return this;
        }
        public java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultDataAuthorizedProdReturnParameters> getAuthorizedProdReturnParameters() {
            return this.authorizedProdReturnParameters;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setDevAuthPeriod(String devAuthPeriod) {
            this.devAuthPeriod = devAuthPeriod;
            return this;
        }
        public String getDevAuthPeriod() {
            return this.devAuthPeriod;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setProdAuthPeriod(String prodAuthPeriod) {
            this.prodAuthPeriod = prodAuthPeriod;
            return this;
        }
        public String getProdAuthPeriod() {
            return this.prodAuthPeriod;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResultData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListAuthorizedDataServiceApiDetailsResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultData> data;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAuthorizedDataServiceApiDetailsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDataServiceApiDetailsResponseBodyResult self = new ListAuthorizedDataServiceApiDetailsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResult setData(java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAuthorizedDataServiceApiDetailsResponseBodyResultData> getData() {
            return this.data;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBodyResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
