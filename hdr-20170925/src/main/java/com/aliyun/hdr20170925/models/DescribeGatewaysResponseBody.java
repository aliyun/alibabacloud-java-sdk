// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeGatewaysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Gateways")
    public DescribeGatewaysResponseBodyGateways gateways;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysResponseBody self = new DescribeGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewaysResponseBody setGateways(DescribeGatewaysResponseBodyGateways gateways) {
        this.gateways = gateways;
        return this;
    }
    public DescribeGatewaysResponseBodyGateways getGateways() {
        return this.gateways;
    }

    public DescribeGatewaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewaysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGatewaysResponseBodyGatewaysGateway extends TeaModel {
        @NameInMap("BackupWorkload")
        public Integer backupWorkload;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("GatewayClass")
        public String gatewayClass;

        @NameInMap("GatewayDescription")
        public String gatewayDescription;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayIp")
        public String gatewayIp;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("MCInstanceId")
        public String MCInstanceId;

        @NameInMap("McPassword")
        public String mcPassword;

        @NameInMap("McUsername")
        public String mcUsername;

        @NameInMap("RecoveryWorkload")
        public Integer recoveryWorkload;

        @NameInMap("SiteName")
        public String siteName;

        @NameInMap("SitePairId")
        public String sitePairId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StoreInstanceId")
        public String storeInstanceId;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeGatewaysResponseBodyGatewaysGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysResponseBodyGatewaysGateway self = new DescribeGatewaysResponseBodyGatewaysGateway();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setBackupWorkload(Integer backupWorkload) {
            this.backupWorkload = backupWorkload;
            return this;
        }
        public Integer getBackupWorkload() {
            return this.backupWorkload;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayClass(String gatewayClass) {
            this.gatewayClass = gatewayClass;
            return this;
        }
        public String getGatewayClass() {
            return this.gatewayClass;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayDescription(String gatewayDescription) {
            this.gatewayDescription = gatewayDescription;
            return this;
        }
        public String getGatewayDescription() {
            return this.gatewayDescription;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayIp(String gatewayIp) {
            this.gatewayIp = gatewayIp;
            return this;
        }
        public String getGatewayIp() {
            return this.gatewayIp;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setMCInstanceId(String MCInstanceId) {
            this.MCInstanceId = MCInstanceId;
            return this;
        }
        public String getMCInstanceId() {
            return this.MCInstanceId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setMcPassword(String mcPassword) {
            this.mcPassword = mcPassword;
            return this;
        }
        public String getMcPassword() {
            return this.mcPassword;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setMcUsername(String mcUsername) {
            this.mcUsername = mcUsername;
            return this;
        }
        public String getMcUsername() {
            return this.mcUsername;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setRecoveryWorkload(Integer recoveryWorkload) {
            this.recoveryWorkload = recoveryWorkload;
            return this;
        }
        public Integer getRecoveryWorkload() {
            return this.recoveryWorkload;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setSitePairId(String sitePairId) {
            this.sitePairId = sitePairId;
            return this;
        }
        public String getSitePairId() {
            return this.sitePairId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setStoreInstanceId(String storeInstanceId) {
            this.storeInstanceId = storeInstanceId;
            return this;
        }
        public String getStoreInstanceId() {
            return this.storeInstanceId;
        }

        public DescribeGatewaysResponseBodyGatewaysGateway setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeGatewaysResponseBodyGateways extends TeaModel {
        @NameInMap("gateway")
        public java.util.List<DescribeGatewaysResponseBodyGatewaysGateway> gateway;

        public static DescribeGatewaysResponseBodyGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysResponseBodyGateways self = new DescribeGatewaysResponseBodyGateways();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysResponseBodyGateways setGateway(java.util.List<DescribeGatewaysResponseBodyGatewaysGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<DescribeGatewaysResponseBodyGatewaysGateway> getGateway() {
            return this.gateway;
        }

    }

}
