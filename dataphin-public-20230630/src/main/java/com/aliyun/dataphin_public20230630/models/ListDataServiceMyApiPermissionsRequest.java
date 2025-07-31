// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceMyApiPermissionsRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListDataServiceMyApiPermissionsRequestListQuery listQuery;

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
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListDataServiceMyApiPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceMyApiPermissionsRequest self = new ListDataServiceMyApiPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceMyApiPermissionsRequest setListQuery(ListDataServiceMyApiPermissionsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceMyApiPermissionsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceMyApiPermissionsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceMyApiPermissionsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceMyApiPermissionsRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListDataServiceMyApiPermissionsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyApiPermissionsRequestListQuery self = new ListDataServiceMyApiPermissionsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyApiPermissionsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDataServiceMyApiPermissionsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceMyApiPermissionsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
