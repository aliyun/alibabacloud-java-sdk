// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetFabricTopologyResponseBody extends TeaModel {
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
    public GetFabricTopologyResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFabricTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFabricTopologyResponseBody self = new GetFabricTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFabricTopologyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetFabricTopologyResponseBody setContent(GetFabricTopologyResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetFabricTopologyResponseBodyContent getContent() {
        return this.content;
    }

    public GetFabricTopologyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFabricTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFabricTopologyResponseBodyContentTopoInfo extends TeaModel {
        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>core-1</p>
         */
        @NameInMap("LayerName")
        public String layerName;

        /**
         * <p>Hierarchical resource types</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>core: core layer.</li>
         * <li>node: Lingjun node.</li>
         * <li>lni: lingjun network interface controller.</li>
         * <li>spine: backbone layer.</li>
         * <li>leaf: access layer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>core</p>
         */
        @NameInMap("LayerType")
        public String layerType;

        /**
         * <p>Next Level</p>
         */
        @NameInMap("NextLayer")
        public java.util.List<?> nextLayer;

        public static GetFabricTopologyResponseBodyContentTopoInfo build(java.util.Map<String, ?> map) throws Exception {
            GetFabricTopologyResponseBodyContentTopoInfo self = new GetFabricTopologyResponseBodyContentTopoInfo();
            return TeaModel.build(map, self);
        }

        public GetFabricTopologyResponseBodyContentTopoInfo setLayerName(String layerName) {
            this.layerName = layerName;
            return this;
        }
        public String getLayerName() {
            return this.layerName;
        }

        public GetFabricTopologyResponseBodyContentTopoInfo setLayerType(String layerType) {
            this.layerType = layerType;
            return this;
        }
        public String getLayerType() {
            return this.layerType;
        }

        public GetFabricTopologyResponseBodyContentTopoInfo setNextLayer(java.util.List<?> nextLayer) {
            this.nextLayer = nextLayer;
            return this;
        }
        public java.util.List<?> getNextLayer() {
            return this.nextLayer;
        }

    }

    public static class GetFabricTopologyResponseBodyContent extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>network interface controller Topology Information</p>
         */
        @NameInMap("TopoInfo")
        public java.util.List<GetFabricTopologyResponseBodyContentTopoInfo> topoInfo;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-j6ctp4n75306****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Lingjun CIDR block ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-fuli****</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static GetFabricTopologyResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetFabricTopologyResponseBodyContent self = new GetFabricTopologyResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetFabricTopologyResponseBodyContent setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetFabricTopologyResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetFabricTopologyResponseBodyContent setTopoInfo(java.util.List<GetFabricTopologyResponseBodyContentTopoInfo> topoInfo) {
            this.topoInfo = topoInfo;
            return this;
        }
        public java.util.List<GetFabricTopologyResponseBodyContentTopoInfo> getTopoInfo() {
            return this.topoInfo;
        }

        public GetFabricTopologyResponseBodyContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetFabricTopologyResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
