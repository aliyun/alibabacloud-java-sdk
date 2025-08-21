// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeployInstanceSDGRequest extends TeaModel {
    /**
     * <p>The deployment type of the SDG. shared: shared read/write splitting deployment. The content of the SDG is read-only, and data updates are written to the local storage of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>shared</p>
     */
    @NameInMap("DeploymentType")
    public String deploymentType;

    @NameInMap("DiskAccessProtocol")
    public String diskAccessProtocol;

    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The IDs of the instances. The value is a JSON array that consists of up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DeployInstanceSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployInstanceSDGRequest self = new DeployInstanceSDGRequest();
        return TeaModel.build(map, self);
    }

    public DeployInstanceSDGRequest setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeployInstanceSDGRequest setDiskAccessProtocol(String diskAccessProtocol) {
        this.diskAccessProtocol = diskAccessProtocol;
        return this;
    }
    public String getDiskAccessProtocol() {
        return this.diskAccessProtocol;
    }

    public DeployInstanceSDGRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DeployInstanceSDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DeployInstanceSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
