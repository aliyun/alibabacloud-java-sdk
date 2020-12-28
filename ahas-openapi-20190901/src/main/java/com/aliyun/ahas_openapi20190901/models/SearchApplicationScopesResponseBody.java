// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class SearchApplicationScopesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public java.util.List<SearchApplicationScopesResponseBodyContent> content;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchApplicationScopesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchApplicationScopesResponseBody self = new SearchApplicationScopesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchApplicationScopesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchApplicationScopesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchApplicationScopesResponseBody setContent(java.util.List<SearchApplicationScopesResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<SearchApplicationScopesResponseBodyContent> getContent() {
        return this.content;
    }

    public SearchApplicationScopesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchApplicationScopesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchApplicationScopesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchApplicationScopesResponseBodyContent extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ConfigurationId")
        public String configurationId;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public Integer deviceType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("HostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static SearchApplicationScopesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            SearchApplicationScopesResponseBodyContent self = new SearchApplicationScopesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public SearchApplicationScopesResponseBodyContent setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SearchApplicationScopesResponseBodyContent setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public SearchApplicationScopesResponseBodyContent setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SearchApplicationScopesResponseBodyContent setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public SearchApplicationScopesResponseBodyContent setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public SearchApplicationScopesResponseBodyContent setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchApplicationScopesResponseBodyContent setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SearchApplicationScopesResponseBodyContent setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchApplicationScopesResponseBodyContent setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public SearchApplicationScopesResponseBodyContent setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchApplicationScopesResponseBodyContent setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public SearchApplicationScopesResponseBodyContent setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public SearchApplicationScopesResponseBodyContent setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
