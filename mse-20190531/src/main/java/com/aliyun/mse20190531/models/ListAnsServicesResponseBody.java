// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAnsServicesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Queries Nacos services.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>> The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAnsServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServicesResponseBody self = new ListAnsServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnsServicesResponseBody setData(java.util.List<ListAnsServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAnsServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListAnsServicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAnsServicesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAnsServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnsServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAnsServicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnsServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnsServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAnsServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAnsServicesResponseBodyData extends TeaModel {
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HealthyInstanceCount")
        public Integer healthyInstanceCount;

        @NameInMap("IpCount")
        public Integer ipCount;

        @NameInMap("Name")
        public String name;

        public static ListAnsServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnsServicesResponseBodyData self = new ListAnsServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnsServicesResponseBodyData setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public ListAnsServicesResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAnsServicesResponseBodyData setHealthyInstanceCount(Integer healthyInstanceCount) {
            this.healthyInstanceCount = healthyInstanceCount;
            return this;
        }
        public Integer getHealthyInstanceCount() {
            return this.healthyInstanceCount;
        }

        public ListAnsServicesResponseBodyData setIpCount(Integer ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Integer getIpCount() {
            return this.ipCount;
        }

        public ListAnsServicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
