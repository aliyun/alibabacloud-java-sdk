// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagCloudResourcesResponseBody extends TeaModel {
    @NameInMap("FailedResources")
    public java.util.List<TagCloudResourcesResponseBodyFailedResources> failedResources;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagCloudResourcesResponseBody self = new TagCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagCloudResourcesResponseBody setFailedResources(java.util.List<TagCloudResourcesResponseBodyFailedResources> failedResources) {
        this.failedResources = failedResources;
        return this;
    }
    public java.util.List<TagCloudResourcesResponseBodyFailedResources> getFailedResources() {
        return this.failedResources;
    }

    public TagCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TagCloudResourcesResponseBodyFailedResourcesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>System/Scheduler/STOP_NEW_USER_CONNECTION</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagCloudResourcesResponseBodyFailedResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            TagCloudResourcesResponseBodyFailedResourcesTags self = new TagCloudResourcesResponseBodyFailedResourcesTags();
            return TeaModel.build(map, self);
        }

        public TagCloudResourcesResponseBodyFailedResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagCloudResourcesResponseBodyFailedResourcesTags setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public TagCloudResourcesResponseBodyFailedResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TagCloudResourcesResponseBodyFailedResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TAG_KEY_DUPLICATED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>Duplicate tag keys exist.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>aig-001</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>AppInstanceGroupId</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tags")
        public java.util.List<TagCloudResourcesResponseBodyFailedResourcesTags> tags;

        public static TagCloudResourcesResponseBodyFailedResources build(java.util.Map<String, ?> map) throws Exception {
            TagCloudResourcesResponseBodyFailedResources self = new TagCloudResourcesResponseBodyFailedResources();
            return TeaModel.build(map, self);
        }

        public TagCloudResourcesResponseBodyFailedResources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TagCloudResourcesResponseBodyFailedResources setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TagCloudResourcesResponseBodyFailedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public TagCloudResourcesResponseBodyFailedResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public TagCloudResourcesResponseBodyFailedResources setTags(java.util.List<TagCloudResourcesResponseBodyFailedResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<TagCloudResourcesResponseBodyFailedResourcesTags> getTags() {
            return this.tags;
        }

    }

}
