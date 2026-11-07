// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteResponseBody extends TeaModel {
    /**
     * <p>Code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public ListGatewayRouteResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83F02EAB-ECDF-55C6-B332-8649E5E7AF2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request result, with the following values:</p>
     * <ul>
     * <li><p><code>true</code>: The request is successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteResponseBody self = new ListGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayRouteResponseBody setData(ListGatewayRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayRouteResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayRouteResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayRouteResponseBodyDataResultComment extends TeaModel {
        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListGatewayRouteResponseBodyDataResultComment build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultComment self = new ListGatewayRouteResponseBodyDataResultComment();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultComment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultDirectResponse extends TeaModel {
        /**
         * <p>Mock return value</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        public static ListGatewayRouteResponseBodyDataResultDirectResponse build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultDirectResponse self = new ListGatewayRouteResponseBodyDataResultDirectResponse();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultDirectResponse setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListGatewayRouteResponseBodyDataResultDirectResponse setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultFallbackServices extends TeaModel {
        /**
         * <p>Protocol Type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>Service group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Service namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Weight percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>Service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>service name</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8848</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>Service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListGatewayRouteResponseBodyDataResultFallbackServices build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultFallbackServices self = new ListGatewayRouteResponseBodyDataResultFallbackServices();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListGatewayRouteResponseBodyDataResultFallbackServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRedirect extends TeaModel {
        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>Redirect hostname</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        public static ListGatewayRouteResponseBodyDataResultRedirect build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRedirect self = new ListGatewayRouteResponseBodyDataResultRedirect();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRedirect setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListGatewayRouteResponseBodyDataResultRedirect setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListGatewayRouteResponseBodyDataResultRedirect setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates extends TeaModel {
        /**
         * <p>Header KEY</p>
         * 
         * <strong>example:</strong>
         * <p>userid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Matching type</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Matching value</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates extends TeaModel {
        /**
         * <p>Case insensitive</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>Node path.</p>
         * 
         * <strong>example:</strong>
         * <p>/getIp</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates extends TeaModel {
        /**
         * <p>Parameter name</p>
         * 
         * <strong>example:</strong>
         * <p>userid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Matching type</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Matching value</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicates extends TeaModel {
        /**
         * <p>Header matching</p>
         */
        @NameInMap("HeaderPredicates")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> headerPredicates;

        /**
         * <p>HTTP method matching</p>
         */
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        /**
         * <p>Route Path matching.</p>
         */
        @NameInMap("PathPredicates")
        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates pathPredicates;

        /**
         * <p>Parameter matching</p>
         */
        @NameInMap("QueryPredicates")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates> queryPredicates;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setHeaderPredicates(java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setPathPredicates(ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setQueryPredicates(java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList extends TeaModel {
        /**
         * <p>Extract key from input.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ExtractKey")
        public String extractKey;

        /**
         * <p>Input parameter position.</p>
         * <blockquote>
         * <p>Input parameter position enumeration values.</p>
         * <ul>
         * <li><p>Request parameter: <code>ALL_QUERY_PARAMETER</code></p>
         * </li>
         * <li><p>Request header: <code>ALL_HEADER</code></p>
         * </li>
         * <li><p>Request path: <code>ALL_PATH</code></p>
         * </li>
         * <li><p>Request body: <code>ALL_BODY</code></p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL_QUERY_PARAMETER</p>
         */
        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        /**
         * <p>Backend parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.String</p>
         */
        @NameInMap("MappingType")
        public String mappingType;

        public static ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList self = new ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKey(String extractKey) {
            this.extractKey = extractKey;
            return this;
        }
        public String getExtractKey() {
            return this.extractKey;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKeySpec(String extractKeySpec) {
            this.extractKeySpec = extractKeySpec;
            return this;
        }
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList extends TeaModel {
        /**
         * <p>Dubbo method name.</p>
         * 
         * <strong>example:</strong>
         * <p>sayHello</p>
         */
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        /**
         * <p>Http method.</p>
         * <blockquote>
         * <p>Supported HTTP method parameter values.</p>
         * <ul>
         * <li><p>ALL_GET</p>
         * </li>
         * <li><p>ALL_POST</p>
         * </li>
         * <li><p>ALL_PUT</p>
         * </li>
         * <li><p>ALL_DELETE</p>
         * </li>
         * <li><p>ALL_PATCH</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL_GET</p>
         */
        @NameInMap("HttpMothed")
        public String httpMothed;

        /**
         * <p>Method matching path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mytestzbk/sayhello</p>
         */
        @NameInMap("Mothedpath")
        public String mothedpath;

        /**
         * <p>Parameter mapping list.</p>
         */
        @NameInMap("ParamMapsList")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        /**
         * <p>Header pass-through type.</p>
         * <blockquote>
         * <p>Pass-through type enumeration values.</p>
         * <ul>
         * <li><p>Pass through all: PASS_ALL</p>
         * </li>
         * <li><p>No pass-through: PASS_NOT</p>
         * </li>
         * <li><p>Specified parameters: PASS_ASSIGN</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PASS_NOT</p>
         */
        @NameInMap("PassThroughAllHeaders")
        public String passThroughAllHeaders;

        /**
         * <p>Specified pass-through Header list.</p>
         */
        @NameInMap("PassThroughList")
        public java.util.List<String> passThroughList;

        public static ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList self = new ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList setDubboMothedName(String dubboMothedName) {
            this.dubboMothedName = dubboMothedName;
            return this;
        }
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList setHttpMothed(String httpMothed) {
            this.httpMothed = httpMothed;
            return this;
        }
        public String getHttpMothed() {
            return this.httpMothed;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList setMothedpath(String mothedpath) {
            this.mothedpath = mothedpath;
            return this;
        }
        public String getMothedpath() {
            return this.mothedpath;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList setParamMapsList(java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList) {
            this.paramMapsList = paramMapsList;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList setPassThroughAllHeaders(String passThroughAllHeaders) {
            this.passThroughAllHeaders = passThroughAllHeaders;
            return this;
        }
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList setPassThroughList(java.util.List<String> passThroughList) {
            this.passThroughList = passThroughList;
            return this;
        }
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder extends TeaModel {
        /**
         * <p>Dubbo service group.</p>
         * 
         * <strong>example:</strong>
         * <p>service group</p>
         */
        @NameInMap("DubboServiceGroup")
        public String dubboServiceGroup;

        /**
         * <p>Dubbo service name.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.dubbo.samples.basic.api.DemoService</p>
         */
        @NameInMap("DubboServiceName")
        public String dubboServiceName;

        /**
         * <p>Dubbo service version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        @NameInMap("DubboServiceVersion")
        public String dubboServiceVersion;

        /**
         * <p>Dubbo forwarding rule list.</p>
         */
        @NameInMap("MothedMapList")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList> mothedMapList;

        public static ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder self = new ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder setDubboServiceGroup(String dubboServiceGroup) {
            this.dubboServiceGroup = dubboServiceGroup;
            return this;
        }
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder setDubboServiceName(String dubboServiceName) {
            this.dubboServiceName = dubboServiceName;
            return this;
        }
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder setDubboServiceVersion(String dubboServiceVersion) {
            this.dubboServiceVersion = dubboServiceVersion;
            return this;
        }
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder setMothedMapList(java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList> mothedMapList) {
            this.mothedMapList = mothedMapList;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRouteServices extends TeaModel {
        /**
         * <p>Protocol Type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>Service group name.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Health status</p>
         * <ul>
         * <li><p>Health</p>
         * </li>
         * <li><p>Unhealthy</p>
         * </li>
         * <li><p>Checking</p>
         * </li>
         * <li><p>Unknown</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Health</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>Dubbo protocol conversion body.</p>
         */
        @NameInMap("HttpDubboTranscoder")
        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Weight percentage</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>1563</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>hu</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Service port.</p>
         * 
         * <strong>example:</strong>
         * <p>20880</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>Source type</p>
         * 
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>Unhealthy Endpoint list</p>
         */
        @NameInMap("UnhealthyEndpoints")
        public java.util.List<String> unhealthyEndpoints;

        /**
         * <p>Service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListGatewayRouteResponseBodyDataResultRouteServices build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRouteServices self = new ListGatewayRouteResponseBodyDataResultRouteServices();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setHttpDubboTranscoder(ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder httpDubboTranscoder) {
            this.httpDubboTranscoder = httpDubboTranscoder;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setUnhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
            this.unhealthyEndpoints = unhealthyEndpoints;
            return this;
        }
        public java.util.List<String> getUnhealthyEndpoints() {
            return this.unhealthyEndpoints;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResult extends TeaModel {
        /**
         * <p>Route comment (ingress)</p>
         */
        @NameInMap("Comment")
        public ListGatewayRouteResponseBodyDataResultComment comment;

        /**
         * <p>Default service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        /**
         * <p>Default service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        /**
         * <p>Destination type.</p>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>Mock configuration</p>
         */
        @NameInMap("DirectResponse")
        public ListGatewayRouteResponseBodyDataResultDirectResponse directResponse;

        /**
         * <p>Domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>265</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>Domain list.</p>
         */
        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>y.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Domain name list.</p>
         */
        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        /**
         * <p>Whether to enable dynamic routing</p>
         */
        @NameInMap("DynamicRoute")
        public Boolean dynamicRoute;

        /**
         * <p>Whether to enable WAF</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableWaf")
        public String enableWaf;

        /**
         * <p>Whether to enable Fallback service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Fallback")
        public Boolean fallback;

        /**
         * <p>Fallback service.</p>
         */
        @NameInMap("FallbackServices")
        public java.util.List<ListGatewayRouteResponseBodyDataResultFallbackServices> fallbackServices;

        /**
         * <p>Gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>496</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>Gateway unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cf0e7f52ecc7429dbc7ba4d5e3656100</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-25T07:14:01.817+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Matching rules</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;PathPredicates\&quot;:{\&quot;Path\&quot;:\&quot;/rpc/compute \&quot;,\&quot;Type\&quot;:\&quot;PRE\&quot;,\&quot;IgnoreCase\&quot;:true}}</p>
         */
        @NameInMap("Predicates")
        public String predicates;

        /**
         * <p>Redirection</p>
         */
        @NameInMap("Redirect")
        public ListGatewayRouteResponseBodyDataResultRedirect redirect;

        /**
         * <p>Order</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        /**
         * <p>Matching rules</p>
         */
        @NameInMap("RoutePredicates")
        public ListGatewayRouteResponseBodyDataResultRoutePredicates routePredicates;

        /**
         * <p>Service.</p>
         */
        @NameInMap("RouteServices")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> routeServices;

        /**
         * <p>Service.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Services")
        public String services;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Route type</p>
         * 
         * <strong>example:</strong>
         * <p>Op</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayRouteResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResult self = new ListGatewayRouteResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResult setComment(ListGatewayRouteResponseBodyDataResultComment comment) {
            this.comment = comment;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultComment getComment() {
            return this.comment;
        }

        public ListGatewayRouteResponseBodyDataResult setDefaultServiceId(Long defaultServiceId) {
            this.defaultServiceId = defaultServiceId;
            return this;
        }
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        public ListGatewayRouteResponseBodyDataResult setDefaultServiceName(String defaultServiceName) {
            this.defaultServiceName = defaultServiceName;
            return this;
        }
        public String getDefaultServiceName() {
            return this.defaultServiceName;
        }

        public ListGatewayRouteResponseBodyDataResult setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListGatewayRouteResponseBodyDataResult setDirectResponse(ListGatewayRouteResponseBodyDataResultDirectResponse directResponse) {
            this.directResponse = directResponse;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultDirectResponse getDirectResponse() {
            return this.directResponse;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainIdList(java.util.List<Long> domainIdList) {
            this.domainIdList = domainIdList;
            return this;
        }
        public java.util.List<Long> getDomainIdList() {
            return this.domainIdList;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainNameList(java.util.List<String> domainNameList) {
            this.domainNameList = domainNameList;
            return this;
        }
        public java.util.List<String> getDomainNameList() {
            return this.domainNameList;
        }

        public ListGatewayRouteResponseBodyDataResult setDynamicRoute(Boolean dynamicRoute) {
            this.dynamicRoute = dynamicRoute;
            return this;
        }
        public Boolean getDynamicRoute() {
            return this.dynamicRoute;
        }

        public ListGatewayRouteResponseBodyDataResult setEnableWaf(String enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public String getEnableWaf() {
            return this.enableWaf;
        }

        public ListGatewayRouteResponseBodyDataResult setFallback(Boolean fallback) {
            this.fallback = fallback;
            return this;
        }
        public Boolean getFallback() {
            return this.fallback;
        }

        public ListGatewayRouteResponseBodyDataResult setFallbackServices(java.util.List<ListGatewayRouteResponseBodyDataResultFallbackServices> fallbackServices) {
            this.fallbackServices = fallbackServices;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultFallbackServices> getFallbackServices() {
            return this.fallbackServices;
        }

        public ListGatewayRouteResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayRouteResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayRouteResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayRouteResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayRouteResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayRouteResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteResponseBodyDataResult setPredicates(String predicates) {
            this.predicates = predicates;
            return this;
        }
        public String getPredicates() {
            return this.predicates;
        }

        public ListGatewayRouteResponseBodyDataResult setRedirect(ListGatewayRouteResponseBodyDataResultRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRedirect getRedirect() {
            return this.redirect;
        }

        public ListGatewayRouteResponseBodyDataResult setRouteOrder(Integer routeOrder) {
            this.routeOrder = routeOrder;
            return this;
        }
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        public ListGatewayRouteResponseBodyDataResult setRoutePredicates(ListGatewayRouteResponseBodyDataResultRoutePredicates routePredicates) {
            this.routePredicates = routePredicates;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

        public ListGatewayRouteResponseBodyDataResult setRouteServices(java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> routeServices) {
            this.routeServices = routeServices;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> getRouteServices() {
            return this.routeServices;
        }

        public ListGatewayRouteResponseBodyDataResult setServices(String services) {
            this.services = services;
            return this;
        }
        public String getServices() {
            return this.services;
        }

        public ListGatewayRouteResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGatewayRouteResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayRouteResponseBodyData extends TeaModel {
        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Data structure.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayRouteResponseBodyDataResult> result;

        /**
         * <p>Total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyData self = new ListGatewayRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayRouteResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayRouteResponseBodyData setResult(java.util.List<ListGatewayRouteResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayRouteResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
