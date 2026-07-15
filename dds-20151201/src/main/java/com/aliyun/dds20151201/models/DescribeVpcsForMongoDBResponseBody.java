// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeVpcsForMongoDBResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53924AF0-1628-5AA2-9C95-D4**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of VPCs.</p>
     */
    @NameInMap("Vpcs")
    public java.util.List<DescribeVpcsForMongoDBResponseBodyVpcs> vpcs;

    public static DescribeVpcsForMongoDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsForMongoDBResponseBody self = new DescribeVpcsForMongoDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsForMongoDBResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsForMongoDBResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsForMongoDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsForMongoDBResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsForMongoDBResponseBody setVpcs(java.util.List<DescribeVpcsForMongoDBResponseBodyVpcs> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<DescribeVpcsForMongoDBResponseBodyVpcs> getVpcs() {
        return this.vpcs;
    }

    public static class DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs extends TeaModel {
        /**
         * <p>The CIDR block of the vSwitch.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The vSwitch is the default vSwitch.</p>
         * </li>
         * <li><p><strong>false</strong>: The vSwitch is not the default vSwitch.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The zone to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>The status of the vSwitch. A value of <strong>Available</strong> indicates that the vSwitch is active.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp*******************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-name</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs self = new DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeVpcsForMongoDBResponseBodyVpcs extends TeaModel {
        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The CIDR block of the VPC.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the VPC is the default one. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The VPC is the default one.</p>
         * </li>
         * <li><p><strong>false</strong>: The VPC is not the default one.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The status of the VPC. A value of <strong>Available</strong> indicates that the VPC is active.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of vSwitches.</p>
         */
        @NameInMap("VSwitchs")
        public java.util.List<DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs> vSwitchs;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zep2pepkthg5ueal****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-name</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcsForMongoDBResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsForMongoDBResponseBodyVpcs self = new DescribeVpcsForMongoDBResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setVSwitchs(java.util.List<DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<DescribeVpcsForMongoDBResponseBodyVpcsVSwitchs> getVSwitchs() {
            return this.vSwitchs;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsForMongoDBResponseBodyVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
