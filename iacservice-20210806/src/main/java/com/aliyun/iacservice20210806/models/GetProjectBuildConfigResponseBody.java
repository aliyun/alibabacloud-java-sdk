// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildConfigResponseBody extends TeaModel {
    @NameInMap("projectBuildConfig")
    public GetProjectBuildConfigResponseBodyProjectBuildConfig projectBuildConfig;

    @NameInMap("requestId")
    public String requestId;

    public static GetProjectBuildConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectBuildConfigResponseBody self = new GetProjectBuildConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectBuildConfigResponseBody setProjectBuildConfig(GetProjectBuildConfigResponseBodyProjectBuildConfig projectBuildConfig) {
        this.projectBuildConfig = projectBuildConfig;
        return this;
    }
    public GetProjectBuildConfigResponseBodyProjectBuildConfig getProjectBuildConfig() {
        return this.projectBuildConfig;
    }

    public GetProjectBuildConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectBuildConfigResponseBodyProjectBuildConfig extends TeaModel {
        @NameInMap("taskPolicies")
        public java.util.Map<String, ProjectBuildConfigTaskPoliciesValue> taskPolicies;

        public static GetProjectBuildConfigResponseBodyProjectBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            GetProjectBuildConfigResponseBodyProjectBuildConfig self = new GetProjectBuildConfigResponseBodyProjectBuildConfig();
            return TeaModel.build(map, self);
        }

        public GetProjectBuildConfigResponseBodyProjectBuildConfig setTaskPolicies(java.util.Map<String, ProjectBuildConfigTaskPoliciesValue> taskPolicies) {
            this.taskPolicies = taskPolicies;
            return this;
        }
        public java.util.Map<String, ProjectBuildConfigTaskPoliciesValue> getTaskPolicies() {
            return this.taskPolicies;
        }

    }

}
