// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageLabelsRequest extends TeaModel {
    /**
     * <p>A list of image labels.</p>
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
         * <p>The key of the label. The following keys are supported:</p>
         * <ul>
         * <li><p>system.chipType</p>
         * </li>
         * <li><p>system.dsw\.cudaVersion</p>
         * </li>
         * <li><p>system.dsw\.fromImageId</p>
         * </li>
         * <li><p>system.dsw\.fromInstanceId</p>
         * </li>
         * <li><p>system.dsw\.id</p>
         * </li>
         * <li><p>system.dsw\.os</p>
         * </li>
         * <li><p>system.dsw\.osVersion</p>
         * </li>
         * <li><p>system.dsw\.resourceType</p>
         * </li>
         * <li><p>system.dsw\.rootImageId</p>
         * </li>
         * <li><p>system.dsw\.stage</p>
         * </li>
         * <li><p>system.dsw\.tag</p>
         * </li>
         * <li><p>system.dsw\.type</p>
         * </li>
         * <li><p>system.framework</p>
         * </li>
         * <li><p>system.origin</p>
         * </li>
         * <li><p>system.pythonVersion</p>
         * </li>
         * <li><p>system.source</p>
         * </li>
         * <li><p>system.supported.dlc</p>
         * </li>
         * <li><p>system.supported.dsw</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
         * 
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
