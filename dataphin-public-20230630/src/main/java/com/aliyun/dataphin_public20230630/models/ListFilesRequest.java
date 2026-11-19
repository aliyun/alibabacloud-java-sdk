// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListFilesRequestListQuery listQuery;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilesRequest self = new ListFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListFilesRequest setListQuery(ListFilesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListFilesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListFilesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListFilesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListFilesRequestListQuery extends TeaModel {
        /**
         * <p>The menu tree category. Valid values:</p>
         * <ul>
         * <li>tempCode: Ad hoc query.</li>
         * <li>codeManage: Code task.</li>
         * <li>offlinePipeline: Offline pipeline.</li>
         * <li>offlinePipelineCustomPlugin: Custom pipeline component.</li>
         * <li>dataX: Synchronization task.</li>
         * <li>streamMeta: Real-time metatable.</li>
         * <li>streamCustomDataSource: Real-time custom data source.</li>
         * <li>streamTemplate: Real-time computing template.</li>
         * <li>resourceManage: Resource management.</li>
         * <li>udfResource: Offline function.</li>
         * <li>streamFunction: Real-time function.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempCode</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The file directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/xx/x</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The environment identifier. Valid values:</p>
         * <ul>
         * <li>DEV</li>
         * <li>PROD</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11112311</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Specifies whether to recursively traverse and query the directory. Valid values:</p>
         * <ul>
         * <li>true: Yes. Returns all nodes under the directory.</li>
         * <li>false: No. Returns only the first-level nodes under the directory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Recursive")
        public Boolean recursive;

        public static ListFilesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListFilesRequestListQuery self = new ListFilesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListFilesRequestListQuery setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListFilesRequestListQuery setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListFilesRequestListQuery setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListFilesRequestListQuery setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListFilesRequestListQuery setRecursive(Boolean recursive) {
            this.recursive = recursive;
            return this;
        }
        public Boolean getRecursive() {
            return this.recursive;
        }

    }

}
