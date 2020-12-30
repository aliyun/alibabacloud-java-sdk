// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Projects")
    public ListFlowProjectResponseBodyProjects projects;

    public static ListFlowProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectResponseBody self = new ListFlowProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowProjectResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListFlowProjectResponseBody setProjects(ListFlowProjectResponseBodyProjects projects) {
        this.projects = projects;
        return this;
    }
    public ListFlowProjectResponseBodyProjects getProjects() {
        return this.projects;
    }

    public static class ListFlowProjectResponseBodyProjectsProject extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListFlowProjectResponseBodyProjectsProject build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectResponseBodyProjectsProject self = new ListFlowProjectResponseBodyProjectsProject();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectResponseBodyProjectsProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowProjectResponseBodyProjectsProject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListFlowProjectResponseBodyProjectsProject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowProjectResponseBodyProjectsProject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowProjectResponseBodyProjectsProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowProjectResponseBodyProjectsProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListFlowProjectResponseBodyProjects extends TeaModel {
        @NameInMap("Project")
        public java.util.List<ListFlowProjectResponseBodyProjectsProject> project;

        public static ListFlowProjectResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectResponseBodyProjects self = new ListFlowProjectResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectResponseBodyProjects setProject(java.util.List<ListFlowProjectResponseBodyProjectsProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<ListFlowProjectResponseBodyProjectsProject> getProject() {
            return this.project;
        }

    }

}
