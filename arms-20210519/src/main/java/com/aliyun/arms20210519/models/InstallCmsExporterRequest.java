// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class InstallCmsExporterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CmsArgs")
    public String cmsArgs;

    public static InstallCmsExporterRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCmsExporterRequest self = new InstallCmsExporterRequest();
        return TeaModel.build(map, self);
    }

    public InstallCmsExporterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstallCmsExporterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallCmsExporterRequest setCmsArgs(String cmsArgs) {
        this.cmsArgs = cmsArgs;
        return this;
    }
    public String getCmsArgs() {
        return this.cmsArgs;
    }

}
