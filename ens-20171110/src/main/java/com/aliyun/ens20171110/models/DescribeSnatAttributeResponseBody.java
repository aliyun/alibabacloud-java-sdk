// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the entry was created. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-26T15:38:27Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The destination CIDR block. The rule takes effect only on requests that access the destination CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>101.10. XX.XX/24</p>
     */
    @NameInMap("DestCIDR")
    public String destCIDR;

    /**
     * <p>Timeout period.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The ID of the Network Address Translation (NAT) gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5tfi6f8gds82mjmlofeym****</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The name of the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>The EIP specified in the SNAT entry. Multiple EIPs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>120.72.XX.XX</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The information about the EIP specified in the SNAT entry.</p>
     */
    @NameInMap("SnatIps")
    public java.util.List<DescribeSnatAttributeResponseBodySnatIps> snatIps;

    /**
     * <p>The source CIDR block specified in the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX/24</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    /**
     * <p>The secondary EIP specified in the SNAT entry. Multiple secondary EIPs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>101.23. XX.XX</p>
     */
    @NameInMap("StandbySnatIp")
    public String standbySnatIp;

    /**
     * <p>The status of the secondary EIP.</p>
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
     * <p>The status of the SNAT entry.</p>
     * <ul>
     * <li>Pending: The SNAT entry is being created or modified.</li>
     * <li>Available: The SNAT entry is available.</li>
     * <li>Deleting: The SNAT entry is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the NAT. Valid values: </p>
     * <ul>
     * <li><p>Empty: symmetric NAT.</p>
     * </li>
     * <li><p>FullCone: full cone NAT.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullCone</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSnatAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatAttributeResponseBody self = new DescribeSnatAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeSnatAttributeResponseBody setDestCIDR(String destCIDR) {
        this.destCIDR = destCIDR;
        return this;
    }
    public String getDestCIDR() {
        return this.destCIDR;
    }

    public DescribeSnatAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public DescribeSnatAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeSnatAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatAttributeResponseBody setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public DescribeSnatAttributeResponseBody setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public DescribeSnatAttributeResponseBody setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public DescribeSnatAttributeResponseBody setSnatIps(java.util.List<DescribeSnatAttributeResponseBodySnatIps> snatIps) {
        this.snatIps = snatIps;
        return this;
    }
    public java.util.List<DescribeSnatAttributeResponseBodySnatIps> getSnatIps() {
        return this.snatIps;
    }

    public DescribeSnatAttributeResponseBody setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public DescribeSnatAttributeResponseBody setStandbySnatIp(String standbySnatIp) {
        this.standbySnatIp = standbySnatIp;
        return this;
    }
    public String getStandbySnatIp() {
        return this.standbySnatIp;
    }

    public DescribeSnatAttributeResponseBody setStandbyStatus(String standbyStatus) {
        this.standbyStatus = standbyStatus;
        return this;
    }
    public String getStandbyStatus() {
        return this.standbyStatus;
    }

    public DescribeSnatAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSnatAttributeResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeSnatAttributeResponseBodySnatIps extends TeaModel {
        /**
         * <p>The time when the IP address was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-26T15:38:27Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>203.132.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The status of the IP address.</p>
         * <ul>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Starting</li>
         * <li>Releasing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSnatAttributeResponseBodySnatIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatAttributeResponseBodySnatIps self = new DescribeSnatAttributeResponseBodySnatIps();
            return TeaModel.build(map, self);
        }

        public DescribeSnatAttributeResponseBodySnatIps setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnatAttributeResponseBodySnatIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSnatAttributeResponseBodySnatIps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
