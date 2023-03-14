// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("DebtStatus")
        public Integer debtStatus;

        @NameInMap("Edition")
        public Integer edition;

        @NameInMap("Enabled")
        public Integer enabled;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setDebtStatus(Integer debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }
        public Integer getDebtStatus() {
            return this.debtStatus;
        }

        public DescribeInstancesResponseBodyInstances setEdition(Integer edition) {
            this.edition = edition;
            return this;
        }
        public Integer getEdition() {
            return this.edition;
        }

        public DescribeInstancesResponseBodyInstances setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstancesResponseBodyInstances setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
