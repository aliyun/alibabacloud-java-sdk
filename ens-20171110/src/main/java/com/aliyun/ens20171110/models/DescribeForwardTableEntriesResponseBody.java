// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    /**
     * <p>Details of DNAT entries.</p>
     */
    @NameInMap("ForwardTableEntries")
    public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntries> forwardTableEntries;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeForwardTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponseBody self = new DescribeForwardTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponseBody setForwardTableEntries(java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntries> forwardTableEntries) {
        this.forwardTableEntries = forwardTableEntries;
        return this;
    }
    public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntries> getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    public DescribeForwardTableEntriesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForwardTableEntriesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntries extends TeaModel {
        /**
         * <p>The EIP in the DNAT entry. The public IP address is used to access the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XXX.XXX.70</p>
         */
        @NameInMap("ExternalIp")
        public String externalIp;

        /**
         * <p>The external port or port range that is used in port forwarding.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The ID of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>fwd-5tf66679oi2uoxcvlg0g2****</p>
         */
        @NameInMap("ForwardEntryId")
        public String forwardEntryId;

        /**
         * <p>The name of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        @NameInMap("ForwardEntryName")
        public String forwardEntryName;

        /**
         * <p>The probe port of DNAT.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckPort")
        public String healthCheckPort;

        /**
         * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XXX.XXX.3</p>
         */
        @NameInMap("InternalIp")
        public String internalIp;

        /**
         * <p>The internal port or port range that is used for port forwarding.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>: forwards TCP packets.</li>
         * <li><strong>UDP</strong>: forwards UDP packets.</li>
         * <li><strong>Any</strong>: forwards all packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Any</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5tawjw5j7sgd2deujxuk0****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The secondary EIP that is used to access the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>101.XXX.XXX.7</p>
         */
        @NameInMap("StandbyExternalIp")
        public String standbyExternalIp;

        /**
         * <p>The status of the secondary EIP. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Starting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("StandbyStatus")
        public String standbyStatus;

        /**
         * <p>The status of the DNAT entry. Valid values:</p>
         * <ul>
         * <li>Pending: The DNAT entry is being created or modified.</li>
         * <li>Available: The DNAT entry is available.</li>
         * <li>Deleting: The DNAT entry is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntries self = new DescribeForwardTableEntriesResponseBodyForwardTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }
        public String getForwardEntryName() {
            return this.forwardEntryName;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setHealthCheckPort(String healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public String getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setStandbyExternalIp(String standbyExternalIp) {
            this.standbyExternalIp = standbyExternalIp;
            return this;
        }
        public String getStandbyExternalIp() {
            return this.standbyExternalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setStandbyStatus(String standbyStatus) {
            this.standbyStatus = standbyStatus;
            return this;
        }
        public String getStandbyStatus() {
            return this.standbyStatus;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
