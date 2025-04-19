// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RebootDesktopsRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The operating system (OS) of the device that runs the Alibaba Cloud Workspace client (hereinafter referred to as WUYING client).</p>
     * 
     * <strong>example:</strong>
     * <p>Windows_NT 10.0.18363 x64</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence of a request?</a></p>
     * 
     * <strong>example:</strong>
     * <p>40401e62-5caf-4508-8de7-bf98af12****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The client version. If you use a WUYING client, you can view the client version in the <strong>About</strong> dialog box on the client logon page.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.0-R-20210731.151756</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The IDs of the cloud computers. You can specify the IDs of 1 to 20 cloud computers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The logon token.</p>
     * 
     * <strong>example:</strong>
     * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OsUpdate")
    public Boolean osUpdate;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The logon token.</p>
     * 
     * <strong>example:</strong>
     * <p>04b7b80a0b020715c5c1b4175fc4771698****9e2a759557a4624665fd53ae40</p>
     */
    @NameInMap("SessionToken")
    public String sessionToken;

    /**
     * <p>The UUID of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>91761ED27169E2FC564F29388E2D****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static RebootDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsRequest self = new RebootDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RebootDesktopsRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public RebootDesktopsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RebootDesktopsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public RebootDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RebootDesktopsRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public RebootDesktopsRequest setOsUpdate(Boolean osUpdate) {
        this.osUpdate = osUpdate;
        return this;
    }
    public Boolean getOsUpdate() {
        return this.osUpdate;
    }

    public RebootDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RebootDesktopsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RebootDesktopsRequest setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }
    public String getSessionToken() {
        return this.sessionToken;
    }

    public RebootDesktopsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
