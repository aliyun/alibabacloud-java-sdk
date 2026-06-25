// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable local camera redirection.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>The clipboard permission.</p>
     * 
     * <strong>example:</strong>
     * <p>readwrite</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <p>The file transfer policy for the web client.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <p>The local disk mapping permission.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>Specifies whether to lock the resolution.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LockResolution")
    public String lockResolution;

    /**
     * <p>Network redirection.</p>
     */
    @NameInMap("NetRedirectPolicy")
    public CreatePolicyGroupRequestNetRedirectPolicy netRedirectPolicy;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Default policy</p>
     */
    @NameInMap("PolicyGroupName")
    public String policyGroupName;

    /**
     * <p>The policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The resolution height, in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <p>The resolution width, in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    /**
     * <p>Screen watermark.</p>
     */
    @NameInMap("Watermark")
    public CreatePolicyGroupRequestWatermark watermark;

    public static CreatePolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupRequest self = new CreatePolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public CreatePolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public CreatePolicyGroupRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public CreatePolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public CreatePolicyGroupRequest setLockResolution(String lockResolution) {
        this.lockResolution = lockResolution;
        return this;
    }
    public String getLockResolution() {
        return this.lockResolution;
    }

    public CreatePolicyGroupRequest setNetRedirectPolicy(CreatePolicyGroupRequestNetRedirectPolicy netRedirectPolicy) {
        this.netRedirectPolicy = netRedirectPolicy;
        return this;
    }
    public CreatePolicyGroupRequestNetRedirectPolicy getNetRedirectPolicy() {
        return this.netRedirectPolicy;
    }

    public CreatePolicyGroupRequest setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    public CreatePolicyGroupRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreatePolicyGroupRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public CreatePolicyGroupRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public CreatePolicyGroupRequest setWatermark(CreatePolicyGroupRequestWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public CreatePolicyGroupRequestWatermark getWatermark() {
        return this.watermark;
    }

    public static class CreatePolicyGroupRequestNetRedirectPolicyRules extends TeaModel {
        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The application package name or domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.baidu.com</p>
         */
        @NameInMap("Target")
        public String target;

        public static CreatePolicyGroupRequestNetRedirectPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestNetRedirectPolicyRules self = new CreatePolicyGroupRequestNetRedirectPolicyRules();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestNetRedirectPolicyRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CreatePolicyGroupRequestNetRedirectPolicyRules setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class CreatePolicyGroupRequestNetRedirectPolicy extends TeaModel {
        /**
         * <p>Specifies whether to manually configure a transparent proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CustomProxy")
        public String customProxy;

        /**
         * <p>The IP address of the transparent proxy. The IP address must be in IPv4 format.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("HostAddr")
        public String hostAddr;

        /**
         * <p>Specifies whether to enable network redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The port of the transparent proxy. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1145</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The proxy password. The password must be 1 to 256 characters in length. It cannot contain Chinese characters or whitespace characters.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ProxyPassword")
        public String proxyPassword;

        /**
         * <p>The proxy protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>socks5</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        /**
         * <p>The proxy username. The username must be 1 to 256 characters in length. It cannot contain Chinese characters or whitespace characters.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("ProxyUserName")
        public String proxyUserName;

        /**
         * <p>The list of proxy rules. You can specify up to 100 rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<CreatePolicyGroupRequestNetRedirectPolicyRules> rules;

        public static CreatePolicyGroupRequestNetRedirectPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestNetRedirectPolicy self = new CreatePolicyGroupRequestNetRedirectPolicy();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setCustomProxy(String customProxy) {
            this.customProxy = customProxy;
            return this;
        }
        public String getCustomProxy() {
            return this.customProxy;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setHostAddr(String hostAddr) {
            this.hostAddr = hostAddr;
            return this;
        }
        public String getHostAddr() {
            return this.hostAddr;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setProxyPassword(String proxyPassword) {
            this.proxyPassword = proxyPassword;
            return this;
        }
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setProxyUserName(String proxyUserName) {
            this.proxyUserName = proxyUserName;
            return this;
        }
        public String getProxyUserName() {
            return this.proxyUserName;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setRules(java.util.List<CreatePolicyGroupRequestNetRedirectPolicyRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreatePolicyGroupRequestNetRedirectPolicyRules> getRules() {
            return this.rules;
        }

    }

    public static class CreatePolicyGroupRequestWatermark extends TeaModel {
        /**
         * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>The custom text for the watermark. The text can be up to 10 characters long and cannot contain emojis.</p>
         * 
         * <strong>example:</strong>
         * <p>custom text</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The font size of the watermark. Valid values: 10 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        /**
         * <p>Specifies whether to enable the screen watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The opacity of the watermark. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The screen watermark content.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static CreatePolicyGroupRequestWatermark build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestWatermark self = new CreatePolicyGroupRequestWatermark();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestWatermark setWatermarkColor(Integer watermarkColor) {
            this.watermarkColor = watermarkColor;
            return this;
        }
        public Integer getWatermarkColor() {
            return this.watermarkColor;
        }

        public CreatePolicyGroupRequestWatermark setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public CreatePolicyGroupRequestWatermark setWatermarkFontSize(Integer watermarkFontSize) {
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        public CreatePolicyGroupRequestWatermark setWatermarkSwitch(String watermarkSwitch) {
            this.watermarkSwitch = watermarkSwitch;
            return this;
        }
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        public CreatePolicyGroupRequestWatermark setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        public CreatePolicyGroupRequestWatermark setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

}
