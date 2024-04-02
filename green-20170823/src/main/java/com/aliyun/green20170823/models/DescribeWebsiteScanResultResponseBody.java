// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteScanResultResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("WebsiteScanResultList")
    public java.util.List<DescribeWebsiteScanResultResponseBodyWebsiteScanResultList> websiteScanResultList;

    public static DescribeWebsiteScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteScanResultResponseBody self = new DescribeWebsiteScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteScanResultResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebsiteScanResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebsiteScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteScanResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebsiteScanResultResponseBody setWebsiteScanResultList(java.util.List<DescribeWebsiteScanResultResponseBodyWebsiteScanResultList> websiteScanResultList) {
        this.websiteScanResultList = websiteScanResultList;
        return this;
    }
    public java.util.List<DescribeWebsiteScanResultResponseBodyWebsiteScanResultList> getWebsiteScanResultList() {
        return this.websiteScanResultList;
    }

    public static class DescribeWebsiteScanResultResponseBodyWebsiteScanResultList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("HandleStatus")
        public Integer handleStatus;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ImageRiskCount")
        public Integer imageRiskCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("ScanTime")
        public String scanTime;

        @NameInMap("SourceRiskCount")
        public Integer sourceRiskCount;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TextRiskCount")
        public Integer textRiskCount;

        @NameInMap("Url")
        public String url;

        public static DescribeWebsiteScanResultResponseBodyWebsiteScanResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebsiteScanResultResponseBodyWebsiteScanResultList self = new DescribeWebsiteScanResultResponseBodyWebsiteScanResultList();
            return TeaModel.build(map, self);
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setHandleStatus(Integer handleStatus) {
            this.handleStatus = handleStatus;
            return this;
        }
        public Integer getHandleStatus() {
            return this.handleStatus;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setImageRiskCount(Integer imageRiskCount) {
            this.imageRiskCount = imageRiskCount;
            return this;
        }
        public Integer getImageRiskCount() {
            return this.imageRiskCount;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setScanTime(String scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public String getScanTime() {
            return this.scanTime;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setSourceRiskCount(Integer sourceRiskCount) {
            this.sourceRiskCount = sourceRiskCount;
            return this;
        }
        public Integer getSourceRiskCount() {
            return this.sourceRiskCount;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setTextRiskCount(Integer textRiskCount) {
            this.textRiskCount = textRiskCount;
            return this;
        }
        public Integer getTextRiskCount() {
            return this.textRiskCount;
        }

        public DescribeWebsiteScanResultResponseBodyWebsiteScanResultList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
