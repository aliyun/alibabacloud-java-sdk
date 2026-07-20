// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSessionInput extends TeaModel {
    @NameInMap("allowInternetAccess")
    public Boolean allowInternetAccess;

    /**
     * <p>Default value: False. This indicates that after a session with a specific SessionID expires, you can send requests with the same SessionID. The system treats it as a new session and binds it to a new instance. If set to True, the SessionID cannot be reused after the session expires.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionIdReuse")
    public Boolean disableSessionIdReuse;

    @NameInMap("enableAutoPause")
    public Boolean enableAutoPause;

    @NameInMap("enableAutoResume")
    public Boolean enableAutoResume;

    @NameInMap("juiceFsConfig")
    public JuiceFsConfig juiceFsConfig;

    /**
     * <p>The NAS configuration. After this parameter is configured, instances associated with the session can access the specified NAS resources.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("network")
    public CreateSessionNetworkConfig network;

    /**
     * <p>The OSS mount configuration. After this parameter is configured, instances associated with the session can access the specified OSS resources.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The PolarFs configuration. After this parameter is configured, instances associated with the session can access the specified PolarFs resources.</p>
     */
    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

    /**
     * <p>The custom session ID. If not specified, the server generates one. If specified, this value is used as the session ID. This parameter applies only to the HEADER_FIELD affinity mode. Format: the length is limited to [0,64]. The first character must be from <strong>a-zA-Z0-9_</strong>. Subsequent characters can be from <strong>a-zA-Z0-9_-</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-test-session-id</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The session idle timeout.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The session lifetime.</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sessionTTLInSeconds")
    public Long sessionTTLInSeconds;

    public static CreateSessionInput build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionInput self = new CreateSessionInput();
        return TeaModel.build(map, self);
    }

    public CreateSessionInput setAllowInternetAccess(Boolean allowInternetAccess) {
        this.allowInternetAccess = allowInternetAccess;
        return this;
    }
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    public CreateSessionInput setDisableSessionIdReuse(Boolean disableSessionIdReuse) {
        this.disableSessionIdReuse = disableSessionIdReuse;
        return this;
    }
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
    }

    public CreateSessionInput setEnableAutoPause(Boolean enableAutoPause) {
        this.enableAutoPause = enableAutoPause;
        return this;
    }
    public Boolean getEnableAutoPause() {
        return this.enableAutoPause;
    }

    public CreateSessionInput setEnableAutoResume(Boolean enableAutoResume) {
        this.enableAutoResume = enableAutoResume;
        return this;
    }
    public Boolean getEnableAutoResume() {
        return this.enableAutoResume;
    }

    public CreateSessionInput setJuiceFsConfig(JuiceFsConfig juiceFsConfig) {
        this.juiceFsConfig = juiceFsConfig;
        return this;
    }
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
    }

    public CreateSessionInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateSessionInput setNetwork(CreateSessionNetworkConfig network) {
        this.network = network;
        return this;
    }
    public CreateSessionNetworkConfig getNetwork() {
        return this.network;
    }

    public CreateSessionInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public CreateSessionInput setPolarFsConfig(PolarFsConfig polarFsConfig) {
        this.polarFsConfig = polarFsConfig;
        return this;
    }
    public PolarFsConfig getPolarFsConfig() {
        return this.polarFsConfig;
    }

    public CreateSessionInput setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateSessionInput setSessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
        this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
        return this;
    }
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    public CreateSessionInput setSessionTTLInSeconds(Long sessionTTLInSeconds) {
        this.sessionTTLInSeconds = sessionTTLInSeconds;
        return this;
    }
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

}
