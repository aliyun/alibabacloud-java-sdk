// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackIpListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code of the request.</p>
     * <p>For more information about status codes, see <a href="https://help.aliyun.com/document_detail/118841.html">Common parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of IP addresses that are protected by the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("IpList")
    public java.util.List<DescribePackIpListResponseBodyIpList> ipList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4FD1578A-BD77-50B7-A969-45A374A7ED22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of protected IP addresses that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribePackIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackIpListResponseBody self = new DescribePackIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackIpListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePackIpListResponseBody setIpList(java.util.List<DescribePackIpListResponseBodyIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<DescribePackIpListResponseBodyIpList> getIpList() {
        return this.ipList;
    }

    public DescribePackIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackIpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePackIpListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribePackIpListResponseBodyIpList extends TeaModel {
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>170858869679****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The end time of cross-border traffic blocking.</p>
         * 
         * <strong>example:</strong>
         * <p>1715658000</p>
         */
        @NameInMap("NsmExpireAt")
        public Long nsmExpireAt;

        /**
         * <p>The start time of cross-border traffic blocking.</p>
         * 
         * <strong>example:</strong>
         * <p>1715655000</p>
         */
        @NameInMap("NsmStartAt")
        public Long nsmStartAt;

        /**
         * <p>The status of cross-border traffic blocking. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Cross-border traffic is being blocked.</p>
         * </li>
         * <li><p><strong>0</strong>: Cross-border traffic is not blocked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NsmStatus")
        public Integer nsmStatus;

        /**
         * <p>The type of the cloud asset to which the IP address belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>ECS</strong>: an ECS instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: a CLB instance.</p>
         * </li>
         * <li><p><strong>EIP</strong>: an EIP instance. This includes the EIP used by an ALB instance.</p>
         * </li>
         * <li><p><strong>WAF</strong>: a WAF instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region where the protected IP address is deployed.</p>
         * <blockquote>
         * <p>This parameter is not returned if the protected IP address is deployed in the same region as the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The remarks on the cloud asset to which the IP address belongs, such as an ECS instance or an SLB instance.</p>
         * <blockquote>
         * <p>This parameter is not returned if no remarks are specified for the cloud asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The current status of the IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>normal</strong>: The IP address is not under attack.</p>
         * </li>
         * <li><p><strong>hole_begin</strong>: The IP address is in blackhole filtering status.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribePackIpListResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackIpListResponseBodyIpList self = new DescribePackIpListResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public DescribePackIpListResponseBodyIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePackIpListResponseBodyIpList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribePackIpListResponseBodyIpList setNsmExpireAt(Long nsmExpireAt) {
            this.nsmExpireAt = nsmExpireAt;
            return this;
        }
        public Long getNsmExpireAt() {
            return this.nsmExpireAt;
        }

        public DescribePackIpListResponseBodyIpList setNsmStartAt(Long nsmStartAt) {
            this.nsmStartAt = nsmStartAt;
            return this;
        }
        public Long getNsmStartAt() {
            return this.nsmStartAt;
        }

        public DescribePackIpListResponseBodyIpList setNsmStatus(Integer nsmStatus) {
            this.nsmStatus = nsmStatus;
            return this;
        }
        public Integer getNsmStatus() {
            return this.nsmStatus;
        }

        public DescribePackIpListResponseBodyIpList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribePackIpListResponseBodyIpList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePackIpListResponseBodyIpList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribePackIpListResponseBodyIpList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
