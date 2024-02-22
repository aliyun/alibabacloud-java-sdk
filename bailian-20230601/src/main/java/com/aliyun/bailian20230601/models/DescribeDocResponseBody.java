// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeDocResponseBody extends TeaModel {
    @NameInMap("DocId")
    public String docId;

    @NameInMap("FailReason")
    public String failReason;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public String size;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<DescribeDocResponseBodyTags> tags;

    @NameInMap("Type")
    public String type;

    @NameInMap("UploadTime")
    public String uploadTime;

    public static DescribeDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocResponseBody self = new DescribeDocResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocResponseBody setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public DescribeDocResponseBody setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public DescribeDocResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDocResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocResponseBody setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public DescribeDocResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDocResponseBody setTags(java.util.List<DescribeDocResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDocResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDocResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDocResponseBody setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public String getUploadTime() {
        return this.uploadTime;
    }

    public static class DescribeDocResponseBodyTags extends TeaModel {
        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagName")
        public String tagName;

        public static DescribeDocResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyTags self = new DescribeDocResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeDocResponseBodyTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
