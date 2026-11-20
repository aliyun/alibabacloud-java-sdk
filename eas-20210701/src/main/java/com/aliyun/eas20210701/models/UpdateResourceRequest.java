// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    /**
     * <p>The new name of the resource group. The name cannot exceed 27 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>iot</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The configuration options for the self-managed resource group.</p>
     */
    @NameInMap("SelfManagedResourceOptions")
    public UpdateResourceRequestSelfManagedResourceOptions selfManagedResourceOptions;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public UpdateResourceRequest setSelfManagedResourceOptions(UpdateResourceRequestSelfManagedResourceOptions selfManagedResourceOptions) {
        this.selfManagedResourceOptions = selfManagedResourceOptions;
        return this;
    }
    public UpdateResourceRequestSelfManagedResourceOptions getSelfManagedResourceOptions() {
        return this.selfManagedResourceOptions;
    }

    public static class UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations extends TeaModel {
        /**
         * <p>The effect.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSchedule</p>
         */
        @NameInMap("effect")
        public String effect;

        /**
         * <p>The key name.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The relationship between the key name and the key value.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The key value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations self = new UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations();
            return TeaModel.build(map, self);
        }

        public UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateResourceRequestSelfManagedResourceOptions extends TeaModel {
        /**
         * <p>The set of label key-value pairs for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;key1&quot;: &quot;value1&quot;</p>
         */
        @NameInMap("NodeMatchLabels")
        public java.util.Map<String, String> nodeMatchLabels;

        /**
         * <p>The list of tolerations for node taints.</p>
         */
        @NameInMap("NodeTolerations")
        public java.util.List<UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations> nodeTolerations;

        public static UpdateResourceRequestSelfManagedResourceOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceRequestSelfManagedResourceOptions self = new UpdateResourceRequestSelfManagedResourceOptions();
            return TeaModel.build(map, self);
        }

        public UpdateResourceRequestSelfManagedResourceOptions setNodeMatchLabels(java.util.Map<String, String> nodeMatchLabels) {
            this.nodeMatchLabels = nodeMatchLabels;
            return this;
        }
        public java.util.Map<String, String> getNodeMatchLabels() {
            return this.nodeMatchLabels;
        }

        public UpdateResourceRequestSelfManagedResourceOptions setNodeTolerations(java.util.List<UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations> nodeTolerations) {
            this.nodeTolerations = nodeTolerations;
            return this;
        }
        public java.util.List<UpdateResourceRequestSelfManagedResourceOptionsNodeTolerations> getNodeTolerations() {
            return this.nodeTolerations;
        }

    }

}
