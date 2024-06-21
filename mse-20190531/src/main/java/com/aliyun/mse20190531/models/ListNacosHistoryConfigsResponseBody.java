// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>53338ECA-F880-54D8-A9B3-5606355A1B89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
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
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>test.yaml</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>23fdsf</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The timestamp when the configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>16434400</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The format of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>yaml</p>
         */
        @NameInMap("OpType")
        public String opType;

        @NameInMap("SrcUser")
        public String srcUser;

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

        public ListNacosHistoryConfigsResponseBodyHistoryItems setSrcUser(String srcUser) {
            this.srcUser = srcUser;
            return this;
        }
        public String getSrcUser() {
            return this.srcUser;
        }

    }

}
