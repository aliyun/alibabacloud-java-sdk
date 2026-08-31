// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgGremlinRequest extends TeaModel {
    /**
     * <p>The custom Cypher query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecCommand")
    public ExecKgGremlinRequestExecCommand execCommand;

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
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExecKgGremlinRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecKgGremlinRequest self = new ExecKgGremlinRequest();
        return TeaModel.build(map, self);
    }

    public ExecKgGremlinRequest setExecCommand(ExecKgGremlinRequestExecCommand execCommand) {
        this.execCommand = execCommand;
        return this;
    }
    public ExecKgGremlinRequestExecCommand getExecCommand() {
        return this.execCommand;
    }

    public ExecKgGremlinRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ExecKgGremlinRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ExecKgGremlinRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ExecKgGremlinRequestExecCommandParams extends TeaModel {
        /**
         * <p>The data type of paramValue.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>paramKey</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>paramValue</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecKgGremlinRequestExecCommandParams build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinRequestExecCommandParams self = new ExecKgGremlinRequestExecCommandParams();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinRequestExecCommandParams setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ExecKgGremlinRequestExecCommandParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecKgGremlinRequestExecCommandParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgGremlinRequestExecCommand extends TeaModel {
        /**
         * <p>The maximum number of records to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The input parameters of the query statement.</p>
         */
        @NameInMap("Params")
        public java.util.List<ExecKgGremlinRequestExecCommandParams> params;

        /**
         * <p>The custom Cypher query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>MATCH (n) RETURN n LIMIT 10</p>
         */
        @NameInMap("Query")
        public String query;

        public static ExecKgGremlinRequestExecCommand build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinRequestExecCommand self = new ExecKgGremlinRequestExecCommand();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinRequestExecCommand setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ExecKgGremlinRequestExecCommand setParams(java.util.List<ExecKgGremlinRequestExecCommandParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<ExecKgGremlinRequestExecCommandParams> getParams() {
            return this.params;
        }

        public ExecKgGremlinRequestExecCommand setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

}
