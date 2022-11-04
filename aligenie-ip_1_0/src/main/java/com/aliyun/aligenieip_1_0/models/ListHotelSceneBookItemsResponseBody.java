// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListHotelSceneBookItemsResponseBodyResult result;

    public static ListHotelSceneBookItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneBookItemsResponseBody self = new ListHotelSceneBookItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneBookItemsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelSceneBookItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelSceneBookItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelSceneBookItemsResponseBody setResult(ListHotelSceneBookItemsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListHotelSceneBookItemsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListHotelSceneBookItemsResponseBodyResultPage extends TeaModel {
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

        public static ListHotelSceneBookItemsResponseBodyResultPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneBookItemsResponseBodyResultPage self = new ListHotelSceneBookItemsResponseBodyResultPage();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneBookItemsResponseBodyResultPage setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListHotelSceneBookItemsResponseBodyResultPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelSceneBookItemsResponseBodyResultPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotelSceneBookItemsResponseBodyResultPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListHotelSceneBookItemsResponseBodyResultPage setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ListHotelSceneBookItemsResponseBodyResultSceneItemList extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public Long price;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListHotelSceneBookItemsResponseBodyResultSceneItemList build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneBookItemsResponseBodyResultSceneItemList self = new ListHotelSceneBookItemsResponseBodyResultSceneItemList();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHotelSceneBookItemsResponseBodyResultSceneItemList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListHotelSceneBookItemsResponseBodyResult extends TeaModel {
        @NameInMap("Page")
        public ListHotelSceneBookItemsResponseBodyResultPage page;

        @NameInMap("SceneItemList")
        public java.util.List<ListHotelSceneBookItemsResponseBodyResultSceneItemList> sceneItemList;

        public static ListHotelSceneBookItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneBookItemsResponseBodyResult self = new ListHotelSceneBookItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneBookItemsResponseBodyResult setPage(ListHotelSceneBookItemsResponseBodyResultPage page) {
            this.page = page;
            return this;
        }
        public ListHotelSceneBookItemsResponseBodyResultPage getPage() {
            return this.page;
        }

        public ListHotelSceneBookItemsResponseBodyResult setSceneItemList(java.util.List<ListHotelSceneBookItemsResponseBodyResultSceneItemList> sceneItemList) {
            this.sceneItemList = sceneItemList;
            return this;
        }
        public java.util.List<ListHotelSceneBookItemsResponseBodyResultSceneItemList> getSceneItemList() {
            return this.sceneItemList;
        }

    }

}
