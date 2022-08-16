// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ClusterForReq extends TeaModel {
    @NameInMap("Cover")
    public ClusterForReqCover cover;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("Name")
    public String name;

    @NameInMap("ObjectId")
    public String objectId;

    public static ClusterForReq build(java.util.Map<String, ?> map) throws Exception {
        ClusterForReq self = new ClusterForReq();
        return TeaModel.build(map, self);
    }

    public ClusterForReq setCover(ClusterForReqCover cover) {
        this.cover = cover;
        return this;
    }
    public ClusterForReqCover getCover() {
        return this.cover;
    }

    public ClusterForReq setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public ClusterForReq setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public ClusterForReq setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClusterForReq setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public static class ClusterForReqCoverFigures extends TeaModel {
        @NameInMap("FigureId")
        public String figureId;

        public static ClusterForReqCoverFigures build(java.util.Map<String, ?> map) throws Exception {
            ClusterForReqCoverFigures self = new ClusterForReqCoverFigures();
            return TeaModel.build(map, self);
        }

        public ClusterForReqCoverFigures setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

    }

    public static class ClusterForReqCover extends TeaModel {
        @NameInMap("Figures")
        public java.util.List<ClusterForReqCoverFigures> figures;

        public static ClusterForReqCover build(java.util.Map<String, ?> map) throws Exception {
            ClusterForReqCover self = new ClusterForReqCover();
            return TeaModel.build(map, self);
        }

        public ClusterForReqCover setFigures(java.util.List<ClusterForReqCoverFigures> figures) {
            this.figures = figures;
            return this;
        }
        public java.util.List<ClusterForReqCoverFigures> getFigures() {
            return this.figures;
        }

    }

    public static class FigureClusterForReqCoverFigures extends TeaModel {
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
