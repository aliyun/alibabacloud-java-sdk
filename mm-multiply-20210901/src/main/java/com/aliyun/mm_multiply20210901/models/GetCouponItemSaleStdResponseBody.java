// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetCouponItemSaleStdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    // 优惠券交易累计model
    @NameInMap("Models")
    public java.util.List<GetCouponItemSaleStdResponseBodyModels> models;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("OrderByMethod")
    public String orderByMethod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordsPerPage")
    public Integer recordsPerPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static GetCouponItemSaleStdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCouponItemSaleStdResponseBody self = new GetCouponItemSaleStdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCouponItemSaleStdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCouponItemSaleStdResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetCouponItemSaleStdResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetCouponItemSaleStdResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetCouponItemSaleStdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCouponItemSaleStdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCouponItemSaleStdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCouponItemSaleStdResponseBody setModels(java.util.List<GetCouponItemSaleStdResponseBodyModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<GetCouponItemSaleStdResponseBodyModels> getModels() {
        return this.models;
    }

    public GetCouponItemSaleStdResponseBody setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public GetCouponItemSaleStdResponseBody setOrderByMethod(String orderByMethod) {
        this.orderByMethod = orderByMethod;
        return this;
    }
    public String getOrderByMethod() {
        return this.orderByMethod;
    }

    public GetCouponItemSaleStdResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetCouponItemSaleStdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCouponItemSaleStdResponseBody setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
        return this;
    }
    public Integer getRecordsPerPage() {
        return this.recordsPerPage;
    }

    public GetCouponItemSaleStdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCouponItemSaleStdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCouponItemSaleStdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetCouponItemSaleStdResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public GetCouponItemSaleStdResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class GetCouponItemSaleStdResponseBodyModels extends TeaModel {
        // 卡券模板ID
        @NameInMap("CouponTemplateCd")
        public String couponTemplateCd;

        // 付款人数
        @NameInMap("CusCntStd")
        public Long cusCntStd;

        // 付款件数
        @NameInMap("ItemCntStd")
        public Long itemCntStd;

        // 商品名称
        @NameInMap("MmItemName")
        public String mmItemName;

        public static GetCouponItemSaleStdResponseBodyModels build(java.util.Map<String, ?> map) throws Exception {
            GetCouponItemSaleStdResponseBodyModels self = new GetCouponItemSaleStdResponseBodyModels();
            return TeaModel.build(map, self);
        }

        public GetCouponItemSaleStdResponseBodyModels setCouponTemplateCd(String couponTemplateCd) {
            this.couponTemplateCd = couponTemplateCd;
            return this;
        }
        public String getCouponTemplateCd() {
            return this.couponTemplateCd;
        }

        public GetCouponItemSaleStdResponseBodyModels setCusCntStd(Long cusCntStd) {
            this.cusCntStd = cusCntStd;
            return this;
        }
        public Long getCusCntStd() {
            return this.cusCntStd;
        }

        public GetCouponItemSaleStdResponseBodyModels setItemCntStd(Long itemCntStd) {
            this.itemCntStd = itemCntStd;
            return this;
        }
        public Long getItemCntStd() {
            return this.itemCntStd;
        }

        public GetCouponItemSaleStdResponseBodyModels setMmItemName(String mmItemName) {
            this.mmItemName = mmItemName;
            return this;
        }
        public String getMmItemName() {
            return this.mmItemName;
        }

    }

}
