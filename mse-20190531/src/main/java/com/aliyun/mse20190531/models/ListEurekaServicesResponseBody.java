// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaServicesResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public java.util.List<ListEurekaServicesResponseBodyData> data;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

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

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEurekaServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEurekaServicesResponseBody self = new ListEurekaServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEurekaServicesResponseBody setData(java.util.List<ListEurekaServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEurekaServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListEurekaServicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEurekaServicesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListEurekaServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEurekaServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEurekaServicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEurekaServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEurekaServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEurekaServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEurekaServicesResponseBodyData extends TeaModel {
        // The information about instances.
        @NameInMap("InstancesId")
        public java.util.List<String> instancesId;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The number of service providers. The value is in the following format: Number of healthy instances/Total number of instances.
        @NameInMap("UpStatus")
        public String upStatus;

        public static ListEurekaServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEurekaServicesResponseBodyData self = new ListEurekaServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEurekaServicesResponseBodyData setInstancesId(java.util.List<String> instancesId) {
            this.instancesId = instancesId;
            return this;
        }
        public java.util.List<String> getInstancesId() {
            return this.instancesId;
        }

        public ListEurekaServicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEurekaServicesResponseBodyData setUpStatus(String upStatus) {
            this.upStatus = upStatus;
            return this;
        }
        public String getUpStatus() {
            return this.upStatus;
        }

    }

}
