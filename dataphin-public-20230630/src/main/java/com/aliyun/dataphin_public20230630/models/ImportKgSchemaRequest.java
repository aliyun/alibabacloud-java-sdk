// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ImportKgSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("ImportCommand")
    public ImportKgSchemaRequestImportCommand importCommand;

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

    public ImportKgSchemaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ImportKgSchemaRequestImportCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name:xxx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>yaml</p>
         */
        @NameInMap("InputFormat")
        public String inputFormat;

        /**
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
