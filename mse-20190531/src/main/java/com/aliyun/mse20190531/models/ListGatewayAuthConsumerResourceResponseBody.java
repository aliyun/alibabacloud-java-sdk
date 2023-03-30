// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListGatewayAuthConsumerResourceResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ConsumerId")
        public Long consumerId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ResourceStatus")
        public Boolean resourceStatus;

        @NameInMap("RouteId")
        public Long routeId;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListGatewayAuthConsumerResourceResponseBodyDataResult> result;

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
