// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedAppsRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceAuthorizedAppsRequestListQuery listQuery;

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
     * <p>The ID of the data service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListDataServiceAuthorizedAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedAppsRequest self = new ListDataServiceAuthorizedAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedAppsRequest setListQuery(ListDataServiceAuthorizedAppsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceAuthorizedAppsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceAuthorizedAppsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceAuthorizedAppsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceAuthorizedAppsRequestListQuery extends TeaModel {
        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListDataServiceAuthorizedAppsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedAppsRequestListQuery self = new ListDataServiceAuthorizedAppsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedAppsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDataServiceAuthorizedAppsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceAuthorizedAppsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
