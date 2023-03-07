// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InstallSoftwareRequest extends TeaModel {
    /**
     * <p>The name of the software that you want to install.</p>
     * <br>
     * <p>You can call the [ListSoftwares](~~87216~~) operation to query the software that can be installed.</p>
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

    public static InstallSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallSoftwareRequest self = new InstallSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public InstallSoftwareRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public InstallSoftwareRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
