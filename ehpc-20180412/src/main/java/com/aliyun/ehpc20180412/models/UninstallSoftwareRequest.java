// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UninstallSoftwareRequest extends TeaModel {
    /**
     * <p>The name of the software that you want to uninstall.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188591.html">ListInstalledSoftware</a> operation to query the software that is installed in the cluster.</p>
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
