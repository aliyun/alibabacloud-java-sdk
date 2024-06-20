// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageLabelsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Labels")
    public java.util.List<AddImageLabelsRequestLabels> labels;

    public static AddImageLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageLabelsRequest self = new AddImageLabelsRequest();
        return TeaModel.build(map, self);
    }

    public AddImageLabelsRequest setLabels(java.util.List<AddImageLabelsRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<AddImageLabelsRequestLabels> getLabels() {
        return this.labels;
    }

    public static class AddImageLabelsRequestLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddImageLabelsRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            AddImageLabelsRequestLabels self = new AddImageLabelsRequestLabels();
            return TeaModel.build(map, self);
        }

        public AddImageLabelsRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddImageLabelsRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
