// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchRequest extends TeaModel {
    @NameInMap("ScgFilter")
    public ScgSearchRequestScgFilter scgFilter;

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
        @NameInMap("Limit")
        public Integer limit;

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
        @NameInMap("PageNum")
        public Integer pageNum;

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
        @NameInMap("SortKey")
        public String sortKey;

        @NameInMap("SortOrder")
        public String sortOrder;

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
        @NameInMap("OffSetParam")
        public ScgSearchRequestScgFilterOffSetParam offSetParam;

        @NameInMap("PageParam")
        public ScgSearchRequestScgFilterPageParam pageParam;

        @NameInMap("SortParam")
        public ScgSearchRequestScgFilterSortParam sortParam;

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
