// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListConnectorsResponseBody extends TeaModel {
    @NameInMap("Connectors")
    public java.util.List<ListConnectorsResponseBodyConnectors> connectors;

    @NameInMap("RequestId")
    public String requestId;

    public static ListConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponseBody self = new ListConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponseBody setConnectors(java.util.List<ListConnectorsResponseBodyConnectors> connectors) {
        this.connectors = connectors;
        return this;
    }
    public java.util.List<ListConnectorsResponseBodyConnectors> getConnectors() {
        return this.connectors;
    }

    public ListConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConnectorsResponseBodyConnectorsIcon extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListConnectorsResponseBodyConnectorsIcon build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsIcon self = new ListConnectorsResponseBodyConnectorsIcon();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConnectorsResponseBodyConnectorsIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectorsResponseBodyConnectorsConnectionParameters extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static ListConnectorsResponseBodyConnectorsConnectionParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsConnectionParameters self = new ListConnectorsResponseBodyConnectorsConnectionParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsConnectionParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListConnectorsResponseBodyConnectors extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Capabilities")
        public java.util.List<String> capabilities;

        @NameInMap("ParentConnector")
        public String parentConnector;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("Icon")
        public ListConnectorsResponseBodyConnectorsIcon icon;

        @NameInMap("ConnectorId")
        public String connectorId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("BrandColor")
        public String brandColor;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConnectionParameters")
        public ListConnectorsResponseBodyConnectorsConnectionParameters connectionParameters;

        @NameInMap("Name")
        public String name;

        public static ListConnectorsResponseBodyConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectors self = new ListConnectorsResponseBodyConnectors();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectors setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListConnectorsResponseBodyConnectors setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public ListConnectorsResponseBodyConnectors setParentConnector(String parentConnector) {
            this.parentConnector = parentConnector;
            return this;
        }
        public String getParentConnector() {
            return this.parentConnector;
        }

        public ListConnectorsResponseBodyConnectors setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ListConnectorsResponseBodyConnectors setIcon(ListConnectorsResponseBodyConnectorsIcon icon) {
            this.icon = icon;
            return this;
        }
        public ListConnectorsResponseBodyConnectorsIcon getIcon() {
            return this.icon;
        }

        public ListConnectorsResponseBodyConnectors setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public ListConnectorsResponseBodyConnectors setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConnectorsResponseBodyConnectors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectorsResponseBodyConnectors setBrandColor(String brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        public String getBrandColor() {
            return this.brandColor;
        }

        public ListConnectorsResponseBodyConnectors setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListConnectorsResponseBodyConnectors setConnectionParameters(ListConnectorsResponseBodyConnectorsConnectionParameters connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }
        public ListConnectorsResponseBodyConnectorsConnectionParameters getConnectionParameters() {
            return this.connectionParameters;
        }

        public ListConnectorsResponseBodyConnectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
