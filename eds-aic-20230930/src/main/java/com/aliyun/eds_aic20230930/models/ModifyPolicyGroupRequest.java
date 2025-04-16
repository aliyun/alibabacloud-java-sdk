// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the webcam redirection feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>The read/write permissions on the clipboard.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>read: read-only.</li>
     * <li>readwrite: ready and write.</li>
     * <li>off: read/write disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>readwrite</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <p>The file transfer policy of the Alibaba Cloud Workspace web client.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>all: File upload and download are supported.</li>
     * <li>download: Only file download is supported.</li>
     * <li>upload: Only file upload is supported.</li>
     * <li>off: File upload or download is forbidden.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <p>The read/write permissions on the on-premises drive.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>read: read-only.</li>
     * <li>readwrite: ready and write.</li>
     * <li>off: read/write disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>Specifies whether to lock the resolution.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LockResolution")
    public String lockResolution;

    /**
     * <p>The network redirection policy.</p>
     */
    @NameInMap("NetRedirectPolicy")
    public ModifyPolicyGroupRequestNetRedirectPolicy netRedirectPolicy;

    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-4bi18ebi9tfjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultPolicyGroup</p>
     */
    @NameInMap("PolicyGroupName")
    public String policyGroupName;

    /**
     * <p>The height of the resolution. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <p>The width of the resolution. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    public static ModifyPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupRequest self = new ModifyPolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public ModifyPolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyPolicyGroupRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public ModifyPolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyPolicyGroupRequest setLockResolution(String lockResolution) {
        this.lockResolution = lockResolution;
        return this;
    }
    public String getLockResolution() {
        return this.lockResolution;
    }

    public ModifyPolicyGroupRequest setNetRedirectPolicy(ModifyPolicyGroupRequestNetRedirectPolicy netRedirectPolicy) {
        this.netRedirectPolicy = netRedirectPolicy;
        return this;
    }
    public ModifyPolicyGroupRequestNetRedirectPolicy getNetRedirectPolicy() {
        return this.netRedirectPolicy;
    }

    public ModifyPolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyPolicyGroupRequest setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    public ModifyPolicyGroupRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public ModifyPolicyGroupRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public static class ModifyPolicyGroupRequestNetRedirectPolicyRules extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Target")
        public String target;

        public static ModifyPolicyGroupRequestNetRedirectPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestNetRedirectPolicyRules self = new ModifyPolicyGroupRequestNetRedirectPolicyRules();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestNetRedirectPolicyRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicyRules setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ModifyPolicyGroupRequestNetRedirectPolicy extends TeaModel {
        /**
         * <p>Specifies whether to manually configure a custom proxy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CustomProxy")
        public String customProxy;

        /**
         * <p>The IPv4 address of the custom proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("HostAddr")
        public String hostAddr;

        /**
         * <p>Specifies whether to enable network redirection.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The port of the custom proxy. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1145</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The password of the proxy. The password must be 1 to 256 in length and cannot contain Chinese character or space characters.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ProxyPassword")
        public String proxyPassword;

        /**
         * <p>The type of the proxy protocol.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>socks5.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>socks5</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        /**
         * <p>The username of the proxy. The name must be 1 to 256 in length and cannot contain Chinese character or space characters.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("ProxyUserName")
        public String proxyUserName;

        @NameInMap("Rules")
        public java.util.List<ModifyPolicyGroupRequestNetRedirectPolicyRules> rules;

        public static ModifyPolicyGroupRequestNetRedirectPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestNetRedirectPolicy self = new ModifyPolicyGroupRequestNetRedirectPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setCustomProxy(String customProxy) {
            this.customProxy = customProxy;
            return this;
        }
        public String getCustomProxy() {
            return this.customProxy;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setHostAddr(String hostAddr) {
            this.hostAddr = hostAddr;
            return this;
        }
        public String getHostAddr() {
            return this.hostAddr;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setProxyPassword(String proxyPassword) {
            this.proxyPassword = proxyPassword;
            return this;
        }
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setProxyUserName(String proxyUserName) {
            this.proxyUserName = proxyUserName;
            return this;
        }
        public String getProxyUserName() {
            return this.proxyUserName;
        }

        public ModifyPolicyGroupRequestNetRedirectPolicy setRules(java.util.List<ModifyPolicyGroupRequestNetRedirectPolicyRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ModifyPolicyGroupRequestNetRedirectPolicyRules> getRules() {
            return this.rules;
        }

    }

}
