// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSubmitRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListSubmitRecordsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListSubmitRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubmitRecordsRequest self = new ListSubmitRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubmitRecordsRequest setListQuery(ListSubmitRecordsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListSubmitRecordsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListSubmitRecordsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListSubmitRecordsRequestListQuerySearchFilter extends TeaModel {
        @NameInMap("ChangeTypeList")
        public java.util.List<Integer> changeTypeList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProjectIdList")
        public java.util.List<Long> projectIdList;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("SubmitEndTime")
        public String submitEndTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("SubmitStartTime")
        public String submitStartTime;

        @NameInMap("SubmitterList")
        public java.util.List<String> submitterList;

        public static ListSubmitRecordsRequestListQuerySearchFilter build(java.util.Map<String, ?> map) throws Exception {
            ListSubmitRecordsRequestListQuerySearchFilter self = new ListSubmitRecordsRequestListQuerySearchFilter();
            return TeaModel.build(map, self);
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setChangeTypeList(java.util.List<Integer> changeTypeList) {
            this.changeTypeList = changeTypeList;
            return this;
        }
        public java.util.List<Integer> getChangeTypeList() {
            return this.changeTypeList;
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setProjectIdList(java.util.List<Long> projectIdList) {
            this.projectIdList = projectIdList;
            return this;
        }
        public java.util.List<Long> getProjectIdList() {
            return this.projectIdList;
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setSubmitEndTime(String submitEndTime) {
            this.submitEndTime = submitEndTime;
            return this;
        }
        public String getSubmitEndTime() {
            return this.submitEndTime;
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setSubmitStartTime(String submitStartTime) {
            this.submitStartTime = submitStartTime;
            return this;
        }
        public String getSubmitStartTime() {
            return this.submitStartTime;
        }

        public ListSubmitRecordsRequestListQuerySearchFilter setSubmitterList(java.util.List<String> submitterList) {
            this.submitterList = submitterList;
            return this;
        }
        public java.util.List<String> getSubmitterList() {
            return this.submitterList;
        }

    }

    public static class ListSubmitRecordsRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SearchFilter")
        public ListSubmitRecordsRequestListQuerySearchFilter searchFilter;

        public static ListSubmitRecordsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListSubmitRecordsRequestListQuery self = new ListSubmitRecordsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListSubmitRecordsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListSubmitRecordsRequestListQuery setSearchFilter(ListSubmitRecordsRequestListQuerySearchFilter searchFilter) {
            this.searchFilter = searchFilter;
            return this;
        }
        public ListSubmitRecordsRequestListQuerySearchFilter getSearchFilter() {
            return this.searchFilter;
        }

    }

}
