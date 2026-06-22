// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FigureClusterForReq extends TeaModel {
    /**
     * <p>The cover of the cluster.</p>
     */
    @NameInMap("Cover")
    public FigureClusterForReqCover cover;

    /**
     * <p>The custom ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>A key-value map of custom labels that can be used to search for the figure cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The metadata lock version. This parameter enables optimistic locking to prevent conflicting updates during high concurrency. To ensure data consistency, pass the current MetaLockVersion value when updating a figure cluster. You can retrieve this value from a Get or List operation. The service proceeds with the update only if the provided version matches the system\&quot;s current version. The initial value is 0 and is incremented by 1 after each successful update.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MetaLockVersion")
    public Long metaLockVersion;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The object ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster-99b1c333-86dc-45da-8c6****</p>
     */
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

    public FigureClusterForReq setMetaLockVersion(Long metaLockVersion) {
        this.metaLockVersion = metaLockVersion;
        return this;
    }
    public Long getMetaLockVersion() {
        return this.metaLockVersion;
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
        /**
         * <p>The figure ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2cb3c51e-b406-4b0c-af1b-897d88e1****</p>
         */
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
        /**
         * <p>The figure list.</p>
         */
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
