// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetNatGatewayStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetNatGatewayStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("SnatConfigured")
        public Boolean snatConfigured;

        @NameInMap("SnatTableId")
        public String snatTableId;

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
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Covered")
        public Boolean covered;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("SnatEntryId")
        public String snatEntryId;

        @NameInMap("SnatSourceCidr")
        public String snatSourceCidr;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NatGatewayConfigured")
        public Boolean natGatewayConfigured;

        @NameInMap("NatGateways")
        public java.util.List<GetNatGatewayStatusResponseBodyDataNatGateways> natGateways;

        @NameInMap("SnatConfigured")
        public Boolean snatConfigured;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneCidrCovered")
        public Boolean zoneCidrCovered;

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
