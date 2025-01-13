// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListHotelSceneItemResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>CEADB586-51CB-1B6B-95BD-AB85A7A08E97</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>客用品类</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/jiudianmianban_fuwushangpintu/wupin/keyongpinlei/mianqian.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/jiudianmianban_fuwushangpintu/wupin/keyongpinlei/mianqian.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>152860</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>棉签</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Price")
        public Long price;

        @NameInMap("ResidueLimit")
        public Long residueLimit;

        /**
         * <strong>example:</strong>
         * <p>已添加</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>GOODS</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>客用品类</p>
         */
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
