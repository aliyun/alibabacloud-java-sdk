// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateAntCloudAuthSceneRequest extends TeaModel {
    /**
     * <p>Whether to enable binding to a mini program:</p>
     * <ul>
     * <li><strong>Y</strong>: Enable</li>
     * <li><strong>N (default)</strong>: Do not enable<blockquote>
     * <p>Notice: If enabling the binding of a mini program, please ensure all parameters for the mini program are passed.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("BindMiniProgram")
    public String bindMiniProgram;

    /**
     * <p>Content of the uploaded verification file.</p>
     * 
     * <strong>example:</strong>
     * <p>774c4aab45981ff4a86cde9255a11xxx</p>
     */
    @NameInMap("CheckFileBody")
    public String checkFileBody;

    /**
     * <p>Name of the uploaded verification file.</p>
     * 
     * <strong>example:</strong>
     * <p>测试.txt</p>
     */
    @NameInMap("CheckFileName")
    public String checkFileName;

    @NameInMap("DeviceRiskPlus")
    public String deviceRiskPlus;

    /**
     * <p>Mini program name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试APP</p>
     */
    @NameInMap("MiniProgramName")
    public String miniProgramName;

    /**
     * <p>Binding mini program platform:</p>
     * <ul>
     * <li><strong>WECHAT</strong>: WeChat</li>
     * <li><strong>ALIPAY</strong>: Alipay</li>
     * <li><strong>TIKTOK</strong>: TikTok</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ReturnPicCount")
    public Long returnPicCount;

    @NameInMap("ReturnVideoLength")
    public Long returnVideoLength;

    /**
     * <p>Scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000013372</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>Currently meaningless, can be omitted.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Whether to enable delivering the authentication files generated during the authentication process to the user\&quot;s OSS:</p>
     * <ul>
     * <li><strong>Y</strong>: Enable</li>
     * <li><strong>N (default)</strong>: Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StoreImage")
    public String storeImage;

    public static UpdateAntCloudAuthSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntCloudAuthSceneRequest self = new UpdateAntCloudAuthSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntCloudAuthSceneRequest setBindMiniProgram(String bindMiniProgram) {
        this.bindMiniProgram = bindMiniProgram;
        return this;
    }
    public String getBindMiniProgram() {
        return this.bindMiniProgram;
    }

    public UpdateAntCloudAuthSceneRequest setCheckFileBody(String checkFileBody) {
        this.checkFileBody = checkFileBody;
        return this;
    }
    public String getCheckFileBody() {
        return this.checkFileBody;
    }

    public UpdateAntCloudAuthSceneRequest setCheckFileName(String checkFileName) {
        this.checkFileName = checkFileName;
        return this;
    }
    public String getCheckFileName() {
        return this.checkFileName;
    }

    public UpdateAntCloudAuthSceneRequest setDeviceRiskPlus(String deviceRiskPlus) {
        this.deviceRiskPlus = deviceRiskPlus;
        return this;
    }
    public String getDeviceRiskPlus() {
        return this.deviceRiskPlus;
    }

    public UpdateAntCloudAuthSceneRequest setMiniProgramName(String miniProgramName) {
        this.miniProgramName = miniProgramName;
        return this;
    }
    public String getMiniProgramName() {
        return this.miniProgramName;
    }

    public UpdateAntCloudAuthSceneRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public UpdateAntCloudAuthSceneRequest setReturnPicCount(Long returnPicCount) {
        this.returnPicCount = returnPicCount;
        return this;
    }
    public Long getReturnPicCount() {
        return this.returnPicCount;
    }

    public UpdateAntCloudAuthSceneRequest setReturnVideoLength(Long returnVideoLength) {
        this.returnVideoLength = returnVideoLength;
        return this;
    }
    public Long getReturnVideoLength() {
        return this.returnVideoLength;
    }

    public UpdateAntCloudAuthSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public UpdateAntCloudAuthSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public UpdateAntCloudAuthSceneRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateAntCloudAuthSceneRequest setStoreImage(String storeImage) {
        this.storeImage = storeImage;
        return this;
    }
    public String getStoreImage() {
        return this.storeImage;
    }

}
