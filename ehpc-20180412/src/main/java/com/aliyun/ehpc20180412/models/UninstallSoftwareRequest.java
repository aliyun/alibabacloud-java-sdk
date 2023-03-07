// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UninstallSoftwareRequest extends TeaModel {
    /**
     * <p>The name of the software that you want to uninstall.</p>
     * <br>
     * <p>You can call the [ListInstalledSoftware](~~188591~~) operation to query the software that is installed in the cluster.</p>
     */
    @NameInMap("Application")
    public String application;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UninstallSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwareRequest self = new UninstallSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwareRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public UninstallSoftwareRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
