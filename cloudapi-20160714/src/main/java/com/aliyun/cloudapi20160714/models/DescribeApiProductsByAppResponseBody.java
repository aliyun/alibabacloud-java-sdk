// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiProductsByAppResponseBody extends TeaModel {
    @NameInMap("ApiProductInfoList")
    public DescribeApiProductsByAppResponseBodyApiProductInfoList apiProductInfoList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiProductsByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiProductsByAppResponseBody self = new DescribeApiProductsByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiProductsByAppResponseBody setApiProductInfoList(DescribeApiProductsByAppResponseBodyApiProductInfoList apiProductInfoList) {
        this.apiProductInfoList = apiProductInfoList;
        return this;
    }
    public DescribeApiProductsByAppResponseBodyApiProductInfoList getApiProductInfoList() {
        return this.apiProductInfoList;
    }

    public DescribeApiProductsByAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiProductsByAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiProductsByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiProductsByAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo extends TeaModel {
        @NameInMap("ApiProductId")
        public String apiProductId;

        public static DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo self = new DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo setApiProductId(String apiProductId) {
            this.apiProductId = apiProductId;
            return this;
        }
        public String getApiProductId() {
            return this.apiProductId;
        }

    }

    public static class DescribeApiProductsByAppResponseBodyApiProductInfoList extends TeaModel {
        @NameInMap("ApiProductInfo")
        public java.util.List<DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo> apiProductInfo;

        public static DescribeApiProductsByAppResponseBodyApiProductInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiProductsByAppResponseBodyApiProductInfoList self = new DescribeApiProductsByAppResponseBodyApiProductInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeApiProductsByAppResponseBodyApiProductInfoList setApiProductInfo(java.util.List<DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo> apiProductInfo) {
            this.apiProductInfo = apiProductInfo;
            return this;
        }
        public java.util.List<DescribeApiProductsByAppResponseBodyApiProductInfoListApiProductInfo> getApiProductInfo() {
            return this.apiProductInfo;
        }

    }

}
