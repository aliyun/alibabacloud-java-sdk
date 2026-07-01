// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Session extends TeaModel {
    /**
     * <p>The instance ID of the function instance associated with the session.</p>
     * 
     * <strong>example:</strong>
     * <p>c-68999e02-16a1955c-d2a03d1ccs</p>
     */
    @NameInMap("containerId")
    public String containerId;

    /**
     * <p>The time when the session was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-01T08:15:27Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>Specifies whether to disable session ID reuse. Default value: False, which indicates that after the session expires, you can use the same session ID to initiate requests. The system treats the request as a new session and binds it to a new instance. If you set this parameter to True, the session ID cannot be reused after the session expires.</p>
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

    /**
     * <p>The name of the function to which the session belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>functionName1</p>
     */
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("juiceFsConfig")
    public JuiceFsConfig juiceFsConfig;

    /**
     * <p>The time when the session was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-01T18:15:27Z</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The NAS configuration. After configuration, the instance associated with the session can access the specified NAS resource.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

    /**
     * <p>The qualifier passed in when the customer created the session. If not specified, the default value is LATEST.</p>
     * 
     * <strong>example:</strong>
     * <p>AliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The session affinity type.</p>
     * 
     * <strong>example:</strong>
     * <p>HEADER_FIELD</p>
     */
    @NameInMap("sessionAffinityType")
    public String sessionAffinityType;

    /**
     * <p>The unique identifier of the function session.</p>
     * 
     * <strong>example:</strong>
     * <p>81f70ae156904eb9b7d43e12f511fe58</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The idle timeout period of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The session status. Valid values:</p>
     * <ul>
     * <li>Active: The session is valid.</li>
     * <li>Expired: The session has expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("sessionStatus")
    public String sessionStatus;

    /**
     * <p>The maximum lifetime of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sessionTTLInSeconds")
    public Long sessionTTLInSeconds;

    public static Session build(java.util.Map<String, ?> map) throws Exception {
        Session self = new Session();
        return TeaModel.build(map, self);
    }

    public Session setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public Session setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Session setDisableSessionIdReuse(Boolean disableSessionIdReuse) {
        this.disableSessionIdReuse = disableSessionIdReuse;
        return this;
    }
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
    }

    public Session setEnableAutoPause(Boolean enableAutoPause) {
        this.enableAutoPause = enableAutoPause;
        return this;
    }
    public Boolean getEnableAutoPause() {
        return this.enableAutoPause;
    }

    public Session setEnableAutoResume(Boolean enableAutoResume) {
        this.enableAutoResume = enableAutoResume;
        return this;
    }
    public Boolean getEnableAutoResume() {
        return this.enableAutoResume;
    }

    public Session setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public Session setJuiceFsConfig(JuiceFsConfig juiceFsConfig) {
        this.juiceFsConfig = juiceFsConfig;
        return this;
    }
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
    }

    public Session setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Session setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public Session setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public Session setPolarFsConfig(PolarFsConfig polarFsConfig) {
        this.polarFsConfig = polarFsConfig;
        return this;
    }
    public PolarFsConfig getPolarFsConfig() {
        return this.polarFsConfig;
    }

    public Session setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public Session setSessionAffinityType(String sessionAffinityType) {
        this.sessionAffinityType = sessionAffinityType;
        return this;
    }
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    public Session setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public Session setSessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
        this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
        return this;
    }
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    public Session setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public Session setSessionTTLInSeconds(Long sessionTTLInSeconds) {
        this.sessionTTLInSeconds = sessionTTLInSeconds;
        return this;
    }
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

}
