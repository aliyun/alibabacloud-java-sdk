// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceVersionRequest extends TeaModel {
    /**
     * <p>The service tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("labels")
    public java.util.List<CreateServiceVersionRequestLabels> labels;

    /**
     * <p>The version name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceVersionRequest self = new CreateServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceVersionRequest setLabels(java.util.List<CreateServiceVersionRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateServiceVersionRequestLabels> getLabels() {
        return this.labels;
    }

    public CreateServiceVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateServiceVersionRequestLabels extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>topology.kubernetes.io/zone</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateServiceVersionRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceVersionRequestLabels self = new CreateServiceVersionRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateServiceVersionRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceVersionRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
