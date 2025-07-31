// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateResourceRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setCreateCommand(CreateResourceRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateResourceRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateResourceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateResourceRequestCreateCommand extends TeaModel {
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
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>udf_sleep.jar</p>
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
         * <p>JAR</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300011448/711833/cdcd1c44-f1ee-46bb-b318-1d123dbabf6c</p>
         */
        @NameInMap("StorageAddress")
        public String storageAddress;

        public static CreateResourceRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRequestCreateCommand self = new CreateResourceRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateResourceRequestCreateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateResourceRequestCreateCommand setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public CreateResourceRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateResourceRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateResourceRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateResourceRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateResourceRequestCreateCommand setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CreateResourceRequestCreateCommand setStorageAddress(String storageAddress) {
            this.storageAddress = storageAddress;
            return this;
        }
        public String getStorageAddress() {
            return this.storageAddress;
        }

    }

}
