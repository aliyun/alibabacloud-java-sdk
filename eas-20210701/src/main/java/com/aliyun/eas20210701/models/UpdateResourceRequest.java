// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    /**
     * <p>The new name of the resource group after the update. The name can be up to 27 characters in length.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The configurable options for self managed resource group.</p>
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
         * <br>
         * <p>Valid values:</p>
         * <p>- PreferNoSchedule</p>
         * <p>- NoSchedule</p>
         * <p>- NoExecute</p>
         */
        @NameInMap("effect")
        public String effect;

        /**
         * <p>The name of the key.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Relationship between key names and key values.</p>
         * <p>Valid values:</p>
         * <p>- Equal</p>
         * <p>- Exists</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The name of the value.</p>
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
         * <p>The key-value pairs for matched nodes.</p>
         */
        @NameInMap("NodeMatchLabels")
        public java.util.Map<String, String> nodeMatchLabels;

        /**
         * <p>Tolerations for nodes.</p>
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
