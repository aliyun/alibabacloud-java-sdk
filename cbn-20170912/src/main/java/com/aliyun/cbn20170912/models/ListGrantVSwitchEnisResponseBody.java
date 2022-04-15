// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    @NameInMap("GrantVSwitchEnis")
    public java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> grantVSwitchEnis;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListGrantVSwitchEnisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchEnisResponseBody self = new ListGrantVSwitchEnisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchEnisResponseBody setGrantVSwitchEnis(java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> grantVSwitchEnis) {
        this.grantVSwitchEnis = grantVSwitchEnis;
        return this;
    }
    public java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> getGrantVSwitchEnis() {
        return this.grantVSwitchEnis;
    }

    public ListGrantVSwitchEnisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrantVSwitchEnisResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("TransitRouterFlag")
        public Boolean transitRouterFlag;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis build(java.util.Map<String, ?> map) throws Exception {
            ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis self = new ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis();
            return TeaModel.build(map, self);
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setTransitRouterFlag(Boolean transitRouterFlag) {
            this.transitRouterFlag = transitRouterFlag;
            return this;
        }
        public Boolean getTransitRouterFlag() {
            return this.transitRouterFlag;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
