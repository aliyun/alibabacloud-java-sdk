// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    public DescribeProjectResponseBodyProject project;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectResponseBody self = new DescribeProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectResponseBody setProject(DescribeProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public DescribeProjectResponseBodyProject getProject() {
        return this.project;
    }

    public DescribeProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProjectResponseBodyProject extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Description")
        public String description;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("VehicleCommunicationProtocol")
        public String vehicleCommunicationProtocol;

        public static DescribeProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyProject self = new DescribeProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyProject setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectResponseBodyProject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeProjectResponseBodyProject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectResponseBodyProject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeProjectResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyProject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyProject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeProjectResponseBodyProject setVehicleCommunicationProtocol(String vehicleCommunicationProtocol) {
            this.vehicleCommunicationProtocol = vehicleCommunicationProtocol;
            return this;
        }
        public String getVehicleCommunicationProtocol() {
            return this.vehicleCommunicationProtocol;
        }

    }

}
