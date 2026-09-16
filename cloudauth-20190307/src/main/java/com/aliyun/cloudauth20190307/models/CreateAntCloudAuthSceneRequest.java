// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAntCloudAuthSceneRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable mini program binding. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Enabled.</li>
     * <li><strong>N (default)</strong>: Disabled.</li>
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
     * <p>test.txt</p>
     */
    @NameInMap("CheckFileName")
    public String checkFileName;

    /**
     * <p>The iOS app scheme for degradation redirect.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudauth://callback</p>
     */
    @NameInMap("DegradeAppScheme")
    public String degradeAppScheme;

    /**
     * <p>The SubCode that triggers degradation.</p>
     * 
     * <strong>example:</strong>
     * <p>201,202</p>
     */
    @NameInMap("DegradeSubCodes")
    public String degradeSubCodes;

    /**
     * <p>The degradation verification type.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("DegradeType")
    public String degradeType;

    /**
     * <p>Specifies whether to enable enhanced device risk detection. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Enabled.</li>
     * <li><strong>N</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("DeviceRiskPlus")
    public String deviceRiskPlus;

    /**
     * <p>The mini program name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("MiniProgramName")
    public String miniProgramName;

    /**
     * <p>The mini program platform to bind. Valid values:</p>
     * <ul>
     * <li><strong>WECHAT</strong>: WeChat.</li>
     * <li><strong>ALIPAY</strong>: Alipay.</li>
     * <li><strong>TIKTOK</strong>: TikTok.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The number of face photos for evidence storage (1-5).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnPicCount")
    public Long returnPicCount;

    /**
     * <p>The duration of the evidence storage video, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnVideoLength")
    public Long returnVideoLength;

    /**
     * <p>The scenario name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestScenario</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>Specifies whether to deliver files generated during verification to the customer\&quot;s OSS. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Yes.</li>
     * <li><strong>N</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StoreImage")
    public String storeImage;

    /**
     * <p>Specifies whether to enable degradation.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("UseDegrade")
    public String useDegrade;

    public static CreateAntCloudAuthSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntCloudAuthSceneRequest self = new CreateAntCloudAuthSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntCloudAuthSceneRequest setBindMiniProgram(String bindMiniProgram) {
        this.bindMiniProgram = bindMiniProgram;
        return this;
    }
    public String getBindMiniProgram() {
        return this.bindMiniProgram;
    }

    public CreateAntCloudAuthSceneRequest setCheckFileBody(String checkFileBody) {
        this.checkFileBody = checkFileBody;
        return this;
    }
    public String getCheckFileBody() {
        return this.checkFileBody;
    }

    public CreateAntCloudAuthSceneRequest setCheckFileName(String checkFileName) {
        this.checkFileName = checkFileName;
        return this;
    }
    public String getCheckFileName() {
        return this.checkFileName;
    }

    public CreateAntCloudAuthSceneRequest setDegradeAppScheme(String degradeAppScheme) {
        this.degradeAppScheme = degradeAppScheme;
        return this;
    }
    public String getDegradeAppScheme() {
        return this.degradeAppScheme;
    }

    public CreateAntCloudAuthSceneRequest setDegradeSubCodes(String degradeSubCodes) {
        this.degradeSubCodes = degradeSubCodes;
        return this;
    }
    public String getDegradeSubCodes() {
        return this.degradeSubCodes;
    }

    public CreateAntCloudAuthSceneRequest setDegradeType(String degradeType) {
        this.degradeType = degradeType;
        return this;
    }
    public String getDegradeType() {
        return this.degradeType;
    }

    public CreateAntCloudAuthSceneRequest setDeviceRiskPlus(String deviceRiskPlus) {
        this.deviceRiskPlus = deviceRiskPlus;
        return this;
    }
    public String getDeviceRiskPlus() {
        return this.deviceRiskPlus;
    }

    public CreateAntCloudAuthSceneRequest setMiniProgramName(String miniProgramName) {
        this.miniProgramName = miniProgramName;
        return this;
    }
    public String getMiniProgramName() {
        return this.miniProgramName;
    }

    public CreateAntCloudAuthSceneRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateAntCloudAuthSceneRequest setReturnPicCount(Long returnPicCount) {
        this.returnPicCount = returnPicCount;
        return this;
    }
    public Long getReturnPicCount() {
        return this.returnPicCount;
    }

    public CreateAntCloudAuthSceneRequest setReturnVideoLength(Long returnVideoLength) {
        this.returnVideoLength = returnVideoLength;
        return this;
    }
    public Long getReturnVideoLength() {
        return this.returnVideoLength;
    }

    public CreateAntCloudAuthSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public CreateAntCloudAuthSceneRequest setStoreImage(String storeImage) {
        this.storeImage = storeImage;
        return this;
    }
    public String getStoreImage() {
        return this.storeImage;
    }

    public CreateAntCloudAuthSceneRequest setUseDegrade(String useDegrade) {
        this.useDegrade = useDegrade;
        return this;
    }
    public String getUseDegrade() {
        return this.useDegrade;
    }

}
