// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryWaitInstallPluginResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryWaitInstallPluginResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryWaitInstallPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWaitInstallPluginResponseBody self = new QueryWaitInstallPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWaitInstallPluginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWaitInstallPluginResponseBody setData(QueryWaitInstallPluginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryWaitInstallPluginResponseBodyData getData() {
        return this.data;
    }

    public QueryWaitInstallPluginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWaitInstallPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWaitInstallPluginResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWaitInstallPluginResponseBodyDataResult extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("canAutoInstall")
        public Boolean canAutoInstall;

        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("link")
        public String link;

        @NameInMap("networkType")
        public String networkType;

        @NameInMap("osType")
        public String osType;

        @NameInMap("pluginStatus")
        public Integer pluginStatus;

        @NameInMap("pluginType")
        public String pluginType;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("publicIp")
        public String publicIp;

        public static QueryWaitInstallPluginResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWaitInstallPluginResponseBodyDataResult self = new QueryWaitInstallPluginResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryWaitInstallPluginResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setCanAutoInstall(Boolean canAutoInstall) {
            this.canAutoInstall = canAutoInstall;
            return this;
        }
        public Boolean getCanAutoInstall() {
            return this.canAutoInstall;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setPluginStatus(Integer pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public Integer getPluginStatus() {
            return this.pluginStatus;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryWaitInstallPluginResponseBodyDataResult setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

    }

    public static class QueryWaitInstallPluginResponseBodyData extends TeaModel {
        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("result")
        public java.util.List<QueryWaitInstallPluginResponseBodyDataResult> result;

        @NameInMap("totalItem")
        public Long totalItem;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static QueryWaitInstallPluginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWaitInstallPluginResponseBodyData self = new QueryWaitInstallPluginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWaitInstallPluginResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryWaitInstallPluginResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryWaitInstallPluginResponseBodyData setResult(java.util.List<QueryWaitInstallPluginResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryWaitInstallPluginResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryWaitInstallPluginResponseBodyData setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public QueryWaitInstallPluginResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
