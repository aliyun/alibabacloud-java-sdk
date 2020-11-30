// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<DescribeInstancesResponseInstances> instances;

    public static DescribeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponse self = new DescribeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeInstancesResponse setInstances(java.util.List<DescribeInstancesResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeInstancesResponseInstances extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DebtStatus")
        @Validation(required = true)
        public Integer debtStatus;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public Long expireTime;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("Edition")
        @Validation(required = true)
        public Integer edition;

        @NameInMap("Enabled")
        @Validation(required = true)
        public Integer enabled;

        public static DescribeInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstances self = new DescribeInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseInstances setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstancesResponseInstances setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseInstances setDebtStatus(Integer debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }
        public Integer getDebtStatus() {
            return this.debtStatus;
        }

        public DescribeInstancesResponseInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseInstances setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstancesResponseInstances setEdition(Integer edition) {
            this.edition = edition;
            return this;
        }
        public Integer getEdition() {
            return this.edition;
        }

        public DescribeInstancesResponseInstances setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

    }

}
