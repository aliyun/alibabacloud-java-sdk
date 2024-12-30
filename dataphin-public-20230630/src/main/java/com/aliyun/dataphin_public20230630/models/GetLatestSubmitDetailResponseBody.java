// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLatestSubmitDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubmitDetailResult")
    public GetLatestSubmitDetailResponseBodySubmitDetailResult submitDetailResult;

    @NameInMap("Success")
    public Boolean success;

    public static GetLatestSubmitDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestSubmitDetailResponseBody self = new GetLatestSubmitDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestSubmitDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLatestSubmitDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLatestSubmitDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLatestSubmitDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLatestSubmitDetailResponseBody setSubmitDetailResult(GetLatestSubmitDetailResponseBodySubmitDetailResult submitDetailResult) {
        this.submitDetailResult = submitDetailResult;
        return this;
    }
    public GetLatestSubmitDetailResponseBodySubmitDetailResult getSubmitDetailResult() {
        return this.submitDetailResult;
    }

    public GetLatestSubmitDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE_SQL</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        public static GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject build(java.util.Map<String, ?> map) throws Exception {
            GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject self = new GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject();
            return TeaModel.build(map, self);
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <strong>example:</strong>
         * <p>n_1234</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>提交说明</p>
         */
        @NameInMap("SubmitComment")
        public String submitComment;

        @NameInMap("SubmitObject")
        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject submitObject;

        public static GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject build(java.util.Map<String, ?> map) throws Exception {
            GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject self = new GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject();
            return TeaModel.build(map, self);
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject setSubmitComment(String submitComment) {
            this.submitComment = submitComment;
            return this;
        }
        public String getSubmitComment() {
            return this.submitComment;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject setSubmitObject(GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject submitObject) {
            this.submitObject = submitObject;
            return this;
        }
        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObjectSubmitObject getSubmitObject() {
            return this.submitObject;
        }

    }

    public static class GetLatestSubmitDetailResponseBodySubmitDetailResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("ReleaseObject")
        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject releaseObject;

        /**
         * <strong>example:</strong>
         * <p>TO_BE_PUBLISHED</p>
         */
        @NameInMap("SubmitStatus")
        public String submitStatus;

        /**
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static GetLatestSubmitDetailResponseBodySubmitDetailResult build(java.util.Map<String, ?> map) throws Exception {
            GetLatestSubmitDetailResponseBodySubmitDetailResult self = new GetLatestSubmitDetailResponseBodySubmitDetailResult();
            return TeaModel.build(map, self);
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResult setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResult setReleaseObject(GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject releaseObject) {
            this.releaseObject = releaseObject;
            return this;
        }
        public GetLatestSubmitDetailResponseBodySubmitDetailResultReleaseObject getReleaseObject() {
            return this.releaseObject;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResult setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public GetLatestSubmitDetailResponseBodySubmitDetailResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
