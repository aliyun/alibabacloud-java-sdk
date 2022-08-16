// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class OctreeOption extends TeaModel {
    @NameInMap("DoVoxelGridDownDownSampling")
    public Boolean doVoxelGridDownDownSampling;

    @NameInMap("LibraryName")
    public String libraryName;

    @NameInMap("OctreeResolution")
    public Double octreeResolution;

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
