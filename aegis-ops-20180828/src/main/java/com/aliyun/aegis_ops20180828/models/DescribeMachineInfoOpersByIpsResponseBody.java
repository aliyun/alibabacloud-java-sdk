// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersByIpsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("MachineInfoOpers")
    public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers machineInfoOpers;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMachineInfoOpersByIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersByIpsResponseBody self = new DescribeMachineInfoOpersByIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersByIpsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMachineInfoOpersByIpsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMachineInfoOpersByIpsResponseBody setMachineInfoOpers(DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers machineInfoOpers) {
        this.machineInfoOpers = machineInfoOpers;
        return this;
    }
    public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers getMachineInfoOpers() {
        return this.machineInfoOpers;
    }

    public DescribeMachineInfoOpersByIpsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMachineInfoOpersByIpsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("GcLevel")
        public String gcLevel;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("updateVersion")
        public String updateVersion;

        public static DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper self = new DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper();
            return TeaModel.build(map, self);
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper setUpdateVersion(String updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public String getUpdateVersion() {
            return this.updateVersion;
        }

    }

    public static class DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers extends TeaModel {
        @NameInMap("MachineInfoOper")
        public java.util.List<DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper> machineInfoOper;

        public static DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers self = new DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers();
            return TeaModel.build(map, self);
        }

        public DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpers setMachineInfoOper(java.util.List<DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper> machineInfoOper) {
            this.machineInfoOper = machineInfoOper;
            return this;
        }
        public java.util.List<DescribeMachineInfoOpersByIpsResponseBodyMachineInfoOpersMachineInfoOper> getMachineInfoOper() {
            return this.machineInfoOper;
        }

    }

}
