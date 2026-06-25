// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    /**
     * <p>The visibility of the image. Valid values:</p>
     * <ul>
     * <li><p>PUBLIC: All members in the current workspace can perform operations on the image.</p>
     * </li>
     * <li><p>PRIVATE: Only the creator can perform operations on the image.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>NLP model compression training image</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the image was created. The time is in UTC and the format is ISO 8601.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the image was last modified. The time is in UTC and the format is ISO 8601.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The URL of the image, including the version number.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.******ession/nlp:gpu</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>A list of image labels. This is an array. Each item in the array contains a Key and a Value field.
     * Official images have the following label: the key is system.official and the value is true.</p>
     */
    @NameInMap("Labels")
    public java.util.List<GetImageResponseBodyLabels> labels;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>nlp-compression</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud account of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>15577******8921</p>
     */
    @NameInMap("ParentUserId")
    public String parentUserId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The size of the image in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The ID of the image source.</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the image source.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The UID of the user who created the image.</p>
     * 
     * <strong>example:</strong>
     * <p>15577******8921</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace to which the image belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>15945</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetImageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetImageResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetImageResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetImageResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageResponseBody setLabels(java.util.List<GetImageResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetImageResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetImageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetImageResponseBody setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public String getParentUserId() {
        return this.parentUserId;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetImageResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetImageResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetImageResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetImageResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetImageResponseBodyLabels extends TeaModel {
        /**
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetImageResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyLabels self = new GetImageResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetImageResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
