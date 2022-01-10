// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class QueryPodFromCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("value")
    public QueryPodFromCMDBResponseBodyValue value;

    public static QueryPodFromCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPodFromCMDBResponseBody self = new QueryPodFromCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPodFromCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public QueryPodFromCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPodFromCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPodFromCMDBResponseBody setValue(QueryPodFromCMDBResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public QueryPodFromCMDBResponseBodyValue getValue() {
        return this.value;
    }

    public static class QueryPodFromCMDBResponseBodyValueItemList extends TeaModel {
        @NameInMap("item")
        public java.util.List<java.util.Map<String, ?>> item;

        public static QueryPodFromCMDBResponseBodyValueItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryPodFromCMDBResponseBodyValueItemList self = new QueryPodFromCMDBResponseBodyValueItemList();
            return TeaModel.build(map, self);
        }

        public QueryPodFromCMDBResponseBodyValueItemList setItem(java.util.List<java.util.Map<String, ?>> item) {
            this.item = item;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItem() {
            return this.item;
        }

    }

    public static class QueryPodFromCMDBResponseBodyValue extends TeaModel {
        @NameInMap("hasMore")
        public Boolean hasMore;

        @NameInMap("itemList")
        public QueryPodFromCMDBResponseBodyValueItemList itemList;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static QueryPodFromCMDBResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            QueryPodFromCMDBResponseBodyValue self = new QueryPodFromCMDBResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public QueryPodFromCMDBResponseBodyValue setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public QueryPodFromCMDBResponseBodyValue setItemList(QueryPodFromCMDBResponseBodyValueItemList itemList) {
            this.itemList = itemList;
            return this;
        }
        public QueryPodFromCMDBResponseBodyValueItemList getItemList() {
            return this.itemList;
        }

        public QueryPodFromCMDBResponseBodyValue setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
