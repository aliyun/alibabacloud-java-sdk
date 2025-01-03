// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateMountPointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("UsePerformanceMode")
    public Boolean usePerformanceMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-iq8fymi327krd14mt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-iq8hhsk3ymzv9m4wn****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateMountPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMountPointRequest self = new CreateMountPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateMountPointRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public CreateMountPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMountPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateMountPointRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateMountPointRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateMountPointRequest setUsePerformanceMode(Boolean usePerformanceMode) {
        this.usePerformanceMode = usePerformanceMode;
        return this;
    }
    public Boolean getUsePerformanceMode() {
        return this.usePerformanceMode;
    }

    public CreateMountPointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateMountPointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
