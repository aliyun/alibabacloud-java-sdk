// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupShrinkRequest extends TeaModel {
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
     * <p>The file transfer policy for the Wuying web client.</p>
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
    public String netRedirectPolicyShrink;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-4bi18ebi9tfjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Default policy</p>
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

    /**
     * <p>The screen watermark.</p>
     */
    @NameInMap("Watermark")
    public String watermarkShrink;

    public static ModifyPolicyGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupShrinkRequest self = new ModifyPolicyGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupShrinkRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public ModifyPolicyGroupShrinkRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyPolicyGroupShrinkRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public ModifyPolicyGroupShrinkRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyPolicyGroupShrinkRequest setLockResolution(String lockResolution) {
        this.lockResolution = lockResolution;
        return this;
    }
    public String getLockResolution() {
        return this.lockResolution;
    }

    public ModifyPolicyGroupShrinkRequest setNetRedirectPolicyShrink(String netRedirectPolicyShrink) {
        this.netRedirectPolicyShrink = netRedirectPolicyShrink;
        return this;
    }
    public String getNetRedirectPolicyShrink() {
        return this.netRedirectPolicyShrink;
    }

    public ModifyPolicyGroupShrinkRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyPolicyGroupShrinkRequest setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    public ModifyPolicyGroupShrinkRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public ModifyPolicyGroupShrinkRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public ModifyPolicyGroupShrinkRequest setWatermarkShrink(String watermarkShrink) {
        this.watermarkShrink = watermarkShrink;
        return this;
    }
    public String getWatermarkShrink() {
        return this.watermarkShrink;
    }

}
