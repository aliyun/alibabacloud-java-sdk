// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PutWorkspaceRequest extends TeaModel {
    /**
     * <p>The workspace description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Simple Log Service project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-project-test-001</p>
     */
    @NameInMap("slsProject")
    public String slsProject;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<PutWorkspaceRequestTags> tags;

    public static PutWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        PutWorkspaceRequest self = new PutWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public PutWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public PutWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public PutWorkspaceRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public PutWorkspaceRequest setTags(java.util.List<PutWorkspaceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<PutWorkspaceRequestTags> getTags() {
        return this.tags;
    }

    public static class PutWorkspaceRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("value")
        public String value;

        public static PutWorkspaceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            PutWorkspaceRequestTags self = new PutWorkspaceRequestTags();
            return TeaModel.build(map, self);
        }

        public PutWorkspaceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutWorkspaceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
