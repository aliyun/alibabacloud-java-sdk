// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStandardsRequest extends TeaModel {
    /**
     * <p>Search conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListStandardsRequestListQuery listQuery;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListStandardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStandardsRequest self = new ListStandardsRequest();
        return TeaModel.build(map, self);
    }

    public ListStandardsRequest setListQuery(ListStandardsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListStandardsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListStandardsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListStandardsRequestListQuery extends TeaModel {
        /**
         * <p>Directory of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1/dir2</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>Search keyword: fuzzy search by standard name, English name, or code. Case-insensitive, sorted by relevance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>Page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>Number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Standard set ID list.</p>
         */
        @NameInMap("StandardSetIdList")
        public java.util.List<Long> standardSetIdList;

        /**
         * <p>Stage of the standard: DEV or PROD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        /**
         * <p>Standard status list. Standard statuses under DEV stage: DRAFT, UNDER_REVISION, UNDER_REVIEW, REVIEW_PASSED, IN_PUBLISH. Standard statuses under PROD stage: NOT_ACTIVATED, ACTIVE, EXPIRED.</p>
         */
        @NameInMap("StandardStatusList")
        public java.util.List<String> standardStatusList;

        /**
         * <p>Standard template ID list.</p>
         */
        @NameInMap("StandardTemplateIdList")
        public java.util.List<Long> standardTemplateIdList;

        /**
         * <p>Standard type: Basic, EMPTY indicates the standard type is empty.</p>
         */
        @NameInMap("StandardTypeList")
        public java.util.List<String> standardTypeList;

        /**
         * <p>User ID: only queries standards visible to this user ID. If empty, queries standards visible to the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListStandardsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsRequestListQuery self = new ListStandardsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListStandardsRequestListQuery setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListStandardsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListStandardsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListStandardsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListStandardsRequestListQuery setStandardSetIdList(java.util.List<Long> standardSetIdList) {
            this.standardSetIdList = standardSetIdList;
            return this;
        }
        public java.util.List<Long> getStandardSetIdList() {
            return this.standardSetIdList;
        }

        public ListStandardsRequestListQuery setStandardStage(String standardStage) {
            this.standardStage = standardStage;
            return this;
        }
        public String getStandardStage() {
            return this.standardStage;
        }

        public ListStandardsRequestListQuery setStandardStatusList(java.util.List<String> standardStatusList) {
            this.standardStatusList = standardStatusList;
            return this;
        }
        public java.util.List<String> getStandardStatusList() {
            return this.standardStatusList;
        }

        public ListStandardsRequestListQuery setStandardTemplateIdList(java.util.List<Long> standardTemplateIdList) {
            this.standardTemplateIdList = standardTemplateIdList;
            return this;
        }
        public java.util.List<Long> getStandardTemplateIdList() {
            return this.standardTemplateIdList;
        }

        public ListStandardsRequestListQuery setStandardTypeList(java.util.List<String> standardTypeList) {
            this.standardTypeList = standardTypeList;
            return this;
        }
        public java.util.List<String> getStandardTypeList() {
            return this.standardTypeList;
        }

        public ListStandardsRequestListQuery setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
