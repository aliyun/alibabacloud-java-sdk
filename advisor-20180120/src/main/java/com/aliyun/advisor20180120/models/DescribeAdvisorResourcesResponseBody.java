// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAdvisorResourcesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdvisorResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorResourcesResponseBody self = new DescribeAdvisorResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorResourcesResponseBody setData(DescribeAdvisorResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAdvisorResourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeAdvisorResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdvisorResourcesResponseBodyDataResultResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;resourceId&quot;: &quot;xxxxx&quot;,
         *     &quot;deviceAvailable&quot;: true,
         *     ...
         * }</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>ecs-20230701</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static DescribeAdvisorResourcesResponseBodyDataResultResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorResourcesResponseBodyDataResultResource self = new DescribeAdvisorResourcesResponseBodyDataResultResource();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorResourcesResponseBodyDataResultResource setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAdvisorResourcesResponseBodyDataResultResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAdvisorResourcesResponseBodyDataResultResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAdvisorResourcesResponseBodyDataResultResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeAdvisorResourcesResponseBodyDataResultResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class DescribeAdvisorResourcesResponseBodyDataResult extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeAdvisorResourcesResponseBodyDataResultResource> resource;

        public static DescribeAdvisorResourcesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorResourcesResponseBodyDataResult self = new DescribeAdvisorResourcesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorResourcesResponseBodyDataResult setResource(java.util.List<DescribeAdvisorResourcesResponseBodyDataResultResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeAdvisorResourcesResponseBodyDataResultResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeAdvisorResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public DescribeAdvisorResourcesResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static DescribeAdvisorResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorResourcesResponseBodyData self = new DescribeAdvisorResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorResourcesResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public DescribeAdvisorResourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAdvisorResourcesResponseBodyData setResult(DescribeAdvisorResourcesResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public DescribeAdvisorResourcesResponseBodyDataResult getResult() {
            return this.result;
        }

        public DescribeAdvisorResourcesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
