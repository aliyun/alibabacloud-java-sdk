// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSessionInput extends TeaModel {
    /**
     * <p>A value of false (the default) allows an expired session ID to be reused for a new session, which the system then binds to a new instance. If set to true, an expired session ID cannot be reused.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionIdReuse")
    public Boolean disableSessionIdReuse;

    @NameInMap("juiceFsConfig")
    public JuiceFsConfig juiceFsConfig;

    /**
     * <p>Allows instances in the session to access specified NAS resources.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>Allows instances in the session to access specified OSS resources.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>Allows instances in the session to access specified PolarFS resources.</p>
     */
    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

    /**
     * <p>A customizable session ID. If you do not specify a value, the server generates one. This parameter applies only to the HEADER_FIELD affinity mode. The value must be 0 to 64 characters long. The first character must be a character in <strong>a-zA-Z0-9_</strong>. Subsequent characters can be any character in <strong>a-zA-Z0-9_-</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-test-session-id</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The session idle timeout in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The session lifetime in seconds.</p>
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
