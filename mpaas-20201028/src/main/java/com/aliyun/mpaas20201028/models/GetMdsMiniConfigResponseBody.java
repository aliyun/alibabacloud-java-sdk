// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMdsMiniConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetMdsMiniConfigResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMdsMiniConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMdsMiniConfigResponseBody self = new GetMdsMiniConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMdsMiniConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMdsMiniConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMdsMiniConfigResponseBody setResultContent(GetMdsMiniConfigResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetMdsMiniConfigResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetMdsMiniConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("ConfigStatus")
        public Long configStatus;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("Id")
        public Long id;

        public static GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList self = new GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setConfigStatus(Long configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public Long getConfigStatus() {
            return this.configStatus;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("ConfigStatus")
        public Long configStatus;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("Id")
        public Long id;

        public static GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch self = new GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setConfigStatus(Long configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public Long getConfigStatus() {
            return this.configStatus;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("ConfigStatus")
        public Long configStatus;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("Id")
        public Long id;

        public static GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList self = new GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setConfigStatus(Long configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public Long getConfigStatus() {
            return this.configStatus;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("ConfigStatus")
        public Long configStatus;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("Id")
        public Long id;

        public static GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList self = new GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setConfigStatus(Long configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public Long getConfigStatus() {
            return this.configStatus;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetMdsMiniConfigResponseBodyResultContentDataContent extends TeaModel {
        @NameInMap("ApiConfigList")
        public java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList> apiConfigList;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("EnableServerDomainCount")
        public String enableServerDomainCount;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("PrivilegeSwitch")
        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch privilegeSwitch;

        @NameInMap("ServerDomainConfigList")
        public java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList> serverDomainConfigList;

        @NameInMap("WebviewDomainConfigList")
        public java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList> webviewDomainConfigList;

        public static GetMdsMiniConfigResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContentDataContent self = new GetMdsMiniConfigResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setApiConfigList(java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList> apiConfigList) {
            this.apiConfigList = apiConfigList;
            return this;
        }
        public java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentApiConfigList> getApiConfigList() {
            return this.apiConfigList;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setEnableServerDomainCount(String enableServerDomainCount) {
            this.enableServerDomainCount = enableServerDomainCount;
            return this;
        }
        public String getEnableServerDomainCount() {
            return this.enableServerDomainCount;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setPrivilegeSwitch(GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch privilegeSwitch) {
            this.privilegeSwitch = privilegeSwitch;
            return this;
        }
        public GetMdsMiniConfigResponseBodyResultContentDataContentPrivilegeSwitch getPrivilegeSwitch() {
            return this.privilegeSwitch;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setServerDomainConfigList(java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList> serverDomainConfigList) {
            this.serverDomainConfigList = serverDomainConfigList;
            return this;
        }
        public java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentServerDomainConfigList> getServerDomainConfigList() {
            return this.serverDomainConfigList;
        }

        public GetMdsMiniConfigResponseBodyResultContentDataContent setWebviewDomainConfigList(java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList> webviewDomainConfigList) {
            this.webviewDomainConfigList = webviewDomainConfigList;
            return this;
        }
        public java.util.List<GetMdsMiniConfigResponseBodyResultContentDataContentWebviewDomainConfigList> getWebviewDomainConfigList() {
            return this.webviewDomainConfigList;
        }

    }

    public static class GetMdsMiniConfigResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public GetMdsMiniConfigResponseBodyResultContentDataContent content;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static GetMdsMiniConfigResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContentData self = new GetMdsMiniConfigResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContentData setContent(GetMdsMiniConfigResponseBodyResultContentDataContent content) {
            this.content = content;
            return this;
        }
        public GetMdsMiniConfigResponseBodyResultContentDataContent getContent() {
            return this.content;
        }

        public GetMdsMiniConfigResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMdsMiniConfigResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetMdsMiniConfigResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class GetMdsMiniConfigResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public GetMdsMiniConfigResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static GetMdsMiniConfigResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetMdsMiniConfigResponseBodyResultContent self = new GetMdsMiniConfigResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetMdsMiniConfigResponseBodyResultContent setData(GetMdsMiniConfigResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetMdsMiniConfigResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetMdsMiniConfigResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
