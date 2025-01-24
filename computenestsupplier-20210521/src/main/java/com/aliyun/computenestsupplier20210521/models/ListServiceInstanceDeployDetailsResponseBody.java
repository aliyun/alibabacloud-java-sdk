// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceDeployDetailsResponseBody extends TeaModel {
    /**
     * <p>The details of the service instance deployment.</p>
     */
    @NameInMap("DeployDetails")
    public java.util.List<ListServiceInstanceDeployDetailsResponseBodyDeployDetails> deployDetails;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0036D82E-0624-5B37-B797-C460F4B02026</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceInstanceDeployDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceDeployDetailsResponseBody self = new ListServiceInstanceDeployDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceDeployDetailsResponseBody setDeployDetails(java.util.List<ListServiceInstanceDeployDetailsResponseBodyDeployDetails> deployDetails) {
        this.deployDetails = deployDetails;
        return this;
    }
    public java.util.List<ListServiceInstanceDeployDetailsResponseBodyDeployDetails> getDeployDetails() {
        return this.deployDetails;
    }

    public ListServiceInstanceDeployDetailsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceDeployDetailsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceDeployDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceDeployDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceInstanceDeployDetailsResponseBodyDeployDetails extends TeaModel {
        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The time when the service instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-10T01:58:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The period over which data is aggregated.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("Cycle")
        public String cycle;

        /**
         * <p>The indicates whether the deployment was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("DeploySucceeded")
        public String deploySucceeded;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>StackValidationFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>{code: StackValidationFailed, message: \&quot;Failed to continue create ROS stack 89e724e2-84e6-4517-a372-30a545ab4145: Resource [LinuxInstanceRunCommand]: i-wz91nfbh1fxtmfb0try4 are not running. Command invocation only support running instances. ErrorCode: StackValidationFailed\&quot;, requestId: null}</p>
         */
        @NameInMap("ErrorDetail")
        public String errorDetail;

        /**
         * <p>The type of error that caused the deployment to fail.</p>
         * 
         * <strong>example:</strong>
         * <p>ValidationError</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-c751ed91f2074af39779</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-273e8cee11d349e1803c</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The name of the service in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>测试服务(Test Service)</p>
         */
        @NameInMap("ServiceNameChn")
        public String serviceNameChn;

        /**
         * <p>The name of the service in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Service</p>
         */
        @NameInMap("ServiceNameEng")
        public String serviceNameEng;

        /**
         * <p>The type of service. </p>
         * <p>Possible values:</p>
         * <ul>
         * <li>private: Deployed under the user\&quot;s account.</li>
         * <li>managed: Hosted under the service provider\&quot;s account.</li>
         * <li>operation: Managed operation service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("ServiceVersion")
        public String serviceVersion;

        /**
         * <p>The timestamp when the response is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1723946641994</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The aliuid of user.</p>
         * 
         * <strong>example:</strong>
         * <p>1591457835436382</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListServiceInstanceDeployDetailsResponseBodyDeployDetails build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceDeployDetailsResponseBodyDeployDetails self = new ListServiceInstanceDeployDetailsResponseBodyDeployDetails();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setDeploySucceeded(String deploySucceeded) {
            this.deploySucceeded = deploySucceeded;
            return this;
        }
        public String getDeploySucceeded() {
            return this.deploySucceeded;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setServiceNameChn(String serviceNameChn) {
            this.serviceNameChn = serviceNameChn;
            return this;
        }
        public String getServiceNameChn() {
            return this.serviceNameChn;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setServiceNameEng(String serviceNameEng) {
            this.serviceNameEng = serviceNameEng;
            return this;
        }
        public String getServiceNameEng() {
            return this.serviceNameEng;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListServiceInstanceDeployDetailsResponseBodyDeployDetails setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
