// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTaskUdfLineagesRequest extends TeaModel {
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
    public UpdateBatchTaskUdfLineagesRequestUpdateCommand updateCommand;

    public static UpdateBatchTaskUdfLineagesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTaskUdfLineagesRequest self = new UpdateBatchTaskUdfLineagesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTaskUdfLineagesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBatchTaskUdfLineagesRequest setUpdateCommand(UpdateBatchTaskUdfLineagesRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBatchTaskUdfLineagesRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<String> columnList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FullTable")
        public Boolean fullTable;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList self = new UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList setColumnList(java.util.List<String> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList setFullTable(Boolean fullTable) {
            this.fullTable = fullTable;
            return this;
        }
        public Boolean getFullTable() {
            return this.fullTable;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<String> columnList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FullTable")
        public Boolean fullTable;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_output</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList self = new UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList setColumnList(java.util.List<String> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList setFullTable(Boolean fullTable) {
            this.fullTable = fullTable;
            return this;
        }
        public Boolean getFullTable() {
            return this.fullTable;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InputLineageList")
        public java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList> inputLineageList;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OutputLineageList")
        public java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList> outputLineageList;

        public static UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList self = new UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList setInputLineageList(java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList> inputLineageList) {
            this.inputLineageList = inputLineageList;
            return this;
        }
        public java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListInputLineageList> getInputLineageList() {
            return this.inputLineageList;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList setOutputLineageList(java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList> outputLineageList) {
            this.outputLineageList = outputLineageList;
            return this;
        }
        public java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupListOutputLineageList> getOutputLineageList() {
            return this.outputLineageList;
        }

    }

    public static class UpdateBatchTaskUdfLineagesRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("LineageGroupList")
        public java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList> lineageGroupList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static UpdateBatchTaskUdfLineagesRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskUdfLineagesRequestUpdateCommand self = new UpdateBatchTaskUdfLineagesRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommand setLineageGroupList(java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList> lineageGroupList) {
            this.lineageGroupList = lineageGroupList;
            return this;
        }
        public java.util.List<UpdateBatchTaskUdfLineagesRequestUpdateCommandLineageGroupList> getLineageGroupList() {
            return this.lineageGroupList;
        }

        public UpdateBatchTaskUdfLineagesRequestUpdateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
