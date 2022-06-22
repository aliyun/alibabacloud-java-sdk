// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPluginsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPluginsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPluginsResponseBody self = new QueryPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPluginsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPluginsResponseBody setData(QueryPluginsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPluginsResponseBodyData getData() {
        return this.data;
    }

    public QueryPluginsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPluginsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPluginsResponseBodyDataResult extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("canAutoInstall")
        public Boolean canAutoInstall;

        @NameInMap("chaosTools")
        public java.util.List<String> chaosTools;

        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("connectTime")
        public String connectTime;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("installMode")
        public String installMode;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("link")
        public String link;

        @NameInMap("osType")
        public Integer osType;

        @NameInMap("pluginStatus")
        public Integer pluginStatus;

        @NameInMap("pluginType")
        public String pluginType;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("publicIp")
        public String publicIp;

        @NameInMap("upgrade")
        public Boolean upgrade;

        @NameInMap("upgradeVersion")
        public String upgradeVersion;

        @NameInMap("version")
        public String version;

        public static QueryPluginsResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryPluginsResponseBodyDataResult self = new QueryPluginsResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryPluginsResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryPluginsResponseBodyDataResult setCanAutoInstall(Boolean canAutoInstall) {
            this.canAutoInstall = canAutoInstall;
            return this;
        }
        public Boolean getCanAutoInstall() {
            return this.canAutoInstall;
        }

        public QueryPluginsResponseBodyDataResult setChaosTools(java.util.List<String> chaosTools) {
            this.chaosTools = chaosTools;
            return this;
        }
        public java.util.List<String> getChaosTools() {
            return this.chaosTools;
        }

        public QueryPluginsResponseBodyDataResult setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryPluginsResponseBodyDataResult setConnectTime(String connectTime) {
            this.connectTime = connectTime;
            return this;
        }
        public String getConnectTime() {
            return this.connectTime;
        }

        public QueryPluginsResponseBodyDataResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPluginsResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryPluginsResponseBodyDataResult setInstallMode(String installMode) {
            this.installMode = installMode;
            return this;
        }
        public String getInstallMode() {
            return this.installMode;
        }

        public QueryPluginsResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryPluginsResponseBodyDataResult setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryPluginsResponseBodyDataResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryPluginsResponseBodyDataResult setOsType(Integer osType) {
            this.osType = osType;
            return this;
        }
        public Integer getOsType() {
            return this.osType;
        }

        public QueryPluginsResponseBodyDataResult setPluginStatus(Integer pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public Integer getPluginStatus() {
            return this.pluginStatus;
        }

        public QueryPluginsResponseBodyDataResult setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryPluginsResponseBodyDataResult setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryPluginsResponseBodyDataResult setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public QueryPluginsResponseBodyDataResult setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public QueryPluginsResponseBodyDataResult setUpgradeVersion(String upgradeVersion) {
            this.upgradeVersion = upgradeVersion;
            return this;
        }
        public String getUpgradeVersion() {
            return this.upgradeVersion;
        }

        public QueryPluginsResponseBodyDataResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryPluginsResponseBodyData extends TeaModel {
        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("result")
        public java.util.List<QueryPluginsResponseBodyDataResult> result;

        @NameInMap("totalItem")
        public Long totalItem;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static QueryPluginsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPluginsResponseBodyData self = new QueryPluginsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPluginsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPluginsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPluginsResponseBodyData setResult(java.util.List<QueryPluginsResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryPluginsResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryPluginsResponseBodyData setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public QueryPluginsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
