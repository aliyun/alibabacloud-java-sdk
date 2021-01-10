// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListConnectorTriggersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Triggers")
    public java.util.List<ListConnectorTriggersResponseBodyTriggers> triggers;

    public static ListConnectorTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorTriggersResponseBody self = new ListConnectorTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorTriggersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectorTriggersResponseBody setTriggers(java.util.List<ListConnectorTriggersResponseBodyTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<ListConnectorTriggersResponseBodyTriggers> getTriggers() {
        return this.triggers;
    }

    public static class ListConnectorTriggersResponseBodyTriggersConnectorIcon extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListConnectorTriggersResponseBodyTriggersConnectorIcon build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorTriggersResponseBodyTriggersConnectorIcon self = new ListConnectorTriggersResponseBodyTriggersConnectorIcon();
            return TeaModel.build(map, self);
        }

        public ListConnectorTriggersResponseBodyTriggersConnectorIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConnectorTriggersResponseBodyTriggersConnectorIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectorTriggersResponseBodyTriggersConnector extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("BrandColor")
        public String brandColor;

        @NameInMap("Icon")
        public ListConnectorTriggersResponseBodyTriggersConnectorIcon icon;

        @NameInMap("Category")
        public String category;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        public static ListConnectorTriggersResponseBodyTriggersConnector build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorTriggersResponseBodyTriggersConnector self = new ListConnectorTriggersResponseBodyTriggersConnector();
            return TeaModel.build(map, self);
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setBrandColor(String brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        public String getBrandColor() {
            return this.brandColor;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setIcon(ListConnectorTriggersResponseBodyTriggersConnectorIcon icon) {
            this.icon = icon;
            return this;
        }
        public ListConnectorTriggersResponseBodyTriggersConnectorIcon getIcon() {
            return this.icon;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectorTriggersResponseBodyTriggersConnector setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListConnectorTriggersResponseBodyTriggers extends TeaModel {
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

        @NameInMap("Connector")
        public ListConnectorTriggersResponseBodyTriggersConnector connector;

        @NameInMap("Name")
        public String name;

        @NameInMap("System")
        public Boolean system;

        public static ListConnectorTriggersResponseBodyTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorTriggersResponseBodyTriggers self = new ListConnectorTriggersResponseBodyTriggers();
            return TeaModel.build(map, self);
        }

        public ListConnectorTriggersResponseBodyTriggers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListConnectorTriggersResponseBodyTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConnectorTriggersResponseBodyTriggers setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public ListConnectorTriggersResponseBodyTriggers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectorTriggersResponseBodyTriggers setDocumentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        public ListConnectorTriggersResponseBodyTriggers setConnector(ListConnectorTriggersResponseBodyTriggersConnector connector) {
            this.connector = connector;
            return this;
        }
        public ListConnectorTriggersResponseBodyTriggersConnector getConnector() {
            return this.connector;
        }

        public ListConnectorTriggersResponseBodyTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectorTriggersResponseBodyTriggers setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

    }

}
