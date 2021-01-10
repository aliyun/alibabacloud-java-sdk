// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateSysAppDownloadInfoRequest extends TeaModel {
    @NameInMap("Plugins")
    public String plugins;

    @NameInMap("SignMode")
    public String signMode;

    @NameInMap("OsType")
    public Integer osType;

    @NameInMap("PkgName")
    public String pkgName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("CertFileObjectKey")
    public String certFileObjectKey;

    public static GenerateSysAppDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSysAppDownloadInfoRequest self = new GenerateSysAppDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSysAppDownloadInfoRequest setPlugins(String plugins) {
        this.plugins = plugins;
        return this;
    }
    public String getPlugins() {
        return this.plugins;
    }

    public GenerateSysAppDownloadInfoRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public GenerateSysAppDownloadInfoRequest setOsType(Integer osType) {
        this.osType = osType;
        return this;
    }
    public Integer getOsType() {
        return this.osType;
    }

    public GenerateSysAppDownloadInfoRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

    public GenerateSysAppDownloadInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GenerateSysAppDownloadInfoRequest setCertFileObjectKey(String certFileObjectKey) {
        this.certFileObjectKey = certFileObjectKey;
        return this;
    }
    public String getCertFileObjectKey() {
        return this.certFileObjectKey;
    }

}
