// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardSlabInfoRequest extends TeaModel {
    @NameInMap("Legends")
    public java.util.List<UpdateBimStandardSlabInfoRequestLegends> legends;

    @NameInMap("RootDir")
    public String rootDir;

    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("Thickness")
    public Long thickness;

    public static UpdateBimStandardSlabInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardSlabInfoRequest self = new UpdateBimStandardSlabInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardSlabInfoRequest setLegends(java.util.List<UpdateBimStandardSlabInfoRequestLegends> legends) {
        this.legends = legends;
        return this;
    }
    public java.util.List<UpdateBimStandardSlabInfoRequestLegends> getLegends() {
        return this.legends;
    }

    public UpdateBimStandardSlabInfoRequest setRootDir(String rootDir) {
        this.rootDir = rootDir;
        return this;
    }
    public String getRootDir() {
        return this.rootDir;
    }

    public UpdateBimStandardSlabInfoRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public UpdateBimStandardSlabInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimStandardSlabInfoRequest setThickness(Long thickness) {
        this.thickness = thickness;
        return this;
    }
    public Long getThickness() {
        return this.thickness;
    }

    public static class UpdateBimStandardSlabInfoRequestLegends extends TeaModel {
        @NameInMap("ElevationHeight")
        public String elevationHeight;

        @NameInMap("ElevationMode")
        public String elevationMode;

        @NameInMap("ElevationOperator")
        public String elevationOperator;

        @NameInMap("PatternName")
        public String patternName;

        @NameInMap("Picture")
        public String picture;

        @NameInMap("Thickness")
        public Long thickness;

        public static UpdateBimStandardSlabInfoRequestLegends build(java.util.Map<String, ?> map) throws Exception {
            UpdateBimStandardSlabInfoRequestLegends self = new UpdateBimStandardSlabInfoRequestLegends();
            return TeaModel.build(map, self);
        }

        public UpdateBimStandardSlabInfoRequestLegends setElevationHeight(String elevationHeight) {
            this.elevationHeight = elevationHeight;
            return this;
        }
        public String getElevationHeight() {
            return this.elevationHeight;
        }

        public UpdateBimStandardSlabInfoRequestLegends setElevationMode(String elevationMode) {
            this.elevationMode = elevationMode;
            return this;
        }
        public String getElevationMode() {
            return this.elevationMode;
        }

        public UpdateBimStandardSlabInfoRequestLegends setElevationOperator(String elevationOperator) {
            this.elevationOperator = elevationOperator;
            return this;
        }
        public String getElevationOperator() {
            return this.elevationOperator;
        }

        public UpdateBimStandardSlabInfoRequestLegends setPatternName(String patternName) {
            this.patternName = patternName;
            return this;
        }
        public String getPatternName() {
            return this.patternName;
        }

        public UpdateBimStandardSlabInfoRequestLegends setPicture(String picture) {
            this.picture = picture;
            return this;
        }
        public String getPicture() {
            return this.picture;
        }

        public UpdateBimStandardSlabInfoRequestLegends setThickness(Long thickness) {
            this.thickness = thickness;
            return this;
        }
        public Long getThickness() {
            return this.thickness;
        }

    }

}
