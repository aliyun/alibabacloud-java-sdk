// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListAppReleaseStageExecutionIntegratedMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> body;

    public static ListAppReleaseStageExecutionIntegratedMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppReleaseStageExecutionIntegratedMetadataResponse self = new ListAppReleaseStageExecutionIntegratedMetadataResponse();
        return TeaModel.build(map, self);
    }

    public ListAppReleaseStageExecutionIntegratedMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppReleaseStageExecutionIntegratedMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppReleaseStageExecutionIntegratedMetadataResponse setBody(java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> getBody() {
        return this.body;
    }

    public static class ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fcd37726a6f84c60b7eb9c5856007c2f</p>
         */
        @NameInMap("sn")
        public String sn;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>feature/20240625</p>
         */
        @NameInMap("branchName")
        public String branchName;

        /**
         * <strong>example:</strong>
         * <p>a66cfa8c6869b96bb7d111ba2144c9c764d556b7</p>
         */
        @NameInMap("commitId")
        public String commitId;

        /**
         * <strong>example:</strong>
         * <p>262579140573491041</p>
         */
        @NameInMap("ownerAccountId")
        public String ownerAccountId;

        public static ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests build(java.util.Map<String, ?> map) throws Exception {
            ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests self = new ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests();
            return TeaModel.build(map, self);
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests setOwnerAccountId(String ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public String getOwnerAccountId() {
            return this.ownerAccountId;
        }

    }

    public static class ListAppReleaseStageExecutionIntegratedMetadataResponseBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>release/20240625-152603220321211_release_3252057_1</p>
         */
        @NameInMap("releaseBranch")
        public String releaseBranch;

        /**
         * <strong>example:</strong>
         * <p>a66cfa8c6869b96bb7d111ba2144c9c764d556b7</p>
         */
        @NameInMap("releaseRevision")
        public String releaseRevision;

        /**
         * <strong>example:</strong>
         * <p><a href="https://codeup.aliyun.com/60d54f3daccf2bbd6659f3ad/auto-test.git">https://codeup.aliyun.com/60d54f3daccf2bbd6659f3ad/auto-test.git</a></p>
         */
        @NameInMap("repoUrl")
        public String repoUrl;

        /**
         * <strong>example:</strong>
         * <p>CODEUP</p>
         */
        @NameInMap("repoType")
        public String repoType;

        @NameInMap("changeRequests")
        public java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests> changeRequests;

        public static ListAppReleaseStageExecutionIntegratedMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
            ListAppReleaseStageExecutionIntegratedMetadataResponseBody self = new ListAppReleaseStageExecutionIntegratedMetadataResponseBody();
            return TeaModel.build(map, self);
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBody setReleaseBranch(String releaseBranch) {
            this.releaseBranch = releaseBranch;
            return this;
        }
        public String getReleaseBranch() {
            return this.releaseBranch;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBody setReleaseRevision(String releaseRevision) {
            this.releaseRevision = releaseRevision;
            return this;
        }
        public String getReleaseRevision() {
            return this.releaseRevision;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBody setRepoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }
        public String getRepoUrl() {
            return this.repoUrl;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBody setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListAppReleaseStageExecutionIntegratedMetadataResponseBody setChangeRequests(java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests> changeRequests) {
            this.changeRequests = changeRequests;
            return this;
        }
        public java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBodyChangeRequests> getChangeRequests() {
            return this.changeRequests;
        }

    }

}
