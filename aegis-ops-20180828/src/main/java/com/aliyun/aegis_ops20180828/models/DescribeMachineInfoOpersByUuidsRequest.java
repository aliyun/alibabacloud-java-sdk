// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersByUuidsRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GcLevels")
    public String gcLevels;

    @NameInMap("IPs")
    public String IPs;

    @NameInMap("Online")
    public Boolean online;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("UpdateVersion")
    public String updateVersion;

    @NameInMap("Uuids")
    public String uuids;

    public static DescribeMachineInfoOpersByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersByUuidsRequest self = new DescribeMachineInfoOpersByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersByUuidsRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeMachineInfoOpersByUuidsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public DescribeMachineInfoOpersByUuidsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMachineInfoOpersByUuidsRequest setGcLevels(String gcLevels) {
        this.gcLevels = gcLevels;
        return this;
    }
    public String getGcLevels() {
        return this.gcLevels;
    }

    public DescribeMachineInfoOpersByUuidsRequest setIPs(String IPs) {
        this.IPs = IPs;
        return this;
    }
    public String getIPs() {
        return this.IPs;
    }

    public DescribeMachineInfoOpersByUuidsRequest setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public DescribeMachineInfoOpersByUuidsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMachineInfoOpersByUuidsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeMachineInfoOpersByUuidsRequest setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
        return this;
    }
    public String getUpdateVersion() {
        return this.updateVersion;
    }

    public DescribeMachineInfoOpersByUuidsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
