// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvDetailModel extends TeaModel {
    @NameInMap("BaseTableNames")
    public java.util.List<java.util.List<String>> baseTableNames;

    @NameInMap("ExplicitHit")
    public Long explicitHit;

    @NameInMap("FirstRefreshTime")
    public String firstRefreshTime;

    @NameInMap("ImplicitHit")
    public Long implicitHit;

    @NameInMap("IsInactive")
    public Boolean isInactive;

    @NameInMap("LocalSize")
    public Long localSize;

    @NameInMap("QueryRewriteEnabled")
    public Boolean queryRewriteEnabled;

    @NameInMap("RefreshInterval")
    public String refreshInterval;

    @NameInMap("RefreshState")
    public String refreshState;

    @NameInMap("RemoteSize")
    public Long remoteSize;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static OpenStructMvDetailModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMvDetailModel self = new OpenStructMvDetailModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMvDetailModel setBaseTableNames(java.util.List<java.util.List<String>> baseTableNames) {
        this.baseTableNames = baseTableNames;
        return this;
    }
    public java.util.List<java.util.List<String>> getBaseTableNames() {
        return this.baseTableNames;
    }

    public OpenStructMvDetailModel setExplicitHit(Long explicitHit) {
        this.explicitHit = explicitHit;
        return this;
    }
    public Long getExplicitHit() {
        return this.explicitHit;
    }

    public OpenStructMvDetailModel setFirstRefreshTime(String firstRefreshTime) {
        this.firstRefreshTime = firstRefreshTime;
        return this;
    }
    public String getFirstRefreshTime() {
        return this.firstRefreshTime;
    }

    public OpenStructMvDetailModel setImplicitHit(Long implicitHit) {
        this.implicitHit = implicitHit;
        return this;
    }
    public Long getImplicitHit() {
        return this.implicitHit;
    }

    public OpenStructMvDetailModel setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
        return this;
    }
    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public OpenStructMvDetailModel setLocalSize(Long localSize) {
        this.localSize = localSize;
        return this;
    }
    public Long getLocalSize() {
        return this.localSize;
    }

    public OpenStructMvDetailModel setQueryRewriteEnabled(Boolean queryRewriteEnabled) {
        this.queryRewriteEnabled = queryRewriteEnabled;
        return this;
    }
    public Boolean getQueryRewriteEnabled() {
        return this.queryRewriteEnabled;
    }

    public OpenStructMvDetailModel setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }
    public String getRefreshInterval() {
        return this.refreshInterval;
    }

    public OpenStructMvDetailModel setRefreshState(String refreshState) {
        this.refreshState = refreshState;
        return this;
    }
    public String getRefreshState() {
        return this.refreshState;
    }

    public OpenStructMvDetailModel setRemoteSize(Long remoteSize) {
        this.remoteSize = remoteSize;
        return this;
    }
    public Long getRemoteSize() {
        return this.remoteSize;
    }

    public OpenStructMvDetailModel setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public OpenStructMvDetailModel setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
