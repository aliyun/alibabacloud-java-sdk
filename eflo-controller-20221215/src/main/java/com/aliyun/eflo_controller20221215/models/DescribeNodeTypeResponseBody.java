// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeTypeResponseBody extends TeaModel {
    /**
     * <p>The maximum number of cloud disks that can be mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("DiskQuantity")
    public Integer diskQuantity;

    /**
     * <p>The maximum number of network interface controllers (NICs) in high-density mode.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("EniHighDenseQuantity")
    public Integer eniHighDenseQuantity;

    /**
     * <p>The maximum number of IPv6 addresses supported by a NIC.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("EniIpv6AddressQuantity")
    public Integer eniIpv6AddressQuantity;

    /**
     * <p>The maximum number of IPv4 addresses supported by a NIC.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("EniPrivateIpAddressQuantity")
    public Integer eniPrivateIpAddressQuantity;

    /**
     * <p>The maximum number of elastic network interfaces (ENIs) supported, including primary and secondary ENIs.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("EniQuantity")
    public Integer eniQuantity;

    /**
     * <p>The number of Elastic RDMA Interfaces (ERIs) for the current specification.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("EriQuantity")
    public Integer eriQuantity;

    /**
     * <p>The number of physical network interface controllers (NICs) supported by the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkCardQuantity")
    public Integer networkCardQuantity;

    /**
     * <p>The list of physical network interface controllers (NICs), including the details of each physical NIC.</p>
     */
    @NameInMap("NetworkCards")
    public java.util.List<DescribeNodeTypeResponseBodyNetworkCards> networkCards;

    /**
     * <p>The default number of queues for the primary NIC.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("PrimaryEniQueueNumber")
    public Integer primaryEniQueueNumber;

    /**
     * <p>The number of queue pairs (QPs) for all Elastic RDMA Interfaces (ERIs) of the current specification.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The default number of queues for secondary elastic network interfaces (ENIs).</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("SecondaryEniQueueNumber")
    public Integer secondaryEniQueueNumber;

    /**
     * <p>The total queue quota for elastic network interface controllers (NICs) of the current specification.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("TotalEniQueueQuantity")
    public Integer totalEniQueueQuantity;

    public static DescribeNodeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeTypeResponseBody self = new DescribeNodeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeTypeResponseBody setDiskQuantity(Integer diskQuantity) {
        this.diskQuantity = diskQuantity;
        return this;
    }
    public Integer getDiskQuantity() {
        return this.diskQuantity;
    }

    public DescribeNodeTypeResponseBody setEniHighDenseQuantity(Integer eniHighDenseQuantity) {
        this.eniHighDenseQuantity = eniHighDenseQuantity;
        return this;
    }
    public Integer getEniHighDenseQuantity() {
        return this.eniHighDenseQuantity;
    }

    public DescribeNodeTypeResponseBody setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
        this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
        return this;
    }
    public Integer getEniIpv6AddressQuantity() {
        return this.eniIpv6AddressQuantity;
    }

    public DescribeNodeTypeResponseBody setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
        this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
        return this;
    }
    public Integer getEniPrivateIpAddressQuantity() {
        return this.eniPrivateIpAddressQuantity;
    }

    public DescribeNodeTypeResponseBody setEniQuantity(Integer eniQuantity) {
        this.eniQuantity = eniQuantity;
        return this;
    }
    public Integer getEniQuantity() {
        return this.eniQuantity;
    }

    public DescribeNodeTypeResponseBody setEriQuantity(Integer eriQuantity) {
        this.eriQuantity = eriQuantity;
        return this;
    }
    public Integer getEriQuantity() {
        return this.eriQuantity;
    }

    public DescribeNodeTypeResponseBody setNetworkCardQuantity(Integer networkCardQuantity) {
        this.networkCardQuantity = networkCardQuantity;
        return this;
    }
    public Integer getNetworkCardQuantity() {
        return this.networkCardQuantity;
    }

    public DescribeNodeTypeResponseBody setNetworkCards(java.util.List<DescribeNodeTypeResponseBodyNetworkCards> networkCards) {
        this.networkCards = networkCards;
        return this;
    }
    public java.util.List<DescribeNodeTypeResponseBodyNetworkCards> getNetworkCards() {
        return this.networkCards;
    }

    public DescribeNodeTypeResponseBody setPrimaryEniQueueNumber(Integer primaryEniQueueNumber) {
        this.primaryEniQueueNumber = primaryEniQueueNumber;
        return this;
    }
    public Integer getPrimaryEniQueueNumber() {
        return this.primaryEniQueueNumber;
    }

    public DescribeNodeTypeResponseBody setQueuePairNumber(Integer queuePairNumber) {
        this.queuePairNumber = queuePairNumber;
        return this;
    }
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
    }

    public DescribeNodeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeTypeResponseBody setSecondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
        this.secondaryEniQueueNumber = secondaryEniQueueNumber;
        return this;
    }
    public Integer getSecondaryEniQueueNumber() {
        return this.secondaryEniQueueNumber;
    }

    public DescribeNodeTypeResponseBody setTotalEniQueueQuantity(Integer totalEniQueueQuantity) {
        this.totalEniQueueQuantity = totalEniQueueQuantity;
        return this;
    }
    public Integer getTotalEniQueueQuantity() {
        return this.totalEniQueueQuantity;
    }

    public static class DescribeNodeTypeResponseBodyNetworkCards extends TeaModel {
        /**
         * <p>The index of the physical network interface controller (NIC), starting from 0. You can specify this index to attach elastic network interfaces (ENIs) to different underlying physical network interface controllers (NICs).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        public static DescribeNodeTypeResponseBodyNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeTypeResponseBodyNetworkCards self = new DescribeNodeTypeResponseBodyNetworkCards();
            return TeaModel.build(map, self);
        }

        public DescribeNodeTypeResponseBodyNetworkCards setNetworkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            return this;
        }
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

    }

}
