// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeTableDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("AvgSize")
    public String avgSize;

    @NameInMap("Items")
    public DescribeTableDetailResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeTableDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableDetailResponseBody self = new DescribeTableDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeTableDetailResponseBody setAvgSize(String avgSize) {
        this.avgSize = avgSize;
        return this;
    }
    public String getAvgSize() {
        return this.avgSize;
    }

    public DescribeTableDetailResponseBody setItems(DescribeTableDetailResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTableDetailResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeTableDetailResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableDetailResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeTableDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableDetailResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTableDetailResponseBodyItemsShard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>9484858</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeTableDetailResponseBodyItemsShard build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableDetailResponseBodyItemsShard self = new DescribeTableDetailResponseBodyItemsShard();
            return TeaModel.build(map, self);
        }

        public DescribeTableDetailResponseBodyItemsShard setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeTableDetailResponseBodyItemsShard setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeTableDetailResponseBodyItems extends TeaModel {
        @NameInMap("Shard")
        public java.util.List<DescribeTableDetailResponseBodyItemsShard> shard;

        public static DescribeTableDetailResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableDetailResponseBodyItems self = new DescribeTableDetailResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTableDetailResponseBodyItems setShard(java.util.List<DescribeTableDetailResponseBodyItemsShard> shard) {
            this.shard = shard;
            return this;
        }
        public java.util.List<DescribeTableDetailResponseBodyItemsShard> getShard() {
            return this.shard;
        }

    }

}
