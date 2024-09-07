// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UninstallSoftwaresShrinkRequest extends TeaModel {
    /**
     * <p>The information about the software systems that you want to uninstall.</p>
     */
    @NameInMap("AdditionalPackages")
    public String additionalPackagesShrink;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UninstallSoftwaresShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwaresShrinkRequest self = new UninstallSoftwaresShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwaresShrinkRequest setAdditionalPackagesShrink(String additionalPackagesShrink) {
        this.additionalPackagesShrink = additionalPackagesShrink;
        return this;
    }
    public String getAdditionalPackagesShrink() {
        return this.additionalPackagesShrink;
    }

    public UninstallSoftwaresShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
