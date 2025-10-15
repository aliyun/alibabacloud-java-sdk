// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("ApplicationsForNetworkAccessEndpoint")
    public java.util.List<ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint> applicationsForNetworkAccessEndpoint;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsForNetworkAccessEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForNetworkAccessEndpointResponseBody self = new ListApplicationsForNetworkAccessEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForNetworkAccessEndpointResponseBody setApplicationsForNetworkAccessEndpoint(java.util.List<ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint> applicationsForNetworkAccessEndpoint) {
        this.applicationsForNetworkAccessEndpoint = applicationsForNetworkAccessEndpoint;
        return this;
    }
    public java.util.List<ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint> getApplicationsForNetworkAccessEndpoint() {
        return this.applicationsForNetworkAccessEndpoint;
    }

    public ListApplicationsForNetworkAccessEndpointResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsForNetworkAccessEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForNetworkAccessEndpointResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint extends TeaModel {
        /**
         * <p>应用ID。</p>
         * 
         * <strong>example:</strong>
         * <p>app_m5nzr3kk4njkco2nnc4wjxxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>应用名称。</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>IDaaS EIAM 实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_6ed5syotlwdrgmbzn7qn5xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint self = new ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListApplicationsForNetworkAccessEndpointResponseBodyApplicationsForNetworkAccessEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
