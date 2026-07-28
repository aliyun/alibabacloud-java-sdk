// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRegistryModuleVersionResponseBody extends TeaModel {
    /**
     * <p>The version information.</p>
     */
    @NameInMap("moduleVersion")
    public GetRegistryModuleVersionResponseBodyModuleVersion moduleVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62DF26B0-53F0-5747-9D7F-FEF444FB4E24</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRegistryModuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryModuleVersionResponseBody self = new GetRegistryModuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegistryModuleVersionResponseBody setModuleVersion(GetRegistryModuleVersionResponseBodyModuleVersion moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public GetRegistryModuleVersionResponseBodyModuleVersion getModuleVersion() {
        return this.moduleVersion;
    }

    public GetRegistryModuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRegistryModuleVersionResponseBodyModuleVersion extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-08T02:22:16Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The product page URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("detailUrl")
        public String detailUrl;

        /**
         * <p>The number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("downloads")
        public String downloads;

        /**
         * <p>The template name.</p>
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
         * <p>alibabacloud</p>
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
         * <p>The template source.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaceName/ModuleName</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The template source URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("sourceUrl")
        public String sourceUrl;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetRegistryModuleVersionResponseBodyModuleVersion build(java.util.Map<String, ?> map) throws Exception {
            GetRegistryModuleVersionResponseBodyModuleVersion self = new GetRegistryModuleVersionResponseBodyModuleVersion();
            return TeaModel.build(map, self);
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setDownloads(String downloads) {
            this.downloads = downloads;
            return this;
        }
        public String getDownloads() {
            return this.downloads;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public GetRegistryModuleVersionResponseBodyModuleVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
