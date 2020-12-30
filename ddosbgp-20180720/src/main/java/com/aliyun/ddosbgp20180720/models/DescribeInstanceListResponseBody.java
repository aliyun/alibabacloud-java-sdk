// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("InstanceList")
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList;

    public static DescribeInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListResponseBody self = new DescribeInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeInstanceListResponseBody setInstanceList(java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static class DescribeInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("IpType")
        public String ipType;

        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Product")
        public String product;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("BlackholdingCount")
        public String blackholdingCount;

        public static DescribeInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListResponseBodyInstanceList self = new DescribeInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListResponseBodyInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceListResponseBodyInstanceList setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeInstanceListResponseBodyInstanceList setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstanceListResponseBodyInstanceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstanceListResponseBodyInstanceList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceListResponseBodyInstanceList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeInstanceListResponseBodyInstanceList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstanceListResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceListResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceListResponseBodyInstanceList setBlackholdingCount(String blackholdingCount) {
            this.blackholdingCount = blackholdingCount;
            return this;
        }
        public String getBlackholdingCount() {
            return this.blackholdingCount;
        }

    }

}
