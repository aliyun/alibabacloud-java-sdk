// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowConnectionsResponseBody extends TeaModel {
    @NameInMap("Connections")
    public java.util.List<ListFlowConnectionsResponseBodyConnections> connections;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFlowConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowConnectionsResponseBody self = new ListFlowConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowConnectionsResponseBody setConnections(java.util.List<ListFlowConnectionsResponseBodyConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<ListFlowConnectionsResponseBodyConnections> getConnections() {
        return this.connections;
    }

    public ListFlowConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowConnectionsResponseBodyConnectionsActions extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ActionName")
        public String actionName;

        public static ListFlowConnectionsResponseBodyConnectionsActions build(java.util.Map<String, ?> map) throws Exception {
            ListFlowConnectionsResponseBodyConnectionsActions self = new ListFlowConnectionsResponseBodyConnectionsActions();
            return TeaModel.build(map, self);
        }

        public ListFlowConnectionsResponseBodyConnectionsActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowConnectionsResponseBodyConnectionsActions setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

    }

    public static class ListFlowConnectionsResponseBodyConnectionsConnectorIcon extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListFlowConnectionsResponseBodyConnectionsConnectorIcon build(java.util.Map<String, ?> map) throws Exception {
            ListFlowConnectionsResponseBodyConnectionsConnectorIcon self = new ListFlowConnectionsResponseBodyConnectionsConnectorIcon();
            return TeaModel.build(map, self);
        }

        public ListFlowConnectionsResponseBodyConnectionsConnectorIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowConnectionsResponseBodyConnectionsConnectorIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters build(java.util.Map<String, ?> map) throws Exception {
            ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters self = new ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters();
            return TeaModel.build(map, self);
        }

        public ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFlowConnectionsResponseBodyConnectionsConnector extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("BrandColor")
        public String brandColor;

        @NameInMap("Icon")
        public ListFlowConnectionsResponseBodyConnectionsConnectorIcon icon;

        @NameInMap("Name")
        public String name;

        @NameInMap("ConnectionParameters")
        public ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters connectionParameters;

        public static ListFlowConnectionsResponseBodyConnectionsConnector build(java.util.Map<String, ?> map) throws Exception {
            ListFlowConnectionsResponseBodyConnectionsConnector self = new ListFlowConnectionsResponseBodyConnectionsConnector();
            return TeaModel.build(map, self);
        }

        public ListFlowConnectionsResponseBodyConnectionsConnector setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListFlowConnectionsResponseBodyConnectionsConnector setBrandColor(String brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        public String getBrandColor() {
            return this.brandColor;
        }

        public ListFlowConnectionsResponseBodyConnectionsConnector setIcon(ListFlowConnectionsResponseBodyConnectionsConnectorIcon icon) {
            this.icon = icon;
            return this;
        }
        public ListFlowConnectionsResponseBodyConnectionsConnectorIcon getIcon() {
            return this.icon;
        }

        public ListFlowConnectionsResponseBodyConnectionsConnector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowConnectionsResponseBodyConnectionsConnector setConnectionParameters(ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }
        public ListFlowConnectionsResponseBodyConnectionsConnectorConnectionParameters getConnectionParameters() {
            return this.connectionParameters;
        }

    }

    public static class ListFlowConnectionsResponseBodyConnections extends TeaModel {
        @NameInMap("Definition")
        public String definition;

        @NameInMap("Actions")
        public java.util.List<ListFlowConnectionsResponseBodyConnectionsActions> actions;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("Connector")
        public ListFlowConnectionsResponseBodyConnectionsConnector connector;

        @NameInMap("Content")
        public String content;

        public static ListFlowConnectionsResponseBodyConnections build(java.util.Map<String, ?> map) throws Exception {
            ListFlowConnectionsResponseBodyConnections self = new ListFlowConnectionsResponseBodyConnections();
            return TeaModel.build(map, self);
        }

        public ListFlowConnectionsResponseBodyConnections setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListFlowConnectionsResponseBodyConnections setActions(java.util.List<ListFlowConnectionsResponseBodyConnectionsActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<ListFlowConnectionsResponseBodyConnectionsActions> getActions() {
            return this.actions;
        }

        public ListFlowConnectionsResponseBodyConnections setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public ListFlowConnectionsResponseBodyConnections setConnector(ListFlowConnectionsResponseBodyConnectionsConnector connector) {
            this.connector = connector;
            return this;
        }
        public ListFlowConnectionsResponseBodyConnectionsConnector getConnector() {
            return this.connector;
        }

        public ListFlowConnectionsResponseBodyConnections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
