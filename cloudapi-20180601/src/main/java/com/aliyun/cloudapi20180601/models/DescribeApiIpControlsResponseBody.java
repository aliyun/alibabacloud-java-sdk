// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiIpControlsResponseBody extends TeaModel {
    @NameInMap("ApiIpControls")
    public DescribeApiIpControlsResponseBodyApiIpControls apiIpControls;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiIpControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiIpControlsResponseBody self = new DescribeApiIpControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiIpControlsResponseBody setApiIpControls(DescribeApiIpControlsResponseBodyApiIpControls apiIpControls) {
        this.apiIpControls = apiIpControls;
        return this;
    }
    public DescribeApiIpControlsResponseBodyApiIpControls getApiIpControls() {
        return this.apiIpControls;
    }

    public DescribeApiIpControlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiIpControlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiIpControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiIpControlsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("BoundTime")
        public String boundTime;

        @NameInMap("IpControlId")
        public String ipControlId;

        @NameInMap("IpControlName")
        public String ipControlName;

        public static DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem self = new DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem setIpControlId(String ipControlId) {
            this.ipControlId = ipControlId;
            return this;
        }
        public String getIpControlId() {
            return this.ipControlId;
        }

        public DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem setIpControlName(String ipControlName) {
            this.ipControlName = ipControlName;
            return this;
        }
        public String getIpControlName() {
            return this.ipControlName;
        }

    }

    public static class DescribeApiIpControlsResponseBodyApiIpControls extends TeaModel {
        @NameInMap("ApiIpControlItem")
        public java.util.List<DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem> apiIpControlItem;

        public static DescribeApiIpControlsResponseBodyApiIpControls build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiIpControlsResponseBodyApiIpControls self = new DescribeApiIpControlsResponseBodyApiIpControls();
            return TeaModel.build(map, self);
        }

        public DescribeApiIpControlsResponseBodyApiIpControls setApiIpControlItem(java.util.List<DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem> apiIpControlItem) {
            this.apiIpControlItem = apiIpControlItem;
            return this;
        }
        public java.util.List<DescribeApiIpControlsResponseBodyApiIpControlsApiIpControlItem> getApiIpControlItem() {
            return this.apiIpControlItem;
        }

    }

}
