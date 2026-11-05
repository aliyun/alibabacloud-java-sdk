// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeVscMountPointsRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e389e5c7-bcb4-4558-846a-e5afc444****</p>
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
     * <p>The instance ID of the ECS instance on which the HDFS file system is mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6zv0ce8oghu7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mount point ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f-037cb49e1d-c****.dfs.aliyuncs.com</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    /**
     * <p>The instance status of the ECS instance on which the HDFS file system is mounted. Valid values:</p>
     * <ul>
     * <li>NORMAL: The mount operation succeeded.</li>
     * <li>CREATING: The mount operation is in progress.</li>
     * <li>INVALID: The mount operation failed.</li>
     * <li>OK: Returns instances in the NORMAL, CREATING, and INVALID states.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the VSC on which the HDFS file system is mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-asjodjoio****</p>
     */
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
