// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    @NameInMap("ResourceName")
    public String resourceName;

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
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("operator")
        public String operator;

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
        @NameInMap("NodeMatchLabels")
        public java.util.Map<String, String> nodeMatchLabels;

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
