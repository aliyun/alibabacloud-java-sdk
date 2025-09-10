// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    public static class ListPrometheusInstancesResponseBodyPrometheusInstancesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("value")
        public String value;

        public static ListPrometheusInstancesResponseBodyPrometheusInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstancesResponseBodyPrometheusInstancesTags self = new ListPrometheusInstancesResponseBodyPrometheusInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusInstancesResponseBodyPrometheusInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusInstancesResponseBodyPrometheusInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>readWrite</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>2025-08-10T02:07:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>remote-write</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>POSTPAY_GB</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>arms</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>rw-63549e054ff596a4149927961dff</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test-prom-name</p>
         */
        @NameInMap("prometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-nanjing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2bhocin5e2na</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Pending2Running</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("supportAuthTypes")
        public java.util.List<String> supportAuthTypes;

        @NameInMap("tags")
        public java.util.List<ListPrometheusInstancesResponseBodyPrometheusInstancesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>17073812345</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("version")
        public String version;

        /**
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

        public ListPrometheusInstancesResponseBodyPrometheusInstances setTags(java.util.List<ListPrometheusInstancesResponseBodyPrometheusInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPrometheusInstancesResponseBodyPrometheusInstancesTags> getTags() {
            return this.tags;
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
