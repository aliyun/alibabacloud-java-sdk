// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersByIpsRequest extends TeaModel {
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

    public static DescribeMachineInfoOpersByIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersByIpsRequest self = new DescribeMachineInfoOpersByIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersByIpsRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeMachineInfoOpersByIpsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public DescribeMachineInfoOpersByIpsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMachineInfoOpersByIpsRequest setGcLevels(String gcLevels) {
        this.gcLevels = gcLevels;
        return this;
    }
    public String getGcLevels() {
        return this.gcLevels;
    }

    public DescribeMachineInfoOpersByIpsRequest setIPs(String IPs) {
        this.IPs = IPs;
        return this;
    }
    public String getIPs() {
        return this.IPs;
    }

    public DescribeMachineInfoOpersByIpsRequest setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public DescribeMachineInfoOpersByIpsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMachineInfoOpersByIpsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeMachineInfoOpersByIpsRequest setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
        return this;
    }
    public String getUpdateVersion() {
        return this.updateVersion;
    }

    public DescribeMachineInfoOpersByIpsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
