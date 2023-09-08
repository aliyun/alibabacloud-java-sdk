// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The time when the network instance was attached to the CEN instance.</p>
     * <br>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
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
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The name of the network instance.</p>
     */
    @NameInMap("ChildInstanceName")
    public String childInstanceName;

    /**
     * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
     */
    @NameInMap("ChildInstanceOwnerId")
    public Long childInstanceOwnerId;

    /**
     * <p>The region ID of the network instance.</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**: VPC</p>
     * <p>*   **VBR**: VBR</p>
     * <p>*   **CCN**: CCN instance</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the network instance is attached to the CEN instance.</p>
     * <br>
     * <p>*   **Attaching**: The network instance is being attached to the CEN instance.</p>
     * <p>*   **Attached**: The network instance is attached to the CEN instance.</p>
     * <p>*   **Detaching**: The network instance is being detached from the CEN instance.</p>
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
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The type of the IPv6 CIDR block. Valid values:</p>
         * <br>
         * <p>* **BGP** (default): Alibaba Cloud Border Gateway Protocol (BGP) IPv6</p>
         * <p>* **ChinaMobile:** China Mobile (single line)</p>
         * <p>* **ChinaUnicom:** China Unicom (single line)</p>
         * <p>* **ChinaTelecom:** China Telecom (single line)</p>
         * <br>
         * <p>> If your Alibaba Cloud account has the required permissions to activate single-ISP bandwidth, you can set Ipv6Isp to ChinaTelecom, ChinaUnicom, or ChinaMobile.</p>
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
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The information about the IPv6 CIDR blocks of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlocks")
        public DescribeCenAttachedChildInstanceAttributeResponseBodyChildInstanceAttributesIpv6CidrBlocks ipv6CidrBlocks;

        /**
         * <p>The secondary IPv4 CIDR block of the VPC.</p>
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
