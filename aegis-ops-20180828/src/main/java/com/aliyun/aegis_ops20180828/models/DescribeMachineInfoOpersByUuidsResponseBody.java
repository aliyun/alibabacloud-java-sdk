// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersByUuidsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("MachineInfoOpers")
    public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers machineInfoOpers;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMachineInfoOpersByUuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersByUuidsResponseBody self = new DescribeMachineInfoOpersByUuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersByUuidsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMachineInfoOpersByUuidsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMachineInfoOpersByUuidsResponseBody setMachineInfoOpers(DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers machineInfoOpers) {
        this.machineInfoOpers = machineInfoOpers;
        return this;
    }
    public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers getMachineInfoOpers() {
        return this.machineInfoOpers;
    }

    public DescribeMachineInfoOpersByUuidsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMachineInfoOpersByUuidsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper extends TeaModel {
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

        public static DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper self = new DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper();
            return TeaModel.build(map, self);
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper setUpdateVersion(String updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public String getUpdateVersion() {
            return this.updateVersion;
        }

    }

    public static class DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers extends TeaModel {
        @NameInMap("MachineInfoOper")
        public java.util.List<DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper> machineInfoOper;

        public static DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers self = new DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers();
            return TeaModel.build(map, self);
        }

        public DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpers setMachineInfoOper(java.util.List<DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper> machineInfoOper) {
            this.machineInfoOper = machineInfoOper;
            return this;
        }
        public java.util.List<DescribeMachineInfoOpersByUuidsResponseBodyMachineInfoOpersMachineInfoOper> getMachineInfoOper() {
            return this.machineInfoOper;
        }

    }

}
