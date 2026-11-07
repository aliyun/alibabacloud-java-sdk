// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaServicesResponseBody extends TeaModel {
    /**
     * <p>The data overview.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEurekaServicesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request succeeded.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
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
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("InstancesId")
        public java.util.List<String> instancesId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTACTINFO</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of service providers, in the format of healthy instances/total instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1/1</p>
         */
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
