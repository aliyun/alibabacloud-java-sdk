// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功响应
    @NameInMap("Success")
    public Boolean success;

    // 是否分页
    @NameInMap("Paging")
    public Boolean paging;

    // 标签键集合
    @NameInMap("Data")
    public java.util.List<ListTagKeysResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTagKeysResponseBody setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public ListTagKeysResponseBody setData(java.util.List<ListTagKeysResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTagKeysResponseBodyData> getData() {
        return this.data;
    }

    public ListTagKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagKeysResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTagKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ListTagKeysResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("NextToken")
        public String nextToken;

        // 标签键集合
        @NameInMap("Items")
        public java.util.List<String> items;

        public static ListTagKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyData self = new ListTagKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListTagKeysResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTagKeysResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListTagKeysResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTagKeysResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
