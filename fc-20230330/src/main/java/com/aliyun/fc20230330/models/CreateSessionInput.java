// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSessionInput extends TeaModel {
    /**
     * <p>Specifies whether to disable session ID reuse. Default value: False, which indicates that after a session with a specific SessionID expires, you can send requests with the same SessionID, and the system treats it as a new session bound to a new instance. If this parameter is set to True, the SessionID cannot be reused after the session expires.</p>
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

    /**
     * <p>The OSS configuration. After this parameter is configured, instances associated with the session can access the specified OSS resources.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The PolarFs configuration. After this parameter is configured, instances associated with the session can access the specified PolarFs resources.</p>
     */
    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

    /**
     * <p>The custom session ID. If this parameter is not specified, the server generates a session ID. If specified, the value is used as the session ID. This parameter applies only to the HEADER_FIELD affinity mode. Format: the length is limited to [0,64]. The first character must be from <strong>a-zA-Z0-9_</strong>, and subsequent characters can be from <strong>a-zA-Z0-9_-</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-test-session-id</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The session idle timeout period.</p>
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
