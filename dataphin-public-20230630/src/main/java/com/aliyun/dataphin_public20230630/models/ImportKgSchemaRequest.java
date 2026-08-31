// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ImportKgSchemaRequest extends TeaModel {
    /**
     * <p>The command for importing the knowledge graph definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("ImportCommand")
    public ImportKgSchemaRequestImportCommand importCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ImportKgSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKgSchemaRequest self = new ImportKgSchemaRequest();
        return TeaModel.build(map, self);
    }

    public ImportKgSchemaRequest setImportCommand(ImportKgSchemaRequestImportCommand importCommand) {
        this.importCommand = importCommand;
        return this;
    }
    public ImportKgSchemaRequestImportCommand getImportCommand() {
        return this.importCommand;
    }

    public ImportKgSchemaRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ImportKgSchemaRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ImportKgSchemaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ImportKgSchemaRequestImportCommand extends TeaModel {
        /**
         * <p>The knowledge graph definition content converted based on the specified format.</p>
         * 
         * <strong>example:</strong>
         * <p>name:xxx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the knowledge graph definition content. Valid values: json and yaml. Default value: yaml.</p>
         * 
         * <strong>example:</strong>
         * <p>yaml</p>
         */
        @NameInMap("InputFormat")
        public String inputFormat;

        /**
         * <p>The merge strategy for the knowledge graph definition content. Valid values: replace and merge. Default value: replace.</p>
         * 
         * <strong>example:</strong>
         * <p>replace</p>
         */
        @NameInMap("MergeStrategy")
        public String mergeStrategy;

        public static ImportKgSchemaRequestImportCommand build(java.util.Map<String, ?> map) throws Exception {
            ImportKgSchemaRequestImportCommand self = new ImportKgSchemaRequestImportCommand();
            return TeaModel.build(map, self);
        }

        public ImportKgSchemaRequestImportCommand setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImportKgSchemaRequestImportCommand setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public ImportKgSchemaRequestImportCommand setMergeStrategy(String mergeStrategy) {
            this.mergeStrategy = mergeStrategy;
            return this;
        }
        public String getMergeStrategy() {
            return this.mergeStrategy;
        }

    }

}
