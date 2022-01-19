// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FigureClusterForReq extends TeaModel {
    // Cover
    @NameInMap("Cover")
    public FigureClusterForReqCover cover;

    // CustomId
    @NameInMap("CustomId")
    public String customId;

    // CustomLabels
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    // Name
    @NameInMap("Name")
    public String name;

    // ObjectId
    @NameInMap("ObjectId")
    public String objectId;

    public static FigureClusterForReq build(java.util.Map<String, ?> map) throws Exception {
        FigureClusterForReq self = new FigureClusterForReq();
        return TeaModel.build(map, self);
    }

    public FigureClusterForReq setCover(FigureClusterForReqCover cover) {
        this.cover = cover;
        return this;
    }
    public FigureClusterForReqCover getCover() {
        return this.cover;
    }

    public FigureClusterForReq setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public FigureClusterForReq setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public FigureClusterForReq setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FigureClusterForReq setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public static class FigureClusterForReqCoverFigures extends TeaModel {
        // FigureId
        @NameInMap("FigureId")
        public String figureId;

        public static FigureClusterForReqCoverFigures build(java.util.Map<String, ?> map) throws Exception {
            FigureClusterForReqCoverFigures self = new FigureClusterForReqCoverFigures();
            return TeaModel.build(map, self);
        }

        public FigureClusterForReqCoverFigures setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

    }

    public static class FigureClusterForReqCover extends TeaModel {
        // Figures
        @NameInMap("Figures")
        public java.util.List<FigureClusterForReqCoverFigures> figures;

        public static FigureClusterForReqCover build(java.util.Map<String, ?> map) throws Exception {
            FigureClusterForReqCover self = new FigureClusterForReqCover();
            return TeaModel.build(map, self);
        }

        public FigureClusterForReqCover setFigures(java.util.List<FigureClusterForReqCoverFigures> figures) {
            this.figures = figures;
            return this;
        }
        public java.util.List<FigureClusterForReqCoverFigures> getFigures() {
            return this.figures;
        }

    }

}
