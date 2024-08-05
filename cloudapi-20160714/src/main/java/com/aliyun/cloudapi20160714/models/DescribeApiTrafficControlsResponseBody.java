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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
         * 
         * <strong>example:</strong>
         * <p>46fbb52840d146f186e38e8e70fc8c90</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>API operation</p>
         * 
         * <strong>example:</strong>
         * <p>testapi</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The binding time of the throttling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-23T08:28:48Z</p>
         */
        @NameInMap("BoundTime")
        public String boundTime;

        /**
         * <p>The ID of the throttling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
         */
        @NameInMap("TrafficControlId")
        public String trafficControlId;

        /**
         * <p>The name of the throttling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>backendsignature</p>
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
