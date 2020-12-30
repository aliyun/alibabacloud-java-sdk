// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRuleResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BuildRules")
    public java.util.List<ListRepoBuildRuleResponseBodyBuildRules> buildRules;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Code")
    public String code;

    public static ListRepoBuildRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRuleResponseBody self = new ListRepoBuildRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoBuildRuleResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListRepoBuildRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoBuildRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoBuildRuleResponseBody setBuildRules(java.util.List<ListRepoBuildRuleResponseBodyBuildRules> buildRules) {
        this.buildRules = buildRules;
        return this;
    }
    public java.util.List<ListRepoBuildRuleResponseBodyBuildRules> getBuildRules() {
        return this.buildRules;
    }

    public ListRepoBuildRuleResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoBuildRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRepoBuildRuleResponseBodyBuildRules extends TeaModel {
        @NameInMap("DockerfileLocation")
        public String dockerfileLocation;

        @NameInMap("BuildRuleId")
        public String buildRuleId;

        @NameInMap("PushType")
        public String pushType;

        @NameInMap("PushName")
        public String pushName;

        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("DockerfileName")
        public String dockerfileName;

        public static ListRepoBuildRuleResponseBodyBuildRules build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRuleResponseBodyBuildRules self = new ListRepoBuildRuleResponseBodyBuildRules();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRuleResponseBodyBuildRules setDockerfileLocation(String dockerfileLocation) {
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }
        public String getDockerfileLocation() {
            return this.dockerfileLocation;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setBuildRuleId(String buildRuleId) {
            this.buildRuleId = buildRuleId;
            return this;
        }
        public String getBuildRuleId() {
            return this.buildRuleId;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setPushName(String pushName) {
            this.pushName = pushName;
            return this;
        }
        public String getPushName() {
            return this.pushName;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setDockerfileName(String dockerfileName) {
            this.dockerfileName = dockerfileName;
            return this;
        }
        public String getDockerfileName() {
            return this.dockerfileName;
        }

    }

}
