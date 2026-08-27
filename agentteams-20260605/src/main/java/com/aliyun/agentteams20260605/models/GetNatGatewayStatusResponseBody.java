// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetNatGatewayStatusResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The NAT gateway configuration status information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetNatGatewayStatusResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNatGatewayStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayStatusResponseBody self = new GetNatGatewayStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNatGatewayStatusResponseBody setData(GetNatGatewayStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNatGatewayStatusResponseBodyData getData() {
        return this.data;
    }

    public GetNatGatewayStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNatGatewayStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNatGatewayStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNatGatewayStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNatGatewayStatusResponseBodyDataNatGateways extends TeaModel {
        /**
         * <p>The NAT gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxx</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>Indicates whether the SNAT rule is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnatConfigured")
        public Boolean snatConfigured;

        /**
         * <p>The SNAT table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stb-xxx</p>
         */
        @NameInMap("SnatTableId")
        public String snatTableId;

        /**
         * <p>The status of the NAT gateway. Valid values:</p>
         * <ul>
         * <li>Available: available</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetNatGatewayStatusResponseBodyDataNatGateways build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayStatusResponseBodyDataNatGateways self = new GetNatGatewayStatusResponseBodyDataNatGateways();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayStatusResponseBodyDataNatGateways setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public GetNatGatewayStatusResponseBodyDataNatGateways setSnatConfigured(Boolean snatConfigured) {
            this.snatConfigured = snatConfigured;
            return this;
        }
        public Boolean getSnatConfigured() {
            return this.snatConfigured;
        }

        public GetNatGatewayStatusResponseBodyDataNatGateways setSnatTableId(String snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public String getSnatTableId() {
            return this.snatTableId;
        }

        public GetNatGatewayStatusResponseBodyDataNatGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetNatGatewayStatusResponseBodyDataZoneCidrs extends TeaModel {
        /**
         * <p>The CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>Indicates whether the CIDR block is covered by a SNAT rule.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Covered")
        public Boolean covered;

        /**
         * <p>The associated NAT gateway ID. This value is null if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxx</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The SNAT entry ID. This value is null if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-xxx</p>
         */
        @NameInMap("SnatEntryId")
        public String snatEntryId;

        /**
         * <p>The SNAT source CIDR. This value is null if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("SnatSourceCidr")
        public String snatSourceCidr;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetNatGatewayStatusResponseBodyDataZoneCidrs build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayStatusResponseBodyDataZoneCidrs self = new GetNatGatewayStatusResponseBodyDataZoneCidrs();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setCovered(Boolean covered) {
            this.covered = covered;
            return this;
        }
        public Boolean getCovered() {
            return this.covered;
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setSnatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setSnatSourceCidr(String snatSourceCidr) {
            this.snatSourceCidr = snatSourceCidr;
            return this;
        }
        public String getSnatSourceCidr() {
            return this.snatSourceCidr;
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetNatGatewayStatusResponseBodyDataZoneCidrs setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetNatGatewayStatusResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the NAT gateway is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NatGatewayConfigured")
        public Boolean natGatewayConfigured;

        /**
         * <p>The list of NAT gateway details.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("NatGateways")
        public java.util.List<GetNatGatewayStatusResponseBodyDataNatGateways> natGateways;

        /**
         * <p>Indicates whether the SNAT rule is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnatConfigured")
        public Boolean snatConfigured;

        /**
         * <p>The status of the NAT gateway. Valid values:</p>
         * <ul>
         * <li>READY: The NAT gateway exists, and the zone/vSwitch CIDR selected by the current instance is covered by SNAT.</li>
         * <li>NEED_CONFIGURE_NAT_GATEWAY: No NAT gateway exists in the VPC associated with the current instance. You need to purchase or configure a NAT gateway.</li>
         * <li>NEED_CONFIGURE_SNAT_RULE: The NAT gateway exists, but the zone/vSwitch CIDR selected by the current instance is not fully added to SNAT. You need to add SNAT rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Indicates whether the selected zone/vSwitch CIDR is covered.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ZoneCidrCovered")
        public Boolean zoneCidrCovered;

        /**
         * <p>The CIDR blocks and SNAT configuration status of each zone/vSwitch in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("ZoneCidrs")
        public java.util.List<GetNatGatewayStatusResponseBodyDataZoneCidrs> zoneCidrs;

        public static GetNatGatewayStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayStatusResponseBodyData self = new GetNatGatewayStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetNatGatewayStatusResponseBodyData setNatGatewayConfigured(Boolean natGatewayConfigured) {
            this.natGatewayConfigured = natGatewayConfigured;
            return this;
        }
        public Boolean getNatGatewayConfigured() {
            return this.natGatewayConfigured;
        }

        public GetNatGatewayStatusResponseBodyData setNatGateways(java.util.List<GetNatGatewayStatusResponseBodyDataNatGateways> natGateways) {
            this.natGateways = natGateways;
            return this;
        }
        public java.util.List<GetNatGatewayStatusResponseBodyDataNatGateways> getNatGateways() {
            return this.natGateways;
        }

        public GetNatGatewayStatusResponseBodyData setSnatConfigured(Boolean snatConfigured) {
            this.snatConfigured = snatConfigured;
            return this;
        }
        public Boolean getSnatConfigured() {
            return this.snatConfigured;
        }

        public GetNatGatewayStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetNatGatewayStatusResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetNatGatewayStatusResponseBodyData setZoneCidrCovered(Boolean zoneCidrCovered) {
            this.zoneCidrCovered = zoneCidrCovered;
            return this;
        }
        public Boolean getZoneCidrCovered() {
            return this.zoneCidrCovered;
        }

        public GetNatGatewayStatusResponseBodyData setZoneCidrs(java.util.List<GetNatGatewayStatusResponseBodyDataZoneCidrs> zoneCidrs) {
            this.zoneCidrs = zoneCidrs;
            return this;
        }
        public java.util.List<GetNatGatewayStatusResponseBodyDataZoneCidrs> getZoneCidrs() {
            return this.zoneCidrs;
        }

    }

}
