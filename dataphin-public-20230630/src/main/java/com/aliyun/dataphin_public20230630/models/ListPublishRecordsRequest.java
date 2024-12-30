// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPublishRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListPublishRecordsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListPublishRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishRecordsRequest self = new ListPublishRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishRecordsRequest setListQuery(ListPublishRecordsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListPublishRecordsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListPublishRecordsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListPublishRecordsRequestListQuerySearchFilter extends TeaModel {
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
        @NameInMap("PublishEndTime")
        public String publishEndTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("PublishStartTime")
        public String publishStartTime;

        @NameInMap("PublishStatusList")
        public java.util.List<Integer> publishStatusList;

        @NameInMap("SubmitterList")
        public java.util.List<String> submitterList;

        public static ListPublishRecordsRequestListQuerySearchFilter build(java.util.Map<String, ?> map) throws Exception {
            ListPublishRecordsRequestListQuerySearchFilter self = new ListPublishRecordsRequestListQuerySearchFilter();
            return TeaModel.build(map, self);
        }

        public ListPublishRecordsRequestListQuerySearchFilter setChangeTypeList(java.util.List<Integer> changeTypeList) {
            this.changeTypeList = changeTypeList;
            return this;
        }
        public java.util.List<Integer> getChangeTypeList() {
            return this.changeTypeList;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setProjectIdList(java.util.List<Long> projectIdList) {
            this.projectIdList = projectIdList;
            return this;
        }
        public java.util.List<Long> getProjectIdList() {
            return this.projectIdList;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setPublishEndTime(String publishEndTime) {
            this.publishEndTime = publishEndTime;
            return this;
        }
        public String getPublishEndTime() {
            return this.publishEndTime;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setPublishStartTime(String publishStartTime) {
            this.publishStartTime = publishStartTime;
            return this;
        }
        public String getPublishStartTime() {
            return this.publishStartTime;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setPublishStatusList(java.util.List<Integer> publishStatusList) {
            this.publishStatusList = publishStatusList;
            return this;
        }
        public java.util.List<Integer> getPublishStatusList() {
            return this.publishStatusList;
        }

        public ListPublishRecordsRequestListQuerySearchFilter setSubmitterList(java.util.List<String> submitterList) {
            this.submitterList = submitterList;
            return this;
        }
        public java.util.List<String> getSubmitterList() {
            return this.submitterList;
        }

    }

    public static class ListPublishRecordsRequestListQuery extends TeaModel {
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
        public ListPublishRecordsRequestListQuerySearchFilter searchFilter;

        public static ListPublishRecordsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListPublishRecordsRequestListQuery self = new ListPublishRecordsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListPublishRecordsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListPublishRecordsRequestListQuery setSearchFilter(ListPublishRecordsRequestListQuerySearchFilter searchFilter) {
            this.searchFilter = searchFilter;
            return this;
        }
        public ListPublishRecordsRequestListQuerySearchFilter getSearchFilter() {
            return this.searchFilter;
        }

    }

}
