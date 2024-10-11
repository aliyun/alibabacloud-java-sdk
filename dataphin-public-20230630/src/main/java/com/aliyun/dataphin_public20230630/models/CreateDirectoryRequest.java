// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDirectoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDirectoryRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectoryRequest self = new CreateDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDirectoryRequest setCreateCommand(CreateDirectoryRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDirectoryRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDirectoryRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateDirectoryRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempCode</p>
         */
        @NameInMap("Category")
        public String category;

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
         * <p>test_xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1212344</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreateDirectoryRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDirectoryRequestCreateCommand self = new CreateDirectoryRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDirectoryRequestCreateCommand setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateDirectoryRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateDirectoryRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDirectoryRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
