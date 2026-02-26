// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetImage extends TeaModel {
    /**
     * <p>The animated images.</p>
     */
    @NameInMap("Animations")
    public java.util.List<TargetImageAnimations> animations;

    /**
     * <p>The frames.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<TargetImageSnapshots> snapshots;

    /**
     * <p>The sprites.</p>
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
         * <p>The format of the animated image. Valid values:</p>
         * <ul>
         * <li>gif</li>
         * <li>webp</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gif</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the animated image. You can use this parameter together with the Interval parameter to slow down the animation.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FrameRate")
        public Double frameRate;

        /**
         * <p>The height of the animated image. By default, the animated image has the same height as the source video. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the height of the target image resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The time interval for extracting frames. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Interval")
        public Double interval;

        /**
         * <p>The number of extracted frames. The default value is 0, which indicates that frames are extracted until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The resizing mode. Valid values:</p>
         * <ul>
         * <li>stretch: stretches the image to fill the entire space. This is the default value.</li>
         * <li>crop: resizes and crops the image.</li>
         * <li>fill: resizes the image and keeps the black border.</li>
         * <li>fit: resizes the image and removes the black border.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>The start time for extracting frames. Unit: seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The URI of the animated image.</p>
         * <p>The OSS URI follows the oss://bucket/object format, where bucket is the name of the bucket in the same region as the current project and object is the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/animations</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The width of the animated image. By default, the animated image has the same width as the source video. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the width of the target image resolution. Valid values: (0,1).</li>
         * </ul>
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
         * <p>The format of the frame. Valid values:</p>
         * <ul>
         * <li>jpg</li>
         * <li>png</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The height of the frame image. By default, the image has the same height as the source video. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the height of the target image resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The time interval of frame capturing in seconds.</p>
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
         * <p>The number of frames. The default value is 0, which indicates that frames are captured until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The resizing mode. Valid values:</p>
         * <ul>
         * <li>stretch: stretches the image to fill the entire space. This is the default value.</li>
         * <li>crop: resizes and crops the image.</li>
         * <li>fill: resizes the image and keeps the black border.</li>
         * <li>fit: resizes the image and removes the black border.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>The time in seconds at which frame capturing starts. The default value is 0, which indicates that frame capturing starts at the beginning of the video.</p>
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
         * <p>The OSS URI of the frame.</p>
         * <p>The OSS URI follows the oss://bucket/object format, where bucket is the name of the bucket in the same region as the current project and object is the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/snapshots</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The width of the frame image. By default, the image has the same width as the source video. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the width of the target image resolution. Valid values: (0,1).</li>
         * </ul>
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
         * <p>The format of the sprite. Valid values:</p>
         * <ul>
         * <li>jpg</li>
         * <li>png</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The time interval of frame capturing in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Double interval;

        /**
         * <p>The margin between the small images and the edges of the sprite. Default value: 2.</p>
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
         * <p>The number of small images in the sprite. The default value is 0, which indicates that frames are captured until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The padding between small images. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Pad")
        public Integer pad;

        /**
         * <p>The height of individual small images. The default value is 1. The value can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: (1,4096).</li>
         * <li>A decimal: the ratio relative to the height of the target video resolution. Valid values: (0,1].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("ScaleHeight")
        public Float scaleHeight;

        /**
         * <p>The resizing mode. Valid values:</p>
         * <ul>
         * <li>stretch: stretches the image to fill the entire space. This is the default value.</li>
         * <li>crop: resizes and crops the image.</li>
         * <li>fill: resizes the image and keeps the black border.</li>
         * <li>fit: resizes the image and removes the black border.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>The width of individual small images. The default value is 1. The value can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: (1,4096).</li>
         * <li>A decimal: the ratio relative to the width of the target video resolution. Valid values: (0,1].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ScaleWidth")
        public Float scaleWidth;

        /**
         * <p>The time in seconds at which frame capturing starts. The default value is 0, which indicates that frame capturing starts at the beginning of the video.</p>
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
         * <p>The number of small images in each column. Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TileHeight")
        public Integer tileHeight;

        /**
         * <p>The number of small images in each row. Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TileWidth")
        public Integer tileWidth;

        /**
         * <p>The URI of the sprite in Object Storage Service (OSS).</p>
         * <p>The OSS URI follows the oss://bucket/object format, where bucket is the name of the bucket in the same region as the current project and object is the path of the object with the extension included.</p>
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
