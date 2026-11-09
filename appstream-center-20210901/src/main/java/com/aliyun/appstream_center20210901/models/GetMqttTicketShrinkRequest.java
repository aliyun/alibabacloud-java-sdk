// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetMqttTicketShrinkRequest extends TeaModel {
    /**
     * <p>The client operating system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows 10</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <p>The client type. Valid values: 0: hardware terminal; 1: Windows software terminal; 2: macOS software terminal; 3: iOS client; 4: Android client; 5: web client; 6: tenant console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The client version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The extended properties of the client, represented as a JSON object where both keys and values are strings. Example: <code>{&quot;a&quot;:&quot;1&quot;,&quot;b&quot;:&quot;2&quot;}</code>. If this parameter is not specified, it is processed as an empty property set.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;a&quot;:&quot;1&quot;,&quot;b&quot;:&quot;2&quot;}</p>
     */
    @NameInMap("Properties")
    public String propertiesShrink;

    /**
     * <p>The device UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetMqttTicketShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTicketShrinkRequest self = new GetMqttTicketShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMqttTicketShrinkRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetMqttTicketShrinkRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public GetMqttTicketShrinkRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetMqttTicketShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public GetMqttTicketShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
