// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>pg-4bi18ebi9tfjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

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

}
