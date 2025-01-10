// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNodeInfosForPodResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response body</p>
     */
    @NameInMap("Content")
    public java.util.List<ListNodeInfosForPodResponseBodyContent> content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission of this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeInfosForPodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInfosForPodResponseBody self = new ListNodeInfosForPodResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeInfosForPodResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNodeInfosForPodResponseBody setContent(java.util.List<ListNodeInfosForPodResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ListNodeInfosForPodResponseBodyContent> getContent() {
        return this.content;
    }

    public ListNodeInfosForPodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodeInfosForPodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeInfosForPodResponseBodyContent extends TeaModel {
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
         * <p>Lingjun Elastic Network Interface quota, excluding system type</p>
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
         * <p>List of VSwitches to which IP addresses can be applied for this node</p>
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

        public static ListNodeInfosForPodResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListNodeInfosForPodResponseBodyContent self = new ListNodeInfosForPodResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListNodeInfosForPodResponseBodyContent setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListNodeInfosForPodResponseBodyContent setHdeniQuota(Integer hdeniQuota) {
            this.hdeniQuota = hdeniQuota;
            return this;
        }
        public Integer getHdeniQuota() {
            return this.hdeniQuota;
        }

        public ListNodeInfosForPodResponseBodyContent setLeniQuota(Integer leniQuota) {
            this.leniQuota = leniQuota;
            return this;
        }
        public Integer getLeniQuota() {
            return this.leniQuota;
        }

        public ListNodeInfosForPodResponseBodyContent setLeniSipQuota(Integer leniSipQuota) {
            this.leniSipQuota = leniSipQuota;
            return this;
        }
        public Integer getLeniSipQuota() {
            return this.leniSipQuota;
        }

        public ListNodeInfosForPodResponseBodyContent setLniSipQuota(Integer lniSipQuota) {
            this.lniSipQuota = lniSipQuota;
            return this;
        }
        public Integer getLniSipQuota() {
            return this.lniSipQuota;
        }

        public ListNodeInfosForPodResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNodeInfosForPodResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNodeInfosForPodResponseBodyContent setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public ListNodeInfosForPodResponseBodyContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodeInfosForPodResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
