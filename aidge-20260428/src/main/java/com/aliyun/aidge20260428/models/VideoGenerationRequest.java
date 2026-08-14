// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoGenerationRequest extends TeaModel {
    /**
     * <p>The product input.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public VideoGenerationRequestInput input;

    /**
     * <p>The intent parameters. Currently unavailable.</p>
     */
    @NameInMap("Intent")
    public VideoGenerationRequestIntent intent;

    /**
     * <p>The output parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public VideoGenerationRequestOutput output;

    public static VideoGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoGenerationRequest self = new VideoGenerationRequest();
        return TeaModel.build(map, self);
    }

    public VideoGenerationRequest setInput(VideoGenerationRequestInput input) {
        this.input = input;
        return this;
    }
    public VideoGenerationRequestInput getInput() {
        return this.input;
    }

    public VideoGenerationRequest setIntent(VideoGenerationRequestIntent intent) {
        this.intent = intent;
        return this;
    }
    public VideoGenerationRequestIntent getIntent() {
        return this.intent;
    }

    public VideoGenerationRequest setOutput(VideoGenerationRequestOutput output) {
        this.output = output;
        return this;
    }
    public VideoGenerationRequestOutput getOutput() {
        return this.output;
    }

    public static class VideoGenerationRequestInputAssetBindings extends TeaModel {
        /**
         * <p>The asset index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetIndex")
        public Integer assetIndex;

        /**
         * <p>The natural language description of the asset.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>look_reference: appearance reference.</li>
         * <li>scene_reference: scene reference.</li>
         * </ul>
         */
        @NameInMap("Slot")
        public String slot;

        public static VideoGenerationRequestInputAssetBindings build(java.util.Map<String, ?> map) throws Exception {
            VideoGenerationRequestInputAssetBindings self = new VideoGenerationRequestInputAssetBindings();
            return TeaModel.build(map, self);
        }

        public VideoGenerationRequestInputAssetBindings setAssetIndex(Integer assetIndex) {
            this.assetIndex = assetIndex;
            return this;
        }
        public Integer getAssetIndex() {
            return this.assetIndex;
        }

        public VideoGenerationRequestInputAssetBindings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VideoGenerationRequestInputAssetBindings setSlot(String slot) {
            this.slot = slot;
            return this;
        }
        public String getSlot() {
            return this.slot;
        }

    }

    public static class VideoGenerationRequestInput extends TeaModel {
        /**
         * <p>Specifies the purpose and description of images by asset index.</p>
         */
        @NameInMap("AssetBindings")
        public java.util.List<VideoGenerationRequestInputAssetBindings> assetBindings;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("Extra")
        public java.util.Map<String, ?> extra;

        /**
         * <p>The list of product image URLs (1 to 6 images). The URLs must be publicly accessible.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <p>The product title. A maximum of the first 60 characters are used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026 New Slimming Women\&quot;s Summer Dress with Mid-Length Design, High-Quality Waist Definition for a Slender Look</p>
         */
        @NameInMap("Title")
        public String title;

        public static VideoGenerationRequestInput build(java.util.Map<String, ?> map) throws Exception {
            VideoGenerationRequestInput self = new VideoGenerationRequestInput();
            return TeaModel.build(map, self);
        }

        public VideoGenerationRequestInput setAssetBindings(java.util.List<VideoGenerationRequestInputAssetBindings> assetBindings) {
            this.assetBindings = assetBindings;
            return this;
        }
        public java.util.List<VideoGenerationRequestInputAssetBindings> getAssetBindings() {
            return this.assetBindings;
        }

        public VideoGenerationRequestInput setExtra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        public VideoGenerationRequestInput setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public VideoGenerationRequestInput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class VideoGenerationRequestIntent extends TeaModel {
        /**
         * <p>The distribution channel.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The business goal.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Goal")
        public String goal;

        /**
         * <p>Required when goal is set to scripted_video.</p>
         */
        @NameInMap("Script")
        public String script;

        public static VideoGenerationRequestIntent build(java.util.Map<String, ?> map) throws Exception {
            VideoGenerationRequestIntent self = new VideoGenerationRequestIntent();
            return TeaModel.build(map, self);
        }

        public VideoGenerationRequestIntent setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public VideoGenerationRequestIntent setGoal(String goal) {
            this.goal = goal;
            return this;
        }
        public String getGoal() {
            return this.goal;
        }

        public VideoGenerationRequestIntent setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class VideoGenerationRequestOutput extends TeaModel {
        /**
         * <p>The video duration in seconds. Currently supports integers between 5 and 15. More options will be available in the future.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The output resolution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1080p</p>
         */
        @NameInMap("Quality")
        public String quality;

        /**
         * <p>The video aspect ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>9:16</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        public static VideoGenerationRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            VideoGenerationRequestOutput self = new VideoGenerationRequestOutput();
            return TeaModel.build(map, self);
        }

        public VideoGenerationRequestOutput setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public VideoGenerationRequestOutput setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

        public VideoGenerationRequestOutput setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

}
