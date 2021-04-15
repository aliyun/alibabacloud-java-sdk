// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    @NameInMap("HistoryItems")
    public java.util.List<ListNacosHistoryConfigsResponseBodyHistoryItems> historyItems;

    public static ListNacosHistoryConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNacosHistoryConfigsResponseBody self = new ListNacosHistoryConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNacosHistoryConfigsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListNacosHistoryConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNacosHistoryConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNacosHistoryConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNacosHistoryConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNacosHistoryConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNacosHistoryConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNacosHistoryConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNacosHistoryConfigsResponseBody setHistoryItems(java.util.List<ListNacosHistoryConfigsResponseBodyHistoryItems> historyItems) {
        this.historyItems = historyItems;
        return this;
    }
    public java.util.List<ListNacosHistoryConfigsResponseBodyHistoryItems> getHistoryItems() {
        return this.historyItems;
    }

    public static class ListNacosHistoryConfigsResponseBodyHistoryItems extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Group")
        public String group;

        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OpType")
        public String opType;

        public static ListNacosHistoryConfigsResponseBodyHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            ListNacosHistoryConfigsResponseBodyHistoryItems self = new ListNacosHistoryConfigsResponseBodyHistoryItems();
            return TeaModel.build(map, self);
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

    }

}
