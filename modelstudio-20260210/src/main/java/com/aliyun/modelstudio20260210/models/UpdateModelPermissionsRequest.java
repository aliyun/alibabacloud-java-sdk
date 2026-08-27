// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelPermissionsRequest extends TeaModel {
    /**
     * <p>The tri-state value for one-click authorization. Valid values:</p>
     * <ul>
     * <li>OPEN: grants authorization to all models with one click.</li>
     * <li>CLOSE: cancels one-click authorization.</li>
     * <li>KEEP: keeps per-model authorization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("accessAllEntities")
    public String accessAllEntities;

    /**
     * <p>The list of per-model authorization items.</p>
     */
    @NameInMap("models")
    public java.util.List<UpdateModelPermissionsRequestModels> models;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-32klhjk2312334jkh</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateModelPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelPermissionsRequest self = new UpdateModelPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelPermissionsRequest setAccessAllEntities(String accessAllEntities) {
        this.accessAllEntities = accessAllEntities;
        return this;
    }
    public String getAccessAllEntities() {
        return this.accessAllEntities;
    }

    public UpdateModelPermissionsRequest setModels(java.util.List<UpdateModelPermissionsRequestModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<UpdateModelPermissionsRequestModels> getModels() {
        return this.models;
    }

    public UpdateModelPermissionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateModelPermissionsRequestModels extends TeaModel {
        /**
         * <p>Specifies whether to grant model deployment permission.</p>
         */
        @NameInMap("deploy")
        public Boolean deploy;

        /**
         * <p>Specifies whether to grant model training permission.</p>
         */
        @NameInMap("fineTune")
        public Boolean fineTune;

        /**
         * <p>Specifies whether to grant model invocation permission.</p>
         */
        @NameInMap("inference")
        public Boolean inference;

        /**
         * <p>The model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        public static UpdateModelPermissionsRequestModels build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelPermissionsRequestModels self = new UpdateModelPermissionsRequestModels();
            return TeaModel.build(map, self);
        }

        public UpdateModelPermissionsRequestModels setDeploy(Boolean deploy) {
            this.deploy = deploy;
            return this;
        }
        public Boolean getDeploy() {
            return this.deploy;
        }

        public UpdateModelPermissionsRequestModels setFineTune(Boolean fineTune) {
            this.fineTune = fineTune;
            return this;
        }
        public Boolean getFineTune() {
            return this.fineTune;
        }

        public UpdateModelPermissionsRequestModels setInference(Boolean inference) {
            this.inference = inference;
            return this;
        }
        public Boolean getInference() {
            return this.inference;
        }

        public UpdateModelPermissionsRequestModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

}
