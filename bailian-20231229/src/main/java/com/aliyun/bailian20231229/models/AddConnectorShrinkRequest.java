// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddConnectorShrinkRequest extends TeaModel {
    /**
     * <p>The name of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-connector</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <p>The type of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("ConnectorType")
    public String connectorType;

    /**
     * <p>The description for the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>文件连接器</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters for the file connector.</p>
     */
    @NameInMap("FileConnectorConfig")
    public String fileConnectorConfigShrink;

    public static AddConnectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConnectorShrinkRequest self = new AddConnectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddConnectorShrinkRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public AddConnectorShrinkRequest setConnectorType(String connectorType) {
        this.connectorType = connectorType;
        return this;
    }
    public String getConnectorType() {
        return this.connectorType;
    }

    public AddConnectorShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddConnectorShrinkRequest setFileConnectorConfigShrink(String fileConnectorConfigShrink) {
        this.fileConnectorConfigShrink = fileConnectorConfigShrink;
        return this;
    }
    public String getFileConnectorConfigShrink() {
        return this.fileConnectorConfigShrink;
    }

}
