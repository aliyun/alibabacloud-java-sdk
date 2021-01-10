// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateSdkDownloadInfoRequest extends TeaModel {
    @NameInMap("Sdks")
    public String sdks;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("OsType")
    public Integer osType;

    @NameInMap("PkgName")
    public String pkgName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("CertFileObjectKey")
    public String certFileObjectKey;

    public static GenerateSdkDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSdkDownloadInfoRequest self = new GenerateSdkDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSdkDownloadInfoRequest setSdks(String sdks) {
        this.sdks = sdks;
        return this;
    }
    public String getSdks() {
        return this.sdks;
    }

    public GenerateSdkDownloadInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GenerateSdkDownloadInfoRequest setOsType(Integer osType) {
        this.osType = osType;
        return this;
    }
    public Integer getOsType() {
        return this.osType;
    }

    public GenerateSdkDownloadInfoRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

    public GenerateSdkDownloadInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GenerateSdkDownloadInfoRequest setCertFileObjectKey(String certFileObjectKey) {
        this.certFileObjectKey = certFileObjectKey;
        return this;
    }
    public String getCertFileObjectKey() {
        return this.certFileObjectKey;
    }

}
