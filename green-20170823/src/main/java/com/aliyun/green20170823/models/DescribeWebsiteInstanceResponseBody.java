// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("WebsiteInstanceList")
    public java.util.List<DescribeWebsiteInstanceResponseBodyWebsiteInstanceList> websiteInstanceList;

    public static DescribeWebsiteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceResponseBody self = new DescribeWebsiteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebsiteInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebsiteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebsiteInstanceResponseBody setWebsiteInstanceList(java.util.List<DescribeWebsiteInstanceResponseBodyWebsiteInstanceList> websiteInstanceList) {
        this.websiteInstanceList = websiteInstanceList;
        return this;
    }
    public java.util.List<DescribeWebsiteInstanceResponseBodyWebsiteInstanceList> getWebsiteInstanceList() {
        return this.websiteInstanceList;
    }

    public static class DescribeWebsiteInstanceResponseBodyWebsiteInstanceList extends TeaModel {
        @NameInMap("BuyTime")
        public String buyTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IndexPage")
        public String indexPage;

        @NameInMap("IndexPageScanInterval")
        public Integer indexPageScanInterval;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Status")
        public String status;

        @NameInMap("WebsiteScanInterval")
        public Integer websiteScanInterval;

        public static DescribeWebsiteInstanceResponseBodyWebsiteInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebsiteInstanceResponseBodyWebsiteInstanceList self = new DescribeWebsiteInstanceResponseBodyWebsiteInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setIndexPage(String indexPage) {
            this.indexPage = indexPage;
            return this;
        }
        public String getIndexPage() {
            return this.indexPage;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setIndexPageScanInterval(Integer indexPageScanInterval) {
            this.indexPageScanInterval = indexPageScanInterval;
            return this;
        }
        public Integer getIndexPageScanInterval() {
            return this.indexPageScanInterval;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWebsiteInstanceResponseBodyWebsiteInstanceList setWebsiteScanInterval(Integer websiteScanInterval) {
            this.websiteScanInterval = websiteScanInterval;
            return this;
        }
        public Integer getWebsiteScanInterval() {
            return this.websiteScanInterval;
        }

    }

}
