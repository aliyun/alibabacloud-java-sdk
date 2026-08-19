// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateConnectorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Global Accelerator. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AccelerateStatus")
    public String accelerateStatus;

    /**
     * <p>The Connector ID. You can obtain the value by calling <a href="~~ListConnectors~~">ListConnectors</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-94db94e06b98****</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The Connector name. The name must be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>connector_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance status of the Connector. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Shutdown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("SwitchStatus")
    public String switchStatus;

    /**
     * <p>The CIDR block of the virtual IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("VipCidr")
    public String vipCidr;

    public static UpdateConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorRequest self = new UpdateConnectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorRequest setAccelerateStatus(String accelerateStatus) {
        this.accelerateStatus = accelerateStatus;
        return this;
    }
    public String getAccelerateStatus() {
        return this.accelerateStatus;
    }

    public UpdateConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public UpdateConnectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateConnectorRequest setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public String getSwitchStatus() {
        return this.switchStatus;
    }

    public UpdateConnectorRequest setVipCidr(String vipCidr) {
        this.vipCidr = vipCidr;
        return this;
    }
    public String getVipCidr() {
        return this.vipCidr;
    }

}
