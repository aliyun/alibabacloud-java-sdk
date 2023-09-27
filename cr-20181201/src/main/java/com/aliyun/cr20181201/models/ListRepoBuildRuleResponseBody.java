// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRuleResponseBody extends TeaModel {
    /**
     * <p>The list of image building rules.</p>
     */
    @NameInMap("BuildRules")
    public java.util.List<ListRepoBuildRuleResponseBodyBuildRules> buildRules;

    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request is successful.</p>
     * <p>*   `false`: The request fails.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepoBuildRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRuleResponseBody self = new ListRepoBuildRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRuleResponseBody setBuildRules(java.util.List<ListRepoBuildRuleResponseBodyBuildRules> buildRules) {
        this.buildRules = buildRules;
        return this;
    }
    public java.util.List<ListRepoBuildRuleResponseBodyBuildRules> getBuildRules() {
        return this.buildRules;
    }

    public ListRepoBuildRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoBuildRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoBuildRuleResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoBuildRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoBuildRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoBuildRuleResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoBuildRuleResponseBodyBuildRules extends TeaModel {
        @NameInMap("BuildArgs")
        public java.util.List<String> buildArgs;

        /**
         * <p>The ID of the image building rule.</p>
         */
        @NameInMap("BuildRuleId")
        public String buildRuleId;

        /**
         * <p>The directory of the Dockerfile.</p>
         */
        @NameInMap("DockerfileLocation")
        public String dockerfileLocation;

        /**
         * <p>The name of the Dockerfile.</p>
         */
        @NameInMap("DockerfileName")
        public String dockerfileName;

        /**
         * <p>The tag of the image.</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("Platforms")
        public java.util.List<String> platforms;

        /**
         * <p>The name of the push that triggers the building rule.</p>
         */
        @NameInMap("PushName")
        public String pushName;

        /**
         * <p>The type of the push that triggers the image building rule. Valid values:</p>
         * <br>
         * <p>*   GIT_BRANCH: branch push</p>
         * <p>*   GIT_TAG: tag push</p>
         */
        @NameInMap("PushType")
        public String pushType;

        public static ListRepoBuildRuleResponseBodyBuildRules build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRuleResponseBodyBuildRules self = new ListRepoBuildRuleResponseBodyBuildRules();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRuleResponseBodyBuildRules setBuildArgs(java.util.List<String> buildArgs) {
            this.buildArgs = buildArgs;
            return this;
        }
        public java.util.List<String> getBuildArgs() {
            return this.buildArgs;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setBuildRuleId(String buildRuleId) {
            this.buildRuleId = buildRuleId;
            return this;
        }
        public String getBuildRuleId() {
            return this.buildRuleId;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setDockerfileLocation(String dockerfileLocation) {
            this.dockerfileLocation = dockerfileLocation;
            return this;
        }
        public String getDockerfileLocation() {
            return this.dockerfileLocation;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setDockerfileName(String dockerfileName) {
            this.dockerfileName = dockerfileName;
            return this;
        }
        public String getDockerfileName() {
            return this.dockerfileName;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setPlatforms(java.util.List<String> platforms) {
            this.platforms = platforms;
            return this;
        }
        public java.util.List<String> getPlatforms() {
            return this.platforms;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setPushName(String pushName) {
            this.pushName = pushName;
            return this;
        }
        public String getPushName() {
            return this.pushName;
        }

        public ListRepoBuildRuleResponseBodyBuildRules setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

    }

}
