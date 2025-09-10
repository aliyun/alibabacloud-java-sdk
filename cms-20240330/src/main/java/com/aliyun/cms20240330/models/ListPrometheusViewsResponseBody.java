// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusViewsResponseBody extends TeaModel {
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
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    public static class ListPrometheusViewsResponseBodyPrometheusViewsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static ListPrometheusViewsResponseBodyPrometheusViewsTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusViewsResponseBodyPrometheusViewsTags self = new ListPrometheusViewsResponseBodyPrometheusViewsTags();
            return TeaModel.build(map, self);
        }

        public ListPrometheusViewsResponseBodyPrometheusViewsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusViewsResponseBodyPrometheusViewsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusViewsResponseBodyPrometheusViews extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-07-12T02:18:36Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>prom-view</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("prometheusInstanceCount")
        public Integer prometheusInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>view-xxx</p>
         */
        @NameInMap("prometheusViewId")
        public String prometheusViewId;

        /**
         * <strong>example:</strong>
         * <p>view1</p>
         */
        @NameInMap("prometheusViewName")
        public String prometheusViewName;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>PrometheusView</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListPrometheusViewsResponseBodyPrometheusViewsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>123xxx</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>V2</p>
         */
        @NameInMap("version")
        public String version;

        /**
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

        public ListPrometheusViewsResponseBodyPrometheusViews setTags(java.util.List<ListPrometheusViewsResponseBodyPrometheusViewsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPrometheusViewsResponseBodyPrometheusViewsTags> getTags() {
            return this.tags;
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
