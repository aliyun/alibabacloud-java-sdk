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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The display policy.</p>
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
         * <p>The streaming mode. This parameter is used together with the Webrtc parameter to specify the protocol type.</p>
         * <ul>
         * <li>Webrtc=<code>true</code> and StreamingMode=<code>video</code>: WebRTC stream.</li>
         * <li>Webrtc=<code>false</code> and StreamingMode=<code>video</code>: video stream.</li>
         * <li>Webrtc=<code>false</code> and StreamingMode=<code>mix</code>: mixed stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>Specifies whether to use adaptive resolution.</p>
         * <ul>
         * <li><p><code>true</code>: The session resolution follows changes in the terminal display area. In this case, SessionResolutionWidth and SessionResolutionHeight specify the maximum resolution values.</p>
         * </li>
         * <li><p><code>false</code>: The session resolution does not follow changes in the terminal display area. In this case, the resolution is fixed to the values of SessionResolutionWidth and SessionResolutionHeight.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TerminalResolutionAdaptive")
        public Boolean terminalResolutionAdaptive;

        /**
         * <p>The visual quality strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        @NameInMap("VisualQualityStrategy")
        public String visualQualityStrategy;

        /**
         * <p>Specifies whether to enable WebRTC. This parameter is used together with the StreamingMode parameter to specify the protocol type.</p>
         * <ul>
         * <li>Webrtc=<code>true</code> and StreamingMode=<code>video</code>: WebRTC stream.</li>
         * <li>Webrtc=<code>false</code> and StreamingMode=<code>video</code>: video stream.</li>
         * <li>Webrtc=<code>false</code> and StreamingMode=<code>mix</code>: mixed stream.</li>
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
