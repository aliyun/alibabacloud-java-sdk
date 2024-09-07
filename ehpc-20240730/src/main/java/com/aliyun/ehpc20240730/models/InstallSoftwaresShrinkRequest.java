// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class InstallSoftwaresShrinkRequest extends TeaModel {
    /**
     * <p>The information about the software systems that you want to install.</p>
     */
    @NameInMap("AdditionalPackages")
    public String additionalPackagesShrink;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static InstallSoftwaresShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallSoftwaresShrinkRequest self = new InstallSoftwaresShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallSoftwaresShrinkRequest setAdditionalPackagesShrink(String additionalPackagesShrink) {
        this.additionalPackagesShrink = additionalPackagesShrink;
        return this;
    }
    public String getAdditionalPackagesShrink() {
        return this.additionalPackagesShrink;
    }

    public InstallSoftwaresShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
