// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <strong>example:</strong>
     * <p>readwrite</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("LockResolution")
    public String lockResolution;

    @NameInMap("NetRedirectPolicy")
    public CreatePolicyGroupRequestNetRedirectPolicy netRedirectPolicy;

    @NameInMap("PolicyGroupName")
    public String policyGroupName;

    /**
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

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

    public static class CreatePolicyGroupRequestNetRedirectPolicyRules extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

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
        @NameInMap("CustomProxy")
        public String customProxy;

        @NameInMap("HostAddr")
        public String hostAddr;

        @NameInMap("NetRedirect")
        public String netRedirect;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProxyPassword")
        public String proxyPassword;

        @NameInMap("ProxyType")
        public String proxyType;

        @NameInMap("ProxyUserName")
        public String proxyUserName;

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

}
