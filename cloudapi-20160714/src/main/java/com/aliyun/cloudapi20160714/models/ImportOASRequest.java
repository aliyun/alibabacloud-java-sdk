// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportOASRequest extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BackendName")
    public String backendName;

    @NameInMap("Data")
    public String data;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IgnoreWarning")
    public Boolean ignoreWarning;

    @NameInMap("OASVersion")
    public String OASVersion;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("RequestMode")
    public String requestMode;

    @NameInMap("SecurityToken")
    public String securityToken;

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
