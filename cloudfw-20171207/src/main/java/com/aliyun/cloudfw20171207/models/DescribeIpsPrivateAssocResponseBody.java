// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIpsPrivateAssocResponseBody extends TeaModel {
    @NameInMap("IpsPrivateAssoc")
    public java.util.List<DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc> ipsPrivateAssoc;

    /**
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalOpenCount")
    public Long totalOpenCount;

    public static DescribeIpsPrivateAssocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpsPrivateAssocResponseBody self = new DescribeIpsPrivateAssocResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpsPrivateAssocResponseBody setIpsPrivateAssoc(java.util.List<DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc> ipsPrivateAssoc) {
        this.ipsPrivateAssoc = ipsPrivateAssoc;
        return this;
    }
    public java.util.List<DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc> getIpsPrivateAssoc() {
        return this.ipsPrivateAssoc;
    }

    public DescribeIpsPrivateAssocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpsPrivateAssocResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeIpsPrivateAssocResponseBody setTotalOpenCount(Long totalOpenCount) {
        this.totalOpenCount = totalOpenCount;
        return this;
    }
    public Long getTotalOpenCount() {
        return this.totalOpenCount;
    }

    public static class DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>close</p>
         */
        @NameInMap("AssocInfoStatus")
        public String assocInfoStatus;

        /**
         * <strong>example:</strong>
         * <p>aliuid:1096080848305847 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>1507956024994407</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        @NameInMap("ProtectedIpList")
        public java.util.List<String> protectedIpList;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>cba48ec510bb640559c6f5161cde58014</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>job-0000000061279FB000001BBB31F9D673</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>closed</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UnprotectedIpList")
        public java.util.List<String> unprotectedIpList;

        /**
         * <strong>example:</strong>
         * <p>vpc-wz92dxepli2pgnut796tf</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf62vdtifj7kffpxrydqd</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc self = new DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc();
            return TeaModel.build(map, self);
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setAssocInfoStatus(String assocInfoStatus) {
            this.assocInfoStatus = assocInfoStatus;
            return this;
        }
        public String getAssocInfoStatus() {
            return this.assocInfoStatus;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setProtectedIpList(java.util.List<String> protectedIpList) {
            this.protectedIpList = protectedIpList;
            return this;
        }
        public java.util.List<String> getProtectedIpList() {
            return this.protectedIpList;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setUnprotectedIpList(java.util.List<String> unprotectedIpList) {
            this.unprotectedIpList = unprotectedIpList;
            return this;
        }
        public java.util.List<String> getUnprotectedIpList() {
            return this.unprotectedIpList;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeIpsPrivateAssocResponseBodyIpsPrivateAssoc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
