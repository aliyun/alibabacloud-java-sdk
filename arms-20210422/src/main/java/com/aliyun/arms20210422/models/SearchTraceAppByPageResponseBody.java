// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public SearchTraceAppByPageResponseBodyPageBean pageBean;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchTraceAppByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByPageResponseBody self = new SearchTraceAppByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByPageResponseBody setPageBean(SearchTraceAppByPageResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchTraceAppByPageResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchTraceAppByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchTraceAppByPageResponseBodyPageBeanTraceApps extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static SearchTraceAppByPageResponseBodyPageBeanTraceApps build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponseBodyPageBeanTraceApps self = new SearchTraceAppByPageResponseBodyPageBeanTraceApps();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchTraceAppByPageResponseBodyPageBean extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TraceApps")
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceApps> traceApps;

        public static SearchTraceAppByPageResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponseBodyPageBean self = new SearchTraceAppByPageResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByPageResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchTraceAppByPageResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchTraceAppByPageResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchTraceAppByPageResponseBodyPageBean setTraceApps(java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceApps> traceApps) {
            this.traceApps = traceApps;
            return this;
        }
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceApps> getTraceApps() {
            return this.traceApps;
        }

    }

}
