// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeConnectorAttributeResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Category")
    public String category;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Capabilities")
    public DescribeConnectorAttributeResponseBodyCapabilities capabilities;

    @NameInMap("FullName")
    public String fullName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Icon")
    public DescribeConnectorAttributeResponseBodyIcon icon;

    @NameInMap("BrandColor")
    public String brandColor;

    @NameInMap("StepResult")
    public DescribeConnectorAttributeResponseBodyStepResult stepResult;

    @NameInMap("Name")
    public String name;

    @NameInMap("ConnectorId")
    public String connectorId;

    public static DescribeConnectorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectorAttributeResponseBody self = new DescribeConnectorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConnectorAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeConnectorAttributeResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeConnectorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConnectorAttributeResponseBody setCapabilities(DescribeConnectorAttributeResponseBodyCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public DescribeConnectorAttributeResponseBodyCapabilities getCapabilities() {
        return this.capabilities;
    }

    public DescribeConnectorAttributeResponseBody setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public DescribeConnectorAttributeResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DescribeConnectorAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeConnectorAttributeResponseBody setIcon(DescribeConnectorAttributeResponseBodyIcon icon) {
        this.icon = icon;
        return this;
    }
    public DescribeConnectorAttributeResponseBodyIcon getIcon() {
        return this.icon;
    }

    public DescribeConnectorAttributeResponseBody setBrandColor(String brandColor) {
        this.brandColor = brandColor;
        return this;
    }
    public String getBrandColor() {
        return this.brandColor;
    }

    public DescribeConnectorAttributeResponseBody setStepResult(DescribeConnectorAttributeResponseBodyStepResult stepResult) {
        this.stepResult = stepResult;
        return this;
    }
    public DescribeConnectorAttributeResponseBodyStepResult getStepResult() {
        return this.stepResult;
    }

    public DescribeConnectorAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeConnectorAttributeResponseBody setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public static class DescribeConnectorAttributeResponseBodyCapabilitiesActions extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocumentUrl")
        public String documentUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("System")
        public Boolean system;

        @NameInMap("DefaultActionName")
        public String defaultActionName;

        public static DescribeConnectorAttributeResponseBodyCapabilitiesActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorAttributeResponseBodyCapabilitiesActions self = new DescribeConnectorAttributeResponseBodyCapabilitiesActions();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setDocumentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesActions setDefaultActionName(String defaultActionName) {
            this.defaultActionName = defaultActionName;
            return this;
        }
        public String getDefaultActionName() {
            return this.defaultActionName;
        }

    }

    public static class DescribeConnectorAttributeResponseBodyCapabilitiesTriggers extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocumentUrl")
        public String documentUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("System")
        public Boolean system;

        public static DescribeConnectorAttributeResponseBodyCapabilitiesTriggers build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorAttributeResponseBodyCapabilitiesTriggers self = new DescribeConnectorAttributeResponseBodyCapabilitiesTriggers();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setDocumentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConnectorAttributeResponseBodyCapabilitiesTriggers setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

    }

    public static class DescribeConnectorAttributeResponseBodyCapabilities extends TeaModel {
        @NameInMap("Actions")
        public java.util.List<DescribeConnectorAttributeResponseBodyCapabilitiesActions> actions;

        @NameInMap("Triggers")
        public java.util.List<DescribeConnectorAttributeResponseBodyCapabilitiesTriggers> triggers;

        public static DescribeConnectorAttributeResponseBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorAttributeResponseBodyCapabilities self = new DescribeConnectorAttributeResponseBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorAttributeResponseBodyCapabilities setActions(java.util.List<DescribeConnectorAttributeResponseBodyCapabilitiesActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<DescribeConnectorAttributeResponseBodyCapabilitiesActions> getActions() {
            return this.actions;
        }

        public DescribeConnectorAttributeResponseBodyCapabilities setTriggers(java.util.List<DescribeConnectorAttributeResponseBodyCapabilitiesTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<DescribeConnectorAttributeResponseBodyCapabilitiesTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class DescribeConnectorAttributeResponseBodyIcon extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeConnectorAttributeResponseBodyIcon build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorAttributeResponseBodyIcon self = new DescribeConnectorAttributeResponseBodyIcon();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorAttributeResponseBodyIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorAttributeResponseBodyIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeConnectorAttributeResponseBodyStepResult extends TeaModel {
        @NameInMap("HasNext")
        public Boolean hasNext;

        public static DescribeConnectorAttributeResponseBodyStepResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorAttributeResponseBodyStepResult self = new DescribeConnectorAttributeResponseBodyStepResult();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorAttributeResponseBodyStepResult setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

    }

}
