// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRegistryModuleResponseBody extends TeaModel {
    /**
     * <p>The Registry module.</p>
     */
    @NameInMap("registryModule")
    public GetRegistryModuleResponseBodyRegistryModule registryModule;

    /**
     * <p>The request ID.</p>
     * 
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
        /**
         * <p>The permission. Valid values:</p>
         * <ul>
         * <li>private: private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-28 13:39:05</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The module description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("downloads")
        public Integer downloads;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-cluster</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>NamespaceName</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        /**
         * <p>The provider type. Valid values:</p>
         * <ul>
         * <li>alicloud: Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alicloud</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The list of accounts with which the Registry module is shared.</p>
         */
        @NameInMap("sharedAccounts")
        public java.util.List<Long> sharedAccounts;

        /**
         * <p>The module source, which is a concatenation of <NamespaceName>/<ModuleName>.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaceName/ModuleName</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The module source URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("sourceUrl")
        public String sourceUrl;

        /**
         * <p>The workspace type. Valid values:</p>
         * <ul>
         * <li>system: public module</li>
         * <li>self: custom module</li>
         * <li>shared: shared module</li>
         * <li>community: community module.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
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
