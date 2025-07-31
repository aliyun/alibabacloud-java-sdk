// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceMyAppPermissionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceMyAppPermissionsRequestListQuery listQuery;

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

    public static ListDataServiceMyAppPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceMyAppPermissionsRequest self = new ListDataServiceMyAppPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceMyAppPermissionsRequest setListQuery(ListDataServiceMyAppPermissionsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceMyAppPermissionsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceMyAppPermissionsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceMyAppPermissionsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceMyAppPermissionsRequestListQuery extends TeaModel {
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

        public static ListDataServiceMyAppPermissionsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyAppPermissionsRequestListQuery self = new ListDataServiceMyAppPermissionsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyAppPermissionsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDataServiceMyAppPermissionsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceMyAppPermissionsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
