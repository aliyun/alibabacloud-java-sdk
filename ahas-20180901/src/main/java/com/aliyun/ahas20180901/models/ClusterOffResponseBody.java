// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ClusterOffResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClusterOffResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ClusterOffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClusterOffResponseBody self = new ClusterOffResponseBody();
        return TeaModel.build(map, self);
    }

    public ClusterOffResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClusterOffResponseBody setData(ClusterOffResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClusterOffResponseBodyData getData() {
        return this.data;
    }

    public ClusterOffResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClusterOffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClusterOffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClusterOffResponseBodyData extends TeaModel {
        @NameInMap("Apps")
        public java.util.List<String> apps;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterQpsLevel")
        public Integer clusterQpsLevel;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxClusterQps")
        public Integer maxClusterQps;

        @NameInMap("MaxMachineCount")
        public Integer maxMachineCount;

        @NameInMap("MaxSingleQps")
        public Integer maxSingleQps;

        @NameInMap("MaxThresholdCount")
        public Integer maxThresholdCount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ShareLevel")
        public Integer shareLevel;

        @NameInMap("UserId")
        public String userId;

        public static ClusterOffResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClusterOffResponseBodyData self = new ClusterOffResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClusterOffResponseBodyData setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public ClusterOffResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ClusterOffResponseBodyData setClusterQpsLevel(Integer clusterQpsLevel) {
            this.clusterQpsLevel = clusterQpsLevel;
            return this;
        }
        public Integer getClusterQpsLevel() {
            return this.clusterQpsLevel;
        }

        public ClusterOffResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ClusterOffResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClusterOffResponseBodyData setMaxClusterQps(Integer maxClusterQps) {
            this.maxClusterQps = maxClusterQps;
            return this;
        }
        public Integer getMaxClusterQps() {
            return this.maxClusterQps;
        }

        public ClusterOffResponseBodyData setMaxMachineCount(Integer maxMachineCount) {
            this.maxMachineCount = maxMachineCount;
            return this;
        }
        public Integer getMaxMachineCount() {
            return this.maxMachineCount;
        }

        public ClusterOffResponseBodyData setMaxSingleQps(Integer maxSingleQps) {
            this.maxSingleQps = maxSingleQps;
            return this;
        }
        public Integer getMaxSingleQps() {
            return this.maxSingleQps;
        }

        public ClusterOffResponseBodyData setMaxThresholdCount(Integer maxThresholdCount) {
            this.maxThresholdCount = maxThresholdCount;
            return this;
        }
        public Integer getMaxThresholdCount() {
            return this.maxThresholdCount;
        }

        public ClusterOffResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ClusterOffResponseBodyData setShareLevel(Integer shareLevel) {
            this.shareLevel = shareLevel;
            return this;
        }
        public Integer getShareLevel() {
            return this.shareLevel;
        }

        public ClusterOffResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
