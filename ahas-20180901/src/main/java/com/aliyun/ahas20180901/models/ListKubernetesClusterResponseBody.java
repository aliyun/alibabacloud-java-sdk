// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListKubernetesClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListKubernetesClusterResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKubernetesClusterResponseBody self = new ListKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKubernetesClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKubernetesClusterResponseBody setData(ListKubernetesClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKubernetesClusterResponseBodyData getData() {
        return this.data;
    }

    public ListKubernetesClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKubernetesClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKubernetesClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKubernetesClusterResponseBodyDataResult extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ConnectTime")
        public Long connectTime;

        @NameInMap("OnlineCount")
        public Integer onlineCount;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("Upgrade")
        public Boolean upgrade;

        @NameInMap("UpgradeVersion")
        public String upgradeVersion;

        @NameInMap("Version")
        public String version;

        @NameInMap("chaosTools")
        public java.util.List<String> chaosTools;

        public static ListKubernetesClusterResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListKubernetesClusterResponseBodyDataResult self = new ListKubernetesClusterResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListKubernetesClusterResponseBodyDataResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListKubernetesClusterResponseBodyDataResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListKubernetesClusterResponseBodyDataResult setConnectTime(Long connectTime) {
            this.connectTime = connectTime;
            return this;
        }
        public Long getConnectTime() {
            return this.connectTime;
        }

        public ListKubernetesClusterResponseBodyDataResult setOnlineCount(Integer onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Integer getOnlineCount() {
            return this.onlineCount;
        }

        public ListKubernetesClusterResponseBodyDataResult setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public ListKubernetesClusterResponseBodyDataResult setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public ListKubernetesClusterResponseBodyDataResult setUpgradeVersion(String upgradeVersion) {
            this.upgradeVersion = upgradeVersion;
            return this;
        }
        public String getUpgradeVersion() {
            return this.upgradeVersion;
        }

        public ListKubernetesClusterResponseBodyDataResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListKubernetesClusterResponseBodyDataResult setChaosTools(java.util.List<String> chaosTools) {
            this.chaosTools = chaosTools;
            return this;
        }
        public java.util.List<String> getChaosTools() {
            return this.chaosTools;
        }

    }

    public static class ListKubernetesClusterResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListKubernetesClusterResponseBodyDataResult> result;

        @NameInMap("TotalItem")
        public Long totalItem;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListKubernetesClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKubernetesClusterResponseBodyData self = new ListKubernetesClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKubernetesClusterResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListKubernetesClusterResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListKubernetesClusterResponseBodyData setResult(java.util.List<ListKubernetesClusterResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListKubernetesClusterResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListKubernetesClusterResponseBodyData setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public ListKubernetesClusterResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
