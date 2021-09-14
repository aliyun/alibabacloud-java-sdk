// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeHostInstanceMonitorInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public java.util.List<DescribeHostInstanceMonitorInfoResponseBodyItems> items;

    public static DescribeHostInstanceMonitorInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostInstanceMonitorInfoResponseBody self = new DescribeHostInstanceMonitorInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostInstanceMonitorInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostInstanceMonitorInfoResponseBody setItems(java.util.List<DescribeHostInstanceMonitorInfoResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHostInstanceMonitorInfoResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog extends TeaModel {
        @NameInMap("SwitchFrom")
        public Float switchFrom;

        @NameInMap("SwitchType")
        public Float switchType;

        @NameInMap("SwitchTime")
        public Long switchTime;

        public static DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog self = new DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog();
            return TeaModel.build(map, self);
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog setSwitchFrom(Float switchFrom) {
            this.switchFrom = switchFrom;
            return this;
        }
        public Float getSwitchFrom() {
            return this.switchFrom;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog setSwitchType(Float switchType) {
            this.switchType = switchType;
            return this;
        }
        public Float getSwitchType() {
            return this.switchType;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog setSwitchTime(Long switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public Long getSwitchTime() {
            return this.switchTime;
        }

    }

    public static class DescribeHostInstanceMonitorInfoResponseBodyItems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("MemSize")
        public Integer memSize;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("LevelName")
        public String levelName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("Role")
        public String role;

        @NameInMap("Port")
        public String port;

        @NameInMap("CpuCores")
        public Integer cpuCores;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("AuroraSwitchInstanceLog")
        public DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog auroraSwitchInstanceLog;

        public static DescribeHostInstanceMonitorInfoResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostInstanceMonitorInfoResponseBodyItems self = new DescribeHostInstanceMonitorInfoResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setMemSize(Integer memSize) {
            this.memSize = memSize;
            return this;
        }
        public Integer getMemSize() {
            return this.memSize;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeHostInstanceMonitorInfoResponseBodyItems setAuroraSwitchInstanceLog(DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog auroraSwitchInstanceLog) {
            this.auroraSwitchInstanceLog = auroraSwitchInstanceLog;
            return this;
        }
        public DescribeHostInstanceMonitorInfoResponseBodyItemsAuroraSwitchInstanceLog getAuroraSwitchInstanceLog() {
            return this.auroraSwitchInstanceLog;
        }

    }

}
