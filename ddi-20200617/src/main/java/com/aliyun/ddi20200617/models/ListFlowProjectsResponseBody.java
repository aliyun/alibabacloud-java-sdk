// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowProjectsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Projects")
    public ListFlowProjectsResponseBodyProjects projects;

    public static ListFlowProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectsResponseBody self = new ListFlowProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowProjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowProjectsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListFlowProjectsResponseBody setProjects(ListFlowProjectsResponseBodyProjects projects) {
        this.projects = projects;
        return this;
    }
    public ListFlowProjectsResponseBodyProjects getProjects() {
        return this.projects;
    }

    public static class ListFlowProjectsResponseBodyProjectsProject extends TeaModel {
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

        public static ListFlowProjectsResponseBodyProjectsProject build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectsResponseBodyProjectsProject self = new ListFlowProjectsResponseBodyProjectsProject();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectsResponseBodyProjectsProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowProjectsResponseBodyProjectsProject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListFlowProjectsResponseBodyProjectsProject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowProjectsResponseBodyProjectsProject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowProjectsResponseBodyProjectsProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowProjectsResponseBodyProjectsProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListFlowProjectsResponseBodyProjects extends TeaModel {
        @NameInMap("Project")
        public java.util.List<ListFlowProjectsResponseBodyProjectsProject> project;

        public static ListFlowProjectsResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectsResponseBodyProjects self = new ListFlowProjectsResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectsResponseBodyProjects setProject(java.util.List<ListFlowProjectsResponseBodyProjectsProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<ListFlowProjectsResponseBodyProjectsProject> getProject() {
            return this.project;
        }

    }

}
