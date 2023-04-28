// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaServicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListEurekaServicesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

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
        @NameInMap("InstancesId")
        public java.util.List<String> instancesId;

        @NameInMap("Name")
        public String name;

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
