// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateAntCloudAuthSceneRequest extends TeaModel {
    /**
     * <p>Specifies whether to bind a mini program. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: enabled.</li>
     * <li><strong>N (default)</strong>: disabled.<blockquote>
     * <p>Notice: If you enable mini program binding, make sure that you specify all parameters related to the mini program binding..</p>
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
     * <p>The content of the uploaded verification file.</p>
     * 
     * <strong>example:</strong>
     * <p>774c4aab45981ff4a86cde9255a11xxx</p>
     */
    @NameInMap("CheckFileBody")
    public String checkFileBody;

    /**
     * <p>The name of the uploaded verification file.</p>
     * 
     * <strong>example:</strong>
     * <p>测试.txt</p>
     */
    @NameInMap("CheckFileName")
    public String checkFileName;

    /**
     * <p>Specifies whether to enable enhanced device risk detection. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: enabled.</li>
     * <li><strong>N</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("DeviceRiskPlus")
    public String deviceRiskPlus;

    /**
     * <p>The name of the mini program.</p>
     * 
     * <strong>example:</strong>
     * <p>测试APP</p>
     */
    @NameInMap("MiniProgramName")
    public String miniProgramName;

    /**
     * <p>The mini program platform. Valid values:</p>
     * <ul>
     * <li><strong>WECHAT</strong>: WeChat</li>
     * <li><strong>ALIPAY</strong>: Alipay</li>
     * <li><strong>TIKTOK</strong>: TikTok.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The number of returned photos (1 to 5). This parameter takes effect only after StoreImage is enabled for certification file retention.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnPicCount")
    public Long returnPicCount;

    /**
     * <p>The duration of the returned video (1 to 2 seconds). This parameter takes effect only after StoreImage is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReturnVideoLength")
    public Long returnVideoLength;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000013372</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>This parameter is not used. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Specifies whether to deliver certification files generated during the certification process to the user\&quot;s OSS bucket. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: enabled.</li>
     * <li><strong>N (default)</strong>: disabled.</li>
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
