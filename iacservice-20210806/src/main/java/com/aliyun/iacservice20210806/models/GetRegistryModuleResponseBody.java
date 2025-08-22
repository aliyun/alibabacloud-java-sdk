// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRegistryModuleResponseBody extends TeaModel {
    @NameInMap("registryModule")
    public GetRegistryModuleResponseBodyRegistryModule registryModule;

    /**
     * <strong>example:</strong>
     * <p>5B5AD471-5036-581B-AC9B-7D5EECED877A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRegistryModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryModuleResponseBody self = new GetRegistryModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegistryModuleResponseBody setRegistryModule(GetRegistryModuleResponseBodyRegistryModule registryModule) {
        this.registryModule = registryModule;
        return this;
    }
    public GetRegistryModuleResponseBodyRegistryModule getRegistryModule() {
        return this.registryModule;
    }

    public GetRegistryModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRegistryModuleResponseBodyRegistryModule extends TeaModel {
        @NameInMap("acl")
        public String acl;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("downloads")
        public Integer downloads;

        @NameInMap("moduleName")
        public String moduleName;

        @NameInMap("namespaceName")
        public String namespaceName;

        @NameInMap("provider")
        public String provider;

        @NameInMap("sharedAccounts")
        public java.util.List<Long> sharedAccounts;

        @NameInMap("source")
        public String source;

        @NameInMap("sourceUrl")
        public String sourceUrl;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static GetRegistryModuleResponseBodyRegistryModule build(java.util.Map<String, ?> map) throws Exception {
            GetRegistryModuleResponseBodyRegistryModule self = new GetRegistryModuleResponseBodyRegistryModule();
            return TeaModel.build(map, self);
        }

        public GetRegistryModuleResponseBodyRegistryModule setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public GetRegistryModuleResponseBodyRegistryModule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRegistryModuleResponseBodyRegistryModule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRegistryModuleResponseBodyRegistryModule setDownloads(Integer downloads) {
            this.downloads = downloads;
            return this;
        }
        public Integer getDownloads() {
            return this.downloads;
        }

        public GetRegistryModuleResponseBodyRegistryModule setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetRegistryModuleResponseBodyRegistryModule setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public GetRegistryModuleResponseBodyRegistryModule setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetRegistryModuleResponseBodyRegistryModule setSharedAccounts(java.util.List<Long> sharedAccounts) {
            this.sharedAccounts = sharedAccounts;
            return this;
        }
        public java.util.List<Long> getSharedAccounts() {
            return this.sharedAccounts;
        }

        public GetRegistryModuleResponseBodyRegistryModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetRegistryModuleResponseBodyRegistryModule setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public GetRegistryModuleResponseBodyRegistryModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRegistryModuleResponseBodyRegistryModule setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
