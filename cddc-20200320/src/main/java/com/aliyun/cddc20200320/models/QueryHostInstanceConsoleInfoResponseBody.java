// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class QueryHostInstanceConsoleInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostInstanceConsoleInfos")
    public java.util.List<QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos;

    public static QueryHostInstanceConsoleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHostInstanceConsoleInfoResponseBody self = new QueryHostInstanceConsoleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHostInstanceConsoleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHostInstanceConsoleInfoResponseBody setHostInstanceConsoleInfos(java.util.List<QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos) {
        this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
        return this;
    }
    public java.util.List<QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos> getHostInstanceConsoleInfos() {
        return this.hostInstanceConsoleInfos;
    }

    public static class QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo extends TeaModel {
        @NameInMap("PerfIdbPio")
        public Float perfIdbPio;

        @NameInMap("DiskCurr")
        public Float diskCurr;

        @NameInMap("MemRatio")
        public Float memRatio;

        @NameInMap("CpuRatio")
        public Float cpuRatio;

        public static QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo self = new QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo();
            return TeaModel.build(map, self);
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo setPerfIdbPio(Float perfIdbPio) {
            this.perfIdbPio = perfIdbPio;
            return this;
        }
        public Float getPerfIdbPio() {
            return this.perfIdbPio;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo setDiskCurr(Float diskCurr) {
            this.diskCurr = diskCurr;
            return this;
        }
        public Float getDiskCurr() {
            return this.diskCurr;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo setMemRatio(Float memRatio) {
            this.memRatio = memRatio;
            return this;
        }
        public Float getMemRatio() {
            return this.memRatio;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo setCpuRatio(Float cpuRatio) {
            this.cpuRatio = cpuRatio;
            return this;
        }
        public Float getCpuRatio() {
            return this.cpuRatio;
        }

    }

    public static class QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("MaxConnIncreaseRatioValue")
        public Integer maxConnIncreaseRatioValue;

        @NameInMap("MemSize")
        public Integer memSize;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("MemoryIncreaseRatioValue")
        public Integer memoryIncreaseRatioValue;

        @NameInMap("CpuIncreaseRatioValue")
        public Integer cpuIncreaseRatioValue;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("LevelName")
        public String levelName;

        @NameInMap("Role")
        public String role;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("CpuCores")
        public Integer cpuCores;

        @NameInMap("PerfInfo")
        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo perfInfo;

        public static QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos self = new QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos();
            return TeaModel.build(map, self);
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setMaxConnIncreaseRatioValue(Integer maxConnIncreaseRatioValue) {
            this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
            return this;
        }
        public Integer getMaxConnIncreaseRatioValue() {
            return this.maxConnIncreaseRatioValue;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setMemSize(Integer memSize) {
            this.memSize = memSize;
            return this;
        }
        public Integer getMemSize() {
            return this.memSize;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setMemoryIncreaseRatioValue(Integer memoryIncreaseRatioValue) {
            this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
            return this;
        }
        public Integer getMemoryIncreaseRatioValue() {
            return this.memoryIncreaseRatioValue;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setCpuIncreaseRatioValue(Integer cpuIncreaseRatioValue) {
            this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
            return this;
        }
        public Integer getCpuIncreaseRatioValue() {
            return this.cpuIncreaseRatioValue;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setPerfInfo(QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo perfInfo) {
            this.perfInfo = perfInfo;
            return this;
        }
        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo getPerfInfo() {
            return this.perfInfo;
        }

    }

}
