// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CreateEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endpointZones")
    public java.util.List<CreateEndpointRequestEndpointZones> endpointZones;

    /**
     * <strong>example:</strong>
     * <p>testendpoint</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf664nyle5khp5***</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointRequest self = new CreateEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointRequest setEndpointZones(java.util.List<CreateEndpointRequestEndpointZones> endpointZones) {
        this.endpointZones = endpointZones;
        return this;
    }
    public java.util.List<CreateEndpointRequestEndpointZones> getEndpointZones() {
        return this.endpointZones;
    }

    public CreateEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateEndpointRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateEndpointRequestEndpointZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-uf6qmfkqdcw*****</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateEndpointRequestEndpointZones build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointRequestEndpointZones self = new CreateEndpointRequestEndpointZones();
            return TeaModel.build(map, self);
        }

        public CreateEndpointRequestEndpointZones setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public CreateEndpointRequestEndpointZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
