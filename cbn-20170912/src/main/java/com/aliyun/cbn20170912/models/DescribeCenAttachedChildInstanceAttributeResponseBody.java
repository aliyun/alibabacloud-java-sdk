// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-5mv960yjhja0dh****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The time when the network instance was attached to the CEN instance.</p>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07-30T07:53Z</p>
     */
    @NameInMap("ChildInstanceAttachTime")
    public String childInstanceAttachTime;

    /**
     * <p>The details about the network instance.</p>
     */
    @NameInMap("ChildInstanceAttributes")
    public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes childInstanceAttributes;

    /**
     * <p>The ID of the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zebdboka7d7t37vo****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The name of the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultvpc</p>
     */
    @NameInMap("ChildInstanceName")
    public String childInstanceName;

    /**
     * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1688000000000000</p>
     */
    @NameInMap("ChildInstanceOwnerId")
    public Long childInstanceOwnerId;

    /**
     * <p>The region ID of the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: VPC</li>
     * <li><strong>VBR</strong>: VBR</li>
     * <li><strong>CCN</strong>: CCN instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    @NameInMap("ManagedService")
    public String managedService;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD98358-D265-4060-87CB-A2427F5A8944</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the network instance is attached to the CEN instance.</p>
     * <ul>
     * <li><strong>Attaching</strong>: The network instance is being attached to the CEN instance.</li>
     * <li><strong>Attached</strong>: The network instance is attached to the CEN instance.</li>
     * <li><strong>Detaching</strong>: The network instance is being detached from the CEN instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Attached</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCenAttachedChildInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenAttachedChildInstanceAttributeResponseBody self = new DescribeCenAttachedChildInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceAttachTime(String childInstanceAttachTime) {
        this.childInstanceAttachTime = childInstanceAttachTime;
        return this;
    }
    public String getChildInstanceAttachTime() {
        return this.childInstanceAttachTime;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceAttributes(DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes childInstanceAttributes) {
        this.childInstanceAttributes = childInstanceAttributes;
        return this;
    }
    public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes getChildInstanceAttributes() {
        return this.childInstanceAttributes;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceName(String childInstanceName) {
        this.childInstanceName = childInstanceName;
        return this;
    }
    public String getChildInstanceName() {
        return this.childInstanceName;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceOwnerId(Long childInstanceOwnerId) {
        this.childInstanceOwnerId = childInstanceOwnerId;
        return this;
    }
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setManagedService(String managedService) {
        this.managedService = managedService;
        return this;
    }
    public String getManagedService() {
        return this.managedService;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock extends TeaModel {
        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:6a::/56</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
         * <ul>
         * <li>BGP (default): Alibaba Cloud Border Gateway Protocol (BGP) IPv6</li>
         * <li>ChinaMobile: China Mobile (single line)</li>
         * <li>ChinaUnicom: China Unicom (single line)</li>
         * <li>ChinaTelecom: China Telecom (single line)</li>
         * </ul>
         * <blockquote>
         * <p> If you are on the whitelist of single-line bandwidth, you can set this parameter to ChinaTelecom, ChinaUnicom, or ChinaMobile.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("Ipv6Isp")
        public String ipv6Isp;

        public static DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock self = new DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock setIpv6Isp(String ipv6Isp) {
            this.ipv6Isp = ipv6Isp;
            return this;
        }
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

    }

    public static class DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks extends TeaModel {
        @NameInMap("ipv6CidrBlock")
        public java.util.List<DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock> ipv6CidrBlock;

        public static DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks self = new DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks setIpv6CidrBlock(java.util.List<DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public java.util.List<DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocksIpv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

    }

    public static class DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks extends TeaModel {
        @NameInMap("secondaryCidrBlock")
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks self = new DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks setSecondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

    }

    public static class DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:a600::/56</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The IPv6 CIDR blocks of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlocks")
        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks ipv6CidrBlocks;

        /**
         * <p>The information about the VPC secondary CIDR block.</p>
         */
        @NameInMap("SecondaryCidrBlocks")
        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks secondaryCidrBlocks;

        public static DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes self = new DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes setIpv6CidrBlocks(DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }
        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks getIpv6CidrBlocks() {
            return this.ipv6CidrBlocks;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributes setSecondaryCidrBlocks(DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesSecondaryCidrBlocks getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

    }

}
