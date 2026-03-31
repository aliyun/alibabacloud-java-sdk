// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDbsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("sorter")
    public ListMmsDbsRequestSorter sorter;

    /**
     * <strong>example:</strong>
     * <p>STARTED</p>
     */
    @NameInMap("status")
    public String status;

    public static ListMmsDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDbsRequest self = new ListMmsDbsRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsDbsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMmsDbsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsDbsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsDbsRequest setSorter(ListMmsDbsRequestSorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public ListMmsDbsRequestSorter getSorter() {
        return this.sorter;
    }

    public ListMmsDbsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListMmsDbsRequestSorter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("numRows")
        public String numRows;

        /**
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListMmsDbsRequestSorter build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDbsRequestSorter self = new ListMmsDbsRequestSorter();
            return TeaModel.build(map, self);
        }

        public ListMmsDbsRequestSorter setNumRows(String numRows) {
            this.numRows = numRows;
            return this;
        }
        public String getNumRows() {
            return this.numRows;
        }

        public ListMmsDbsRequestSorter setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListMmsDbsRequestSorter setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
