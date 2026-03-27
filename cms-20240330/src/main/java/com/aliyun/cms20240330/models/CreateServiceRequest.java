// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    /**
     * <p>Extended attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;language&quot;:&quot;java&quot;}</p>
     */
    @NameInMap("attributes")
    public String attributes;

    /**
     * <p>Service description, only valid when <code>serviceType=RUM</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>mag测试应用</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Display name, only valid when <code>serviceType=RUM</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>mag测试应用</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Application ID, generally not required to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>bx3udsi5ie@ed2ba6beebdb6de</p>
     */
    @NameInMap("pid")
    public String pid;

    /**
     * <strong>example:</strong>
     * <p>rg-xxekxxzuad5zzzz</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Service name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mag_test</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>Service status, not required for service creation.</p>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("serviceStatus")
    public String serviceStatus;

    /**
     * <p>Service type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    @NameInMap("tags")
    public java.util.List<CreateServiceRequestTags> tags;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public CreateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateServiceRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public CreateServiceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateServiceRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public CreateServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateServiceRequest setTags(java.util.List<CreateServiceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateServiceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateServiceRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateServiceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestTags self = new CreateServiceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
