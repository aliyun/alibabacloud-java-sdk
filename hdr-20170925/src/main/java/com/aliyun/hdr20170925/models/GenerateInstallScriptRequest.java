// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class GenerateInstallScriptRequest extends TeaModel {
    @NameInMap("OsType")
    public String osType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static GenerateInstallScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateInstallScriptRequest self = new GenerateInstallScriptRequest();
        return TeaModel.build(map, self);
    }

    public GenerateInstallScriptRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public GenerateInstallScriptRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GenerateInstallScriptRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
