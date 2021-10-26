// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficControlsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ApiTrafficControls")
    public DescribeApiTrafficControlsResponseBodyApiTrafficControls apiTrafficControls;

    public static DescribeApiTrafficControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficControlsResponseBody self = new DescribeApiTrafficControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficControlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiTrafficControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiTrafficControlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiTrafficControlsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeApiTrafficControlsResponseBody setApiTrafficControls(DescribeApiTrafficControlsResponseBodyApiTrafficControls apiTrafficControls) {
        this.apiTrafficControls = apiTrafficControls;
        return this;
    }
    public DescribeApiTrafficControlsResponseBodyApiTrafficControls getApiTrafficControls() {
        return this.apiTrafficControls;
    }

    public static class DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem extends TeaModel {
        @NameInMap("BoundTime")
        public String boundTime;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("TrafficControlId")
        public String trafficControlId;

        @NameInMap("TrafficControlName")
        public String trafficControlName;

        @NameInMap("ApiName")
        public String apiName;

        public static DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem self = new DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
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

        public DescribeApiTrafficControlsResponseBodyApiTrafficControlsApiTrafficControlItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
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
