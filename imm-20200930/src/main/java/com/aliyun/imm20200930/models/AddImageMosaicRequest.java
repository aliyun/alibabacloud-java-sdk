// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddImageMosaicRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Quality")
    public Integer quality;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<AddImageMosaicRequestTargets> targets;

    public static AddImageMosaicRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageMosaicRequest self = new AddImageMosaicRequest();
        return TeaModel.build(map, self);
    }

    public AddImageMosaicRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public AddImageMosaicRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public AddImageMosaicRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public AddImageMosaicRequest setQuality(Integer quality) {
        this.quality = quality;
        return this;
    }
    public Integer getQuality() {
        return this.quality;
    }

    public AddImageMosaicRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public AddImageMosaicRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public AddImageMosaicRequest setTargets(java.util.List<AddImageMosaicRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<AddImageMosaicRequestTargets> getTargets() {
        return this.targets;
    }

    public static class AddImageMosaicRequestTargetsBoundary extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Y")
        public Float y;

        public static AddImageMosaicRequestTargetsBoundary build(java.util.Map<String, ?> map) throws Exception {
            AddImageMosaicRequestTargetsBoundary self = new AddImageMosaicRequestTargetsBoundary();
            return TeaModel.build(map, self);
        }

        public AddImageMosaicRequestTargetsBoundary setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public AddImageMosaicRequestTargetsBoundary setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public AddImageMosaicRequestTargetsBoundary setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public AddImageMosaicRequestTargetsBoundary setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AddImageMosaicRequestTargetsBoundary setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class AddImageMosaicRequestTargets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BlurRadius")
        public Integer blurRadius;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Boundary")
        public AddImageMosaicRequestTargetsBoundary boundary;

        /**
         * <strong>example:</strong>
         * <p>#FFFFFF</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MosaicRadius")
        public Integer mosaicRadius;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Sigma")
        public Integer sigma;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>square</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddImageMosaicRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            AddImageMosaicRequestTargets self = new AddImageMosaicRequestTargets();
            return TeaModel.build(map, self);
        }

        public AddImageMosaicRequestTargets setBlurRadius(Integer blurRadius) {
            this.blurRadius = blurRadius;
            return this;
        }
        public Integer getBlurRadius() {
            return this.blurRadius;
        }

        public AddImageMosaicRequestTargets setBoundary(AddImageMosaicRequestTargetsBoundary boundary) {
            this.boundary = boundary;
            return this;
        }
        public AddImageMosaicRequestTargetsBoundary getBoundary() {
            return this.boundary;
        }

        public AddImageMosaicRequestTargets setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public AddImageMosaicRequestTargets setMosaicRadius(Integer mosaicRadius) {
            this.mosaicRadius = mosaicRadius;
            return this;
        }
        public Integer getMosaicRadius() {
            return this.mosaicRadius;
        }

        public AddImageMosaicRequestTargets setSigma(Integer sigma) {
            this.sigma = sigma;
            return this;
        }
        public Integer getSigma() {
            return this.sigma;
        }

        public AddImageMosaicRequestTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
