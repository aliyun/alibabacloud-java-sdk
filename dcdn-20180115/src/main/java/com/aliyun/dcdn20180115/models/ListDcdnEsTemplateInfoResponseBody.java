// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnEsTemplateInfoResponseBody extends TeaModel {
    @NameInMap("DataItems")
    public ListDcdnEsTemplateInfoResponseBodyDataItems dataItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDcdnEsTemplateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnEsTemplateInfoResponseBody self = new ListDcdnEsTemplateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDcdnEsTemplateInfoResponseBody setDataItems(ListDcdnEsTemplateInfoResponseBodyDataItems dataItems) {
        this.dataItems = dataItems;
        return this;
    }
    public ListDcdnEsTemplateInfoResponseBodyDataItems getDataItems() {
        return this.dataItems;
    }

    public ListDcdnEsTemplateInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDcdnEsTemplateInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDcdnEsTemplateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDcdnEsTemplateInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("TmplDef")
        public String tmplDef;

        @NameInMap("TmplDesc")
        public String tmplDesc;

        @NameInMap("TmplName")
        public String tmplName;

        public static ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem build(java.util.Map<String, ?> map) throws Exception {
            ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem self = new ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem();
            return TeaModel.build(map, self);
        }

        public ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem setTmplDef(String tmplDef) {
            this.tmplDef = tmplDef;
            return this;
        }
        public String getTmplDef() {
            return this.tmplDef;
        }

        public ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem setTmplDesc(String tmplDesc) {
            this.tmplDesc = tmplDesc;
            return this;
        }
        public String getTmplDesc() {
            return this.tmplDesc;
        }

        public ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem setTmplName(String tmplName) {
            this.tmplName = tmplName;
            return this;
        }
        public String getTmplName() {
            return this.tmplName;
        }

    }

    public static class ListDcdnEsTemplateInfoResponseBodyDataItems extends TeaModel {
        @NameInMap("DataItem")
        public java.util.List<ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem> dataItem;

        public static ListDcdnEsTemplateInfoResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDcdnEsTemplateInfoResponseBodyDataItems self = new ListDcdnEsTemplateInfoResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDcdnEsTemplateInfoResponseBodyDataItems setDataItem(java.util.List<ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem> dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public java.util.List<ListDcdnEsTemplateInfoResponseBodyDataItemsDataItem> getDataItem() {
            return this.dataItem;
        }

    }

}
