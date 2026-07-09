// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of Prometheus instances.</p>
     */
    @NameInMap("prometheusInstances")
    public java.util.List<ListPrometheusInstancesResponseBodyPrometheusInstances> prometheusInstances;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListPrometheusInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesResponseBody self = new ListPrometheusInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusInstancesResponseBody setPrometheusInstances(java.util.List<ListPrometheusInstancesResponseBodyPrometheusInstances> prometheusInstances) {
        this.prometheusInstances = prometheusInstances;
        return this;
    }
    public java.util.List<ListPrometheusInstancesResponseBodyPrometheusInstances> getPrometheusInstances() {
        return this.prometheusInstances;
    }

    public ListPrometheusInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrometheusInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPrometheusInstancesResponseBodyPrometheusInstances extends TeaModel {
        /**
         * <p>The access type. Valid values:</p>
         * <ul>
         * <li>readWrite</li>
         * <li>readOnly</li>
         * <li>httpReadOnly</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readWrite</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The instance creation time in UTC+0, in the format of yyyy-MM-ddTHH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10T02:07:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>remote-write</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>POSTPAY: pay-as-you-go by metric volume.</li>
         * <li>POSTPAY_GB: pay-as-you-go by write volume.</li>
         * <li>PREPAY: subscription.</li>
         * <li>FREE: free.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY_GB</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The product to which the Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>arms</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-63549e054ff596a4149927961dff</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-prom-name</p>
         */
        @NameInMap("prometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-nanjing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2bhocin5e2na</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The backend data storage status.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending2Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The supported authentication types.</p>
         */
        @NameInMap("supportAuthTypes")
        public java.util.List<String> supportAuthTypes;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17073812345</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The workspace to which the Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-115214006-cn-hangzhou</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListPrometheusInstancesResponseBodyPrometheusInstances build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstancesResponseBodyPrometheusInstances self = new ListPrometheusInstancesResponseBodyPrometheusInstances();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setPrometheusInstanceName(String prometheusInstanceName) {
            this.prometheusInstanceName = prometheusInstanceName;
            return this;
        }
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setSupportAuthTypes(java.util.List<String> supportAuthTypes) {
            this.supportAuthTypes = supportAuthTypes;
            return this;
        }
        public java.util.List<String> getSupportAuthTypes() {
            return this.supportAuthTypes;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstances setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
