// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchRequest extends TeaModel {
    /**
     * <p>Query filter</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScgFilter")
    public ScgSearchRequestScgFilter scgFilter;

    /**
     * <p>Selection pool ID. Optional values: MC201132 (Ethnic Chinese Style), MC201136 (Pop Music), MC201139 (Sweet Love), MC201133 (Folk), MC201137 (Relaxing Reading), MC201138 (Happiness), PA202029 (Stories), PA202030 (Children\&quot;s Songs), PA202028 (Chinese Classics and History), PA202032 (Encyclopedia), PA202031 (English Children\&quot;s Songs)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MC201132</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    public static ScgSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ScgSearchRequest self = new ScgSearchRequest();
        return TeaModel.build(map, self);
    }

    public ScgSearchRequest setScgFilter(ScgSearchRequestScgFilter scgFilter) {
        this.scgFilter = scgFilter;
        return this;
    }
    public ScgSearchRequestScgFilter getScgFilter() {
        return this.scgFilter;
    }

    public ScgSearchRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public static class ScgSearchRequestScgFilterOffSetParam extends TeaModel {
        /**
         * <p>Number of returned items</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>Number of skipped items</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        public static ScgSearchRequestScgFilterOffSetParam build(java.util.Map<String, ?> map) throws Exception {
            ScgSearchRequestScgFilterOffSetParam self = new ScgSearchRequestScgFilterOffSetParam();
            return TeaModel.build(map, self);
        }

        public ScgSearchRequestScgFilterOffSetParam setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ScgSearchRequestScgFilterOffSetParam setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

    }

    public static class ScgSearchRequestScgFilterPageParam extends TeaModel {
        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Number of records per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ScgSearchRequestScgFilterPageParam build(java.util.Map<String, ?> map) throws Exception {
            ScgSearchRequestScgFilterPageParam self = new ScgSearchRequestScgFilterPageParam();
            return TeaModel.build(map, self);
        }

        public ScgSearchRequestScgFilterPageParam setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ScgSearchRequestScgFilterPageParam setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ScgSearchRequestScgFilterSortParam extends TeaModel {
        /**
         * <p>Sorting field</p>
         * 
         * <strong>example:</strong>
         * <p>internal_id</p>
         */
        @NameInMap("SortKey")
        public String sortKey;

        /**
         * <p>Sorting order</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        @NameInMap("SortOrder")
        public String sortOrder;

        /**
         * <p>Sorting field (default: empty string)</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("SortText")
        public String sortText;

        public static ScgSearchRequestScgFilterSortParam build(java.util.Map<String, ?> map) throws Exception {
            ScgSearchRequestScgFilterSortParam self = new ScgSearchRequestScgFilterSortParam();
            return TeaModel.build(map, self);
        }

        public ScgSearchRequestScgFilterSortParam setSortKey(String sortKey) {
            this.sortKey = sortKey;
            return this;
        }
        public String getSortKey() {
            return this.sortKey;
        }

        public ScgSearchRequestScgFilterSortParam setSortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public String getSortOrder() {
            return this.sortOrder;
        }

        public ScgSearchRequestScgFilterSortParam setSortText(String sortText) {
            this.sortText = sortText;
            return this;
        }
        public String getSortText() {
            return this.sortText;
        }

    }

    public static class ScgSearchRequestScgFilter extends TeaModel {
        /**
         * <p>Paging type</p>
         */
        @NameInMap("OffSetParam")
        public ScgSearchRequestScgFilterOffSetParam offSetParam;

        /**
         * <p>Paging type</p>
         */
        @NameInMap("PageParam")
        public ScgSearchRequestScgFilterPageParam pageParam;

        /**
         * <p>Sorting parameters</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SortParam")
        public ScgSearchRequestScgFilterSortParam sortParam;

        /**
         * <p>Whether to use the pageParam object for paging. Choose either offSetParam or pageParam. The default paging mode is pageParam.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseOffSet")
        public Boolean useOffSet;

        public static ScgSearchRequestScgFilter build(java.util.Map<String, ?> map) throws Exception {
            ScgSearchRequestScgFilter self = new ScgSearchRequestScgFilter();
            return TeaModel.build(map, self);
        }

        public ScgSearchRequestScgFilter setOffSetParam(ScgSearchRequestScgFilterOffSetParam offSetParam) {
            this.offSetParam = offSetParam;
            return this;
        }
        public ScgSearchRequestScgFilterOffSetParam getOffSetParam() {
            return this.offSetParam;
        }

        public ScgSearchRequestScgFilter setPageParam(ScgSearchRequestScgFilterPageParam pageParam) {
            this.pageParam = pageParam;
            return this;
        }
        public ScgSearchRequestScgFilterPageParam getPageParam() {
            return this.pageParam;
        }

        public ScgSearchRequestScgFilter setSortParam(ScgSearchRequestScgFilterSortParam sortParam) {
            this.sortParam = sortParam;
            return this;
        }
        public ScgSearchRequestScgFilterSortParam getSortParam() {
            return this.sortParam;
        }

        public ScgSearchRequestScgFilter setUseOffSet(Boolean useOffSet) {
            this.useOffSet = useOffSet;
            return this;
        }
        public Boolean getUseOffSet() {
            return this.useOffSet;
        }

    }

}
