// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetStatusAndOssResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProjectStatusAndOssResponseList")
    public java.util.List<ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList> projectStatusAndOssResponseList;

    @NameInMap("RequestId")
    public String requestId;

    public static ProjectGetStatusAndOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetStatusAndOssResponseBody self = new ProjectGetStatusAndOssResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectGetStatusAndOssResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectGetStatusAndOssResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectGetStatusAndOssResponseBody setProjectStatusAndOssResponseList(java.util.List<ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList> projectStatusAndOssResponseList) {
        this.projectStatusAndOssResponseList = projectStatusAndOssResponseList;
        return this;
    }
    public java.util.List<ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList> getProjectStatusAndOssResponseList() {
        return this.projectStatusAndOssResponseList;
    }

    public ProjectGetStatusAndOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList extends TeaModel {
        @NameInMap("DatasetPublishStatus")
        public String datasetPublishStatus;

        @NameInMap("GmtPublished")
        public String gmtPublished;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssSts")
        public java.util.Map<String, ?> ossSts;

        @NameInMap("PipelineStatus")
        public String pipelineStatus;

        @NameInMap("ProjectId")
        public Long projectId;

        public static ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList self = new ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList();
            return TeaModel.build(map, self);
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setDatasetPublishStatus(String datasetPublishStatus) {
            this.datasetPublishStatus = datasetPublishStatus;
            return this;
        }
        public String getDatasetPublishStatus() {
            return this.datasetPublishStatus;
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setGmtPublished(String gmtPublished) {
            this.gmtPublished = gmtPublished;
            return this;
        }
        public String getGmtPublished() {
            return this.gmtPublished;
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setOssSts(java.util.Map<String, ?> ossSts) {
            this.ossSts = ossSts;
            return this;
        }
        public java.util.Map<String, ?> getOssSts() {
            return this.ossSts;
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setPipelineStatus(String pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

        public ProjectGetStatusAndOssResponseBodyProjectStatusAndOssResponseList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
