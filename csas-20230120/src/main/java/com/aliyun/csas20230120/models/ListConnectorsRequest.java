// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListConnectorsRequest extends TeaModel {
    /**
     * <p>Collection of Connector IDs. Up to 100 Connector IDs can be entered.</p>
     */
    @NameInMap("ConnectorIds")
    public java.util.List<String> connectorIds;

    /**
     * <p>The page number of the current page in a paginated query. Range: 1~10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Connector name. Length: 1~128 characters, supporting Chinese and both uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>connector_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of items per page in a paginated query. Range: 1~1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Connector connection status. Values:</p>
     * <ul>
     * <li><strong>Online</strong>: Online.</li>
     * <li><strong>Offline</strong>: Offline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Connector instance status. Values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
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
