// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ConvertToFEEditingProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    public ConvertToFEEditingProjectResponseBodyProject project;

    @NameInMap("RequestId")
    public String requestId;

    public static ConvertToFEEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertToFEEditingProjectResponseBody self = new ConvertToFEEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertToFEEditingProjectResponseBody setProject(ConvertToFEEditingProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public ConvertToFEEditingProjectResponseBodyProject getProject() {
        return this.project;
    }

    public ConvertToFEEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ConvertToFEEditingProjectResponseBodyProject extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        public static ConvertToFEEditingProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            ConvertToFEEditingProjectResponseBodyProject self = new ConvertToFEEditingProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public ConvertToFEEditingProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
