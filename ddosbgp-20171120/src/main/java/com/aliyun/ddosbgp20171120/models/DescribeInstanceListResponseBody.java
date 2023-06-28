// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListResponseBody self = new DescribeInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListResponseBody setInstanceList(java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
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

    public static class DescribeInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PackId")
        public String packId;

        @NameInMap("Product")
        public String product;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        public static DescribeInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListResponseBodyInstanceList self = new DescribeInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListResponseBodyInstanceList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
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

        public DescribeInstanceListResponseBodyInstanceList setPackId(String packId) {
            this.packId = packId;
            return this;
        }
        public String getPackId() {
            return this.packId;
        }

        public DescribeInstanceListResponseBodyInstanceList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeInstanceListResponseBodyInstanceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstanceListResponseBodyInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
