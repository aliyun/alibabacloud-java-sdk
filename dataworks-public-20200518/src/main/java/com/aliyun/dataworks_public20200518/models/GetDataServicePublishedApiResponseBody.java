// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServicePublishedApiResponseBody extends TeaModel {
    /**
     * <p>The latest information about the API in the published state.</p>
     */
    @NameInMap("Data")
    public GetDataServicePublishedApiResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServicePublishedApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServicePublishedApiResponseBody self = new GetDataServicePublishedApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServicePublishedApiResponseBody setData(GetDataServicePublishedApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServicePublishedApiResponseBodyData getData() {
        return this.data;
    }

    public GetDataServicePublishedApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServicePublishedApiResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServicePublishedApiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServicePublishedApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServicePublishedApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The solution used to fix the error.</p>
         * 
         * <strong>example:</strong>
         * <p>retry</p>
         */
        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes self = new GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>default1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>example1</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type of the parameter. Valid values:</p>
         * <ul>
         * <li>0: String</li>
         * <li>1: Int</li>
         * <li>2: Long</li>
         * <li>3: Float</li>
         * <li>4: Double</li>
         * <li>5: Boolean</li>
         * <li>6: StringList</li>
         * <li>7: IntList</li>
         * <li>8: LongList</li>
         * <li>9: FloatList</li>
         * <li>10: DoubleList</li>
         * <li>11: BooleanList</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description1</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates the Equal operator. The value 1 indicates the Like operator. The value 2 indicates the Const operator. The value 3 indicates the In operator. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the parameter is in the URL path of the request. The value 1 indicates that the parameter is in the Query parameter of the request URL. The value 2 indicates that the parameter is in the request header. The value 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters self = new GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataRegistrationDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: false}</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>The error codes returned for the API generated by registration.</p>
         */
        @NameInMap("RegistrationErrorCodes")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        /**
         * <p>The request parameters of the API generated by registration.</p>
         */
        @NameInMap("RegistrationRequestParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        /**
         * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceContentType")
        public Integer serviceContentType;

        /**
         * <p>The URL of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com">http://example.aliyundoc.com</a></p>
         */
        @NameInMap("ServiceHost")
        public String serviceHost;

        /**
         * <p>The path of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>/index</p>
         */
        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The description of the request body initiated to call the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;abc&quot;:1}</p>
         */
        @NameInMap("ServiceRequestBodyDescription")
        public String serviceRequestBodyDescription;

        /**
         * <p>The sample success response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: true}</p>
         */
        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        public static GetDataServicePublishedApiResponseBodyDataRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataRegistrationDetails self = new GetDataServicePublishedApiResponseBodyDataRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setRegistrationErrorCodes(java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setRegistrationRequestParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection extends TeaModel {
        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The name of the table in the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>fail to call</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The solution used to fix the error.</p>
         * 
         * <strong>example:</strong>
         * <p>retry</p>
         */
        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>default1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>example1</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type of the parameter. Valid values:</p>
         * <ul>
         * <li>0: String</li>
         * <li>1: Int</li>
         * <li>2: Long</li>
         * <li>3: Float</li>
         * <li>4: Double</li>
         * <li>5: Boolean</li>
         * <li>6: StringList</li>
         * <li>7: IntList</li>
         * <li>8: LongList</li>
         * <li>9: FloatList</li>
         * <li>10: DoubleList</li>
         * <li>11: BooleanList</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description1</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The operator used for the value of the parameter. Valid values:</p>
         * <ul>
         * <li>0: Equal</li>
         * <li>1: Like</li>
         * <li>2: Const</li>
         * <li>3: In</li>
         * </ul>
         * <p>APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values:</p>
         * <ul>
         * <li>0: indicates that the parameter is in the URL path of the request.</li>
         * <li>1: indicates that the parameter is in the Query parameter of the request URL.</li>
         * <li>2: indicates that the parameter is in the request header.</li>
         * <li>3: indicates that the parameter is in the request body.</li>
         * </ul>
         * <p>APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters extends TeaModel {
        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>example2</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The data type of the parameter. Valid values:</p>
         * <ul>
         * <li>0: String</li>
         * <li>1: Int</li>
         * <li>2: Long</li>
         * <li>3: Float</li>
         * <li>4: Double</li>
         * <li>5: Boolean</li>
         * <li>6: StringList</li>
         * <li>7: IntList</li>
         * <li>8: LongList</li>
         * <li>9: FloatList</li>
         * <li>10: DoubleList</li>
         * <li>11: BooleanList</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description2</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param2</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: false}</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>Indicates whether the entries were returned by page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        /**
         * <p>The SQL script.</p>
         * 
         * <strong>example:</strong>
         * <p>select a from t</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The data source information of the API generated in script mode.</p>
         */
        @NameInMap("ScriptConnection")
        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection scriptConnection;

        /**
         * <p>The error codes returned for the API generated in script mode.</p>
         */
        @NameInMap("ScriptErrorCodes")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes> scriptErrorCodes;

        /**
         * <p>The request parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptRequestParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters;

        /**
         * <p>The response parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptResponseParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters;

        /**
         * <p>The sample success response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: true}</p>
         */
        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetails self = new GetDataServicePublishedApiResponseBodyDataScriptDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptConnection(GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptErrorCodes(java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes> scriptErrorCodes) {
            this.scriptErrorCodes = scriptErrorCodes;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptRequestParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptResponseParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection extends TeaModel {
        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The name of the table in the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>fail to call</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The solution used to fix the error.</p>
         * 
         * <strong>example:</strong>
         * <p>retry</p>
         */
        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>default1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>example1</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type of the parameter. Valid values:</p>
         * <ul>
         * <li>0: String</li>
         * <li>1: Int</li>
         * <li>2: Long</li>
         * <li>3: Float</li>
         * <li>4: Double</li>
         * <li>5: Boolean</li>
         * <li>6: StringList</li>
         * <li>7: IntList</li>
         * <li>8: LongList</li>
         * <li>9: FloatList</li>
         * <li>10: DoubleList</li>
         * <li>11: BooleanList</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description1</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates the Equal operator. The value 1 indicates the Like operator. The value 2 indicates the Const operator. The value 3 indicates the In operator. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the parameter is in the URL path of the request. The value 1 indicates that the parameter is in the Query parameter of the request URL. The value 2 indicates that the parameter is in the request header. The value 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters extends TeaModel {
        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>example2</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The data type of the parameter. Valid values:</p>
         * <ul>
         * <li>0: String</li>
         * <li>1: Int</li>
         * <li>2: Long</li>
         * <li>3: Float</li>
         * <li>4: Double</li>
         * <li>5: Boolean</li>
         * <li>6: StringList</li>
         * <li>7: IntList</li>
         * <li>8: LongList</li>
         * <li>9: FloatList</li>
         * <li>10: DoubleList</li>
         * <li>11: BooleanList</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description2</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param2</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: false}</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>Indicates whether the entries were returned by page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        /**
         * <p>The sample success response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: true}</p>
         */
        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        /**
         * <p>The data source information of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardConnection")
        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection wizardConnection;

        /**
         * <p>The error codes returned for the API generated in wizard mode.</p>
         */
        @NameInMap("WizardErrorCodes")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes> wizardErrorCodes;

        /**
         * <p>The request parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardRequestParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters;

        /**
         * <p>The response parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardResponseParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetails self = new GetDataServicePublishedApiResponseBodyDataWizardDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardConnection(GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardErrorCodes(java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes> wizardErrorCodes) {
            this.wizardErrorCodes = wizardErrorCodes;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardRequestParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardResponseParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the DataService Studio API.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The type of the API. Valid values: 0, 1, and 2. The value 0 indicates that the API is generated in wizard mode. The value 1 indicates that the API is generated in script mode. The value 2 indicates that the API is generated by registration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ApiMode")
        public Integer apiMode;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Name of the test API</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/1</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-23T00:21:01+0800</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the creator of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the test API</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>ab12**</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the API was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-23T00:21:01+0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who last modified the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2345678</p>
         */
        @NameInMap("OperatorId")
        public String operatorId;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS. Multiple protocols are presented in a list.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<Integer> protocols;

        /**
         * <p>The details of the API generated by registration. This parameter is returned only if the API is generated by registration.</p>
         */
        @NameInMap("RegistrationDetails")
        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails registrationDetails;

        /**
         * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method, the value 1 indicates the POST method, the value 2 indicates the PUT method, and the value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RequestMethod")
        public Integer requestMethod;

        /**
         * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResponseContentType")
        public Integer responseContentType;

        /**
         * <p>The details of the API generated in script mode. This parameter is returned only if the API is generated in script mode.</p>
         */
        @NameInMap("ScriptDetails")
        public GetDataServicePublishedApiResponseBodyDataScriptDetails scriptDetails;

        /**
         * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The timeout period of the API request. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible to the members in a specific workspace. The value 1 indicates that the API is visible only to the API creator.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VisibleRange")
        public Integer visibleRange;

        /**
         * <p>The details of the API generated in wizard mode. This parameter is returned only if the API is generated in wizard mode.</p>
         */
        @NameInMap("WizardDetails")
        public GetDataServicePublishedApiResponseBodyDataWizardDetails wizardDetails;

        public static GetDataServicePublishedApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyData self = new GetDataServicePublishedApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetDataServicePublishedApiResponseBodyData setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public GetDataServicePublishedApiResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetDataServicePublishedApiResponseBodyData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public GetDataServicePublishedApiResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServicePublishedApiResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServicePublishedApiResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServicePublishedApiResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServicePublishedApiResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServicePublishedApiResponseBodyData setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetDataServicePublishedApiResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServicePublishedApiResponseBodyData setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

        public GetDataServicePublishedApiResponseBodyData setRegistrationDetails(GetDataServicePublishedApiResponseBodyDataRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public GetDataServicePublishedApiResponseBodyData setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataServicePublishedApiResponseBodyData setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public GetDataServicePublishedApiResponseBodyData setScriptDetails(GetDataServicePublishedApiResponseBodyDataScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public GetDataServicePublishedApiResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDataServicePublishedApiResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServicePublishedApiResponseBodyData setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetDataServicePublishedApiResponseBodyData setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public GetDataServicePublishedApiResponseBodyData setWizardDetails(GetDataServicePublishedApiResponseBodyDataWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

    }

}
