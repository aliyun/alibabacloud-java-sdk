// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("InstanceList")
    @Validation(required = true)
    public java.util.List<DescribeInstanceListResponseInstanceList> instanceList;

    public static DescribeInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListResponse self = new DescribeInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceListResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeInstanceListResponse setInstanceList(java.util.List<DescribeInstanceListResponseInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstanceListResponseInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static class DescribeInstanceListResponseInstanceList extends TeaModel {
        @NameInMap("ExpireTime")
        @Validation(required = true)
        public Long expireTime;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("IpType")
        @Validation(required = true)
        public String ipType;

        @NameInMap("AutoRenewal")
        @Validation(required = true)
        public Boolean autoRenewal;

        @NameInMap("BlackholdingCount")
        @Validation(required = true)
        public String blackholdingCount;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        public static DescribeInstanceListResponseInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListResponseInstanceList self = new DescribeInstanceListResponseInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListResponseInstanceList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceListResponseInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceListResponseInstanceList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeInstanceListResponseInstanceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstanceListResponseInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceListResponseInstanceList setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeInstanceListResponseInstanceList setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstanceListResponseInstanceList setBlackholdingCount(String blackholdingCount) {
            this.blackholdingCount = blackholdingCount;
            return this;
        }
        public String getBlackholdingCount() {
            return this.blackholdingCount;
        }

        public DescribeInstanceListResponseInstanceList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstanceListResponseInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
