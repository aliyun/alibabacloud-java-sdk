// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppImageResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppImageResponseBody self = new ListAppImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppImageResponseBody setData(java.util.List<ListAppImageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppImageResponseBodyData> getData() {
        return this.data;
    }

    public ListAppImageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAppImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppImageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppImageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppImageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppImageResponseBodyDataAdaptor extends TeaModel {
        @NameInMap("AdaptorMessage")
        public String adaptorMessage;

        @NameInMap("AppIconUrl")
        public String appIconUrl;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppScript")
        public String appScript;

        @NameInMap("AppType")
        public Integer appType;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("DisActive")
        public Boolean disActive;

        @NameInMap("DistributeStatus")
        public Integer distributeStatus;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IsLoginFree")
        public Boolean isLoginFree;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("LoginConfig")
        public String loginConfig;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("OriginAppType")
        public Integer originAppType;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubAppType")
        public String subAppType;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("VersionUid")
        public String versionUid;

        public static ListAppImageResponseBodyDataAdaptor build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataAdaptor self = new ListAppImageResponseBodyDataAdaptor();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataAdaptor setAdaptorMessage(String adaptorMessage) {
            this.adaptorMessage = adaptorMessage;
            return this;
        }
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        public ListAppImageResponseBodyDataAdaptor setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public ListAppImageResponseBodyDataAdaptor setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppImageResponseBodyDataAdaptor setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAppImageResponseBodyDataAdaptor setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppImageResponseBodyDataAdaptor setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public ListAppImageResponseBodyDataAdaptor setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListAppImageResponseBodyDataAdaptor setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppImageResponseBodyDataAdaptor setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppImageResponseBodyDataAdaptor setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public ListAppImageResponseBodyDataAdaptor setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListAppImageResponseBodyDataAdaptor setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public ListAppImageResponseBodyDataAdaptor setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ListAppImageResponseBodyDataAdaptor setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public ListAppImageResponseBodyDataAdaptor setDisActive(Boolean disActive) {
            this.disActive = disActive;
            return this;
        }
        public Boolean getDisActive() {
            return this.disActive;
        }

        public ListAppImageResponseBodyDataAdaptor setDistributeStatus(Integer distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }
        public Integer getDistributeStatus() {
            return this.distributeStatus;
        }

        public ListAppImageResponseBodyDataAdaptor setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListAppImageResponseBodyDataAdaptor setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListAppImageResponseBodyDataAdaptor setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppImageResponseBodyDataAdaptor setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppImageResponseBodyDataAdaptor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyDataAdaptor setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAppImageResponseBodyDataAdaptor setIsLoginFree(Boolean isLoginFree) {
            this.isLoginFree = isLoginFree;
            return this;
        }
        public Boolean getIsLoginFree() {
            return this.isLoginFree;
        }

        public ListAppImageResponseBodyDataAdaptor setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppImageResponseBodyDataAdaptor setLoginConfig(String loginConfig) {
            this.loginConfig = loginConfig;
            return this;
        }
        public String getLoginConfig() {
            return this.loginConfig;
        }

        public ListAppImageResponseBodyDataAdaptor setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListAppImageResponseBodyDataAdaptor setOriginAppType(Integer originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public Integer getOriginAppType() {
            return this.originAppType;
        }

        public ListAppImageResponseBodyDataAdaptor setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppImageResponseBodyDataAdaptor setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppImageResponseBodyDataAdaptor setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListAppImageResponseBodyDataAdaptor setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListAppImageResponseBodyDataAdaptor setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppImageResponseBodyDataAdaptor setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
        }

        public ListAppImageResponseBodyDataAdaptor setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAppImageResponseBodyDataAdaptor setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public ListAppImageResponseBodyDataAdaptor setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

    }

    public static class ListAppImageResponseBodyDataAppAdaptorList extends TeaModel {
        @NameInMap("AdaptorMessage")
        public String adaptorMessage;

        @NameInMap("AppIconUrl")
        public String appIconUrl;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppScript")
        public String appScript;

        @NameInMap("AppType")
        public Integer appType;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("DisActive")
        public Boolean disActive;

        @NameInMap("DistributeStatus")
        public Integer distributeStatus;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IsLoginFree")
        public Boolean isLoginFree;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("LoginConfig")
        public String loginConfig;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("OriginAppType")
        public Integer originAppType;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubAppType")
        public String subAppType;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("VersionUid")
        public String versionUid;

        public static ListAppImageResponseBodyDataAppAdaptorList build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataAppAdaptorList self = new ListAppImageResponseBodyDataAppAdaptorList();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAdaptorMessage(String adaptorMessage) {
            this.adaptorMessage = adaptorMessage;
            return this;
        }
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setDisActive(Boolean disActive) {
            this.disActive = disActive;
            return this;
        }
        public Boolean getDisActive() {
            return this.disActive;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setDistributeStatus(Integer distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }
        public Integer getDistributeStatus() {
            return this.distributeStatus;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setIsLoginFree(Boolean isLoginFree) {
            this.isLoginFree = isLoginFree;
            return this;
        }
        public Boolean getIsLoginFree() {
            return this.isLoginFree;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setLoginConfig(String loginConfig) {
            this.loginConfig = loginConfig;
            return this;
        }
        public String getLoginConfig() {
            return this.loginConfig;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setOriginAppType(Integer originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public Integer getOriginAppType() {
            return this.originAppType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public ListAppImageResponseBodyDataAppAdaptorList setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

    }

    public static class ListAppImageResponseBodyDataAppsTagList extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uid")
        public String uid;

        public static ListAppImageResponseBodyDataAppsTagList build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataAppsTagList self = new ListAppImageResponseBodyDataAppsTagList();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataAppsTagList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppImageResponseBodyDataAppsTagList setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppImageResponseBodyDataAppsTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyDataAppsTagList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppImageResponseBodyDataAppsTagList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListAppImageResponseBodyDataAppsVersionListListAdaptor extends TeaModel {
        @NameInMap("AdaptorMessage")
        public String adaptorMessage;

        @NameInMap("AppIconUrl")
        public String appIconUrl;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppScript")
        public String appScript;

        @NameInMap("AppType")
        public Integer appType;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("DisActive")
        public Boolean disActive;

        @NameInMap("DistributeStatus")
        public Integer distributeStatus;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IsLoginFree")
        public Boolean isLoginFree;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("LoginConfig")
        public String loginConfig;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("OriginAppType")
        public Integer originAppType;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubAppType")
        public String subAppType;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("VersionUid")
        public String versionUid;

        public static ListAppImageResponseBodyDataAppsVersionListListAdaptor build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataAppsVersionListListAdaptor self = new ListAppImageResponseBodyDataAppsVersionListListAdaptor();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAdaptorMessage(String adaptorMessage) {
            this.adaptorMessage = adaptorMessage;
            return this;
        }
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setDisActive(Boolean disActive) {
            this.disActive = disActive;
            return this;
        }
        public Boolean getDisActive() {
            return this.disActive;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setDistributeStatus(Integer distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }
        public Integer getDistributeStatus() {
            return this.distributeStatus;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setIsLoginFree(Boolean isLoginFree) {
            this.isLoginFree = isLoginFree;
            return this;
        }
        public Boolean getIsLoginFree() {
            return this.isLoginFree;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setLoginConfig(String loginConfig) {
            this.loginConfig = loginConfig;
            return this;
        }
        public String getLoginConfig() {
            return this.loginConfig;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setOriginAppType(Integer originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public Integer getOriginAppType() {
            return this.originAppType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public ListAppImageResponseBodyDataAppsVersionListListAdaptor setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

    }

    public static class ListAppImageResponseBodyDataAppsVersionList extends TeaModel {
        @NameInMap("AdaptorComplishCount")
        public Long adaptorComplishCount;

        @NameInMap("AdaptorCount")
        public Long adaptorCount;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileRealName")
        public String fileRealName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ListAdaptor")
        public java.util.List<ListAppImageResponseBodyDataAppsVersionListListAdaptor> listAdaptor;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Uid")
        public String uid;

        public static ListAppImageResponseBodyDataAppsVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataAppsVersionList self = new ListAppImageResponseBodyDataAppsVersionList();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataAppsVersionList setAdaptorComplishCount(Long adaptorComplishCount) {
            this.adaptorComplishCount = adaptorComplishCount;
            return this;
        }
        public Long getAdaptorComplishCount() {
            return this.adaptorComplishCount;
        }

        public ListAppImageResponseBodyDataAppsVersionList setAdaptorCount(Long adaptorCount) {
            this.adaptorCount = adaptorCount;
            return this;
        }
        public Long getAdaptorCount() {
            return this.adaptorCount;
        }

        public ListAppImageResponseBodyDataAppsVersionList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListAppImageResponseBodyDataAppsVersionList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListAppImageResponseBodyDataAppsVersionList setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public ListAppImageResponseBodyDataAppsVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppImageResponseBodyDataAppsVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppImageResponseBodyDataAppsVersionList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyDataAppsVersionList setListAdaptor(java.util.List<ListAppImageResponseBodyDataAppsVersionListListAdaptor> listAdaptor) {
            this.listAdaptor = listAdaptor;
            return this;
        }
        public java.util.List<ListAppImageResponseBodyDataAppsVersionListListAdaptor> getListAdaptor() {
            return this.listAdaptor;
        }

        public ListAppImageResponseBodyDataAppsVersionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppImageResponseBodyDataAppsVersionList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListAppImageResponseBodyDataAppsVersionList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppImageResponseBodyDataAppsVersionList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListAppImageResponseBodyDataAppsVersionList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListAppImageResponseBodyDataApps extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TagList")
        public java.util.List<ListAppImageResponseBodyDataAppsTagList> tagList;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VersionCount")
        public Long versionCount;

        @NameInMap("VersionList")
        public java.util.List<ListAppImageResponseBodyDataAppsVersionList> versionList;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("VersionNumber")
        public String versionNumber;

        public static ListAppImageResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataApps self = new ListAppImageResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppImageResponseBodyDataApps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppImageResponseBodyDataApps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppImageResponseBodyDataApps setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListAppImageResponseBodyDataApps setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyDataApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppImageResponseBodyDataApps setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppImageResponseBodyDataApps setTagList(java.util.List<ListAppImageResponseBodyDataAppsTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<ListAppImageResponseBodyDataAppsTagList> getTagList() {
            return this.tagList;
        }

        public ListAppImageResponseBodyDataApps setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListAppImageResponseBodyDataApps setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAppImageResponseBodyDataApps setVersionCount(Long versionCount) {
            this.versionCount = versionCount;
            return this;
        }
        public Long getVersionCount() {
            return this.versionCount;
        }

        public ListAppImageResponseBodyDataApps setVersionList(java.util.List<ListAppImageResponseBodyDataAppsVersionList> versionList) {
            this.versionList = versionList;
            return this;
        }
        public java.util.List<ListAppImageResponseBodyDataAppsVersionList> getVersionList() {
            return this.versionList;
        }

        public ListAppImageResponseBodyDataApps setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListAppImageResponseBodyDataApps setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

    }

    public static class ListAppImageResponseBodyDataImageConfigDTOS extends TeaModel {
        @NameInMap("AppImage")
        public String appImage;

        @NameInMap("Region")
        public String region;

        @NameInMap("SysImage")
        public String sysImage;

        public static ListAppImageResponseBodyDataImageConfigDTOS build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyDataImageConfigDTOS self = new ListAppImageResponseBodyDataImageConfigDTOS();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyDataImageConfigDTOS setAppImage(String appImage) {
            this.appImage = appImage;
            return this;
        }
        public String getAppImage() {
            return this.appImage;
        }

        public ListAppImageResponseBodyDataImageConfigDTOS setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListAppImageResponseBodyDataImageConfigDTOS setSysImage(String sysImage) {
            this.sysImage = sysImage;
            return this;
        }
        public String getSysImage() {
            return this.sysImage;
        }

    }

    public static class ListAppImageResponseBodyData extends TeaModel {
        @NameInMap("Adaptor")
        public ListAppImageResponseBodyDataAdaptor adaptor;

        @NameInMap("AdaptorId")
        public Long adaptorId;

        @NameInMap("AdaptorUid")
        public String adaptorUid;

        @NameInMap("AliyunImageConfig")
        public String aliyunImageConfig;

        @NameInMap("AliyunImageId")
        public String aliyunImageId;

        @NameInMap("Aliyunuid")
        public Long aliyunuid;

        @NameInMap("AppAdaptorList")
        public java.util.List<ListAppImageResponseBodyDataAppAdaptorList> appAdaptorList;

        @NameInMap("AppGroupId")
        public Long appGroupId;

        @NameInMap("AppGroupUid")
        public String appGroupUid;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppScript")
        public String appScript;

        @NameInMap("AppType")
        public Integer appType;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        @NameInMap("Apps")
        public java.util.List<ListAppImageResponseBodyDataApps> apps;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("DistributeStatus")
        public Integer distributeStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageConfigDTOS")
        public java.util.List<ListAppImageResponseBodyDataImageConfigDTOS> imageConfigDTOS;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("OtaStatus")
        public Integer otaStatus;

        @NameInMap("OtaVersion")
        public String otaVersion;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RegionStatus")
        public Integer regionStatus;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uid")
        public String uid;

        public static ListAppImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppImageResponseBodyData self = new ListAppImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppImageResponseBodyData setAdaptor(ListAppImageResponseBodyDataAdaptor adaptor) {
            this.adaptor = adaptor;
            return this;
        }
        public ListAppImageResponseBodyDataAdaptor getAdaptor() {
            return this.adaptor;
        }

        public ListAppImageResponseBodyData setAdaptorId(Long adaptorId) {
            this.adaptorId = adaptorId;
            return this;
        }
        public Long getAdaptorId() {
            return this.adaptorId;
        }

        public ListAppImageResponseBodyData setAdaptorUid(String adaptorUid) {
            this.adaptorUid = adaptorUid;
            return this;
        }
        public String getAdaptorUid() {
            return this.adaptorUid;
        }

        public ListAppImageResponseBodyData setAliyunImageConfig(String aliyunImageConfig) {
            this.aliyunImageConfig = aliyunImageConfig;
            return this;
        }
        public String getAliyunImageConfig() {
            return this.aliyunImageConfig;
        }

        public ListAppImageResponseBodyData setAliyunImageId(String aliyunImageId) {
            this.aliyunImageId = aliyunImageId;
            return this;
        }
        public String getAliyunImageId() {
            return this.aliyunImageId;
        }

        public ListAppImageResponseBodyData setAliyunuid(Long aliyunuid) {
            this.aliyunuid = aliyunuid;
            return this;
        }
        public Long getAliyunuid() {
            return this.aliyunuid;
        }

        public ListAppImageResponseBodyData setAppAdaptorList(java.util.List<ListAppImageResponseBodyDataAppAdaptorList> appAdaptorList) {
            this.appAdaptorList = appAdaptorList;
            return this;
        }
        public java.util.List<ListAppImageResponseBodyDataAppAdaptorList> getAppAdaptorList() {
            return this.appAdaptorList;
        }

        public ListAppImageResponseBodyData setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public ListAppImageResponseBodyData setAppGroupUid(String appGroupUid) {
            this.appGroupUid = appGroupUid;
            return this;
        }
        public String getAppGroupUid() {
            return this.appGroupUid;
        }

        public ListAppImageResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppImageResponseBodyData setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public ListAppImageResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListAppImageResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppImageResponseBodyData setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppImageResponseBodyData setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public ListAppImageResponseBodyData setApps(java.util.List<ListAppImageResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<ListAppImageResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public ListAppImageResponseBodyData setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public ListAppImageResponseBodyData setDistributeStatus(Integer distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }
        public Integer getDistributeStatus() {
            return this.distributeStatus;
        }

        public ListAppImageResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppImageResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppImageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppImageResponseBodyData setImageConfigDTOS(java.util.List<ListAppImageResponseBodyDataImageConfigDTOS> imageConfigDTOS) {
            this.imageConfigDTOS = imageConfigDTOS;
            return this;
        }
        public java.util.List<ListAppImageResponseBodyDataImageConfigDTOS> getImageConfigDTOS() {
            return this.imageConfigDTOS;
        }

        public ListAppImageResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppImageResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppImageResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppImageResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppImageResponseBodyData setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public ListAppImageResponseBodyData setOtaStatus(Integer otaStatus) {
            this.otaStatus = otaStatus;
            return this;
        }
        public Integer getOtaStatus() {
            return this.otaStatus;
        }

        public ListAppImageResponseBodyData setOtaVersion(String otaVersion) {
            this.otaVersion = otaVersion;
            return this;
        }
        public String getOtaVersion() {
            return this.otaVersion;
        }

        public ListAppImageResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListAppImageResponseBodyData setRegionStatus(Integer regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public Integer getRegionStatus() {
            return this.regionStatus;
        }

        public ListAppImageResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppImageResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
