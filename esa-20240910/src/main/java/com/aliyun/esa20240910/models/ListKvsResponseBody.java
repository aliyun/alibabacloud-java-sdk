// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListKvsResponseBody extends TeaModel {
    /**
     * <p>The key-value pairs.</p>
     */
    @NameInMap("Keys")
    public java.util.List<ListKvsResponseBodyKeys> keys;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKvsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKvsResponseBody self = new ListKvsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKvsResponseBody setKeys(java.util.List<ListKvsResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<ListKvsResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public ListKvsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKvsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKvsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKvsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKvsResponseBodyKeys extends TeaModel {
        /**
         * <p>The key name.</p>
         * 
         * <strong>example:</strong>
         * <p>Key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the key was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-13T07:46:03Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListKvsResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListKvsResponseBodyKeys self = new ListKvsResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListKvsResponseBodyKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKvsResponseBodyKeys setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
