// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The information about the workspace.</p>
     */
    @NameInMap("Project")
    public GetProjectResponseBodyProject project;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setProject(GetProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public GetProjectResponseBodyProject getProject() {
        return this.project;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectResponseBodyProjectAliyunResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>batch</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>blue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetProjectResponseBodyProjectAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyProjectAliyunResourceTags self = new GetProjectResponseBodyProjectAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyProjectAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProjectResponseBodyProjectAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProjectResponseBodyProject extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud resource group to which the workspace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzbn7pti3zfa</p>
         */
        @NameInMap("AliyunResourceGroupId")
        public String aliyunResourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("AliyunResourceTags")
        public java.util.List<GetProjectResponseBodyProjectAliyunResourceTags> aliyunResourceTags;

        /**
         * <p>The description of the workspace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the development environment is enabled. Valid values:</p>
         * <ul>
         * <li>true: The development environment is enabled. In this case, the development environment is isolated from the production environment in the workspace.</li>
         * <li>false: The development environment is disabled. In this case, only the production environment is used in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DevEnvironmentEnabled")
        public Boolean devEnvironmentEnabled;

        /**
         * <p>Indicates whether the Develop role is disabled. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DevRoleDisabled")
        public Boolean devRoleDisabled;

        /**
         * <p>The display name of the workspace.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28477242</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>sora_finance</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account to which the workspace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>207947397706614299</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>Indicates whether scheduling of Platform for AI (PAI) tasks is enabled. Valid values:</p>
         * <ul>
         * <li>true: Scheduling of PAI tasks is enabled. In this case, you can create a PAI node in a DataWorks workspace and configure scheduling properties for the node to implement periodic scheduling of PAI tasks.</li>
         * <li>false: Scheduling of PAI tasks is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PaiTaskEnabled")
        public Boolean paiTaskEnabled;

        /**
         * <p>The status of the workspace. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Initializing</li>
         * <li>InitFailed</li>
         * <li>Forbidden</li>
         * <li>Deleting</li>
         * <li>DeleteFailed</li>
         * <li>Frozen</li>
         * <li>Updating</li>
         * <li>UpdateFailed</li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyProject self = new GetProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyProject setAliyunResourceGroupId(String aliyunResourceGroupId) {
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        public GetProjectResponseBodyProject setAliyunResourceTags(java.util.List<GetProjectResponseBodyProjectAliyunResourceTags> aliyunResourceTags) {
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }
        public java.util.List<GetProjectResponseBodyProjectAliyunResourceTags> getAliyunResourceTags() {
            return this.aliyunResourceTags;
        }

        public GetProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectResponseBodyProject setDevEnvironmentEnabled(Boolean devEnvironmentEnabled) {
            this.devEnvironmentEnabled = devEnvironmentEnabled;
            return this;
        }
        public Boolean getDevEnvironmentEnabled() {
            return this.devEnvironmentEnabled;
        }

        public GetProjectResponseBodyProject setDevRoleDisabled(Boolean devRoleDisabled) {
            this.devRoleDisabled = devRoleDisabled;
            return this;
        }
        public Boolean getDevRoleDisabled() {
            return this.devRoleDisabled;
        }

        public GetProjectResponseBodyProject setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetProjectResponseBodyProject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProjectResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectResponseBodyProject setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetProjectResponseBodyProject setPaiTaskEnabled(Boolean paiTaskEnabled) {
            this.paiTaskEnabled = paiTaskEnabled;
            return this;
        }
        public Boolean getPaiTaskEnabled() {
            return this.paiTaskEnabled;
        }

        public GetProjectResponseBodyProject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
