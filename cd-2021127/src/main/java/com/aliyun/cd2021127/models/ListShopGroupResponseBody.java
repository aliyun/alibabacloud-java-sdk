// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopGroupResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListShopGroupResponseBodyData> data;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListShopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShopGroupResponseBody self = new ListShopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShopGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListShopGroupResponseBody setData(java.util.List<ListShopGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListShopGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListShopGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListShopGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListShopGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListShopGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListShopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListShopGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListShopGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListShopGroupResponseBodyData extends TeaModel {
        // 门店组编号（ID）
        @NameInMap("ShopGroupId")
        public String shopGroupId;

        // 门店组名称
        @NameInMap("ShopGroupName")
        public String shopGroupName;

        public static ListShopGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListShopGroupResponseBodyData self = new ListShopGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListShopGroupResponseBodyData setShopGroupId(String shopGroupId) {
            this.shopGroupId = shopGroupId;
            return this;
        }
        public String getShopGroupId() {
            return this.shopGroupId;
        }

        public ListShopGroupResponseBodyData setShopGroupName(String shopGroupName) {
            this.shopGroupName = shopGroupName;
            return this;
        }
        public String getShopGroupName() {
            return this.shopGroupName;
        }

    }

}
