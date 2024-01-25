// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportOASRequest extends TeaModel {
    /**
     * <p>The security authentication method of the API. Valid values:</p>
     * <br>
     * <p>*   **APP: Only authorized applications can call the API.**</p>
     * <br>
     * <p>*   **ANONYMOUS: The API can be anonymously called. In this mode, you must take note of the following rules:**</p>
     * <br>
     * <p>    *   All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The name of the backend service.</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>The OAS-compliant text file or OSS object URL.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to ignore alerts.</p>
     */
    @NameInMap("IgnoreWarning")
    public Boolean ignoreWarning;

    /**
     * <p>The OAS version.</p>
     */
    @NameInMap("OASVersion")
    public String OASVersion;

    /**
     * <p>Specifies whether to overwrite an existing API.</p>
     * <br>
     * <p>If an existing API has the same HTTP request type and backend request path as the API to be imported, the existing API is overwritten.</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The request mode. Valid values:</p>
     * <br>
     * <p>*   MAPPING: Parameters are mapped. Unknown parameters are filtered out.</p>
     * <p>*   PASSTHROUGH: Parameters are passed through.</p>
     */
    @NameInMap("RequestMode")
    public String requestMode;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to directly import the API without performing a precheck.</p>
     */
    @NameInMap("SkipDryRun")
    public Boolean skipDryRun;

    public static ImportOASRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportOASRequest self = new ImportOASRequest();
        return TeaModel.build(map, self);
    }

    public ImportOASRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ImportOASRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public ImportOASRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportOASRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ImportOASRequest setIgnoreWarning(Boolean ignoreWarning) {
        this.ignoreWarning = ignoreWarning;
        return this;
    }
    public Boolean getIgnoreWarning() {
        return this.ignoreWarning;
    }

    public ImportOASRequest setOASVersion(String OASVersion) {
        this.OASVersion = OASVersion;
        return this;
    }
    public String getOASVersion() {
        return this.OASVersion;
    }

    public ImportOASRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public ImportOASRequest setRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }
    public String getRequestMode() {
        return this.requestMode;
    }

    public ImportOASRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ImportOASRequest setSkipDryRun(Boolean skipDryRun) {
        this.skipDryRun = skipDryRun;
        return this;
    }
    public Boolean getSkipDryRun() {
        return this.skipDryRun;
    }

}
