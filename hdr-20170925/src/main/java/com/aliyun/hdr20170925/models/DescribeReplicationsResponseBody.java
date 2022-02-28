// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeReplicationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Replications")
    public DescribeReplicationsResponseBodyReplications replications;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeReplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationsResponseBody self = new DescribeReplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeReplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeReplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReplicationsResponseBody setReplications(DescribeReplicationsResponseBodyReplications replications) {
        this.replications = replications;
        return this;
    }
    public DescribeReplicationsResponseBodyReplications getReplications() {
        return this.replications;
    }

    public DescribeReplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeReplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeReplicationsResponseBodyReplicationsReplication extends TeaModel {
        @NameInMap("Applications")
        public String applications;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("InstanceIp")
        public String instanceIp;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ProtectedTime")
        public Long protectedTime;

        @NameInMap("ReplicationId")
        public String replicationId;

        @NameInMap("Status")
        public String status;

        public static DescribeReplicationsResponseBodyReplicationsReplication build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationsResponseBodyReplicationsReplication self = new DescribeReplicationsResponseBodyReplicationsReplication();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setApplications(String applications) {
            this.applications = applications;
            return this;
        }
        public String getApplications() {
            return this.applications;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setProtectedTime(Long protectedTime) {
            this.protectedTime = protectedTime;
            return this;
        }
        public Long getProtectedTime() {
            return this.protectedTime;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setReplicationId(String replicationId) {
            this.replicationId = replicationId;
            return this;
        }
        public String getReplicationId() {
            return this.replicationId;
        }

        public DescribeReplicationsResponseBodyReplicationsReplication setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeReplicationsResponseBodyReplications extends TeaModel {
        @NameInMap("replication")
        public java.util.List<DescribeReplicationsResponseBodyReplicationsReplication> replication;

        public static DescribeReplicationsResponseBodyReplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationsResponseBodyReplications self = new DescribeReplicationsResponseBodyReplications();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationsResponseBodyReplications setReplication(java.util.List<DescribeReplicationsResponseBodyReplicationsReplication> replication) {
            this.replication = replication;
            return this;
        }
        public java.util.List<DescribeReplicationsResponseBodyReplicationsReplication> getReplication() {
            return this.replication;
        }

    }

}
