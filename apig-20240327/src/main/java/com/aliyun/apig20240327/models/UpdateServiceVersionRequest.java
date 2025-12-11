// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionRequest extends TeaModel {
    /**
     * <p>The list of tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("labels")
    public java.util.List<UpdateServiceVersionRequestLabels> labels;

    public static UpdateServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionRequest self = new UpdateServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionRequest setLabels(java.util.List<UpdateServiceVersionRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateServiceVersionRequestLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateServiceVersionRequestLabels extends TeaModel {
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
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateServiceVersionRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceVersionRequestLabels self = new UpdateServiceVersionRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateServiceVersionRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateServiceVersionRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
