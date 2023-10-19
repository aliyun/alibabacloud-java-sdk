// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficControlsResponseBody extends TeaModel {
    /**
     * <p>The returned throttling policy information. It is an array consisting of ApiTrafficControlItem data.</p>
     */
    @NameInMap("ApiTrafficControls")
    public DescribeApiTrafficControlsResponseBodyApiTrafficControls apiTrafficControls;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiTrafficControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficControlsResponseBody self = new DescribeApiTrafficControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficControlsResponseBody setApiTrafficControls(DescribeApiTrafficControlsResponseBodyApiTrafficControls apiTrafficControls) {
        this.apiTrafficControls = apiTrafficControls;
        return this;
    }
    public DescribeApiTrafficControlsResponseBodyApiTrafficControls getApiTrafficControls() {
        return this.apiTrafficControls;
    }

    public DescribeApiTrafficControlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiTrafficControlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiTrafficControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiTrafficControlsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>API operation</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The binding time of the throttling policy.</p>
         */
        @NameInMap("BoundTime")
        public String boundTime;

        /**
         * <p>The ID of the throttling policy.</p>
         */
        @NameInMap("TrafficControlId")
        public String trafficControlId;

        /**
         * <p>The name of the throttling policy.</p>
         */
        @NameInMap("TrafficControlName")
        public String trafficControlName;

        public static DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem self = new DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setTrafficControlId(String trafficControlId) {
            this.trafficControlId = trafficControlId;
            return this;
        }
        public String getTrafficControlId() {
            return this.trafficControlId;
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setTrafficControlName(String trafficControlName) {
            this.trafficControlName = trafficControlName;
            return this;
        }
        public String getTrafficControlName() {
            return this.trafficControlName;
        }

    }

    public static class DescribeApiTrafficControlsResponseBodyApiTrafficControls extends TeaModel {
        @NameInMap("ApiTrafficControlItem")
        public java.util.List<DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem> apiTrafficControlItem;

        public static DescribeApiTrafficControlsResponseBodyApiTrafficControls build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficControlsResponseBodyApiTrafficControls self = new DescribeApiTrafficControlsResponseBodyApiTrafficControls();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControls setApiTrafficControlItem(java.util.List<DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem> apiTrafficControlItem) {
            this.apiTrafficControlItem = apiTrafficControlItem;
            return this;
        }
        public java.util.List<DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem> getApiTrafficControlItem() {
            return this.apiTrafficControlItem;
        }

    }

}
