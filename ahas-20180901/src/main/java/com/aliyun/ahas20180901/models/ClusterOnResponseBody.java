// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ClusterOnResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClusterOnResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ClusterOnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClusterOnResponseBody self = new ClusterOnResponseBody();
        return TeaModel.build(map, self);
    }

    public ClusterOnResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClusterOnResponseBody setData(ClusterOnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClusterOnResponseBodyData getData() {
        return this.data;
    }

    public ClusterOnResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClusterOnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClusterOnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClusterOnResponseBodyData extends TeaModel {
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

        public static ClusterOnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClusterOnResponseBodyData self = new ClusterOnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClusterOnResponseBodyData setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public ClusterOnResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ClusterOnResponseBodyData setClusterQpsLevel(Integer clusterQpsLevel) {
            this.clusterQpsLevel = clusterQpsLevel;
            return this;
        }
        public Integer getClusterQpsLevel() {
            return this.clusterQpsLevel;
        }

        public ClusterOnResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ClusterOnResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClusterOnResponseBodyData setMaxClusterQps(Integer maxClusterQps) {
            this.maxClusterQps = maxClusterQps;
            return this;
        }
        public Integer getMaxClusterQps() {
            return this.maxClusterQps;
        }

        public ClusterOnResponseBodyData setMaxMachineCount(Integer maxMachineCount) {
            this.maxMachineCount = maxMachineCount;
            return this;
        }
        public Integer getMaxMachineCount() {
            return this.maxMachineCount;
        }

        public ClusterOnResponseBodyData setMaxSingleQps(Integer maxSingleQps) {
            this.maxSingleQps = maxSingleQps;
            return this;
        }
        public Integer getMaxSingleQps() {
            return this.maxSingleQps;
        }

        public ClusterOnResponseBodyData setMaxThresholdCount(Integer maxThresholdCount) {
            this.maxThresholdCount = maxThresholdCount;
            return this;
        }
        public Integer getMaxThresholdCount() {
            return this.maxThresholdCount;
        }

        public ClusterOnResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ClusterOnResponseBodyData setShareLevel(Integer shareLevel) {
            this.shareLevel = shareLevel;
            return this;
        }
        public Integer getShareLevel() {
            return this.shareLevel;
        }

        public ClusterOnResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
