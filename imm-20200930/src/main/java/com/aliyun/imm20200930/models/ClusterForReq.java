// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ClusterForReq extends TeaModel {
    /**
     * <p>The cover.</p>
     */
    @NameInMap("Cover")
    public ClusterForReqCover cover;

    /**
     * <p>The custom ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster-99b1c333-86dc-45da-8c6****</p>
     */
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
        /**
         * <p>The person ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2cb3c51e-b406-4b0c-af1b-897d88e1****</p>
         */
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
        /**
         * <p>The persons.</p>
         */
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

}
