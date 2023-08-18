// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Projects")
    public ListProjectResponseBodyProjects projects;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponseBody self = new ListProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectResponseBody setProjects(ListProjectResponseBodyProjects projects) {
        this.projects = projects;
        return this;
    }
    public ListProjectResponseBodyProjects getProjects() {
        return this.projects;
    }

    public ListProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListProjectResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListProjectResponseBodyProjectsProject extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("ManagerIds")
        public String managerIds;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("State")
        public String state;

        public static ListProjectResponseBodyProjectsProject build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyProjectsProject self = new ListProjectResponseBodyProjectsProject();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyProjectsProject setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListProjectResponseBodyProjectsProject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProjectResponseBodyProjectsProject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListProjectResponseBodyProjectsProject setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListProjectResponseBodyProjectsProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectResponseBodyProjectsProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectResponseBodyProjectsProject setManagerIds(String managerIds) {
            this.managerIds = managerIds;
            return this;
        }
        public String getManagerIds() {
            return this.managerIds;
        }

        public ListProjectResponseBodyProjectsProject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListProjectResponseBodyProjectsProject setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListProjectResponseBodyProjectsProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectResponseBodyProjectsProject setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListProjectResponseBodyProjectsProject setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListProjectResponseBodyProjects extends TeaModel {
        @NameInMap("Project")
        public java.util.List<ListProjectResponseBodyProjectsProject> project;

        public static ListProjectResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyProjects self = new ListProjectResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyProjects setProject(java.util.List<ListProjectResponseBodyProjectsProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<ListProjectResponseBodyProjectsProject> getProject() {
            return this.project;
        }

    }

}
