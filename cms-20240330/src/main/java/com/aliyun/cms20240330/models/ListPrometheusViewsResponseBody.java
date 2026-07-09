// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusViewsResponseBody extends TeaModel {
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
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of Prometheus view instances.</p>
     */
    @NameInMap("prometheusViews")
    public java.util.List<ListPrometheusViewsResponseBodyPrometheusViews> prometheusViews;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
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

    public static ListPrometheusViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusViewsResponseBody self = new ListPrometheusViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusViewsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusViewsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusViewsResponseBody setPrometheusViews(java.util.List<ListPrometheusViewsResponseBodyPrometheusViews> prometheusViews) {
        this.prometheusViews = prometheusViews;
        return this;
    }
    public java.util.List<ListPrometheusViewsResponseBodyPrometheusViews> getPrometheusViews() {
        return this.prometheusViews;
    }

    public ListPrometheusViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrometheusViewsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPrometheusViewsResponseBodyPrometheusViews extends TeaModel {
        /**
         * <p>The instance creation time in UTC+0, in the format of yyyy-MM-ddTHH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-12T02:18:36Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The instance type:
         * prom-view: aggregated view of the new version.
         * global-view: aggregated view of the legacy version.</p>
         * 
         * <strong>example:</strong>
         * <p>prom-view</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The billing type. Currently, the fixed value is FREE.</p>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The product to which the Prometheus instance belongs (arms or cms).</p>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The number of Prometheus instances included in the view.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("prometheusInstanceCount")
        public Integer prometheusInstanceCount;

        /**
         * <p>The Prometheus view ID.</p>
         * 
         * <strong>example:</strong>
         * <p>view-xxx</p>
         */
        @NameInMap("prometheusViewId")
        public String prometheusViewId;

        /**
         * <p>The Prometheus view name.</p>
         * 
         * <strong>example:</strong>
         * <p>view1</p>
         */
        @NameInMap("prometheusViewName")
        public String prometheusViewName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The fixed value: PrometheusView.</p>
         * 
         * <strong>example:</strong>
         * <p>PrometheusView</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The backend data storage status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxx</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>V2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The workspace to which the Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1490404746278495-cn-hangzhou</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListPrometheusViewsResponseBodyPrometheusViews build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusViewsResponseBodyPrometheusViews self = new ListPrometheusViewsResponseBodyPrometheusViews();
            return TeaModel.build(map, self);
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setPrometheusInstanceCount(Integer prometheusInstanceCount) {
            this.prometheusInstanceCount = prometheusInstanceCount;
            return this;
        }
        public Integer getPrometheusInstanceCount() {
            return this.prometheusInstanceCount;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setPrometheusViewId(String prometheusViewId) {
            this.prometheusViewId = prometheusViewId;
            return this;
        }
        public String getPrometheusViewId() {
            return this.prometheusViewId;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setPrometheusViewName(String prometheusViewName) {
            this.prometheusViewName = prometheusViewName;
            return this;
        }
        public String getPrometheusViewName() {
            return this.prometheusViewName;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPrometheusViewsResponseBodyPrometheusViews setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
