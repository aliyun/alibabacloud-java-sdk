// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServicePublishedApisRequestListQuery listQuery;

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

    /**
     * <p>The ID of the Data Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListDataServicePublishedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisRequest self = new ListDataServicePublishedApisRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisRequest setListQuery(ListDataServicePublishedApisRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServicePublishedApisRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServicePublishedApisRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServicePublishedApisRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListDataServicePublishedApisRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServicePublishedApisRequestListQuery extends TeaModel {
        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102113</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListDataServicePublishedApisRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisRequestListQuery self = new ListDataServicePublishedApisRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisRequestListQuery setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServicePublishedApisRequestListQuery setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public ListDataServicePublishedApisRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServicePublishedApisRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
