// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AppDefaultVersion")
    public String appDefaultVersion;

    /**
     * <strong>example:</strong>
     * <p>This is app description.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    @NameInMap("AppDescriptorFiles")
    public java.util.List<GetGlobalAppResponseBodyAppDescriptorFiles> appDescriptorFiles;

    /**
     * <strong>example:</strong>
     * <p>WDL / CWL</p>
     */
    @NameInMap("AppDescriptorType")
    public String appDescriptorType;

    /**
     * <strong>example:</strong>
     * <p>实际使用时，计算该应用消耗的资源费用</p>
     */
    @NameInMap("AppFee")
    public String appFee;

    /**
     * <strong>example:</strong>
     * <p>joint-calling</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>OpenAccess / Protected</p>
     */
    @NameInMap("AppScope")
    public String appScope;

    /**
     * <strong>example:</strong>
     * <p>workflow</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>1.2a-3</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppVersions")
    public java.util.List<GetGlobalAppResponseBodyAppVersions> appVersions;

    @NameInMap("Categories")
    public java.util.List<String> categories;

    /**
     * <strong>example:</strong>
     * <p>初始版本</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:support@sentieon.com">support@sentieon.com</a></p>
     */
    @NameInMap("Contact")
    public String contact;

    /**
     * <strong>example:</strong>
     * <p>DAG</p>
     */
    @NameInMap("DAG")
    public String DAG;

    /**
     * <strong>example:</strong>
     * <p>The app details.</p>
     */
    @NameInMap("Document")
    public String document;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>yyyy/MM/dd HH:mm:ss</p>
     */
    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Links")
    public java.util.List<String> links;

    @NameInMap("Locations")
    public java.util.List<String> locations;

    /**
     * <strong>example:</strong>
     * <p>sentieon</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Pinned")
    public Boolean pinned;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Sentieon</p>
     */
    @NameInMap("Toolkit")
    public String toolkit;

    public static GetGlobalAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppResponseBody self = new GetGlobalAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGlobalAppResponseBody setAppDefaultVersion(String appDefaultVersion) {
        this.appDefaultVersion = appDefaultVersion;
        return this;
    }
    public String getAppDefaultVersion() {
        return this.appDefaultVersion;
    }

    public GetGlobalAppResponseBody setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public GetGlobalAppResponseBody setAppDescriptorFiles(java.util.List<GetGlobalAppResponseBodyAppDescriptorFiles> appDescriptorFiles) {
        this.appDescriptorFiles = appDescriptorFiles;
        return this;
    }
    public java.util.List<GetGlobalAppResponseBodyAppDescriptorFiles> getAppDescriptorFiles() {
        return this.appDescriptorFiles;
    }

    public GetGlobalAppResponseBody setAppDescriptorType(String appDescriptorType) {
        this.appDescriptorType = appDescriptorType;
        return this;
    }
    public String getAppDescriptorType() {
        return this.appDescriptorType;
    }

    public GetGlobalAppResponseBody setAppFee(String appFee) {
        this.appFee = appFee;
        return this;
    }
    public String getAppFee() {
        return this.appFee;
    }

    public GetGlobalAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetGlobalAppResponseBody setAppScope(String appScope) {
        this.appScope = appScope;
        return this;
    }
    public String getAppScope() {
        return this.appScope;
    }

    public GetGlobalAppResponseBody setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetGlobalAppResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetGlobalAppResponseBody setAppVersions(java.util.List<GetGlobalAppResponseBodyAppVersions> appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public java.util.List<GetGlobalAppResponseBodyAppVersions> getAppVersions() {
        return this.appVersions;
    }

    public GetGlobalAppResponseBody setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public GetGlobalAppResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetGlobalAppResponseBody setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public GetGlobalAppResponseBody setDAG(String DAG) {
        this.DAG = DAG;
        return this;
    }
    public String getDAG() {
        return this.DAG;
    }

    public GetGlobalAppResponseBody setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public GetGlobalAppResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetGlobalAppResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public GetGlobalAppResponseBody setLinks(java.util.List<String> links) {
        this.links = links;
        return this;
    }
    public java.util.List<String> getLinks() {
        return this.links;
    }

    public GetGlobalAppResponseBody setLocations(java.util.List<String> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<String> getLocations() {
        return this.locations;
    }

    public GetGlobalAppResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetGlobalAppResponseBody setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public GetGlobalAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGlobalAppResponseBody setToolkit(String toolkit) {
        this.toolkit = toolkit;
        return this;
    }
    public String getToolkit() {
        return this.toolkit;
    }

    public static class GetGlobalAppResponseBodyAppDescriptorFiles extends TeaModel {
        @NameInMap("Checksum")
        public String checksum;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>PRIMARY_DESCRIPTOR（主WDL） SECONDARY_DESCRIPTOR（依赖WDL）  CONFIG（推荐的输入参数）  CONTAINERFILE（镜像制作文件）  DATA（输入参数中引用的参考文件）  OTHER（其他）</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>./main.wdl</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("Url")
        public String url;

        public static GetGlobalAppResponseBodyAppDescriptorFiles build(java.util.Map<String, ?> map) throws Exception {
            GetGlobalAppResponseBodyAppDescriptorFiles self = new GetGlobalAppResponseBodyAppDescriptorFiles();
            return TeaModel.build(map, self);
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetGlobalAppResponseBodyAppVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>初始版本</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>yyyy/MM/dd HH:mm:ss</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        public static GetGlobalAppResponseBodyAppVersions build(java.util.Map<String, ?> map) throws Exception {
            GetGlobalAppResponseBodyAppVersions self = new GetGlobalAppResponseBodyAppVersions();
            return TeaModel.build(map, self);
        }

        public GetGlobalAppResponseBodyAppVersions setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetGlobalAppResponseBodyAppVersions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetGlobalAppResponseBodyAppVersions setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

    }

}
