// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpDubboTranscoder extends TeaModel {
    /**
     * <p>The Dubbo service group.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("dubboServiceGroup")
    public String dubboServiceGroup;

    /**
     * <p>The Dubbo service name.</p>
     * 
     * <strong>example:</strong>
     * <p>com.example.DemoService</p>
     */
    @NameInMap("dubboServiceName")
    public String dubboServiceName;

    /**
     * <p>The Dubbo service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("dubboServiceVersion")
    public String dubboServiceVersion;

    /**
     * <p>The method mapping list.</p>
     */
    @NameInMap("methodMapList")
    public java.util.List<HttpDubboTranscoderMethodMapList> methodMapList;

    public static HttpDubboTranscoder build(java.util.Map<String, ?> map) throws Exception {
        HttpDubboTranscoder self = new HttpDubboTranscoder();
        return TeaModel.build(map, self);
    }

    public HttpDubboTranscoder setDubboServiceGroup(String dubboServiceGroup) {
        this.dubboServiceGroup = dubboServiceGroup;
        return this;
    }
    public String getDubboServiceGroup() {
        return this.dubboServiceGroup;
    }

    public HttpDubboTranscoder setDubboServiceName(String dubboServiceName) {
        this.dubboServiceName = dubboServiceName;
        return this;
    }
    public String getDubboServiceName() {
        return this.dubboServiceName;
    }

    public HttpDubboTranscoder setDubboServiceVersion(String dubboServiceVersion) {
        this.dubboServiceVersion = dubboServiceVersion;
        return this;
    }
    public String getDubboServiceVersion() {
        return this.dubboServiceVersion;
    }

    public HttpDubboTranscoder setMethodMapList(java.util.List<HttpDubboTranscoderMethodMapList> methodMapList) {
        this.methodMapList = methodMapList;
        return this;
    }
    public java.util.List<HttpDubboTranscoderMethodMapList> getMethodMapList() {
        return this.methodMapList;
    }

    public static class HttpDubboTranscoderMethodMapListParamMapsList extends TeaModel {
        /**
         * <p>The key used to extract the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("extractKey")
        public String extractKey;

        /**
         * <p>The input parameter location. Valid values:</p>
         * <ul>
         * <li>ALL_QUERY_PARAMETER: Request parameter.</li>
         * <li>ALL_HEADER: Request header.</li>
         * <li>ALL_PATH: URI of the request.</li>
         * <li>ALL_BODY: Request body.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_QUERY_PARAMETER</p>
         */
        @NameInMap("extractKeySpec")
        public String extractKeySpec;

        /**
         * <p>The backend parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.String</p>
         */
        @NameInMap("mappingType")
        public String mappingType;

        public static HttpDubboTranscoderMethodMapListParamMapsList build(java.util.Map<String, ?> map) throws Exception {
            HttpDubboTranscoderMethodMapListParamMapsList self = new HttpDubboTranscoderMethodMapListParamMapsList();
            return TeaModel.build(map, self);
        }

        public HttpDubboTranscoderMethodMapListParamMapsList setExtractKey(String extractKey) {
            this.extractKey = extractKey;
            return this;
        }
        public String getExtractKey() {
            return this.extractKey;
        }

        public HttpDubboTranscoderMethodMapListParamMapsList setExtractKeySpec(String extractKeySpec) {
            this.extractKeySpec = extractKeySpec;
            return this;
        }
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        public HttpDubboTranscoderMethodMapListParamMapsList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

    }

    public static class HttpDubboTranscoderMethodMapList extends TeaModel {
        /**
         * <p>The Dubbo method name.</p>
         * 
         * <strong>example:</strong>
         * <p>sayName</p>
         */
        @NameInMap("dubboMethodName")
        public String dubboMethodName;

        /**
         * <p>The HTTP method. Valid values: ALL_GET. ALL_POST. ALL_PUT. ALL_DELETE. ALL_PATCH.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_GET</p>
         */
        @NameInMap("httpMethod")
        public String httpMethod;

        /**
         * <p>The method matching path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mytestzbk/sayhello</p>
         */
        @NameInMap("methodPath")
        public String methodPath;

        /**
         * <p>The parameter mapping list.</p>
         */
        @NameInMap("paramMapsList")
        public java.util.List<HttpDubboTranscoderMethodMapListParamMapsList> paramMapsList;

        /**
         * <p>The header pass-through type. Valid values:</p>
         * <ul>
         * <li>PASS_ALL: Pass through all headers.</li>
         * <li>PASS_NOT: Do not pass through headers.</li>
         * <li>PASS_ASSIGN: Pass through specified headers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS_NOT</p>
         */
        @NameInMap("passThroughAllHeaders")
        public String passThroughAllHeaders;

        /**
         * <p>The list of specified pass-through headers.</p>
         */
        @NameInMap("passThroughList")
        public java.util.List<String> passThroughList;

        public static HttpDubboTranscoderMethodMapList build(java.util.Map<String, ?> map) throws Exception {
            HttpDubboTranscoderMethodMapList self = new HttpDubboTranscoderMethodMapList();
            return TeaModel.build(map, self);
        }

        public HttpDubboTranscoderMethodMapList setDubboMethodName(String dubboMethodName) {
            this.dubboMethodName = dubboMethodName;
            return this;
        }
        public String getDubboMethodName() {
            return this.dubboMethodName;
        }

        public HttpDubboTranscoderMethodMapList setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public HttpDubboTranscoderMethodMapList setMethodPath(String methodPath) {
            this.methodPath = methodPath;
            return this;
        }
        public String getMethodPath() {
            return this.methodPath;
        }

        public HttpDubboTranscoderMethodMapList setParamMapsList(java.util.List<HttpDubboTranscoderMethodMapListParamMapsList> paramMapsList) {
            this.paramMapsList = paramMapsList;
            return this;
        }
        public java.util.List<HttpDubboTranscoderMethodMapListParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        public HttpDubboTranscoderMethodMapList setPassThroughAllHeaders(String passThroughAllHeaders) {
            this.passThroughAllHeaders = passThroughAllHeaders;
            return this;
        }
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        public HttpDubboTranscoderMethodMapList setPassThroughList(java.util.List<String> passThroughList) {
            this.passThroughList = passThroughList;
            return this;
        }
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

    }

}
