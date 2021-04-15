// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByIpResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Listeners")
    public java.util.List<ListListenersByIpResponseBodyListeners> listeners;

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

    public static ListListenersByIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByIpResponseBody self = new ListListenersByIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersByIpResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListListenersByIpResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListListenersByIpResponseBody setListeners(java.util.List<ListListenersByIpResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersByIpResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersByIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersByIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListListenersByIpResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListenersByIpResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListenersByIpResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListListenersByIpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListListenersByIpResponseBodyListeners extends TeaModel {
        @NameInMap("Md5")
        public String md5;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Group")
        public String group;

        public static ListListenersByIpResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersByIpResponseBodyListeners self = new ListListenersByIpResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersByIpResponseBodyListeners setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
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

    }

}
