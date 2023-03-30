// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The configuration items.</p>
     */
    @NameInMap("HistoryItems")
    public java.util.List<ListNacosHistoryConfigsResponseBodyHistoryItems> historyItems;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNacosHistoryConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNacosHistoryConfigsResponseBody self = new ListNacosHistoryConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNacosHistoryConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNacosHistoryConfigsResponseBody setHistoryItems(java.util.List<ListNacosHistoryConfigsResponseBodyHistoryItems> historyItems) {
        this.historyItems = historyItems;
        return this;
    }
    public java.util.List<ListNacosHistoryConfigsResponseBodyHistoryItems> getHistoryItems() {
        return this.historyItems;
    }

    public ListNacosHistoryConfigsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListNacosHistoryConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNacosHistoryConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNacosHistoryConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNacosHistoryConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNacosHistoryConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNacosHistoryConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNacosHistoryConfigsResponseBodyHistoryItems extends TeaModel {
        /**
         * <p>The application tag.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the data.</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The ID of the configuration.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The timestamp when the configuration was last modified.</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The format of the configuration file.</p>
         */
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

        public ListNacosHistoryConfigsResponseBodyHistoryItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListNacosHistoryConfigsResponseBodyHistoryItems setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
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
