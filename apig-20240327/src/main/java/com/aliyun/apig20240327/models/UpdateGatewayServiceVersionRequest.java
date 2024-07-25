// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceVersionRequest extends TeaModel {
    @NameInMap("labels")
    public java.util.List<UpdateGatewayServiceVersionRequestLabels> labels;

    public static UpdateGatewayServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceVersionRequest self = new UpdateGatewayServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceVersionRequest setLabels(java.util.List<UpdateGatewayServiceVersionRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateGatewayServiceVersionRequestLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateGatewayServiceVersionRequestLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>topology.kubernetes.io/zone</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateGatewayServiceVersionRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayServiceVersionRequestLabels self = new UpdateGatewayServiceVersionRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayServiceVersionRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayServiceVersionRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
