// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateSessionInput extends TeaModel {
    /**
     * <p>Defaults to <code>false</code>. If set to <code>false</code>, you can reuse a <code>SessionID</code> to start a new session on a new instance after the original session expires. If set to <code>true</code>, you cannot reuse a <code>SessionID</code> after its session expires.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionIdReuse")
    public Boolean disableSessionIdReuse;

    /**
     * <p>The JuiceFS configuration.</p>
     */
    @NameInMap("juiceFsConfig")
    public JuiceFsConfig juiceFsConfig;

    /**
     * <p>The NAS configuration.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The OSS mount configuration.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The PolarFS configuration.</p>
     */
    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

    /**
     * <p>The session idle timeout, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The session duration, in seconds.</p>
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
