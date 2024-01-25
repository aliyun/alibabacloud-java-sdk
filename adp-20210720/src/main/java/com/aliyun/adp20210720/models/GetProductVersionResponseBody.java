// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetProductVersionResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResponseBody self = new GetProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductVersionResponseBody setData(GetProductVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductVersionResponseBodyDataDocumentations extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("url")
        public String url;

        public static GetProductVersionResponseBodyDataDocumentations build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionResponseBodyDataDocumentations self = new GetProductVersionResponseBodyDataDocumentations();
            return TeaModel.build(map, self);
        }

        public GetProductVersionResponseBodyDataDocumentations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductVersionResponseBodyDataDocumentations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductVersionResponseBodyDataDocumentations setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetProductVersionResponseBodyDataExtendedResources extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("url")
        public String url;

        public static GetProductVersionResponseBodyDataExtendedResources build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionResponseBodyDataExtendedResources self = new GetProductVersionResponseBodyDataExtendedResources();
            return TeaModel.build(map, self);
        }

        public GetProductVersionResponseBodyDataExtendedResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductVersionResponseBodyDataExtendedResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductVersionResponseBodyDataExtendedResources setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetProductVersionResponseBodyData extends TeaModel {
        @NameInMap("continuousIntegration")
        public Boolean continuousIntegration;

        @NameInMap("description")
        public String description;

        @NameInMap("documentations")
        public java.util.List<GetProductVersionResponseBodyDataDocumentations> documentations;

        @NameInMap("extendedResources")
        public java.util.List<GetProductVersionResponseBodyDataExtendedResources> extendedResources;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("platforms")
        public java.util.List<Platform> platforms;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("timeout")
        public Long timeout;

        @NameInMap("uid")
        public String uid;

        @NameInMap("version")
        public String version;

        public static GetProductVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionResponseBodyData self = new GetProductVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionResponseBodyData setContinuousIntegration(Boolean continuousIntegration) {
            this.continuousIntegration = continuousIntegration;
            return this;
        }
        public Boolean getContinuousIntegration() {
            return this.continuousIntegration;
        }

        public GetProductVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductVersionResponseBodyData setDocumentations(java.util.List<GetProductVersionResponseBodyDataDocumentations> documentations) {
            this.documentations = documentations;
            return this;
        }
        public java.util.List<GetProductVersionResponseBodyDataDocumentations> getDocumentations() {
            return this.documentations;
        }

        public GetProductVersionResponseBodyData setExtendedResources(java.util.List<GetProductVersionResponseBodyDataExtendedResources> extendedResources) {
            this.extendedResources = extendedResources;
            return this;
        }
        public java.util.List<GetProductVersionResponseBodyDataExtendedResources> getExtendedResources() {
            return this.extendedResources;
        }

        public GetProductVersionResponseBodyData setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public GetProductVersionResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetProductVersionResponseBodyData setPlatforms(java.util.List<Platform> platforms) {
            this.platforms = platforms;
            return this;
        }
        public java.util.List<Platform> getPlatforms() {
            return this.platforms;
        }

        public GetProductVersionResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductVersionResponseBodyData setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public GetProductVersionResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetProductVersionResponseBodyData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public GetProductVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
