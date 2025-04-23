// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectBuildsResponseBody extends TeaModel {
    @NameInMap("ProjectBuilds")
    public java.util.List<ListProjectBuildsResponseBodyProjectBuilds> projectBuilds;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>89154E16-FB0A-573D-8AF5-CF3F2FE28913</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListProjectBuildsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBuildsResponseBody self = new ListProjectBuildsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectBuildsResponseBody setProjectBuilds(java.util.List<ListProjectBuildsResponseBodyProjectBuilds> projectBuilds) {
        this.projectBuilds = projectBuilds;
        return this;
    }
    public java.util.List<ListProjectBuildsResponseBodyProjectBuilds> getProjectBuilds() {
        return this.projectBuilds;
    }

    public ListProjectBuildsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectBuildsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProjectBuildsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectBuildsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectBuildsResponseBodyProjectBuilds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-08-26T02:10:48Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>apply</p>
         */
        @NameInMap("projectBuildAction")
        public String projectBuildAction;

        /**
         * <strong>example:</strong>
         * <p>pb-433aead75605717728b6a27615f</p>
         */
        @NameInMap("projectBuildId")
        public String projectBuildId;

        /**
         * <strong>example:</strong>
         * <p>1661221432088</p>
         */
        @NameInMap("projectBuildIndex")
        public Long projectBuildIndex;

        /**
         * <strong>example:</strong>
         * <p>p-14e80de4866bf7ffed0bab6154d737</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        /**
         * <strong>example:</strong>
         * <p>1661221432088</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        public static ListProjectBuildsResponseBodyProjectBuilds build(java.util.Map<String, ?> map) throws Exception {
            ListProjectBuildsResponseBodyProjectBuilds self = new ListProjectBuildsResponseBodyProjectBuilds();
            return TeaModel.build(map, self);
        }

        public ListProjectBuildsResponseBodyProjectBuilds setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectBuildAction(String projectBuildAction) {
            this.projectBuildAction = projectBuildAction;
            return this;
        }
        public String getProjectBuildAction() {
            return this.projectBuildAction;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectBuildId(String projectBuildId) {
            this.projectBuildId = projectBuildId;
            return this;
        }
        public String getProjectBuildId() {
            return this.projectBuildId;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectBuildIndex(Long projectBuildIndex) {
            this.projectBuildIndex = projectBuildIndex;
            return this;
        }
        public Long getProjectBuildIndex() {
            return this.projectBuildIndex;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

    }

}
