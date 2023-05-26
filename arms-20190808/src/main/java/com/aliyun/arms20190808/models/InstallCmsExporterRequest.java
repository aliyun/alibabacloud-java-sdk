// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallCmsExporterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CmsArgs")
    public String cmsArgs;

    @NameInMap("DirectArgs")
    public String directArgs;

    @NameInMap("EnableTag")
    public Boolean enableTag;

    @NameInMap("RegionId")
    public String regionId;

    public static InstallCmsExporterRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCmsExporterRequest self = new InstallCmsExporterRequest();
        return TeaModel.build(map, self);
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

    public InstallCmsExporterRequest setDirectArgs(String directArgs) {
        this.directArgs = directArgs;
        return this;
    }
    public String getDirectArgs() {
        return this.directArgs;
    }

    public InstallCmsExporterRequest setEnableTag(Boolean enableTag) {
        this.enableTag = enableTag;
        return this;
    }
    public Boolean getEnableTag() {
        return this.enableTag;
    }

    public InstallCmsExporterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
