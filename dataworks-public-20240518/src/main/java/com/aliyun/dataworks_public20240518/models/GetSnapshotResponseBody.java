// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSnapshotResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115-1234-5678-ABCD-159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The snapshot.</p>
     */
    @NameInMap("Snapshot")
    public GetSnapshotResponseBodySnapshot snapshot;

    public static GetSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotResponseBody self = new GetSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSnapshotResponseBody setSnapshot(GetSnapshotResponseBodySnapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public GetSnapshotResponseBodySnapshot getSnapshot() {
        return this.snapshot;
    }

    public static class GetSnapshotResponseBodySnapshotContent extends TeaModel {
        /**
         * <p>The node script content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT 1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>FlowSpec JSON</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;version&quot;:&quot;1.1.0&quot;}</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The stage code.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("StageCode")
        public String stageCode;

        public static GetSnapshotResponseBodySnapshotContent build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotResponseBodySnapshotContent self = new GetSnapshotResponseBodySnapshotContent();
            return TeaModel.build(map, self);
        }

        public GetSnapshotResponseBodySnapshotContent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSnapshotResponseBodySnapshotContent setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetSnapshotResponseBodySnapshotContent setStageCode(String stageCode) {
            this.stageCode = stageCode;
            return this;
        }
        public String getStageCode() {
            return this.stageCode;
        }

    }

    public static class GetSnapshotResponseBodySnapshot extends TeaModel {
        /**
         * <p>The submit comment.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The structured snapshot content. This parameter is mutually exclusive with ContentUrl.</p>
         */
        @NameInMap("Content")
        public GetSnapshotResponseBodySnapshotContent content;

        /**
         * <p>The OSS pre-signed download URL. This parameter is mutually exclusive with Content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss.example.com/presigned">https://oss.example.com/presigned</a></p>
         */
        @NameInMap("ContentUrl")
        public String contentUrl;

        /**
         * <p>The snapshot creation time in millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782370983000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The employee ID of the submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>209508679263509059</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The unique ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>8b723a9e8bd443af920b77e39aeb4f63</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1389623</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The unique ID of the object to which the snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>8467231038932407294</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The snapshot type.</p>
         * 
         * <strong>example:</strong>
         * <p>Saved</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetSnapshotResponseBodySnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotResponseBodySnapshot self = new GetSnapshotResponseBodySnapshot();
            return TeaModel.build(map, self);
        }

        public GetSnapshotResponseBodySnapshot setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetSnapshotResponseBodySnapshot setContent(GetSnapshotResponseBodySnapshotContent content) {
            this.content = content;
            return this;
        }
        public GetSnapshotResponseBodySnapshotContent getContent() {
            return this.content;
        }

        public GetSnapshotResponseBodySnapshot setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }
        public String getContentUrl() {
            return this.contentUrl;
        }

        public GetSnapshotResponseBodySnapshot setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetSnapshotResponseBodySnapshot setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetSnapshotResponseBodySnapshot setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSnapshotResponseBodySnapshot setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetSnapshotResponseBodySnapshot setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetSnapshotResponseBodySnapshot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSnapshotResponseBodySnapshot setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
