// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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
         * <p>23</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png">https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>11824</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>青椒肉丝</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1850</p>
         */
        @NameInMap("Price")
        public Long price;

        /**
         * <strong>example:</strong>
         * <p>已添加</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>FOOD</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1666161803</p>
         */
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
