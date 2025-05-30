// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupShrinkRequest extends TeaModel {
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
     * <li>readwrite: read and write.</li>
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
    public String netRedirectPolicyShrink;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultPolicy</p>
     */
    @NameInMap("PolicyGroupName")
    public String policyGroupName;

    @NameInMap("PolicyType")
    public String policyType;

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

    @NameInMap("Watermark")
    public String watermarkShrink;

    public static CreatePolicyGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupShrinkRequest self = new CreatePolicyGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupShrinkRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public CreatePolicyGroupShrinkRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public CreatePolicyGroupShrinkRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public CreatePolicyGroupShrinkRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public CreatePolicyGroupShrinkRequest setLockResolution(String lockResolution) {
        this.lockResolution = lockResolution;
        return this;
    }
    public String getLockResolution() {
        return this.lockResolution;
    }

    public CreatePolicyGroupShrinkRequest setNetRedirectPolicyShrink(String netRedirectPolicyShrink) {
        this.netRedirectPolicyShrink = netRedirectPolicyShrink;
        return this;
    }
    public String getNetRedirectPolicyShrink() {
        return this.netRedirectPolicyShrink;
    }

    public CreatePolicyGroupShrinkRequest setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    public CreatePolicyGroupShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreatePolicyGroupShrinkRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public CreatePolicyGroupShrinkRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public CreatePolicyGroupShrinkRequest setWatermarkShrink(String watermarkShrink) {
        this.watermarkShrink = watermarkShrink;
        return this;
    }
    public String getWatermarkShrink() {
        return this.watermarkShrink;
    }

}
