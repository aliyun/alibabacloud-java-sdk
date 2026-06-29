// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    /**
     * <p>Query conditions</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListFilesRequestListQuery listQuery;

    /**
     * <p>Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

    public static class ListFilesRequestListQuery extends TeaModel {
        /**
         * <p>Menu tree category</p>
         * <ul>
         * <li>Ad hoc query: tempCode</li>
         * <li>Code task: codeManage</li>
         * <li>Offline pipeline: offlinePipeline</li>
         * <li>Pipeline custom component: offlinePipelineCustomPlugin</li>
         * <li>Sync task: dataX</li>
         * <li>Real-time meta table: streamMeta</li>
         * <li>Real-time custom source: streamCustomDataSource</li>
         * <li>Real-time computing template: streamTemplate</li>
         * <li>Resource management: resourceManage</li>
         * <li>Offline function: udfResource</li>
         * <li>Real-time function: streamFunction</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempCode</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>File directory</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/xx/x</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>Environment identifier</p>
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
         * <p>Project ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11112311</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Whether to recursively traverse and query</p>
         * <ul>
         * <li>true: Yes, returns all nodes under the directory</li>
         * <li>false: No, returns only the first-level nodes under the directory</li>
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
