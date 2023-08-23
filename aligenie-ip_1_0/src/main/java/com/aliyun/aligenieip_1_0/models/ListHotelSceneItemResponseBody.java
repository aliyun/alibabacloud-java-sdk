// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListHotelSceneItemResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListHotelSceneItemResponseBodyResult result;

    public static ListHotelSceneItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemResponseBody self = new ListHotelSceneItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelSceneItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelSceneItemResponseBody setPage(ListHotelSceneItemResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListHotelSceneItemResponseBodyPage getPage() {
        return this.page;
    }

    public ListHotelSceneItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelSceneItemResponseBody setResult(ListHotelSceneItemResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListHotelSceneItemResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListHotelSceneItemResponseBodyPage extends TeaModel {
        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListHotelSceneItemResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemResponseBodyPage self = new ListHotelSceneItemResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemResponseBodyPage setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListHotelSceneItemResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelSceneItemResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotelSceneItemResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListHotelSceneItemResponseBodyPage setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ListHotelSceneItemResponseBodyResultSecondCategoryListItemList extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public Long price;

        @NameInMap("ResidueLimit")
        public Long residueLimit;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListHotelSceneItemResponseBodyResultSecondCategoryListItemList build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemResponseBodyResultSecondCategoryListItemList self = new ListHotelSceneItemResponseBodyResultSecondCategoryListItemList();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setResidueLimit(Long residueLimit) {
            this.residueLimit = residueLimit;
            return this;
        }
        public Long getResidueLimit() {
            return this.residueLimit;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryListItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListHotelSceneItemResponseBodyResultSecondCategoryList extends TeaModel {
        @NameInMap("ItemList")
        public java.util.List<ListHotelSceneItemResponseBodyResultSecondCategoryListItemList> itemList;

        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        public static ListHotelSceneItemResponseBodyResultSecondCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemResponseBodyResultSecondCategoryList self = new ListHotelSceneItemResponseBodyResultSecondCategoryList();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryList setItemList(java.util.List<ListHotelSceneItemResponseBodyResultSecondCategoryListItemList> itemList) {
            this.itemList = itemList;
            return this;
        }
        public java.util.List<ListHotelSceneItemResponseBodyResultSecondCategoryListItemList> getItemList() {
            return this.itemList;
        }

        public ListHotelSceneItemResponseBodyResultSecondCategoryList setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

    }

    public static class ListHotelSceneItemResponseBodyResult extends TeaModel {
        @NameInMap("SecondCategoryList")
        public java.util.List<ListHotelSceneItemResponseBodyResultSecondCategoryList> secondCategoryList;

        public static ListHotelSceneItemResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemResponseBodyResult self = new ListHotelSceneItemResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemResponseBodyResult setSecondCategoryList(java.util.List<ListHotelSceneItemResponseBodyResultSecondCategoryList> secondCategoryList) {
            this.secondCategoryList = secondCategoryList;
            return this;
        }
        public java.util.List<ListHotelSceneItemResponseBodyResultSecondCategoryList> getSecondCategoryList() {
            return this.secondCategoryList;
        }

    }

}
