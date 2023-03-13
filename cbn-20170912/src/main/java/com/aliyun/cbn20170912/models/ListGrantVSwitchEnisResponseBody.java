// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    /**
     * <p>The list of ENIs.</p>
     */
    @NameInMap("GrantVSwitchEnis")
    public java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> grantVSwitchEnis;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
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
        /**
         * <p>The description of the ENI.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ENI.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>Indicates whether the ENI is created by a transit router. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>ENIs that are created by transit routers cannot be used as multicast sources or members.</p>
         */
        @NameInMap("TransitRouterFlag")
        public Boolean transitRouterFlag;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         */
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
