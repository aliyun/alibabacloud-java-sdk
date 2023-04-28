// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteResponseBody extends TeaModel {
    /**
     * <p>The code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListGatewayRouteResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
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
         * <p>The status.</p>
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
         * <p>The return value for service mocking.</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The response code returned.</p>
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
         * <p>The type of the protocol.</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace to which the service belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight in the form of a percentage value.</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The service port number.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The version of the service.</p>
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
         * <p>The response code returned.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The hostname to be redirected to.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path.</p>
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
         * <p>The header key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value.</p>
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
         * <p>Indicates whether case sensitivity is ignored.</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>The path of the node.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The matching type.</p>
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
         * <p>The key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value.</p>
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
         * <p>The headers used for route matching.</p>
         */
        @NameInMap("HeaderPredicates")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> headerPredicates;

        /**
         * <p>The HTTP methods used for route matching.</p>
         */
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        /**
         * <p>The path used for route matching.</p>
         */
        @NameInMap("PathPredicates")
        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates pathPredicates;

        /**
         * <p>The parameters used for route matching.</p>
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
         * <p>The key extracted from the input parameter.</p>
         */
        @NameInMap("ExtractKey")
        public String extractKey;

        /**
         * <p>The position of the input parameter.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   `ALL_QUERY_PARAMETER`: request parameter</p>
         * <br>
         * <p>*   `ALL_HEADER`: request header</p>
         * <br>
         * <p>*   `ALL_PATH`: request path</p>
         * <br>
         * <p>*   `ALL_BODY`: request body</p>
         */
        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        /**
         * <p>The type of the backend service parameter.</p>
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
         * <p>The method name of the Dubbo service.</p>
         */
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        /**
         * <p>The HTTP method.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   ALL_GET</p>
         * <br>
         * <p>*   ALL_POST</p>
         * <br>
         * <p>*   ALL_PUT</p>
         * <br>
         * <p>*   ALL_DELETE</p>
         * <br>
         * <p>*   ALL_PATCH</p>
         */
        @NameInMap("HttpMothed")
        public String httpMothed;

        /**
         * <p>The path used for method matching.</p>
         */
        @NameInMap("Mothedpath")
        public String mothedpath;

        /**
         * <p>The information about parameter mappings.</p>
         */
        @NameInMap("ParamMapsList")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        /**
         * <p>The pass-through type of the header.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   PASS_ALL: All headers are passed through.</p>
         * <br>
         * <p>*   PASS_NOT: All headers are not passed through.</p>
         * <br>
         * <p>*   PASS_ASSIGN: Specified headers are passed through.</p>
         */
        @NameInMap("PassThroughAllHeaders")
        public String passThroughAllHeaders;

        /**
         * <p>The list of headers to be passed through.</p>
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
         * <p>The Dubbo service group.</p>
         */
        @NameInMap("DubboServiceGroup")
        public String dubboServiceGroup;

        /**
         * <p>The name of the Dubbo service.</p>
         */
        @NameInMap("DubboServiceName")
        public String dubboServiceName;

        /**
         * <p>The version of the Dubbo service.</p>
         */
        @NameInMap("DubboServiceVersion")
        public String dubboServiceVersion;

        /**
         * <p>The forwarding rules of the Dubbo service.</p>
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
         * <p>The type of the protocol.</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The transcoder of the Dubbo protocol.</p>
         */
        @NameInMap("HttpDubboTranscoder")
        public ListGatewayRouteResponseBodyDataResultRouteServicesHttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight in the form of a percentage value.</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The Dubbo port number.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The version of the service.</p>
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
         * <p>The route comment (ingress).</p>
         */
        @NameInMap("Comment")
        public ListGatewayRouteResponseBodyDataResultComment comment;

        /**
         * <p>The default service ID.</p>
         */
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        /**
         * <p>The default service name.</p>
         */
        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        /**
         * <p>The destination service type.</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The information about service mocking.</p>
         */
        @NameInMap("DirectResponse")
        public ListGatewayRouteResponseBodyDataResultDirectResponse directResponse;

        /**
         * <p>The domain ID.</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>The domain IDs.</p>
         */
        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The domain names.</p>
         */
        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        /**
         * <p>Indicates whether Web Application Firewall (WAF) is activated.</p>
         */
        @NameInMap("EnableWaf")
        public String enableWaf;

        /**
         * <p>Indicates whether the Fallback service is enabled.</p>
         */
        @NameInMap("Fallback")
        public Boolean fallback;

        /**
         * <p>The information about the Fallback service.</p>
         */
        @NameInMap("FallbackServices")
        public java.util.List<ListGatewayRouteResponseBodyDataResultFallbackServices> fallbackServices;

        /**
         * <p>The ID of the gateway.</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The matching rules.</p>
         */
        @NameInMap("Predicates")
        public String predicates;

        /**
         * <p>The information about redirection.</p>
         */
        @NameInMap("Redirect")
        public ListGatewayRouteResponseBodyDataResultRedirect redirect;

        /**
         * <p>The order.</p>
         */
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        /**
         * <p>The matching rules.</p>
         */
        @NameInMap("RoutePredicates")
        public ListGatewayRouteResponseBodyDataResultRoutePredicates routePredicates;

        /**
         * <p>The information about services.</p>
         */
        @NameInMap("RouteServices")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> routeServices;

        /**
         * <p>The information about services.</p>
         */
        @NameInMap("Services")
        public String services;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The route type.</p>
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
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The data structure.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayRouteResponseBodyDataResult> result;

        /**
         * <p>The total number of entries returned.</p>
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
