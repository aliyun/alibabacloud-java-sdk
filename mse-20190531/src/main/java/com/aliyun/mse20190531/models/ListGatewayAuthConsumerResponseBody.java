// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public ListGatewayAuthConsumerResponseBodyData data;

    /**
     * <p>The dynamic part in the error message.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>>  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

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

    public static ListGatewayAuthConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthConsumerResponseBody self = new ListGatewayAuthConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthConsumerResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayAuthConsumerResponseBody setData(ListGatewayAuthConsumerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayAuthConsumerResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayAuthConsumerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListGatewayAuthConsumerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListGatewayAuthConsumerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGatewayAuthConsumerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayAuthConsumerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayAuthConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayAuthConsumerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayAuthConsumerResponseBodyDataResult extends TeaModel {
        /**
         * <p>The status of the consumer. Valid values:</p>
         * <br>
         * <p>*   true: enabled</p>
         * <p>*   false: disabled</p>
         */
        @NameInMap("ConsumerStatus")
        public Boolean consumerStatus;

        /**
         * <p>The description of the consumer.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the consumer.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the consumer.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The creator.</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The authentication type. Valid values:</p>
         * <br>
         * <p>*   JWT</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayAuthConsumerResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthConsumerResponseBodyDataResult self = new ListGatewayAuthConsumerResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setConsumerStatus(Boolean consumerStatus) {
            this.consumerStatus = consumerStatus;
            return this;
        }
        public Boolean getConsumerStatus() {
            return this.consumerStatus;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListGatewayAuthConsumerResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayAuthConsumerResponseBodyData extends TeaModel {
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
         * <p>The returned information.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayAuthConsumerResponseBodyDataResult> result;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayAuthConsumerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthConsumerResponseBodyData self = new ListGatewayAuthConsumerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthConsumerResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayAuthConsumerResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayAuthConsumerResponseBodyData setResult(java.util.List<ListGatewayAuthConsumerResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayAuthConsumerResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayAuthConsumerResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
