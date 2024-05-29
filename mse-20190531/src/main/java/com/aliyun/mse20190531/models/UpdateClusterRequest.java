// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The alias of the instance.</p>
     */
    @NameInMap("ClusterAliasName")
    public String clusterAliasName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The end time of the O\\&M window.</p>
     */
    @NameInMap("MaintenanceEndTime")
    public String maintenanceEndTime;

    /**
     * <p>The start time of the O\\&M window.</p>
     */
    @NameInMap("MaintenanceStartTime")
    public String maintenanceStartTime;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static UpdateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterRequest self = new UpdateClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateClusterRequest setClusterAliasName(String clusterAliasName) {
        this.clusterAliasName = clusterAliasName;
        return this;
    }
    public String getClusterAliasName() {
        return this.clusterAliasName;
    }

    public UpdateClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateClusterRequest setMaintenanceEndTime(String maintenanceEndTime) {
        this.maintenanceEndTime = maintenanceEndTime;
        return this;
    }
    public String getMaintenanceEndTime() {
        return this.maintenanceEndTime;
    }

    public UpdateClusterRequest setMaintenanceStartTime(String maintenanceStartTime) {
        this.maintenanceStartTime = maintenanceStartTime;
        return this;
    }
    public String getMaintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    public UpdateClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
