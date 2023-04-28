// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Listeners")
    public java.util.List<ListListenersByConfigResponseBodyListeners> listeners;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersByConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigResponseBody self = new ListListenersByConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListListenersByConfigResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListListenersByConfigResponseBody setListeners(java.util.List<ListListenersByConfigResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersByConfigResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersByConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListListenersByConfigResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListenersByConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListenersByConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersByConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListListenersByConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersByConfigResponseBodyListeners extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Status")
        public String status;

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

        public ListListenersByConfigResponseBodyListeners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
