// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpDubboTranscoder extends TeaModel {
    @NameInMap("dubboServiceGroup")
    public String dubboServiceGroup;

    @NameInMap("dubboServiceName")
    public String dubboServiceName;

    @NameInMap("dubboServiceVersion")
    public String dubboServiceVersion;

    @NameInMap("mothedMapList")
    public java.util.List<HttpDubboTranscoderMothedMapList> mothedMapList;

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

    public HttpDubboTranscoder setMothedMapList(java.util.List<HttpDubboTranscoderMothedMapList> mothedMapList) {
        this.mothedMapList = mothedMapList;
        return this;
    }
    public java.util.List<HttpDubboTranscoderMothedMapList> getMothedMapList() {
        return this.mothedMapList;
    }

    public static class HttpDubboTranscoderMothedMapListParamMapsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("extractKey")
        public String extractKey;

        /**
         * <strong>example:</strong>
         * <p>ALL_QUERY_PARAMETER</p>
         */
        @NameInMap("extractKeySpec")
        public String extractKeySpec;

        /**
         * <strong>example:</strong>
         * <p>java.lang.String</p>
         */
        @NameInMap("mappingType")
        public String mappingType;

        public static HttpDubboTranscoderMothedMapListParamMapsList build(java.util.Map<String, ?> map) throws Exception {
            HttpDubboTranscoderMothedMapListParamMapsList self = new HttpDubboTranscoderMothedMapListParamMapsList();
            return TeaModel.build(map, self);
        }

        public HttpDubboTranscoderMothedMapListParamMapsList setExtractKey(String extractKey) {
            this.extractKey = extractKey;
            return this;
        }
        public String getExtractKey() {
            return this.extractKey;
        }

        public HttpDubboTranscoderMothedMapListParamMapsList setExtractKeySpec(String extractKeySpec) {
            this.extractKeySpec = extractKeySpec;
            return this;
        }
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        public HttpDubboTranscoderMothedMapListParamMapsList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

    }

    public static class HttpDubboTranscoderMothedMapList extends TeaModel {
        @NameInMap("dubboMothedName")
        public String dubboMothedName;

        /**
         * <strong>example:</strong>
         * <p>ALL_GET</p>
         */
        @NameInMap("httpMothed")
        public String httpMothed;

        /**
         * <strong>example:</strong>
         * <p>/mytestzbk/sayhello</p>
         */
        @NameInMap("mothedpath")
        public String mothedpath;

        @NameInMap("paramMapsList")
        public java.util.List<HttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        /**
         * <strong>example:</strong>
         * <p>PASS_NOT</p>
         */
        @NameInMap("passThroughAllHeaders")
        public String passThroughAllHeaders;

        @NameInMap("passThroughList")
        public java.util.List<String> passThroughList;

        public static HttpDubboTranscoderMothedMapList build(java.util.Map<String, ?> map) throws Exception {
            HttpDubboTranscoderMothedMapList self = new HttpDubboTranscoderMothedMapList();
            return TeaModel.build(map, self);
        }

        public HttpDubboTranscoderMothedMapList setDubboMothedName(String dubboMothedName) {
            this.dubboMothedName = dubboMothedName;
            return this;
        }
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        public HttpDubboTranscoderMothedMapList setHttpMothed(String httpMothed) {
            this.httpMothed = httpMothed;
            return this;
        }
        public String getHttpMothed() {
            return this.httpMothed;
        }

        public HttpDubboTranscoderMothedMapList setMothedpath(String mothedpath) {
            this.mothedpath = mothedpath;
            return this;
        }
        public String getMothedpath() {
            return this.mothedpath;
        }

        public HttpDubboTranscoderMothedMapList setParamMapsList(java.util.List<HttpDubboTranscoderMothedMapListParamMapsList> paramMapsList) {
            this.paramMapsList = paramMapsList;
            return this;
        }
        public java.util.List<HttpDubboTranscoderMothedMapListParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        public HttpDubboTranscoderMothedMapList setPassThroughAllHeaders(String passThroughAllHeaders) {
            this.passThroughAllHeaders = passThroughAllHeaders;
            return this;
        }
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        public HttpDubboTranscoderMothedMapList setPassThroughList(java.util.List<String> passThroughList) {
            this.passThroughList = passThroughList;
            return this;
        }
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

    }

}
