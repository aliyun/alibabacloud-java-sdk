// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNASDefaultMountTargetRequest extends TeaModel {
    /**
     * <p>The NAS file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The mount target domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0bf744****-xo***.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyNASDefaultMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNASDefaultMountTargetRequest self = new ModifyNASDefaultMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNASDefaultMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyNASDefaultMountTargetRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public ModifyNASDefaultMountTargetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
