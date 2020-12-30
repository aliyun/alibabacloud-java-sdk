// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcEndpoints")
    public java.util.List<ListVpcEndpointsResponseBodyVpcEndpoints> vpcEndpoints;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListVpcEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsResponseBody self = new ListVpcEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointsResponseBody setVpcEndpoints(java.util.List<ListVpcEndpointsResponseBodyVpcEndpoints> vpcEndpoints) {
        this.vpcEndpoints = vpcEndpoints;
        return this;
    }
    public java.util.List<ListVpcEndpointsResponseBodyVpcEndpoints> getVpcEndpoints() {
        return this.vpcEndpoints;
    }

    public ListVpcEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListVpcEndpointsResponseBodyVpcEndpoints extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Address")
        public String address;

        @NameInMap("VpcEndpointId")
        public String vpcEndpointId;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("LedgerId")
        public String ledgerId;

        @NameInMap("RegionId")
        public String regionId;

        public static ListVpcEndpointsResponseBodyVpcEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyVpcEndpoints self = new ListVpcEndpointsResponseBodyVpcEndpoints();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setVpcEndpointId(String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public String getVpcEndpointId() {
            return this.vpcEndpointId;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }
        public String getLedgerId() {
            return this.ledgerId;
        }

        public ListVpcEndpointsResponseBodyVpcEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
