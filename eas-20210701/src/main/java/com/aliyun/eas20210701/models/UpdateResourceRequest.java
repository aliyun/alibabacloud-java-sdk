// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    @NameInMap("NodeMatchLabels")
    public java.util.Map<String, String> nodeMatchLabels;

    @NameInMap("NodeTolerations")
    public java.util.List<UpdateResourceRequestNodeTolerations> nodeTolerations;

    @NameInMap("ResourceName")
    public String resourceName;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setNodeMatchLabels(java.util.Map<String, String> nodeMatchLabels) {
        this.nodeMatchLabels = nodeMatchLabels;
        return this;
    }
    public java.util.Map<String, String> getNodeMatchLabels() {
        return this.nodeMatchLabels;
    }

    public UpdateResourceRequest setNodeTolerations(java.util.List<UpdateResourceRequestNodeTolerations> nodeTolerations) {
        this.nodeTolerations = nodeTolerations;
        return this;
    }
    public java.util.List<UpdateResourceRequestNodeTolerations> getNodeTolerations() {
        return this.nodeTolerations;
    }

    public UpdateResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public static class UpdateResourceRequestNodeTolerations extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("operator")
        public String operator;

        @NameInMap("value")
        public String value;

        public static UpdateResourceRequestNodeTolerations build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceRequestNodeTolerations self = new UpdateResourceRequestNodeTolerations();
            return TeaModel.build(map, self);
        }

        public UpdateResourceRequestNodeTolerations setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateResourceRequestNodeTolerations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateResourceRequestNodeTolerations setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateResourceRequestNodeTolerations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
