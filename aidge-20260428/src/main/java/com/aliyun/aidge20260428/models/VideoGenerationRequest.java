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
         * <p>The asset description.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The asset usage.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
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
         * <p>The asset binding list.</p>
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
         * <p>The business goal. Valid values:</p>
         * <p>camera_motion: Camera movement mode. Generates video based on fixed 360° camera movement logic.</p>
         * <p>scripted_video: Scripted mode. Provides a script or prompt, and the system generates video based on the script.</p>
         * <p>auto_video: Unscripted mode. No script is provided. The system automatically plans the script and then generates the video.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_video</p>
         */
        @NameInMap("Goal")
        public String goal;

        /**
         * <p>The script or prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>【2. Shot Breakdown】<br>[0-1s]【Eye-level close-up, static camera】Summer commute trousers folded on a clean tabletop; one corner is quickly unfolded to reveal the solid-color fabric and crisp crease line. The frame focuses on the trouser leg\&quot;s surface smoothness and sharp appearance. [BGM/SFX: Upbeat, crisp commute-vibe background music begins]</p>
         * <p>[1-2s]【Low-angle mid-shot, static camera】The full pair of trousers hangs freely in the air with a slight swing, showcasing the natural drape of the lightweight fabric and the complete straight-leg silhouette, then returns to a still, hanging state.</p>
         * <p>[2-3s]【Eye-level mid-shot, static camera】A commute-styled model stands in a fitting area, holding the folded trousers at waist level with both hands, performing one up-and-down sizing gesture before holding them steady, displaying the overall proportions of the trousers in their folded state and the expected fit. [[Voiceover]: Who says wearing trousers in summer has to be stuffy? Most likely you just haven\&quot;t picked the right pair.]</p>
         * <p>[3-5s]【Eye-level full shot, slight pullback】The commute-styled model, now wearing the trousers paired with a clean commute top, takes two steps forward in a modern office building corridor, dynamically showcasing the front straight-leg silhouette, trouser leg lines, and commute outfit coordination.</p>
         * <p>[5-7s]【Low-angle mid-shot, static camera】The commute-styled model shifts to an angled side stance, one hand in the front pocket and the other in the back pocket, displaying the cut from waist and hip down to the knee, the solid-color surface, and the clean lateral lines.</p>
         * <p>[7-9s]【Eye-level mid-shot, static camera】The commute-styled model lifts one foot onto a low step, one hand brushes down the lower-leg trouser fabric and lightly lifts the hem, briefly exposing the ankle, showcasing the hem edge, side-seam details, and the wearing state during movement. [[Voiceover]: These ice-skin trousers are lightweight and breathable, solid-color straight-leg — looking sharp and at ease even when walking around at work.]</p>
         * <p>[9-11s]【Overhead close-up, static camera】The lens focuses closely on the waistband area; the commute-styled model presses both hands along the waistband contour and smooths it, then pauses to display the seams and actual wearing state, clearly presenting the waistband shape and structural details.</p>
         * <p>[11-13s]【Eye-level close-up, static camera】The commute-styled model gently lifts the fabric on both sides of the thigh with both hands, then raises one knee with a slight lateral turn before returning to a natural stance, demonstrating the actual range of motion during knee-lift and side-turn, as well as how the straight-leg trouser recovers after the foot lands.</p>
         * <p>[13-15s]【Eye-level close-up, static camera】The commute-styled model enters the frame from the rear side, places one hand in the back pocket, then lightly traces along the back pocket edge and rear waist seam, showcasing the back pocket contour, pocket opening edge, and rear waist seam details up close. [[Voiceover]: If you\&quot;re always on the move, there\&quot;s room for knee lifts and side turns — commuting just got easier.]</p>
         * <p>[15-17s]【Eye-level mid-shot, static camera】The commute-styled model faces away to display the rear silhouette of the trousers, hands naturally in pockets with a slight weight shift, then turns slightly to an angled side view so both the rear and lateral trouser lines are visible, fully presenting the rear cut and the overall line from hip and thigh down to the hem.</p>
         * <p>[17-19s]【Eye-level full shot, smooth follow】The commute-styled model first walks sideways to the right, then transitions into a forward stride to complete the full presentation, finishing in the modern office building corridor in full commute attire, clearly showing the front straight-leg silhouette, clean lines, and overall fit. [[Voiceover]: If you like this fit, go check out the details.]</p>
         * <p>【3. Negative/Constraint Instructions】<br>The entire video centers on the summer commute trousers; no unrelated products or multi-person interactions are allowed.</p>
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
