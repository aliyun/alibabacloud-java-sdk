// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetMqttTicketRequest extends TeaModel {
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
    public java.util.Map<String, ?> properties;

    /**
     * <p>The device UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetMqttTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTicketRequest self = new GetMqttTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetMqttTicketRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetMqttTicketRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public GetMqttTicketRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetMqttTicketRequest setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetMqttTicketRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
