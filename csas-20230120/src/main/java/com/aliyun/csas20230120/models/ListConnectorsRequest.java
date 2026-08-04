// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListConnectorsRequest extends TeaModel {
    /**
     * <p>An array of up to 100 ConnectorIDs.</p>
     */
    @NameInMap("ConnectorIds")
    public java.util.List<String> connectorIds;

    /**
     * <p>The number of the page to return. Valid values: 1 to 10,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the connector. The name must be 1 to 128 characters long and can contain letters, Chinese characters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>connector_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Valid values: 1 to 1,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The connection status of the connector. Valid values:</p>
     * <ul>
     * <li><p><strong>Online</strong></p>
     * </li>
     * <li><p><strong>Offline</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The state of the connector instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong></p>
     * </li>
     * <li><p><strong>Disabled</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("SwitchStatus")
    public String switchStatus;

    public static ListConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsRequest self = new ListConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectorsRequest setConnectorIds(java.util.List<String> connectorIds) {
        this.connectorIds = connectorIds;
        return this;
    }
    public java.util.List<String> getConnectorIds() {
        return this.connectorIds;
    }

    public ListConnectorsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListConnectorsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListConnectorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConnectorsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListConnectorsRequest setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public String getSwitchStatus() {
        return this.switchStatus;
    }

}
