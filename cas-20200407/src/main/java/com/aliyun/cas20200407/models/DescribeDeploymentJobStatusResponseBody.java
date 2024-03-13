// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobStatusResponseBody extends TeaModel {
    @NameInMap("BuyCount")
    public Integer buyCount;

    @NameInMap("CertCount")
    public Integer certCount;

    @NameInMap("CostCount")
    public Integer costCount;

    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("MatchWorkerCount")
    public Integer matchWorkerCount;

    @NameInMap("ProductWorkerCount")
    public java.util.List<DescribeDeploymentJobStatusResponseBodyProductWorkerCount> productWorkerCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceCount")
    public Integer resourceCount;

    @NameInMap("RollbackCount")
    public Integer rollbackCount;

    @NameInMap("RollbackFailedCount")
    public Integer rollbackFailedCount;

    @NameInMap("RollbackSuccessCount")
    public Integer rollbackSuccessCount;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("UseCount")
    public Integer useCount;

    @NameInMap("WorkerCount")
    public Integer workerCount;

    public static DescribeDeploymentJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobStatusResponseBody self = new DescribeDeploymentJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobStatusResponseBody setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
        return this;
    }
    public Integer getBuyCount() {
        return this.buyCount;
    }

    public DescribeDeploymentJobStatusResponseBody setCertCount(Integer certCount) {
        this.certCount = certCount;
        return this;
    }
    public Integer getCertCount() {
        return this.certCount;
    }

    public DescribeDeploymentJobStatusResponseBody setCostCount(Integer costCount) {
        this.costCount = costCount;
        return this;
    }
    public Integer getCostCount() {
        return this.costCount;
    }

    public DescribeDeploymentJobStatusResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeDeploymentJobStatusResponseBody setMatchWorkerCount(Integer matchWorkerCount) {
        this.matchWorkerCount = matchWorkerCount;
        return this;
    }
    public Integer getMatchWorkerCount() {
        return this.matchWorkerCount;
    }

    public DescribeDeploymentJobStatusResponseBody setProductWorkerCount(java.util.List<DescribeDeploymentJobStatusResponseBodyProductWorkerCount> productWorkerCount) {
        this.productWorkerCount = productWorkerCount;
        return this;
    }
    public java.util.List<DescribeDeploymentJobStatusResponseBodyProductWorkerCount> getProductWorkerCount() {
        return this.productWorkerCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeploymentJobStatusResponseBody setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public Integer getResourceCount() {
        return this.resourceCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRollbackCount(Integer rollbackCount) {
        this.rollbackCount = rollbackCount;
        return this;
    }
    public Integer getRollbackCount() {
        return this.rollbackCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRollbackFailedCount(Integer rollbackFailedCount) {
        this.rollbackFailedCount = rollbackFailedCount;
        return this;
    }
    public Integer getRollbackFailedCount() {
        return this.rollbackFailedCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRollbackSuccessCount(Integer rollbackSuccessCount) {
        this.rollbackSuccessCount = rollbackSuccessCount;
        return this;
    }
    public Integer getRollbackSuccessCount() {
        return this.rollbackSuccessCount;
    }

    public DescribeDeploymentJobStatusResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeDeploymentJobStatusResponseBody setUseCount(Integer useCount) {
        this.useCount = useCount;
        return this;
    }
    public Integer getUseCount() {
        return this.useCount;
    }

    public DescribeDeploymentJobStatusResponseBody setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }
    public Integer getWorkerCount() {
        return this.workerCount;
    }

    public static class DescribeDeploymentJobStatusResponseBodyProductWorkerCount extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("ProductName")
        public String productName;

        public static DescribeDeploymentJobStatusResponseBodyProductWorkerCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentJobStatusResponseBodyProductWorkerCount self = new DescribeDeploymentJobStatusResponseBodyProductWorkerCount();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentJobStatusResponseBodyProductWorkerCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDeploymentJobStatusResponseBodyProductWorkerCount setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
