// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePerformanceViewsResponseBody extends TeaModel {
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
     * <p>3A8F6106-6AFD-5A34-9C80-8DE2C42D06E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Views")
    public java.util.List<DescribePerformanceViewsResponseBodyViews> views;

    public static DescribePerformanceViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePerformanceViewsResponseBody self = new DescribePerformanceViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePerformanceViewsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePerformanceViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePerformanceViewsResponseBody setViews(java.util.List<DescribePerformanceViewsResponseBodyViews> views) {
        this.views = views;
        return this;
    }
    public java.util.List<DescribePerformanceViewsResponseBodyViews> getViews() {
        return this.views;
    }

    public static class DescribePerformanceViewsResponseBodyViews extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-06-18T07:06:53.000+00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-06-18T07:07:32.000+00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ViewName")
        public String viewName;

        public static DescribePerformanceViewsResponseBodyViews build(java.util.Map<String, ?> map) throws Exception {
            DescribePerformanceViewsResponseBodyViews self = new DescribePerformanceViewsResponseBodyViews();
            return TeaModel.build(map, self);
        }

        public DescribePerformanceViewsResponseBodyViews setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePerformanceViewsResponseBodyViews setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribePerformanceViewsResponseBodyViews setViewName(String viewName) {
            this.viewName = viewName;
            return this;
        }
        public String getViewName() {
            return this.viewName;
        }

    }

}
