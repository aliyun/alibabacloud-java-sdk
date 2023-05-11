// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetImage extends TeaModel {
    @NameInMap("Animations")
    public java.util.List<TargetImageAnimations> animations;

    @NameInMap("Snapshots")
    public java.util.List<TargetImageSnapshots> snapshots;

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
        @NameInMap("Format")
        public String format;

        @NameInMap("FrameRate")
        public Double frameRate;

        @NameInMap("Height")
        public Double height;

        @NameInMap("Interval")
        public Double interval;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("StartTime")
        public Double startTime;

        @NameInMap("URI")
        public String URI;

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
        @NameInMap("Format")
        public String format;

        @NameInMap("Height")
        public Double height;

        @NameInMap("Interval")
        public Double interval;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("StartTime")
        public Double startTime;

        @NameInMap("URI")
        public String URI;

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
        @NameInMap("Format")
        public String format;

        @NameInMap("Interval")
        public Double interval;

        @NameInMap("Margin")
        public Integer margin;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Pad")
        public Integer pad;

        @NameInMap("ScaleHeight")
        public Float scaleHeight;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("ScaleWidth")
        public Float scaleWidth;

        @NameInMap("StartTime")
        public Double startTime;

        @NameInMap("TileHeight")
        public Integer tileHeight;

        @NameInMap("TileWidth")
        public Integer tileWidth;

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
