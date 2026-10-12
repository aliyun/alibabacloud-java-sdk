// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListInstallableGatewaysResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListInstallableGatewaysResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019FA163-3664-5D34-81D1-5FFFC94AD7D5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListInstallableGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstallableGatewaysResponseBody self = new ListInstallableGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstallableGatewaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstallableGatewaysResponseBody setData(ListInstallableGatewaysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstallableGatewaysResponseBodyData getData() {
        return this.data;
    }

    public ListInstallableGatewaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstallableGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstallableGatewaysResponseBodyDataItems extends TeaModel {
        /**
         * <p>The database engine version of the gateway DPI engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.10</p>
         */
        @NameInMap("engineVersion")
        public String engineVersion;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The gateway status. The value is passed through from the GatewayPhase enumeration, such as Running or Creating.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("gatewayPhase")
        public String gatewayPhase;

        /**
         * <p>Indicates whether the plugin can be installed on the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("installable")
        public Boolean installable;

        /**
         * <p>The reason why the plugin cannot be installed.</p>
         * 
         * <strong>example:</strong>
         * <p>VERSION_NOT_MATCH</p>
         */
        @NameInMap("installableFalseReasonType")
        public String installableFalseReasonType;

        /**
         * <p>The version number of another version of the same plugin class that is already installed on the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("installedPluginVersion")
        public String installedPluginVersion;

        /**
         * <p>The gateway name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-gateway</p>
         */
        @NameInMap("name")
        public String name;

        public static ListInstallableGatewaysResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListInstallableGatewaysResponseBodyDataItems self = new ListInstallableGatewaysResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListInstallableGatewaysResponseBodyDataItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListInstallableGatewaysResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListInstallableGatewaysResponseBodyDataItems setGatewayPhase(String gatewayPhase) {
            this.gatewayPhase = gatewayPhase;
            return this;
        }
        public String getGatewayPhase() {
            return this.gatewayPhase;
        }

        public ListInstallableGatewaysResponseBodyDataItems setInstallable(Boolean installable) {
            this.installable = installable;
            return this;
        }
        public Boolean getInstallable() {
            return this.installable;
        }

        public ListInstallableGatewaysResponseBodyDataItems setInstallableFalseReasonType(String installableFalseReasonType) {
            this.installableFalseReasonType = installableFalseReasonType;
            return this;
        }
        public String getInstallableFalseReasonType() {
            return this.installableFalseReasonType;
        }

        public ListInstallableGatewaysResponseBodyDataItems setInstalledPluginVersion(String installedPluginVersion) {
            this.installedPluginVersion = installedPluginVersion;
            return this;
        }
        public String getInstalledPluginVersion() {
            return this.installedPluginVersion;
        }

        public ListInstallableGatewaysResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListInstallableGatewaysResponseBodyData extends TeaModel {
        /**
         * <p>The list of gateways.</p>
         */
        @NameInMap("items")
        public java.util.List<ListInstallableGatewaysResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public String pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public String pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("totalSize")
        public String totalSize;

        public static ListInstallableGatewaysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstallableGatewaysResponseBodyData self = new ListInstallableGatewaysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstallableGatewaysResponseBodyData setItems(java.util.List<ListInstallableGatewaysResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListInstallableGatewaysResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListInstallableGatewaysResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListInstallableGatewaysResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListInstallableGatewaysResponseBodyData setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

    }

}
