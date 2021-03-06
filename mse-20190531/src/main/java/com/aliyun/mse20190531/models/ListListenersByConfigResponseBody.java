// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Listeners")
    public java.util.List<ListListenersByConfigResponseBodyListeners> listeners;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListListenersByConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigResponseBody self = new ListListenersByConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListListenersByConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListListenersByConfigResponseBody setListeners(java.util.List<ListListenersByConfigResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersByConfigResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersByConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersByConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListListenersByConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListenersByConfigResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListenersByConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListListenersByConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListListenersByConfigResponseBodyListeners extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Md5")
        public String md5;

        public static ListListenersByConfigResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersByConfigResponseBodyListeners self = new ListListenersByConfigResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersByConfigResponseBodyListeners setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListListenersByConfigResponseBodyListeners setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

    }

}
