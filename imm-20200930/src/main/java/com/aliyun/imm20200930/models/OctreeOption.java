// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class OctreeOption extends TeaModel {
    /**
     * <p>Specifies whether to downsample the point cloud file. Valid values:</p>
     * <ul>
     * <li>true: The point cloud file is downsampled, and the coordinates of the points in a voxel are replaced with the coordinates of the center point of the voxel. The average color of all points in the voxel is used as the color of the voxel. In this case, the PointResolution parameter does not take effect.</li>
     * <li>false: Specific coordinates and colors in a voxel are encoded by calculating the offsets from each point to the lower-left corner of the voxel. The offsets are divided by the PointResolution value to obtain the integer coordinates. The residual of the color for each point relative to the average color of all points in the voxel is encoded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DoVoxelGridDownDownSampling")
    public Boolean doVoxelGridDownDownSampling;

    /**
     * <p>The library name. Set the value to pcl. Default value: pcl.</p>
     * 
     * <strong>example:</strong>
     * <p>pcl</p>
     */
    @NameInMap("LibraryName")
    public String libraryName;

    /**
     * <p>The minimum block size when an octree is partitioned. The minimum block size indicates the edge length of a voxel. Default value: 0.01.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("OctreeResolution")
    public Double octreeResolution;

    /**
     * <p>The point cloud resolution. This parameter determines the precision of the point coordinates during encoding. Default value: 0.01.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("PointResolution")
    public Double pointResolution;

    public static OctreeOption build(java.util.Map<String, ?> map) throws Exception {
        OctreeOption self = new OctreeOption();
        return TeaModel.build(map, self);
    }

    public OctreeOption setDoVoxelGridDownDownSampling(Boolean doVoxelGridDownDownSampling) {
        this.doVoxelGridDownDownSampling = doVoxelGridDownDownSampling;
        return this;
    }
    public Boolean getDoVoxelGridDownDownSampling() {
        return this.doVoxelGridDownDownSampling;
    }

    public OctreeOption setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public OctreeOption setOctreeResolution(Double octreeResolution) {
        this.octreeResolution = octreeResolution;
        return this;
    }
    public Double getOctreeResolution() {
        return this.octreeResolution;
    }

    public OctreeOption setPointResolution(Double pointResolution) {
        this.pointResolution = pointResolution;
        return this;
    }
    public Double getPointResolution() {
        return this.pointResolution;
    }

}
