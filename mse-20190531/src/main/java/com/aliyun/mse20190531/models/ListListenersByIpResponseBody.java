// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByIpResponseBody extends TeaModel {
    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

    // The information about listeners.
    @NameInMap("Listeners")
    public java.util.List<ListListenersByIpResponseBodyListeners> listeners;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The total number of instances.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersByIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByIpResponseBody self = new ListListenersByIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersByIpResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListListenersByIpResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListListenersByIpResponseBody setListeners(java.util.List<ListListenersByIpResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersByIpResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersByIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListListenersByIpResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListenersByIpResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListenersByIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersByIpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListListenersByIpResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersByIpResponseBodyListeners extends TeaModel {
        // The ID of the data.
        @NameInMap("DataId")
        public String dataId;

        // The group.
        @NameInMap("Group")
        public String group;

        // The verification string.
        @NameInMap("Md5")
        public String md5;

        public static ListListenersByIpResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersByIpResponseBodyListeners self = new ListListenersByIpResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersByIpResponseBodyListeners setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListListenersByIpResponseBodyListeners setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListListenersByIpResponseBodyListeners setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

    }

}
