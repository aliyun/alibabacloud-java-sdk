// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AckNodeSelector extends TeaModel {
    /**
     * <p>污点列表。</p>
     */
    @NameInMap("Labels")
    public java.util.List<Labels> labels;

    /**
     * <p>污点列表。</p>
     */
    @NameInMap("Taints")
    public java.util.List<Taints> taints;

    public static AckNodeSelector build(java.util.Map<String, ?> map) throws Exception {
        AckNodeSelector self = new AckNodeSelector();
        return TeaModel.build(map, self);
    }

    public AckNodeSelector setLabels(java.util.List<Labels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    public AckNodeSelector setTaints(java.util.List<Taints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taints> getTaints() {
        return this.taints;
    }

    public static class Labels extends TeaModel {
        /**
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>emr</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static Labels build(java.util.Map<String, ?> map) throws Exception {
            Labels self = new Labels();
            return TeaModel.build(map, self);
        }

        public Labels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Labels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Taints extends TeaModel {
        /**
         * <p>污点效果。</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>污点键。</p>
         * 
         * <strong>example:</strong>
         * <p>emr</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>污点值。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static Taints build(java.util.Map<String, ?> map) throws Exception {
            Taints self = new Taints();
            return TeaModel.build(map, self);
        }

        public Taints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public Taints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Taints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
