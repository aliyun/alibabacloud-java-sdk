// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityTemplatesRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListQualityTemplatesRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListQualityTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityTemplatesRequest self = new ListQualityTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityTemplatesRequest setListQuery(ListQualityTemplatesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListQualityTemplatesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListQualityTemplatesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListQualityTemplatesRequestListQuery extends TeaModel {
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
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

        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        @NameInMap("TemplateOwnerList")
        public java.util.List<String> templateOwnerList;

        @NameInMap("TemplateSourceList")
        public java.util.List<String> templateSourceList;

        @NameInMap("TemplateTypeList")
        public java.util.List<String> templateTypeList;

        @NameInMap("WatchTypeList")
        public java.util.List<String> watchTypeList;

        public static ListQualityTemplatesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListQualityTemplatesRequestListQuery self = new ListQualityTemplatesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListQualityTemplatesRequestListQuery setCatalogList(java.util.List<String> catalogList) {
            this.catalogList = catalogList;
            return this;
        }
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        public ListQualityTemplatesRequestListQuery setCurrentUserOwned(Boolean currentUserOwned) {
            this.currentUserOwned = currentUserOwned;
            return this;
        }
        public Boolean getCurrentUserOwned() {
            return this.currentUserOwned;
        }

        public ListQualityTemplatesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListQualityTemplatesRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListQualityTemplatesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityTemplatesRequestListQuery setSupportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
            this.supportDataSourceTypeList = supportDataSourceTypeList;
            return this;
        }
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        public ListQualityTemplatesRequestListQuery setTemplateOwnerList(java.util.List<String> templateOwnerList) {
            this.templateOwnerList = templateOwnerList;
            return this;
        }
        public java.util.List<String> getTemplateOwnerList() {
            return this.templateOwnerList;
        }

        public ListQualityTemplatesRequestListQuery setTemplateSourceList(java.util.List<String> templateSourceList) {
            this.templateSourceList = templateSourceList;
            return this;
        }
        public java.util.List<String> getTemplateSourceList() {
            return this.templateSourceList;
        }

        public ListQualityTemplatesRequestListQuery setTemplateTypeList(java.util.List<String> templateTypeList) {
            this.templateTypeList = templateTypeList;
            return this;
        }
        public java.util.List<String> getTemplateTypeList() {
            return this.templateTypeList;
        }

        public ListQualityTemplatesRequestListQuery setWatchTypeList(java.util.List<String> watchTypeList) {
            this.watchTypeList = watchTypeList;
            return this;
        }
        public java.util.List<String> getWatchTypeList() {
            return this.watchTypeList;
        }

    }

}
