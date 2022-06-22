// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInstallCommandRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("HelmVersion")
    public String helmVersion;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OsType")
    public Long osType;

    public static QueryInstallCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstallCommandRequest self = new QueryInstallCommandRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstallCommandRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryInstallCommandRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public QueryInstallCommandRequest setHelmVersion(String helmVersion) {
        this.helmVersion = helmVersion;
        return this;
    }
    public String getHelmVersion() {
        return this.helmVersion;
    }

    public QueryInstallCommandRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryInstallCommandRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryInstallCommandRequest setOsType(Long osType) {
        this.osType = osType;
        return this;
    }
    public Long getOsType() {
        return this.osType;
    }

}
