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

    public static class CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule extends TeaModel {
        @NameInMap("Policy")
        public String policy;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Target")
        public String target;

        public static CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule self = new CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class CreatePolicyGroupRequestNetRedirectPolicy extends TeaModel {
        @NameInMap("NetRedirect")
        public String netRedirect;

        @NameInMap("NetRedirectRule")
        public java.util.List<CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule> netRedirectRule;

        public static CreatePolicyGroupRequestNetRedirectPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestNetRedirectPolicy self = new CreatePolicyGroupRequestNetRedirectPolicy();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public CreatePolicyGroupRequestNetRedirectPolicy setNetRedirectRule(java.util.List<CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule> netRedirectRule) {
            this.netRedirectRule = netRedirectRule;
            return this;
        }
        public java.util.List<CreatePolicyGroupRequestNetRedirectPolicyNetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

    }

}
