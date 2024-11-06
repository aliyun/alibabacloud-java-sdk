// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponseBody extends TeaModel {
    /**
     * <p>Details of the HAVIPs.</p>
     */
    @NameInMap("HaVips")
    public java.util.List<DescribeHaVipsResponseBodyHaVips> haVips;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeHaVipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsResponseBody self = new DescribeHaVipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsResponseBody setHaVips(java.util.List<DescribeHaVipsResponseBodyHaVips> haVips) {
        this.haVips = haVips;
        return this;
    }
    public java.util.List<DescribeHaVipsResponseBodyHaVips> getHaVips() {
        return this.haVips;
    }

    public DescribeHaVipsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHaVipsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHaVipsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses extends TeaModel {
        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.40</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-5p1wz****</p>
         */
        @NameInMap("EipId")
        public String eipId;

        public static DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses self = new DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsAssociatedInstances extends TeaModel {
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05T07:09:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-51p****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance that is associated with the HAVIP. Valid values:</p>
         * <ul>
         * <li>EnsInstance: ENS instance</li>
         * <li>NetworkInterface: elastic network interface (ENI)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnsInstance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The private IP address of the instance that is associated with the HAVIP. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.9</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The association status of the HAVIP. Valid values:</p>
         * <ul>
         * <li>Associating</li>
         * <li>InUse</li>
         * <li>Unassociating</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHaVipsResponseBodyHaVipsAssociatedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsAssociatedInstances self = new DescribeHaVipsResponseBodyHaVipsAssociatedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedInstances setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeHaVipsResponseBodyHaVipsAssociatedInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVips extends TeaModel {
        /**
         * <p>The elastic IP addresses (EIPs) that are associated with the HAVIP.</p>
         */
        @NameInMap("AssociatedEipAddresses")
        public java.util.List<DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses> associatedEipAddresses;

        /**
         * <p>The information about instances that are associated with the HAVIP.</p>
         */
        @NameInMap("AssociatedInstances")
        public java.util.List<DescribeHaVipsResponseBodyHaVipsAssociatedInstances> associatedInstances;

        /**
         * <p>The time when the HAVIP was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-29T11:17:38Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guiyang-14</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-52y28****</p>
         */
        @NameInMap("HaVipId")
        public String haVipId;

        /**
         * <p>The IP address of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.5</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The name of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5wtkyrk****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The status of the HAVIP. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Available</li>
         * <li>InUse</li>
         * <li>Deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5yc8d****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeHaVipsResponseBodyHaVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVips self = new DescribeHaVipsResponseBodyHaVips();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVips setAssociatedEipAddresses(java.util.List<DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses> associatedEipAddresses) {
            this.associatedEipAddresses = associatedEipAddresses;
            return this;
        }
        public java.util.List<DescribeHaVipsResponseBodyHaVipsAssociatedEipAddresses> getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        public DescribeHaVipsResponseBodyHaVips setAssociatedInstances(java.util.List<DescribeHaVipsResponseBodyHaVipsAssociatedInstances> associatedInstances) {
            this.associatedInstances = associatedInstances;
            return this;
        }
        public java.util.List<DescribeHaVipsResponseBodyHaVipsAssociatedInstances> getAssociatedInstances() {
            return this.associatedInstances;
        }

        public DescribeHaVipsResponseBodyHaVips setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeHaVipsResponseBodyHaVips setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHaVipsResponseBodyHaVips setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeHaVipsResponseBodyHaVips setHaVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }
        public String getHaVipId() {
            return this.haVipId;
        }

        public DescribeHaVipsResponseBodyHaVips setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeHaVipsResponseBodyHaVips setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHaVipsResponseBodyHaVips setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeHaVipsResponseBodyHaVips setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHaVipsResponseBodyHaVips setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
