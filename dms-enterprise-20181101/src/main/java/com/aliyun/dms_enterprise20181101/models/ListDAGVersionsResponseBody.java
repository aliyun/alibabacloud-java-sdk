// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDAGVersionsResponseBody extends TeaModel {
    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("DagVersionList")
    public ListDAGVersionsResponseBodyDagVersionList dagVersionList;

    /**
     * <p>The information about the published versions.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The operation that you want to perform. Set the value to **ListDAGVersions**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the version.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the ID of the task flow.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDAGVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDAGVersionsResponseBody self = new ListDAGVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDAGVersionsResponseBody setDagVersionList(ListDAGVersionsResponseBodyDagVersionList dagVersionList) {
        this.dagVersionList = dagVersionList;
        return this;
    }
    public ListDAGVersionsResponseBodyDagVersionList getDagVersionList() {
        return this.dagVersionList;
    }

    public ListDAGVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDAGVersionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDAGVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDAGVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDAGVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDAGVersionsResponseBodyDagVersionListDagVersion extends TeaModel {
        /**
         * <p>The name of the task flow owner.</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The name of the task flow.</p>
         */
        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        @NameInMap("LastVersionId")
        public Long lastVersionId;

        @NameInMap("VersionComments")
        public String versionComments;

        @NameInMap("VersionId")
        public Long versionId;

        public static ListDAGVersionsResponseBodyDagVersionListDagVersion build(java.util.Map<String, ?> map) throws Exception {
            ListDAGVersionsResponseBodyDagVersionListDagVersion self = new ListDAGVersionsResponseBodyDagVersionListDagVersion();
            return TeaModel.build(map, self);
        }

        public ListDAGVersionsResponseBodyDagVersionListDagVersion setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public ListDAGVersionsResponseBodyDagVersionListDagVersion setDagOwnerId(String dagOwnerId) {
            this.dagOwnerId = dagOwnerId;
            return this;
        }
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        public ListDAGVersionsResponseBodyDagVersionListDagVersion setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListDAGVersionsResponseBodyDagVersionListDagVersion setLastVersionId(Long lastVersionId) {
            this.lastVersionId = lastVersionId;
            return this;
        }
        public Long getLastVersionId() {
            return this.lastVersionId;
        }

        public ListDAGVersionsResponseBodyDagVersionListDagVersion setVersionComments(String versionComments) {
            this.versionComments = versionComments;
            return this;
        }
        public String getVersionComments() {
            return this.versionComments;
        }

        public ListDAGVersionsResponseBodyDagVersionListDagVersion setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

    public static class ListDAGVersionsResponseBodyDagVersionList extends TeaModel {
        @NameInMap("DagVersion")
        public java.util.List<ListDAGVersionsResponseBodyDagVersionListDagVersion> dagVersion;

        public static ListDAGVersionsResponseBodyDagVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListDAGVersionsResponseBodyDagVersionList self = new ListDAGVersionsResponseBodyDagVersionList();
            return TeaModel.build(map, self);
        }

        public ListDAGVersionsResponseBodyDagVersionList setDagVersion(java.util.List<ListDAGVersionsResponseBodyDagVersionListDagVersion> dagVersion) {
            this.dagVersion = dagVersion;
            return this;
        }
        public java.util.List<ListDAGVersionsResponseBodyDagVersionListDagVersion> getDagVersion() {
            return this.dagVersion;
        }

    }

}
