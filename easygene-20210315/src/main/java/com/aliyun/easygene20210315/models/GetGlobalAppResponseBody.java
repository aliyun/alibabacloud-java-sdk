// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    // 更新时间
    @NameInMap("LastModified")
    public String lastModified;

    // 命名空间名称
    @NameInMap("NamespaceName")
    public String namespaceName;

    // 应用权限
    @NameInMap("AppScope")
    public String appScope;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用支持的区域
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    // 应用版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 应用类型
    @NameInMap("AppType")
    public String appType;

    // 应用计费说明
    @NameInMap("AppFee")
    public String appFee;

    // 应用描述
    @NameInMap("AppDescription")
    public String appDescription;

    // 应用所属分类
    @NameInMap("Categories")
    public java.util.List<String> categories;

    // 应用所属工具合集
    @NameInMap("Toolkit")
    public String toolkit;

    // 应用联系人信息
    @NameInMap("Contact")
    public String contact;

    // 应用主页信息
    @NameInMap("Links")
    public java.util.List<String> links;

    // 应用的所有版本列表
    @NameInMap("AppVersions")
    public java.util.List<GetGlobalAppResponseBodyAppVersions> appVersions;

    // 默认版本
    @NameInMap("AppDefaultVersion")
    public String appDefaultVersion;

    // 应用描述语言标准(WDL/CWL)
    @NameInMap("AppDescriptorType")
    public String appDescriptorType;

    // 应用的描述文件内容
    @NameInMap("AppDescriptorFiles")
    public java.util.List<GetGlobalAppResponseBodyAppDescriptorFiles> appDescriptorFiles;

    // 应用的帮助文档
    @NameInMap("Document")
    public String document;

    // 应用的备注信息
    @NameInMap("Comment")
    public String comment;

    // 应用的DAG信息
    @NameInMap("DAG")
    public String DAG;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("HostId")
    public String hostId;

    // 应用收藏置顶标记
    @NameInMap("Pinned")
    public Boolean pinned;

    public static GetGlobalAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppResponseBody self = new GetGlobalAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGlobalAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGlobalAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGlobalAppResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetGlobalAppResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public GetGlobalAppResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetGlobalAppResponseBody setAppScope(String appScope) {
        this.appScope = appScope;
        return this;
    }
    public String getAppScope() {
        return this.appScope;
    }

    public GetGlobalAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetGlobalAppResponseBody setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public GetGlobalAppResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetGlobalAppResponseBody setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetGlobalAppResponseBody setAppFee(String appFee) {
        this.appFee = appFee;
        return this;
    }
    public String getAppFee() {
        return this.appFee;
    }

    public GetGlobalAppResponseBody setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public GetGlobalAppResponseBody setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public GetGlobalAppResponseBody setToolkit(String toolkit) {
        this.toolkit = toolkit;
        return this;
    }
    public String getToolkit() {
        return this.toolkit;
    }

    public GetGlobalAppResponseBody setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public GetGlobalAppResponseBody setLinks(java.util.List<String> links) {
        this.links = links;
        return this;
    }
    public java.util.List<String> getLinks() {
        return this.links;
    }

    public GetGlobalAppResponseBody setAppVersions(java.util.List<GetGlobalAppResponseBodyAppVersions> appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public java.util.List<GetGlobalAppResponseBodyAppVersions> getAppVersions() {
        return this.appVersions;
    }

    public GetGlobalAppResponseBody setAppDefaultVersion(String appDefaultVersion) {
        this.appDefaultVersion = appDefaultVersion;
        return this;
    }
    public String getAppDefaultVersion() {
        return this.appDefaultVersion;
    }

    public GetGlobalAppResponseBody setAppDescriptorType(String appDescriptorType) {
        this.appDescriptorType = appDescriptorType;
        return this;
    }
    public String getAppDescriptorType() {
        return this.appDescriptorType;
    }

    public GetGlobalAppResponseBody setAppDescriptorFiles(java.util.List<GetGlobalAppResponseBodyAppDescriptorFiles> appDescriptorFiles) {
        this.appDescriptorFiles = appDescriptorFiles;
        return this;
    }
    public java.util.List<GetGlobalAppResponseBodyAppDescriptorFiles> getAppDescriptorFiles() {
        return this.appDescriptorFiles;
    }

    public GetGlobalAppResponseBody setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public GetGlobalAppResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetGlobalAppResponseBody setDAG(String DAG) {
        this.DAG = DAG;
        return this;
    }
    public String getDAG() {
        return this.DAG;
    }

    public GetGlobalAppResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetGlobalAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGlobalAppResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetGlobalAppResponseBody setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public static class GetGlobalAppResponseBodyAppVersions extends TeaModel {
        // 应用版本
        @NameInMap("AppVersion")
        public String appVersion;

        // 版本描述
        @NameInMap("Comment")
        public String comment;

        // 更新时间
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

    public static class GetGlobalAppResponseBodyAppDescriptorFiles extends TeaModel {
        // 应用文件的类型
        @NameInMap("FileType")
        public String fileType;

        // 应用文件的路径，除PRIMARY_DESCRIPTOR外，其他均为相对于PRIMARY_DESCRIPTOR的相对路径
        @NameInMap("Path")
        public String path;

        // 应用文件内容
        @NameInMap("Content")
        public String content;

        // 应用文件链接
        @NameInMap("Url")
        public String url;

        // 应用文件内容的完整性校验码，如MD5值
        @NameInMap("Checksum")
        public String checksum;

        public static GetGlobalAppResponseBodyAppDescriptorFiles build(java.util.Map<String, ?> map) throws Exception {
            GetGlobalAppResponseBodyAppDescriptorFiles self = new GetGlobalAppResponseBodyAppDescriptorFiles();
            return TeaModel.build(map, self);
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

        public GetGlobalAppResponseBodyAppDescriptorFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetGlobalAppResponseBodyAppDescriptorFiles setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

    }

}
