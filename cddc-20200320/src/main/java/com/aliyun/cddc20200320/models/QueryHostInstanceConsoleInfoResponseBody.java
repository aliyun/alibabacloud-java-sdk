// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class QueryHostInstanceConsoleInfoResponseBody extends TeaModel {
    @NameInMap("HostInstanceConsoleInfos")
    public java.util.List<QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryHostInstanceConsoleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHostInstanceConsoleInfoResponseBody self = new QueryHostInstanceConsoleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHostInstanceConsoleInfoResponseBody setHostInstanceConsoleInfos(java.util.List<QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos> hostInstanceConsoleInfos) {
        this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
        return this;
    }
    public java.util.List<QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos> getHostInstanceConsoleInfos() {
        return this.hostInstanceConsoleInfos;
    }

    public QueryHostInstanceConsoleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo extends TeaModel {
        @NameInMap("CpuRatio")
        public Float cpuRatio;

        @NameInMap("DiskCurr")
        public Float diskCurr;

        @NameInMap("MemRatio")
        public Float memRatio;

        @NameInMap("PerfIdbPio")
        public Float perfIdbPio;

        public static QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo self = new QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo();
            return TeaModel.build(map, self);
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo setCpuRatio(Float cpuRatio) {
            this.cpuRatio = cpuRatio;
            return this;
        }
        public Float getCpuRatio() {
            return this.cpuRatio;
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

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo setPerfIdbPio(Float perfIdbPio) {
            this.perfIdbPio = perfIdbPio;
            return this;
        }
        public Float getPerfIdbPio() {
            return this.perfIdbPio;
        }

    }

    public static class QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos extends TeaModel {
        @NameInMap("CpuCores")
        public Integer cpuCores;

        @NameInMap("CpuIncreaseRatioValue")
        public Integer cpuIncreaseRatioValue;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("LevelName")
        public String levelName;

        @NameInMap("MaxConnIncreaseRatioValue")
        public Integer maxConnIncreaseRatioValue;

        @NameInMap("MemSize")
        public Integer memSize;

        @NameInMap("MemoryIncreaseRatioValue")
        public Integer memoryIncreaseRatioValue;

        @NameInMap("PerfInfo")
        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo perfInfo;

        @NameInMap("Port")
        public String port;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

        public static QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos self = new QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos();
            return TeaModel.build(map, self);
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setCpuIncreaseRatioValue(Integer cpuIncreaseRatioValue) {
            this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
            return this;
        }
        public Integer getCpuIncreaseRatioValue() {
            return this.cpuIncreaseRatioValue;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
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

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setMemoryIncreaseRatioValue(Integer memoryIncreaseRatioValue) {
            this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
            return this;
        }
        public Integer getMemoryIncreaseRatioValue() {
            return this.memoryIncreaseRatioValue;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setPerfInfo(QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo perfInfo) {
            this.perfInfo = perfInfo;
            return this;
        }
        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfosPerfInfo getPerfInfo() {
            return this.perfInfo;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryHostInstanceConsoleInfoResponseBodyHostInstanceConsoleInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
