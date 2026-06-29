// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityTemplatesRequest extends TeaModel {
    /**
     * <p>The paged query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListQualityTemplatesRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
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
        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li>CONSISTENT: consistency</li>
         * <li>EFFECTIVE: validity</li>
         * <li>TIMELINESE: timeliness</li>
         * <li>ACCURATE: accuracy</li>
         * <li>UNIQUENESS: uniqueness</li>
         * <li>COMPLETENESS: completeness</li>
         * <li>STABILITY: stability</li>
         * <li>CUSTOM: custom.</li>
         * </ul>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <p>Specifies whether to query only templates owned by the current user.</p>
         */
        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        /**
         * <p>The search keyword. Template name filtering is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
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

        /**
         * <p>The supported data source types, such as MAX_COMPUTE, MYSQL, and HIVE.</p>
         */
        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        /**
         * <p>The template owners.</p>
         */
        @NameInMap("TemplateOwnerList")
        public java.util.List<String> templateOwnerList;

        /**
         * <p>The template source. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system template</li>
         * <li>CUSTOM: custom template.</li>
         * </ul>
         */
        @NameInMap("TemplateSourceList")
        public java.util.List<String> templateSourceList;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>FIELD_NULL_VALUE_VALIDATE: field null value check</li>
         * <li>FIELD_EMPTY_STRING_VALIDATE: field empty character string check</li>
         * <li>FIELD_UNIQUE_VALIDATE: field uniqueness check</li>
         * <li>FIELD_GROUP_COUNT_VALIDATE: field unique value count check</li>
         * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count check</li>
         * <li>FUNCTION_TIME_COMPARE: time function comparison</li>
         * <li>SINGLE_TABLE_TIME_COMPARE: non-partitioned table time field comparison</li>
         * <li>DOUBLE_TABLE_TIME_COMPARE: two-table time field comparison</li>
         * <li>FIELD_FORMAT_VALIDATE: field format check</li>
         * <li>FIELD_LENGTH_VALIDATE: field length check</li>
         * <li>FIELD_VALUE_RANGE_VALIDATE: field value range check</li>
         * <li>CODE_TABLE_COMPARE: lookup table reference comparison</li>
         * <li>STANDARD_CODE_TABLE_COMPARE: data standard lookup table reference comparison</li>
         * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: non-partitioned table field value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: non-partitioned table field statistical value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: non-partitioned table field business logic consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: two-table field value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: two-table field statistical value consistency comparison</li>
         * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source two-table field statistical value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: two-table field business logic consistency comparison</li>
         * <li>TABLE_STABILITY_VALIDATE: table stability check</li>
         * <li>TABLE_FLUCTUATION_VALIDATE: table fluctuation check</li>
         * <li>FIELD_STABILITY_VALIDATE: field stability check</li>
         * <li>FIELD_FLUCTUATION_VALIDATE: field fluctuation check</li>
         * <li>CUSTOM_STATISTICAL_VALIDATE: custom statistical metric check</li>
         * <li>CUSTOM_DATA_DETAILS_VALIDATE: custom data details check</li>
         * <li>DATASOURCE_AVAILABLE_CHECK: data source connectivity monitoring</li>
         * <li>TABLE_SCHEMA_CHECK: table schema change monitoring</li>
         * <li>REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison</li>
         * <li>REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring</li>
         * <li>REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-link comparison.</li>
         * </ul>
         */
        @NameInMap("TemplateTypeList")
        public java.util.List<String> templateTypeList;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table</li>
         * <li>DATASOURCE_TABLE: full-domain table</li>
         * <li>DATASOURCE: data source</li>
         * <li>INDEX: metric</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         */
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
