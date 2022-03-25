// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetStatusAndOssResponseBody extends TeaModel {
    @NameInMap("DatasetPublishStatus")
    public String datasetPublishStatus;

    @NameInMap("FullName")
    public String fullName;

    @NameInMap("GmtPublished")
    public String gmtPublished;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("NickName")
    public String nickName;

    @NameInMap("PipelineStatus")
    public String pipelineStatus;

    @NameInMap("ProjectId")
    public Long projectId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetStatusAndOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStatusAndOssResponseBody self = new GetStatusAndOssResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStatusAndOssResponseBody setDatasetPublishStatus(String datasetPublishStatus) {
        this.datasetPublishStatus = datasetPublishStatus;
        return this;
    }
    public String getDatasetPublishStatus() {
        return this.datasetPublishStatus;
    }

    public GetStatusAndOssResponseBody setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public GetStatusAndOssResponseBody setGmtPublished(String gmtPublished) {
        this.gmtPublished = gmtPublished;
        return this;
    }
    public String getGmtPublished() {
        return this.gmtPublished;
    }

    public GetStatusAndOssResponseBody setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public GetStatusAndOssResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GetStatusAndOssResponseBody setPipelineStatus(String pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
        return this;
    }
    public String getPipelineStatus() {
        return this.pipelineStatus;
    }

    public GetStatusAndOssResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetStatusAndOssResponseBody setRequestId(String requestId) {
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
