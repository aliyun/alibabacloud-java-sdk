// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductComponentVersionRequest extends TeaModel {
    @NameInMap("componentOrchestrationValues")
    public String componentOrchestrationValues;

    @NameInMap("componentSpecificationUid")
    public String componentSpecificationUid;

    @NameInMap("componentSpecificationValues")
    public String componentSpecificationValues;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("newComponentVersionUID")
    public String newComponentVersionUID;

    @NameInMap("policy")
    public UpdateProductComponentVersionRequestPolicy policy;

    @NameInMap("releaseName")
    public String releaseName;

    @NameInMap("unsetComponentVersionSpec")
    public Boolean unsetComponentVersionSpec;

    public static UpdateProductComponentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentVersionRequest self = new UpdateProductComponentVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentVersionRequest setComponentOrchestrationValues(String componentOrchestrationValues) {
        this.componentOrchestrationValues = componentOrchestrationValues;
        return this;
    }
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    public UpdateProductComponentVersionRequest setComponentSpecificationUid(String componentSpecificationUid) {
        this.componentSpecificationUid = componentSpecificationUid;
        return this;
    }
    public String getComponentSpecificationUid() {
        return this.componentSpecificationUid;
    }

    public UpdateProductComponentVersionRequest setComponentSpecificationValues(String componentSpecificationValues) {
        this.componentSpecificationValues = componentSpecificationValues;
        return this;
    }
    public String getComponentSpecificationValues() {
        return this.componentSpecificationValues;
    }

    public UpdateProductComponentVersionRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateProductComponentVersionRequest setNewComponentVersionUID(String newComponentVersionUID) {
        this.newComponentVersionUID = newComponentVersionUID;
        return this;
    }
    public String getNewComponentVersionUID() {
        return this.newComponentVersionUID;
    }

    public UpdateProductComponentVersionRequest setPolicy(UpdateProductComponentVersionRequestPolicy policy) {
        this.policy = policy;
        return this;
    }
    public UpdateProductComponentVersionRequestPolicy getPolicy() {
        return this.policy;
    }

    public UpdateProductComponentVersionRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public UpdateProductComponentVersionRequest setUnsetComponentVersionSpec(Boolean unsetComponentVersionSpec) {
        this.unsetComponentVersionSpec = unsetComponentVersionSpec;
        return this;
    }
    public Boolean getUnsetComponentVersionSpec() {
        return this.unsetComponentVersionSpec;
    }

    public static class UpdateProductComponentVersionRequestPolicyMultiCluster extends TeaModel {
        @NameInMap("autoInstall")
        public Boolean autoInstall;

        @NameInMap("targetClusters")
        public java.util.List<String> targetClusters;

        public static UpdateProductComponentVersionRequestPolicyMultiCluster build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductComponentVersionRequestPolicyMultiCluster self = new UpdateProductComponentVersionRequestPolicyMultiCluster();
            return TeaModel.build(map, self);
        }

        public UpdateProductComponentVersionRequestPolicyMultiCluster setAutoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        public UpdateProductComponentVersionRequestPolicyMultiCluster setTargetClusters(java.util.List<String> targetClusters) {
            this.targetClusters = targetClusters;
            return this;
        }
        public java.util.List<String> getTargetClusters() {
            return this.targetClusters;
        }

    }

    public static class UpdateProductComponentVersionRequestPolicy extends TeaModel {
        @NameInMap("multiCluster")
        public UpdateProductComponentVersionRequestPolicyMultiCluster multiCluster;

        public static UpdateProductComponentVersionRequestPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductComponentVersionRequestPolicy self = new UpdateProductComponentVersionRequestPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateProductComponentVersionRequestPolicy setMultiCluster(UpdateProductComponentVersionRequestPolicyMultiCluster multiCluster) {
            this.multiCluster = multiCluster;
            return this;
        }
        public UpdateProductComponentVersionRequestPolicyMultiCluster getMultiCluster() {
            return this.multiCluster;
        }

    }

}
