// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("MachineInfoOpers")
    public DescribeMachineInfoOpersResponseBodyMachineInfoOpers machineInfoOpers;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMachineInfoOpersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersResponseBody self = new DescribeMachineInfoOpersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMachineInfoOpersResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMachineInfoOpersResponseBody setMachineInfoOpers(DescribeMachineInfoOpersResponseBodyMachineInfoOpers machineInfoOpers) {
        this.machineInfoOpers = machineInfoOpers;
        return this;
    }
    public DescribeMachineInfoOpersResponseBodyMachineInfoOpers getMachineInfoOpers() {
        return this.machineInfoOpers;
    }

    public DescribeMachineInfoOpersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMachineInfoOpersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper extends TeaModel {
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

        public static DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper self = new DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper();
            return TeaModel.build(map, self);
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper setUpdateVersion(String updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public String getUpdateVersion() {
            return this.updateVersion;
        }

    }

    public static class DescribeMachineInfoOpersResponseBodyMachineInfoOpers extends TeaModel {
        @NameInMap("MachineInfoOper")
        public java.util.List<DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper> machineInfoOper;

        public static DescribeMachineInfoOpersResponseBodyMachineInfoOpers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMachineInfoOpersResponseBodyMachineInfoOpers self = new DescribeMachineInfoOpersResponseBodyMachineInfoOpers();
            return TeaModel.build(map, self);
        }

        public DescribeMachineInfoOpersResponseBodyMachineInfoOpers setMachineInfoOper(java.util.List<DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper> machineInfoOper) {
            this.machineInfoOper = machineInfoOper;
            return this;
        }
        public java.util.List<DescribeMachineInfoOpersResponseBodyMachineInfoOpersMachineInfoOper> getMachineInfoOper() {
            return this.machineInfoOper;
        }

    }

}
