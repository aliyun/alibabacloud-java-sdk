// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTemplatesRequest extends TeaModel {
    /**
     * <p>The runtime environment. Default value: PROD.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The paged query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListBatchTemplatesRequestListQuery listQuery;

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
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListBatchTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTemplatesRequest self = new ListBatchTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchTemplatesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListBatchTemplatesRequest setListQuery(ListBatchTemplatesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListBatchTemplatesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListBatchTemplatesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListBatchTemplatesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public static class ListBatchTemplatesRequestListQuery extends TeaModel {
        /**
         * <p>The template name keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>数据处理模板</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListBatchTemplatesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesRequestListQuery self = new ListBatchTemplatesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListBatchTemplatesRequestListQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListBatchTemplatesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
