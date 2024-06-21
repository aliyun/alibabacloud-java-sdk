// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResourceResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListGatewayAuthConsumerResourceResponseBodyData data;

    /**
     * <p>The dynamic part in the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p> If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A73AC37C-C617-4E3A-8049-372CF49C****</p>
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
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayAuthConsumerResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthConsumerResourceResponseBody self = new ListGatewayAuthConsumerResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthConsumerResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayAuthConsumerResourceResponseBody setData(ListGatewayAuthConsumerResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayAuthConsumerResourceResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayAuthConsumerResourceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListGatewayAuthConsumerResourceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListGatewayAuthConsumerResourceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGatewayAuthConsumerResourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayAuthConsumerResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayAuthConsumerResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayAuthConsumerResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayAuthConsumerResourceResponseBodyDataResult extends TeaModel {
        /**
         * <p>The ID of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConsumerId")
        public Long consumerId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14centbrveca****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the authorized resource for the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The resource authorization status. Valid values:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResourceStatus")
        public Boolean resourceStatus;

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>3091</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        public static ListGatewayAuthConsumerResourceResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthConsumerResourceResponseBodyDataResult self = new ListGatewayAuthConsumerResourceResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setConsumerId(Long consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public Long getConsumerId() {
            return this.consumerId;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setResourceStatus(Boolean resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public Boolean getResourceStatus() {
            return this.resourceStatus;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListGatewayAuthConsumerResourceResponseBodyDataResult setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

    public static class ListGatewayAuthConsumerResourceResponseBodyData extends TeaModel {
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
         * <p>The data structure.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayAuthConsumerResourceResponseBodyDataResult> result;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayAuthConsumerResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthConsumerResourceResponseBodyData self = new ListGatewayAuthConsumerResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthConsumerResourceResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayAuthConsumerResourceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayAuthConsumerResourceResponseBodyData setResult(java.util.List<ListGatewayAuthConsumerResourceResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayAuthConsumerResourceResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayAuthConsumerResourceResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
