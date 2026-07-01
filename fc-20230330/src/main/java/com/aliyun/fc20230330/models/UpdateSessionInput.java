// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateSessionInput extends TeaModel {
    /**
     * <p>Specifies whether to disable session ID reuse after the session expires. Valid values:</p>
     * <ul>
     * <li>False: After the session associated with a SessionID expires, you can use the same SessionID to initiate requests. The system treats this as a new session and binds it to a new instance.</li>
     * <li>True: After the session associated with a SessionID expires, the SessionID cannot be reused.
     * Default value: False.</li>
     * </ul>
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

    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

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

    public static UpdateSessionInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionInput self = new UpdateSessionInput();
        return TeaModel.build(map, self);
    }

    public UpdateSessionInput setDisableSessionIdReuse(Boolean disableSessionIdReuse) {
        this.disableSessionIdReuse = disableSessionIdReuse;
        return this;
    }
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
    }

    public UpdateSessionInput setEnableAutoPause(Boolean enableAutoPause) {
        this.enableAutoPause = enableAutoPause;
        return this;
    }
    public Boolean getEnableAutoPause() {
        return this.enableAutoPause;
    }

    public UpdateSessionInput setEnableAutoResume(Boolean enableAutoResume) {
        this.enableAutoResume = enableAutoResume;
        return this;
    }
    public Boolean getEnableAutoResume() {
        return this.enableAutoResume;
    }

    public UpdateSessionInput setJuiceFsConfig(JuiceFsConfig juiceFsConfig) {
        this.juiceFsConfig = juiceFsConfig;
        return this;
    }
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
    }

    public UpdateSessionInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateSessionInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public UpdateSessionInput setPolarFsConfig(PolarFsConfig polarFsConfig) {
        this.polarFsConfig = polarFsConfig;
        return this;
    }
    public PolarFsConfig getPolarFsConfig() {
        return this.polarFsConfig;
    }

    public UpdateSessionInput setSessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
        this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
        return this;
    }
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    public UpdateSessionInput setSessionTTLInSeconds(Long sessionTTLInSeconds) {
        this.sessionTTLInSeconds = sessionTTLInSeconds;
        return this;
    }
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

}
