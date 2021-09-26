// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowNodeSqlResultResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HeaderList")
    public ListFlowNodeSqlResultResponseBodyHeaderList headerList;

    @NameInMap("RowList")
    public ListFlowNodeSqlResultResponseBodyRowList rowList;

    public static ListFlowNodeSqlResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeSqlResultResponseBody self = new ListFlowNodeSqlResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeSqlResultResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public ListFlowNodeSqlResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowNodeSqlResultResponseBody setHeaderList(ListFlowNodeSqlResultResponseBodyHeaderList headerList) {
        this.headerList = headerList;
        return this;
    }
    public ListFlowNodeSqlResultResponseBodyHeaderList getHeaderList() {
        return this.headerList;
    }

    public ListFlowNodeSqlResultResponseBody setRowList(ListFlowNodeSqlResultResponseBodyRowList rowList) {
        this.rowList = rowList;
        return this;
    }
    public ListFlowNodeSqlResultResponseBodyRowList getRowList() {
        return this.rowList;
    }

    public static class ListFlowNodeSqlResultResponseBodyHeaderList extends TeaModel {
        @NameInMap("Header")
        public java.util.List<String> header;

        public static ListFlowNodeSqlResultResponseBodyHeaderList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeSqlResultResponseBodyHeaderList self = new ListFlowNodeSqlResultResponseBodyHeaderList();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeSqlResultResponseBodyHeaderList setHeader(java.util.List<String> header) {
            this.header = header;
            return this;
        }
        public java.util.List<String> getHeader() {
            return this.header;
        }

    }

    public static class ListFlowNodeSqlResultResponseBodyRowListRowRowItemList extends TeaModel {
        @NameInMap("RowItem")
        public java.util.List<String> rowItem;

        public static ListFlowNodeSqlResultResponseBodyRowListRowRowItemList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeSqlResultResponseBodyRowListRowRowItemList self = new ListFlowNodeSqlResultResponseBodyRowListRowRowItemList();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeSqlResultResponseBodyRowListRowRowItemList setRowItem(java.util.List<String> rowItem) {
            this.rowItem = rowItem;
            return this;
        }
        public java.util.List<String> getRowItem() {
            return this.rowItem;
        }

    }

    public static class ListFlowNodeSqlResultResponseBodyRowListRow extends TeaModel {
        @NameInMap("RowIndex")
        public Integer rowIndex;

        @NameInMap("RowItemList")
        public ListFlowNodeSqlResultResponseBodyRowListRowRowItemList rowItemList;

        public static ListFlowNodeSqlResultResponseBodyRowListRow build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeSqlResultResponseBodyRowListRow self = new ListFlowNodeSqlResultResponseBodyRowListRow();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeSqlResultResponseBodyRowListRow setRowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
            return this;
        }
        public Integer getRowIndex() {
            return this.rowIndex;
        }

        public ListFlowNodeSqlResultResponseBodyRowListRow setRowItemList(ListFlowNodeSqlResultResponseBodyRowListRowRowItemList rowItemList) {
            this.rowItemList = rowItemList;
            return this;
        }
        public ListFlowNodeSqlResultResponseBodyRowListRowRowItemList getRowItemList() {
            return this.rowItemList;
        }

    }

    public static class ListFlowNodeSqlResultResponseBodyRowList extends TeaModel {
        @NameInMap("Row")
        public java.util.List<ListFlowNodeSqlResultResponseBodyRowListRow> row;

        public static ListFlowNodeSqlResultResponseBodyRowList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeSqlResultResponseBodyRowList self = new ListFlowNodeSqlResultResponseBodyRowList();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeSqlResultResponseBodyRowList setRow(java.util.List<ListFlowNodeSqlResultResponseBodyRowListRow> row) {
            this.row = row;
            return this;
        }
        public java.util.List<ListFlowNodeSqlResultResponseBodyRowListRow> getRow() {
            return this.row;
        }

    }

}
