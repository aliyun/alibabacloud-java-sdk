// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageLabelsRequest extends TeaModel {
    /**
     * <p>The list of image tags.</p>
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
         * <p>The tag key. The following keys can be added:</p>
         * <ul>
         * <li>system.chipType</li>
         * <li>system.dsw.cudaVersion</li>
         * <li>system.dsw.fromImageId</li>
         * <li>system.dsw.fromInstanceId</li>
         * <li>system.dsw.id</li>
         * <li>system.dsw.os</li>
         * <li>system.dsw.osVersion</li>
         * <li>system.dsw.resourceType</li>
         * <li>system.dsw.rootImageId</li>
         * <li>system.dsw.stage</li>
         * <li>system.dsw.tag</li>
         * <li>system.dsw.type</li>
         * <li>system.framework</li>
         * <li>system.origin</li>
         * <li>system.pythonVersion</li>
         * <li>system.source</li>
         * <li>system.supported.dlc</li>
         * <li>system.supported.dsw</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
