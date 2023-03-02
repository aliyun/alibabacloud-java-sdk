// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListProduceAuthorizationResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<ListProduceAuthorizationResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListProduceAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProduceAuthorizationResponseBody self = new ListProduceAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProduceAuthorizationResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListProduceAuthorizationResponseBody setData(java.util.List<ListProduceAuthorizationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProduceAuthorizationResponseBodyData> getData() {
        return this.data;
    }

    public ListProduceAuthorizationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProduceAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProduceAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProduceAuthorizationResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListProduceAuthorizationResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListProduceAuthorizationResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedUserId")
        public String authorizedUserId;

        @NameInMap("AuthorizedUserName")
        public String authorizedUserName;

        public static ListProduceAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProduceAuthorizationResponseBodyData self = new ListProduceAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProduceAuthorizationResponseBodyData setAuthorizedUserId(String authorizedUserId) {
            this.authorizedUserId = authorizedUserId;
            return this;
        }
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        public ListProduceAuthorizationResponseBodyData setAuthorizedUserName(String authorizedUserName) {
            this.authorizedUserName = authorizedUserName;
            return this;
        }
        public String getAuthorizedUserName() {
            return this.authorizedUserName;
        }

    }

}
