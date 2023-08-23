// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListHotelSceneItemsResponseBodyResult result;

    public static ListHotelSceneItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemsResponseBody self = new ListHotelSceneItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelSceneItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelSceneItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelSceneItemsResponseBody setResult(ListHotelSceneItemsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListHotelSceneItemsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListHotelSceneItemsResponseBodyResultPage extends TeaModel {
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

        public static ListHotelSceneItemsResponseBodyResultPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemsResponseBodyResultPage self = new ListHotelSceneItemsResponseBodyResultPage();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemsResponseBodyResultPage setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListHotelSceneItemsResponseBodyResultPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelSceneItemsResponseBodyResultPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotelSceneItemsResponseBodyResultPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListHotelSceneItemsResponseBodyResultPage setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ListHotelSceneItemsResponseBodyResultSceneItemList extends TeaModel {
        @NameInMap("BeyondLimitReply")
        public String beyondLimitReply;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeliveryMethod")
        public String deliveryMethod;

        @NameInMap("Icon")
        public String icon;

        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LimitNumber")
        public Integer limitNumber;

        @NameInMap("LimitSwitch")
        public Integer limitSwitch;

        @NameInMap("Name")
        public String name;

        @NameInMap("PaymentMethod")
        public String paymentMethod;

        @NameInMap("Price")
        public Long price;

        @NameInMap("RobotName")
        public String robotName;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListHotelSceneItemsResponseBodyResultSceneItemList build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemsResponseBodyResultSceneItemList self = new ListHotelSceneItemsResponseBodyResultSceneItemList();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setBeyondLimitReply(String beyondLimitReply) {
            this.beyondLimitReply = beyondLimitReply;
            return this;
        }
        public String getBeyondLimitReply() {
            return this.beyondLimitReply;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
            return this;
        }
        public String getDeliveryMethod() {
            return this.deliveryMethod;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setLimitNumber(Integer limitNumber) {
            this.limitNumber = limitNumber;
            return this;
        }
        public Integer getLimitNumber() {
            return this.limitNumber;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setLimitSwitch(Integer limitSwitch) {
            this.limitSwitch = limitSwitch;
            return this;
        }
        public Integer getLimitSwitch() {
            return this.limitSwitch;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHotelSceneItemsResponseBodyResultSceneItemList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListHotelSceneItemsResponseBodyResult extends TeaModel {
        @NameInMap("Page")
        public ListHotelSceneItemsResponseBodyResultPage page;

        @NameInMap("SceneItemList")
        public java.util.List<ListHotelSceneItemsResponseBodyResultSceneItemList> sceneItemList;

        public static ListHotelSceneItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemsResponseBodyResult self = new ListHotelSceneItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemsResponseBodyResult setPage(ListHotelSceneItemsResponseBodyResultPage page) {
            this.page = page;
            return this;
        }
        public ListHotelSceneItemsResponseBodyResultPage getPage() {
            return this.page;
        }

        public ListHotelSceneItemsResponseBodyResult setSceneItemList(java.util.List<ListHotelSceneItemsResponseBodyResultSceneItemList> sceneItemList) {
            this.sceneItemList = sceneItemList;
            return this;
        }
        public java.util.List<ListHotelSceneItemsResponseBodyResultSceneItemList> getSceneItemList() {
            return this.sceneItemList;
        }

    }

}
