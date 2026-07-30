// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoGenerationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public VideoGenerationRequestInput input;

    @NameInMap("Intent")
    public VideoGenerationRequestIntent intent;

    /**
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

    public static class VideoGenerationRequestInput extends TeaModel {
        @NameInMap("Extra")
        public java.util.Map<String, ?> extra;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Title")
        public String title;

        public static VideoGenerationRequestInput build(java.util.Map<String, ?> map) throws Exception {
            VideoGenerationRequestInput self = new VideoGenerationRequestInput();
            return TeaModel.build(map, self);
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
        @NameInMap("Channel")
        public String channel;

        @NameInMap("Goal")
        public String goal;

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

    }

    public static class VideoGenerationRequestOutput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Quality")
        public String quality;

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
