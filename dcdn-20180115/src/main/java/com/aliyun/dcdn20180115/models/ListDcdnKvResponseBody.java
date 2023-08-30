// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnKvResponseBody extends TeaModel {
    /**
     * <p>The keys obtained in this traversal.</p>
     */
    @NameInMap("Keys")
    public java.util.List<ListDcdnKvResponseBodyKeys> keys;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDcdnKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnKvResponseBody self = new ListDcdnKvResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDcdnKvResponseBody setKeys(java.util.List<ListDcdnKvResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<ListDcdnKvResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public ListDcdnKvResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDcdnKvResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDcdnKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDcdnKvResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDcdnKvResponseBodyKeys extends TeaModel {
        /**
         * <p>The value of the key obtained in this traversal.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the key was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListDcdnKvResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListDcdnKvResponseBodyKeys self = new ListDcdnKvResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListDcdnKvResponseBodyKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDcdnKvResponseBodyKeys setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
