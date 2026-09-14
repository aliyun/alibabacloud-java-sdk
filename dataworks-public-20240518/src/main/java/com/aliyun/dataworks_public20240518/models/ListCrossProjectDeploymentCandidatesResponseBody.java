// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectDeploymentCandidatesResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PageNumber&quot;:1,&quot;PageSize&quot;:10,&quot;TotalCount&quot;:1,&quot;DeploymentCandidates&quot;:[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;CommitUser&quot;:&quot;operator&quot;,&quot;CommitTime&quot;:1788739200000}]}</p>
     */
    @NameInMap("Data")
    public ListCrossProjectDeploymentCandidatesResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCrossProjectDeploymentCandidatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectDeploymentCandidatesResponseBody self = new ListCrossProjectDeploymentCandidatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectDeploymentCandidatesResponseBody setData(ListCrossProjectDeploymentCandidatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCrossProjectDeploymentCandidatesResponseBodyData getData() {
        return this.data;
    }

    public ListCrossProjectDeploymentCandidatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrossProjectDeploymentCandidatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates extends TeaModel {
        /**
         * <p>The change type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The commit time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739200000</p>
         */
        @NameInMap("CommitTime")
        public Long commitTime;

        /**
         * <p>The committer.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <p>The candidate object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The candidate object name.</p>
         * 
         * <strong>example:</strong>
         * <p>object-1</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The candidate object type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The candidate object version.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        public static ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates build(java.util.Map<String, ?> map) throws Exception {
            ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates self = new ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates();
            return TeaModel.build(map, self);
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

    }

    public static class ListCrossProjectDeploymentCandidatesResponseBodyData extends TeaModel {
        /**
         * <p>The list of candidate objects from the source workspace that are available for cross-workspace deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;CommitUser&quot;:&quot;operator&quot;,&quot;CommitTime&quot;:1788739200000}]</p>
         */
        @NameInMap("DeploymentCandidates")
        public java.util.List<ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates> deploymentCandidates;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCrossProjectDeploymentCandidatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCrossProjectDeploymentCandidatesResponseBodyData self = new ListCrossProjectDeploymentCandidatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyData setDeploymentCandidates(java.util.List<ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates> deploymentCandidates) {
            this.deploymentCandidates = deploymentCandidates;
            return this;
        }
        public java.util.List<ListCrossProjectDeploymentCandidatesResponseBodyDataDeploymentCandidates> getDeploymentCandidates() {
            return this.deploymentCandidates;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListCrossProjectDeploymentCandidatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
