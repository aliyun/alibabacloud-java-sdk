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
     * <p>The IP addresses that are protected by the instance.</p>
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
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.</li>
     * <li><strong>false</strong>: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of protected IP addresses.</p>
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
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>170858869679****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("NsmExpireAt")
        public Long nsmExpireAt;

        @NameInMap("NsmStartAt")
        public Long nsmStartAt;

        @NameInMap("NsmStatus")
        public Integer nsmStatus;

        /**
         * <p>The type of the cloud asset to which the IP address belongs. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: an ECS instance.</li>
         * <li><strong>SLB</strong>: a CLB instance, originally called an SLB instance.</li>
         * <li><strong>EIP</strong>: an EIP. If the IP address belongs to an ALB instance, the value EIP is returned.</li>
         * <li><strong>WAF</strong>: a WAF instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region to which the protected IP address belongs.</p>
         * <blockquote>
         * <p> If the protected IP address is in the same region as the instance, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The description of the cloud asset to which the IP address belongs. The asset can be an ECS instance or an SLB instance.</p>
         * <blockquote>
         * <p> If no descriptions are provided for the asset, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: The IP address is in the normal state, which indicates that the IP address is not under attack.</li>
         * <li><strong>hole_begin</strong>: Blackhole filtering is triggered for the IP address.</li>
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
