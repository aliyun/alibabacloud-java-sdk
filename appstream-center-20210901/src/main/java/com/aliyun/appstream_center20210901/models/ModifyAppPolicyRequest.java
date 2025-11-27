// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppPolicyRequest extends TeaModel {
    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-ee2znjktwgxu2****</p>
     */
    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>The product type.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>CloudApp: RDS Cloud App</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Displays the policy.</p>
     */
    @NameInMap("VideoPolicy")
    public ModifyAppPolicyRequestVideoPolicy videoPolicy;

    public static ModifyAppPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppPolicyRequest self = new ModifyAppPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppPolicyRequest setAppPolicyId(String appPolicyId) {
        this.appPolicyId = appPolicyId;
        return this;
    }
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    public ModifyAppPolicyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyAppPolicyRequest setVideoPolicy(ModifyAppPolicyRequestVideoPolicy videoPolicy) {
        this.videoPolicy = videoPolicy;
        return this;
    }
    public ModifyAppPolicyRequestVideoPolicy getVideoPolicy() {
        return this.videoPolicy;
    }

    public static class ModifyAppPolicyRequestVideoPolicy extends TeaModel {
        /**
         * <p>The frame rate (FPS).</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>30: 30 FPS</li>
         * <li>60: 60 FPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        /**
         * <p>The height of the resolution, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        /**
         * <p>The width of the resolution, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("SessionResolutionWidth")
        public Integer sessionResolutionWidth;

        /**
         * <p>The stream mode. This parameter is used together with <code>Webrtc</code> to specify the protocol type.</p>
         * <ul>
         * <li>If you set <code>Webrtc</code> to <code>true</code> and <code>StreamingMode</code> to <code>video</code>, Web Real-Time Communications (WebRTC) streams are used.</li>
         * <li>If you set <code>Webrtc</code> to <code>false</code> and <code>StreamingMode</code> to <code>video</code>, video streams are used.</li>
         * <li>If you set <code>Webrtc</code> to <code>false</code> and <code>StreamingMode</code> to <code>mix</code>, mixed streams are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>Whether to use adaptive resolution.</p>
         * <ul>
         * <li><code>true</code>: The session resolution changes with the display area of the terminal. In this case, <code>SessionResolutionWidth</code> indicates the maximum resolution width and <code>SessionResolutionHeight</code> indicates the maximum resolution height.</li>
         * <li><code>false</code>: The session resolution does not change with the display area of the terminal. In this case, <code>SessionResolutionWidth</code> specifies the fixed resolution width and <code>SessionResolutionHeight</code> specifies the fixed resolution height.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TerminalResolutionAdaptive")
        public Boolean terminalResolutionAdaptive;

        /**
         * <p>The image quality policy.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>adaptive: adaptive.</li>
         * <li>smooth: smooth first.</li>
         * <li>quality: quality first.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        @NameInMap("VisualQualityStrategy")
        public String visualQualityStrategy;

        /**
         * <p>Specifies whether to enable WebRTC. This parameter is used together with <code>StreamingMode</code> to specify the protocol type.</p>
         * <ul>
         * <li>If you set <code>Webrtc</code> to <code>true</code> and <code>StreamingMode</code> to <code>video</code>, WebRTC streams are used.</li>
         * <li>If you set <code>Webrtc</code> to <code>false</code> and <code>StreamingMode</code> to <code>video</code>, video streams are used.</li>
         * <li>If you set <code>Webrtc</code> to <code>false</code> and <code>StreamingMode</code> to <code>mix</code>, mixed streams are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Webrtc")
        public Boolean webrtc;

        public static ModifyAppPolicyRequestVideoPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppPolicyRequestVideoPolicy self = new ModifyAppPolicyRequestVideoPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyAppPolicyRequestVideoPolicy setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public ModifyAppPolicyRequestVideoPolicy setSessionResolutionHeight(Integer sessionResolutionHeight) {
            this.sessionResolutionHeight = sessionResolutionHeight;
            return this;
        }
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        public ModifyAppPolicyRequestVideoPolicy setSessionResolutionWidth(Integer sessionResolutionWidth) {
            this.sessionResolutionWidth = sessionResolutionWidth;
            return this;
        }
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        public ModifyAppPolicyRequestVideoPolicy setStreamingMode(String streamingMode) {
            this.streamingMode = streamingMode;
            return this;
        }
        public String getStreamingMode() {
            return this.streamingMode;
        }

        public ModifyAppPolicyRequestVideoPolicy setTerminalResolutionAdaptive(Boolean terminalResolutionAdaptive) {
            this.terminalResolutionAdaptive = terminalResolutionAdaptive;
            return this;
        }
        public Boolean getTerminalResolutionAdaptive() {
            return this.terminalResolutionAdaptive;
        }

        public ModifyAppPolicyRequestVideoPolicy setVisualQualityStrategy(String visualQualityStrategy) {
            this.visualQualityStrategy = visualQualityStrategy;
            return this;
        }
        public String getVisualQualityStrategy() {
            return this.visualQualityStrategy;
        }

        public ModifyAppPolicyRequestVideoPolicy setWebrtc(Boolean webrtc) {
            this.webrtc = webrtc;
            return this;
        }
        public Boolean getWebrtc() {
            return this.webrtc;
        }

    }

}
