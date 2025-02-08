// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListDataServicePublishedApisResponseBodyData data;

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
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
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

    public static ListDataServicePublishedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisResponseBody self = new ListDataServicePublishedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisResponseBody setData(ListDataServicePublishedApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServicePublishedApisResponseBodyData getData() {
        return this.data;
    }

    public ListDataServicePublishedApisResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServicePublishedApisResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServicePublishedApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServicePublishedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServicePublishedApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes self = new ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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
         * <p>Indicates whether the request parameter is required.</p>
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

        public static ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters self = new ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails extends TeaModel {
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
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        /**
         * <p>The request parameters of the API generated by registration.</p>
         */
        @NameInMap("RegistrationRequestParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

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

        public static ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails self = new ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setRegistrationErrorCodes(java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setRegistrationRequestParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection extends TeaModel {
        /**
         * <p>The data source ID.</p>
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

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters extends TeaModel {
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
         * <p>Indicates whether the request parameter is required.</p>
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
         * </ul>
         * <p>Advanced scripts also support the following data types:</p>
         * <ul>
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

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: false}</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>Indicates whether the entries are returned by page.</p>
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
         * <p>The data source information about the API generated in script mode.</p>
         */
        @NameInMap("ScriptConnection")
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection;

        /**
         * <p>The error codes returned for the API generated in script mode.</p>
         */
        @NameInMap("ScriptErrorCodes")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes> scriptErrorCodes;

        /**
         * <p>The request parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptRequestParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters;

        /**
         * <p>The response parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptResponseParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters;

        /**
         * <p>The sample success response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: true}</p>
         */
        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetails self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptConnection(ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptErrorCodes(java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes> scriptErrorCodes) {
            this.scriptErrorCodes = scriptErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptRequestParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptResponseParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters extends TeaModel {
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
         * <p>Indicates whether the request parameter is required.</p>
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

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;success&quot;: false}</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>Indicates whether the entries are returned by page.</p>
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
         * <p>The data source information about the API generated in wizard mode.</p>
         */
        @NameInMap("WizardConnection")
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection;

        /**
         * <p>The error codes returned for the API generated in wizard mode.</p>
         */
        @NameInMap("WizardErrorCodes")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes> wizardErrorCodes;

        /**
         * <p>The request parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardRequestParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters;

        /**
         * <p>The response parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardResponseParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters;

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetails self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardConnection(ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardErrorCodes(java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes> wizardErrorCodes) {
            this.wizardErrorCodes = wizardErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardRequestParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardResponseParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApis extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
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
         * <p>My API name</p>
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
         * <p>The time when the API was created.</p>
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
         * <p>Test API description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ab123</p>
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
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<Integer> protocols;

        /**
         * <p>The details of the API generated by registration. This parameter is returned only if the API is generated by registration.</p>
         */
        @NameInMap("RegistrationDetails")
        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails registrationDetails;

        /**
         * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method. The value 1 indicates the POST method. The value 2 indicates the PUT method. The value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
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
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails scriptDetails;

        /**
         * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tenant ID.</p>
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
         * <p>The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible within the workspace. The value 1 indicates that the API is visible only to its owner.</p>
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
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails wizardDetails;

        public static ListDataServicePublishedApisResponseBodyDataApis build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApis self = new ListDataServicePublishedApisResponseBodyDataApis();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setRegistrationDetails(ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setScriptDetails(ListDataServicePublishedApisResponseBodyDataApisScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setWizardDetails(ListDataServicePublishedApisResponseBodyDataApisWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyData extends TeaModel {
        /**
         * <p>The information about the APIs in the published state.</p>
         */
        @NameInMap("Apis")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApis> apis;

        /**
         * <p>The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServicePublishedApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyData self = new ListDataServicePublishedApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyData setApis(java.util.List<ListDataServicePublishedApisResponseBodyDataApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApis> getApis() {
            return this.apis;
        }

        public ListDataServicePublishedApisResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServicePublishedApisResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServicePublishedApisResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
