// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListHotelsResponseBodyResult result;

    public static ListHotelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelsResponseBody self = new ListHotelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelsResponseBody setResult(ListHotelsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListHotelsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListHotelsResponseBodyResultHotelInfoList extends TeaModel {
        @NameInMap("AccountNames")
        public java.util.List<String> accountNames;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("HotelAddress")
        public String hotelAddress;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("HotelName")
        public String hotelName;

        @NameInMap("IndustryType")
        public String industryType;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RelatedProductName")
        public String relatedProductName;

        @NameInMap("RoomNum")
        public Integer roomNum;

        @NameInMap("Status")
        public Integer status;

        public static ListHotelsResponseBodyResultHotelInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListHotelsResponseBodyResultHotelInfoList self = new ListHotelsResponseBodyResultHotelInfoList();
            return TeaModel.build(map, self);
        }

        public ListHotelsResponseBodyResultHotelInfoList setAccountNames(java.util.List<String> accountNames) {
            this.accountNames = accountNames;
            return this;
        }
        public java.util.List<String> getAccountNames() {
            return this.accountNames;
        }

        public ListHotelsResponseBodyResultHotelInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListHotelsResponseBodyResultHotelInfoList setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public ListHotelsResponseBodyResultHotelInfoList setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public ListHotelsResponseBodyResultHotelInfoList setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public ListHotelsResponseBodyResultHotelInfoList setIndustryType(String industryType) {
            this.industryType = industryType;
            return this;
        }
        public String getIndustryType() {
            return this.industryType;
        }

        public ListHotelsResponseBodyResultHotelInfoList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListHotelsResponseBodyResultHotelInfoList setRelatedProductName(String relatedProductName) {
            this.relatedProductName = relatedProductName;
            return this;
        }
        public String getRelatedProductName() {
            return this.relatedProductName;
        }

        public ListHotelsResponseBodyResultHotelInfoList setRoomNum(Integer roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Integer getRoomNum() {
            return this.roomNum;
        }

        public ListHotelsResponseBodyResultHotelInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListHotelsResponseBodyResultPage extends TeaModel {
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

        public static ListHotelsResponseBodyResultPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelsResponseBodyResultPage self = new ListHotelsResponseBodyResultPage();
            return TeaModel.build(map, self);
        }

        public ListHotelsResponseBodyResultPage setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListHotelsResponseBodyResultPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelsResponseBodyResultPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotelsResponseBodyResultPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListHotelsResponseBodyResultPage setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ListHotelsResponseBodyResult extends TeaModel {
        @NameInMap("HotelInfoList")
        public java.util.List<ListHotelsResponseBodyResultHotelInfoList> hotelInfoList;

        @NameInMap("Page")
        public ListHotelsResponseBodyResultPage page;

        public static ListHotelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelsResponseBodyResult self = new ListHotelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelsResponseBodyResult setHotelInfoList(java.util.List<ListHotelsResponseBodyResultHotelInfoList> hotelInfoList) {
            this.hotelInfoList = hotelInfoList;
            return this;
        }
        public java.util.List<ListHotelsResponseBodyResultHotelInfoList> getHotelInfoList() {
            return this.hotelInfoList;
        }

        public ListHotelsResponseBodyResult setPage(ListHotelsResponseBodyResultPage page) {
            this.page = page;
            return this;
        }
        public ListHotelsResponseBodyResultPage getPage() {
            return this.page;
        }

    }

}
