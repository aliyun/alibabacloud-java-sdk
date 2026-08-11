// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelPermissionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("accessAllEntities")
    public String accessAllEntities;

    @NameInMap("models")
    public java.util.List<UpdateModelPermissionsRequestModels> models;

    /**
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
        @NameInMap("deploy")
        public Boolean deploy;

        @NameInMap("fineTune")
        public Boolean fineTune;

        @NameInMap("inference")
        public Boolean inference;

        /**
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
