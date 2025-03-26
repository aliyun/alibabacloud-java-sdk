// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetNodeInfoForPodResponseBody extends TeaModel {
    /**
     * <p>The details about the failed permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetNodeInfoForPodResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission of this operation, action=eflo:GetNodeInfoForPod, arn=acs:eflo:cn-wulanchabu:1111156667137893:networkinterface/*, resourceGroup=null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNodeInfoForPodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeInfoForPodResponseBody self = new GetNodeInfoForPodResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeInfoForPodResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetNodeInfoForPodResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetNodeInfoForPodResponseBody setContent(GetNodeInfoForPodResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetNodeInfoForPodResponseBodyContent getContent() {
        return this.content;
    }

    public GetNodeInfoForPodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNodeInfoForPodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNodeInfoForPodResponseBodyContent extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Lingjun Gaomi network interface controller quota</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HdeniQuota")
        public Integer hdeniQuota;

        /**
         * <p>Lingjun Elastic Network Interface quota, including system type</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LeniQuota")
        public Integer leniQuota;

        /**
         * <p>Lingjun Elastic Network Interface Secondary Private IP Quota</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LeniSipQuota")
        public Integer leniSipQuota;

        /**
         * <p>Lingjun network interface controller Secondary Private IP Quota</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LniSipQuota")
        public Integer lniSipQuota;

        /**
         * <p>The ID of the node for this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>node-be70****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>List of VSwitches that can apply for IP addresses on this node</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
         * <p>The ID of the Virtual Private Cloud to which the current node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-j6ctp4n75306****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetNodeInfoForPodResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetNodeInfoForPodResponseBodyContent self = new GetNodeInfoForPodResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetNodeInfoForPodResponseBodyContent setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetNodeInfoForPodResponseBodyContent setHdeniQuota(Integer hdeniQuota) {
            this.hdeniQuota = hdeniQuota;
            return this;
        }
        public Integer getHdeniQuota() {
            return this.hdeniQuota;
        }

        public GetNodeInfoForPodResponseBodyContent setLeniQuota(Integer leniQuota) {
            this.leniQuota = leniQuota;
            return this;
        }
        public Integer getLeniQuota() {
            return this.leniQuota;
        }

        public GetNodeInfoForPodResponseBodyContent setLeniSipQuota(Integer leniSipQuota) {
            this.leniSipQuota = leniSipQuota;
            return this;
        }
        public Integer getLeniSipQuota() {
            return this.leniSipQuota;
        }

        public GetNodeInfoForPodResponseBodyContent setLniSipQuota(Integer lniSipQuota) {
            this.lniSipQuota = lniSipQuota;
            return this;
        }
        public Integer getLniSipQuota() {
            return this.lniSipQuota;
        }

        public GetNodeInfoForPodResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeInfoForPodResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetNodeInfoForPodResponseBodyContent setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public GetNodeInfoForPodResponseBodyContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetNodeInfoForPodResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
