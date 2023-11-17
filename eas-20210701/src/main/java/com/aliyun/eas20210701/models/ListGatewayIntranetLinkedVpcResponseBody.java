// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcResponseBody extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IntranetLinkedVpcList")
    public java.util.List<ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList> intranetLinkedVpcList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListGatewayIntranetLinkedVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetLinkedVpcResponseBody self = new ListGatewayIntranetLinkedVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetLinkedVpcResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewayIntranetLinkedVpcResponseBody setIntranetLinkedVpcList(java.util.List<ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList> intranetLinkedVpcList) {
        this.intranetLinkedVpcList = intranetLinkedVpcList;
        return this;
    }
    public java.util.List<ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList> getIntranetLinkedVpcList() {
        return this.intranetLinkedVpcList;
    }

    public ListGatewayIntranetLinkedVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList self = new ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList();
            return TeaModel.build(map, self);
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
