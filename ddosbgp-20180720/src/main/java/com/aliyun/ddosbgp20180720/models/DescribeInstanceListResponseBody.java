// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList;

    /**
     * <p>The value of the tag that is added to the Anti-DDoS Origin instance to query.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the cloud service that is associated with the Anti-DDoS Origin instance. By default, this parameter is not returned. If the Anti-DDoS Origin instance is created by using a different cloud service, the code of the cloud service is returned.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **gamebox**: The Anti-DDoS Origin instance is created by using Game Security Box.</p>
     * <p>*   **eip**: The Anti-DDoS Origin instance is created by using an elastic IP address (EIP) for which Anti-DDoS (Enhanced Edition) is enabled.</p>
     */
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
        /**
         * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
         * <br>
         * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        @NameInMap("BlackholdingCount")
        public String blackholdingCount;

        @NameInMap("CoverageType")
        public Integer coverageType;

        /**
         * <p>DescribeInstanceList</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>WB269094</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>Queries the details of all Anti-DDoS Origin instances.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The remarks of the instance.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListResponseBodyInstanceList self = new DescribeInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListResponseBodyInstanceList setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstanceListResponseBodyInstanceList setBlackholdingCount(String blackholdingCount) {
            this.blackholdingCount = blackholdingCount;
            return this;
        }
        public String getBlackholdingCount() {
            return this.blackholdingCount;
        }

        public DescribeInstanceListResponseBodyInstanceList setCoverageType(Integer coverageType) {
            this.coverageType = coverageType;
            return this;
        }
        public Integer getCoverageType() {
            return this.coverageType;
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

        public DescribeInstanceListResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceListResponseBodyInstanceList setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
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
