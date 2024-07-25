// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayServiceVersionRequest extends TeaModel {
    @NameInMap("labels")
    public java.util.List<CreateGatewayServiceVersionRequestLabels> labels;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateGatewayServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayServiceVersionRequest self = new CreateGatewayServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayServiceVersionRequest setLabels(java.util.List<CreateGatewayServiceVersionRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateGatewayServiceVersionRequestLabels> getLabels() {
        return this.labels;
    }

    public CreateGatewayServiceVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateGatewayServiceVersionRequestLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-blue</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateGatewayServiceVersionRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayServiceVersionRequestLabels self = new CreateGatewayServiceVersionRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateGatewayServiceVersionRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGatewayServiceVersionRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
