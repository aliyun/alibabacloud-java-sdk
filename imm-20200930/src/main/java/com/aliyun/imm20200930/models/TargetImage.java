// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetImage extends TeaModel {
    /**
     * <p>Animations</p>
     */
    @NameInMap("Animations")
    public java.util.List<TargetImageAnimations> animations;

    /**
     * <p>Snapshots</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<TargetImageSnapshots> snapshots;

    /**
     * <p>Sprites</p>
     */
    @NameInMap("Sprites")
    public java.util.List<TargetImageSprites> sprites;

    public static TargetImage build(java.util.Map<String, ?> map) throws Exception {
        TargetImage self = new TargetImage();
        return TeaModel.build(map, self);
    }

    public TargetImage setAnimations(java.util.List<TargetImageAnimations> animations) {
        this.animations = animations;
        return this;
    }
    public java.util.List<TargetImageAnimations> getAnimations() {
        return this.animations;
    }

    public TargetImage setSnapshots(java.util.List<TargetImageSnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<TargetImageSnapshots> getSnapshots() {
        return this.snapshots;
    }

    public TargetImage setSprites(java.util.List<TargetImageSprites> sprites) {
        this.sprites = sprites;
        return this;
    }
    public java.util.List<TargetImageSprites> getSprites() {
        return this.sprites;
    }

    public static class TargetImageAnimations extends TeaModel {
        /**
         * <p>Format</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gif</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Animation frame rate, in frames per second</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FrameRate")
        public Double frameRate;

        /**
         * <p>Height</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>Time interval between animation frames, in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Interval")
        public Double interval;

        /**
         * <p>Total number of animation frames to generate</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>Scaling method</p>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>StartTime</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The URI of the animation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/animations</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>Output width, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Double width;

        public static TargetImageAnimations build(java.util.Map<String, ?> map) throws Exception {
            TargetImageAnimations self = new TargetImageAnimations();
            return TeaModel.build(map, self);
        }

        public TargetImageAnimations setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public TargetImageAnimations setFrameRate(Double frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Double getFrameRate() {
            return this.frameRate;
        }

        public TargetImageAnimations setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public TargetImageAnimations setInterval(Double interval) {
            this.interval = interval;
            return this;
        }
        public Double getInterval() {
            return this.interval;
        }

        public TargetImageAnimations setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public TargetImageAnimations setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public TargetImageAnimations setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public TargetImageAnimations setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public TargetImageAnimations setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

    }

    public static class TargetImageSnapshots extends TeaModel {
        /**
         * <p>Image format</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Output height, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>Time interval between snapshots, in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Interval")
        public Double interval;

        /**
         * <strong>example:</strong>
         * <p>interval</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The sequence number of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>Scaling method</p>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>The start time of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
         * <p>OSS URI where snapshots are stored</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/snapshots</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The width of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Double width;

        public static TargetImageSnapshots build(java.util.Map<String, ?> map) throws Exception {
            TargetImageSnapshots self = new TargetImageSnapshots();
            return TeaModel.build(map, self);
        }

        public TargetImageSnapshots setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public TargetImageSnapshots setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public TargetImageSnapshots setInterval(Double interval) {
            this.interval = interval;
            return this;
        }
        public Double getInterval() {
            return this.interval;
        }

        public TargetImageSnapshots setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public TargetImageSnapshots setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public TargetImageSnapshots setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public TargetImageSnapshots setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public TargetImageSnapshots setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public TargetImageSnapshots setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public TargetImageSnapshots setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

    }

    public static class TargetImageSprites extends TeaModel {
        /**
         * <p>Image format</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Time interval between sprites, in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Double interval;

        /**
         * <p>Margin around the sprite grid, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Margin")
        public Integer margin;

        /**
         * <strong>example:</strong>
         * <p>interval</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Total number of sprites to generate</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>Padding between sprite tiles, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Pad")
        public Integer pad;

        /**
         * <p>Output height after scaling, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("ScaleHeight")
        public Float scaleHeight;

        /**
         * <p>Scaling method</p>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>Output width after scaling, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ScaleWidth")
        public Float scaleWidth;

        /**
         * <p>StartTime</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
         * <p>Height of each sprite tile, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TileHeight")
        public Integer tileHeight;

        /**
         * <p>Width of each sprite tile, in pixels</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TileWidth")
        public Integer tileWidth;

        /**
         * <p>URI</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/sprites</p>
         */
        @NameInMap("URI")
        public String URI;

        public static TargetImageSprites build(java.util.Map<String, ?> map) throws Exception {
            TargetImageSprites self = new TargetImageSprites();
            return TeaModel.build(map, self);
        }

        public TargetImageSprites setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public TargetImageSprites setInterval(Double interval) {
            this.interval = interval;
            return this;
        }
        public Double getInterval() {
            return this.interval;
        }

        public TargetImageSprites setMargin(Integer margin) {
            this.margin = margin;
            return this;
        }
        public Integer getMargin() {
            return this.margin;
        }

        public TargetImageSprites setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public TargetImageSprites setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public TargetImageSprites setPad(Integer pad) {
            this.pad = pad;
            return this;
        }
        public Integer getPad() {
            return this.pad;
        }

        public TargetImageSprites setScaleHeight(Float scaleHeight) {
            this.scaleHeight = scaleHeight;
            return this;
        }
        public Float getScaleHeight() {
            return this.scaleHeight;
        }

        public TargetImageSprites setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public TargetImageSprites setScaleWidth(Float scaleWidth) {
            this.scaleWidth = scaleWidth;
            return this;
        }
        public Float getScaleWidth() {
            return this.scaleWidth;
        }

        public TargetImageSprites setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public TargetImageSprites setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public TargetImageSprites setTileHeight(Integer tileHeight) {
            this.tileHeight = tileHeight;
            return this;
        }
        public Integer getTileHeight() {
            return this.tileHeight;
        }

        public TargetImageSprites setTileWidth(Integer tileWidth) {
            this.tileWidth = tileWidth;
            return this;
        }
        public Integer getTileWidth() {
            return this.tileWidth;
        }

        public TargetImageSprites setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
