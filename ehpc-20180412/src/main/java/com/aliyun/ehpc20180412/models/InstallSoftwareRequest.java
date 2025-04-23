// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InstallSoftwareRequest extends TeaModel {
    /**
     * <p>The name of the software that you want to install.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87216.html">ListSoftwares</a> operation to query the software that can be installed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ABYSS_2.1.5</p>
     */
    @NameInMap("Application")
    public String application;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
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
