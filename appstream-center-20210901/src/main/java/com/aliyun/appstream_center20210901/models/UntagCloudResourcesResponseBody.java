// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UntagCloudResourcesResponseBody extends TeaModel {
    /**
     * <p>The cloud resources whose tags failed to be removed and the corresponding tags.</p>
     */
    @NameInMap("FailedResources")
    public java.util.List<UntagCloudResourcesResponseBodyFailedResources> failedResources;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E25FC620-6B6F-12D2-A992-AD8727DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagCloudResourcesResponseBody self = new UntagCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagCloudResourcesResponseBody setFailedResources(java.util.List<UntagCloudResourcesResponseBodyFailedResources> failedResources) {
        this.failedResources = failedResources;
        return this;
    }
    public java.util.List<UntagCloudResourcesResponseBodyFailedResources> getFailedResources() {
        return this.failedResources;
    }

    public UntagCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UntagCloudResourcesResponseBodyFailedResourcesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Custom: custom tag.</li>
         * <li>System: system tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static UntagCloudResourcesResponseBodyFailedResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            UntagCloudResourcesResponseBodyFailedResourcesTags self = new UntagCloudResourcesResponseBodyFailedResourcesTags();
            return TeaModel.build(map, self);
        }

        public UntagCloudResourcesResponseBodyFailedResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UntagCloudResourcesResponseBodyFailedResourcesTags setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class UntagCloudResourcesResponseBodyFailedResources extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UNTAG_RESOURCE_FAILED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to untag resource.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The resource IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-00000001</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the cloud resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AppId: app ID.</li>
         * <li>WyId: Alibaba Cloud Workspace user ID.</li>
         * <li>AppInstanceGroupId: delivery group ID.</li>
         * <li>AliUid: tenant ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroupId</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags that failed to be removed from the cloud resources.</p>
         */
        @NameInMap("Tags")
        public java.util.List<UntagCloudResourcesResponseBodyFailedResourcesTags> tags;

        public static UntagCloudResourcesResponseBodyFailedResources build(java.util.Map<String, ?> map) throws Exception {
            UntagCloudResourcesResponseBodyFailedResources self = new UntagCloudResourcesResponseBodyFailedResources();
            return TeaModel.build(map, self);
        }

        public UntagCloudResourcesResponseBodyFailedResources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UntagCloudResourcesResponseBodyFailedResources setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UntagCloudResourcesResponseBodyFailedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UntagCloudResourcesResponseBodyFailedResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public UntagCloudResourcesResponseBodyFailedResources setTags(java.util.List<UntagCloudResourcesResponseBodyFailedResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<UntagCloudResourcesResponseBodyFailedResourcesTags> getTags() {
            return this.tags;
        }

    }

}
