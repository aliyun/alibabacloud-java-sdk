// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDAGVersionsResponseBody extends TeaModel {
    /**
     * <p>The information about the published versions.</p>
     */
    @NameInMap("DagVersionList")
    public ListDAGVersionsResponseBodyDagVersionList dagVersionList;

    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The name of the task flow.</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The ID of the task flow owner.</p>
         */
        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        /**
         * <p>The name of the task flow owner.</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        /**
         * <p>The ID of the previously published version.</p>
         */
        @NameInMap("LastVersionId")
        public Long lastVersionId;

        /**
         * <p>The description of the version.</p>
         */
        @NameInMap("VersionComments")
        public String versionComments;

        /**
         * <p>The ID of the version.</p>
         */
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
