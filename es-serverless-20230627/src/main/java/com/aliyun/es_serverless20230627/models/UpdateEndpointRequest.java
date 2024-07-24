// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endpointZones")
    public java.util.List<UpdateEndpointRequestEndpointZones> endpointZones;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointRequest self = new UpdateEndpointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointRequest setEndpointZones(java.util.List<UpdateEndpointRequestEndpointZones> endpointZones) {
        this.endpointZones = endpointZones;
        return this;
    }
    public java.util.List<UpdateEndpointRequestEndpointZones> getEndpointZones() {
        return this.endpointZones;
    }

    public UpdateEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateEndpointRequestEndpointZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-bp18r8uwnukv3rvi9****</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static UpdateEndpointRequestEndpointZones build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointRequestEndpointZones self = new UpdateEndpointRequestEndpointZones();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointRequestEndpointZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateEndpointRequestEndpointZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
