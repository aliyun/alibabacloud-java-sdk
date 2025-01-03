// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeVscMountPointsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>037****e1d</p>
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
     * <strong>example:</strong>
     * <p>[&quot;ecs-instance1&quot;, &quot;ecs-instance2&quot;]</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>037cb49e1d-c***5</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("VscId")
    public String vscId;

    public static DescribeVscMountPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscMountPointsRequest self = new DescribeVscMountPointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVscMountPointsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeVscMountPointsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DescribeVscMountPointsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeVscMountPointsRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public DescribeVscMountPointsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVscMountPointsRequest setVscId(String vscId) {
        this.vscId = vscId;
        return this;
    }
    public String getVscId() {
        return this.vscId;
    }

}
