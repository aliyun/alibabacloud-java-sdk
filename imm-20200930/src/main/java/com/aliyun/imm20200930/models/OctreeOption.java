// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class OctreeOption extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DoVoxelGridDownDownSampling")
    public Boolean doVoxelGridDownDownSampling;

    /**
     * <strong>example:</strong>
     * <p>pcl</p>
     */
    @NameInMap("LibraryName")
    public String libraryName;

    /**
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("OctreeResolution")
    public Double octreeResolution;

    /**
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
