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

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public ListQualityTemplatesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListQualityTemplatesRequestListQuery extends TeaModel {
        /**
         * <p>The rule types. Valid values:</p>
         * <ul>
         * <li>CONSISTENT: Consistency.</li>
         * <li>EFFECTIVE: Effectiveness.</li>
         * <li>TIMELINESE: Timeliness.</li>
         * <li>ACCURATE: Accuracy.</li>
         * <li>UNIQUENESS: Uniqueness.</li>
         * <li>COMPLETENESS: Completeness.</li>
         * <li>STABILITY: Stability.</li>
         * <li>CUSTOM: Custom.</li>
         * </ul>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <p>Specifies whether the template is owned by the current user.</p>
         */
        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        /**
         * <p>The search keyword filter, which supports template names.</p>
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
         * <p>The number of entries per page. Default value: 20.</p>
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
         * <p>The template sources. Valid values:</p>
         * <ul>
         * <li>SYSTEM: System template.</li>
         * <li>CUSTOM: Custom template.</li>
         * </ul>
         */
        @NameInMap("TemplateSourceList")
        public java.util.List<String> templateSourceList;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>FIELD_NULL_VALUE_VALIDATE: Field null value check.</li>
         * <li>FIELD_EMPTY_STRING_VALIDATE: Field empty character check.</li>
         * <li>FIELD_UNIQUE_VALIDATE: Field uniqueness check.</li>
         * <li>FIELD_GROUP_COUNT_VALIDATE: Field unique value count check.</li>
         * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: Field duplicate value count check.</li>
         * <li>FUNCTION_TIME_COMPARE: Time function comparison.</li>
         * <li>SINGLE_TABLE_TIME_COMPARE: Non-partitioned table time field comparison.</li>
         * <li>DOUBLE_TABLE_TIME_COMPARE: Two-table time field comparison.</li>
         * <li>FIELD_FORMAT_VALIDATE: Field format check.</li>
         * <li>FIELD_LENGTH_VALIDATE: Field length check.</li>
         * <li>FIELD_VALUE_RANGE_VALIDATE: Field value range check.</li>
         * <li>CODE_TABLE_COMPARE: Lookup table reference comparison.</li>
         * <li>STANDARD_CODE_TABLE_COMPARE: Data standard lookup table reference comparison.</li>
         * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: Non-partitioned table field value consistency comparison.</li>
         * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: Non-partitioned table field statistical value consistency comparison.</li>
         * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: Non-partitioned table field business logic consistency comparison.</li>
         * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: Two-table field value consistency comparison.</li>
         * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Two-table field statistical value consistency comparison.</li>
         * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Cross-source two-table field statistical value consistency comparison.</li>
         * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: Two-table field business logic consistency comparison.</li>
         * <li>TABLE_STABILITY_VALIDATE: Table stability check.</li>
         * <li>TABLE_FLUCTUATION_VALIDATE: Table fluctuation check.</li>
         * <li>FIELD_STABILITY_VALIDATE: Field stability check.</li>
         * <li>FIELD_FLUCTUATION_VALIDATE: Field fluctuation check.</li>
         * <li>CUSTOM_STATISTICAL_VALIDATE: Custom statistical metric check.</li>
         * <li>CUSTOM_DATA_DETAILS_VALIDATE: Custom data details check.</li>
         * <li>DATASOURCE_AVAILABLE_CHECK: Data source connectivity monitoring.</li>
         * <li>TABLE_SCHEMA_CHECK: Table schema change monitoring.</li>
         * <li>REAL_TIME_OFFLINE_COMPARE: Real-time and offline comparison.</li>
         * <li>REAL_TIME_STATISTICAL_VALIDATE: Real-time statistical value monitoring.</li>
         * <li>REAL_TIME_MULTI_CHAIN_COMPARE: Real-time multi-link comparison.</li>
         * </ul>
         */
        @NameInMap("TemplateTypeList")
        public java.util.List<String> templateTypeList;

        /**
         * <p>The monitored object types. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table.</li>
         * <li>DATASOURCE_TABLE: Global table.</li>
         * <li>DATASOURCE: Data source.</li>
         * <li>INDEX: Metric.</li>
         * <li>REALTIME_LOGICAL_TABLE: Real-time metadata table.</li>
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
