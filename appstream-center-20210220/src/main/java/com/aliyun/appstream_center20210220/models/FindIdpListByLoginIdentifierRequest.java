// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class FindIdpListByLoginIdentifierRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc</p>
     */
    @NameInMap("ClientChannel")
    public String clientChannel;

    /**
     * <strong>example:</strong>
     * <p>370b56f8-2812-4b6c-bfa6-2560791c****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>22.21.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <strong>example:</strong>
     * <p>windows_\&quot;Windows 10 Enterprise\&quot; 10.0 (Build 14393)</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <strong>example:</strong>
     * <p>2.0.1-D-20211008.101607</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun123***</p>
     */
    @NameInMap("LoginIdentifier")
    public String loginIdentifier;

    @NameInMap("SupportTypes")
    public java.util.List<String> supportTypes;

    /**
     * <strong>example:</strong>
     * <p>2943802884B27030B6759F9132B2****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static FindIdpListByLoginIdentifierRequest build(java.util.Map<String, ?> map) throws Exception {
        FindIdpListByLoginIdentifierRequest self = new FindIdpListByLoginIdentifierRequest();
        return TeaModel.build(map, self);
    }

    public FindIdpListByLoginIdentifierRequest setClientChannel(String clientChannel) {
        this.clientChannel = clientChannel;
        return this;
    }
    public String getClientChannel() {
        return this.clientChannel;
    }

    public FindIdpListByLoginIdentifierRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public FindIdpListByLoginIdentifierRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public FindIdpListByLoginIdentifierRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public FindIdpListByLoginIdentifierRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public FindIdpListByLoginIdentifierRequest setLoginIdentifier(String loginIdentifier) {
        this.loginIdentifier = loginIdentifier;
        return this;
    }
    public String getLoginIdentifier() {
        return this.loginIdentifier;
    }

    public FindIdpListByLoginIdentifierRequest setSupportTypes(java.util.List<String> supportTypes) {
        this.supportTypes = supportTypes;
        return this;
    }
    public java.util.List<String> getSupportTypes() {
        return this.supportTypes;
    }

    public FindIdpListByLoginIdentifierRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
