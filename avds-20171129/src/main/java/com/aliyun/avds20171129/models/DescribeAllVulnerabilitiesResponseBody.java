// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAllVulnerabilitiesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<DescribeAllVulnerabilitiesResponseBodyList> list;

    @NameInMap("Count")
    public Integer count;

    public static DescribeAllVulnerabilitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllVulnerabilitiesResponseBody self = new DescribeAllVulnerabilitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllVulnerabilitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAllVulnerabilitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllVulnerabilitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAllVulnerabilitiesResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeAllVulnerabilitiesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAllVulnerabilitiesResponseBody setList(java.util.List<DescribeAllVulnerabilitiesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeAllVulnerabilitiesResponseBodyList> getList() {
        return this.list;
    }

    public DescribeAllVulnerabilitiesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public static class DescribeAllVulnerabilitiesResponseBodyList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Severity")
        public Integer severity;

        @NameInMap("LastDiscoveredAt")
        public Long lastDiscoveredAt;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("Name")
        public String name;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("VulnerabilityTypeDes")
        public String vulnerabilityTypeDes;

        @NameInMap("Target")
        public String target;

        @NameInMap("Id")
        public Long id;

        public static DescribeAllVulnerabilitiesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllVulnerabilitiesResponseBodyList self = new DescribeAllVulnerabilitiesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeAllVulnerabilitiesResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setSeverity(Integer severity) {
            this.severity = severity;
            return this;
        }
        public Integer getSeverity() {
            return this.severity;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setLastDiscoveredAt(Long lastDiscoveredAt) {
            this.lastDiscoveredAt = lastDiscoveredAt;
            return this;
        }
        public Long getLastDiscoveredAt() {
            return this.lastDiscoveredAt;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setVulnerabilityTypeDes(String vulnerabilityTypeDes) {
            this.vulnerabilityTypeDes = vulnerabilityTypeDes;
            return this;
        }
        public String getVulnerabilityTypeDes() {
            return this.vulnerabilityTypeDes;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeAllVulnerabilitiesResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
