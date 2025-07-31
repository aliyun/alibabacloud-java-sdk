// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateResourceRequestUpdateCommand updateCommand;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateResourceRequest setUpdateCommand(UpdateResourceRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateResourceRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateResourceRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx 测试</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("ComputeEngineType")
        public String computeEngineType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx 测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10112101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>711833</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300011448/711833/cdcd1c44-f1ee-46bb-b318-1d123dbabf6c</p>
         */
        @NameInMap("StorageAddress")
        public String storageAddress;

        public static UpdateResourceRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceRequestUpdateCommand self = new UpdateResourceRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateResourceRequestUpdateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateResourceRequestUpdateCommand setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public UpdateResourceRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateResourceRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateResourceRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateResourceRequestUpdateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateResourceRequestUpdateCommand setStorageAddress(String storageAddress) {
            this.storageAddress = storageAddress;
            return this;
        }
        public String getStorageAddress() {
            return this.storageAddress;
        }

    }

}
