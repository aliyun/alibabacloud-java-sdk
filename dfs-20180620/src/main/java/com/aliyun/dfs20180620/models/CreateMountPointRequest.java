// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateMountPointRequest extends TeaModel {
    /**
     * <p>The access group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    /**
     * <p>The description of the mount target. The value can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Mount the online HDFS to the vSwitch of the VPC log cluster</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The network type of the mount target. Only VPC is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>Specifies whether to use the high-performance mount target mode. Valid values:</p>
     * <ul>
     * <li>true: Uses the mode.</li>
     * <li>false: Does not use the mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePerformanceMode")
    public Boolean usePerformanceMode;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-iq8fymi327krd14mt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
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
