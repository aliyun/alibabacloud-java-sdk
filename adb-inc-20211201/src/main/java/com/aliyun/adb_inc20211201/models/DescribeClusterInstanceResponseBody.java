// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("clusterInstance")
    public DescribeClusterInstanceResponseBodyClusterInstance clusterInstance;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeClusterInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInstanceResponseBody self = new DescribeClusterInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterInstanceResponseBody setClusterInstance(DescribeClusterInstanceResponseBodyClusterInstance clusterInstance) {
        this.clusterInstance = clusterInstance;
        return this;
    }
    public DescribeClusterInstanceResponseBodyClusterInstance getClusterInstance() {
        return this.clusterInstance;
    }

    public DescribeClusterInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeClusterInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeClusterInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeClusterInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeClusterInstanceResponseBodyClusterInstance extends TeaModel {
        @NameInMap("ClusterId")
        public Integer clusterId;

        @NameInMap("ClusterIdStr")
        public String clusterIdStr;

        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("InstanceIdStr")
        public String instanceIdStr;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("K8sServiceAccount")
        public String k8sServiceAccount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParentId")
        public Integer parentId;

        @NameInMap("ReplicaIdList")
        public java.util.List<Long> replicaIdList;

        @NameInMap("ReplicaIdStrList")
        public java.util.List<String> replicaIdStrList;

        @NameInMap("Replicas")
        public Integer replicas;

        @NameInMap("State")
        public String state;

        @NameInMap("Version")
        public String version;

        @NameInMap("instanceType")
        public String instanceType;

        public static DescribeClusterInstanceResponseBodyClusterInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterInstanceResponseBodyClusterInstance self = new DescribeClusterInstanceResponseBodyClusterInstance();
            return TeaModel.build(map, self);
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setClusterId(Integer clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Integer getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setClusterIdStr(String clusterIdStr) {
            this.clusterIdStr = clusterIdStr;
            return this;
        }
        public String getClusterIdStr() {
            return this.clusterIdStr;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setInstanceIdStr(String instanceIdStr) {
            this.instanceIdStr = instanceIdStr;
            return this;
        }
        public String getInstanceIdStr() {
            return this.instanceIdStr;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setK8sServiceAccount(String k8sServiceAccount) {
            this.k8sServiceAccount = k8sServiceAccount;
            return this;
        }
        public String getK8sServiceAccount() {
            return this.k8sServiceAccount;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setReplicaIdList(java.util.List<Long> replicaIdList) {
            this.replicaIdList = replicaIdList;
            return this;
        }
        public java.util.List<Long> getReplicaIdList() {
            return this.replicaIdList;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setReplicaIdStrList(java.util.List<String> replicaIdStrList) {
            this.replicaIdStrList = replicaIdStrList;
            return this;
        }
        public java.util.List<String> getReplicaIdStrList() {
            return this.replicaIdStrList;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClusterInstanceResponseBodyClusterInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
