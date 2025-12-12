// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAntCloudAuthSceneRequest extends TeaModel {
    /**
     * <p>Whether to enable binding of the mini program:</p>
     * <ul>
     * <li><strong>Y</strong>: Enable</li>
     * <li><strong>N (default)</strong>: Not enabled</li>
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

    /**
     * <p>Mini program name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试APP</p>
     */
    @NameInMap("MiniProgramName")
    public String miniProgramName;

    /**
     * <p>Binding platform for the mini program:</p>
     * <ul>
     * <li><strong>WECHAT</strong>: WeChat</li>
     * <li><strong>ALIPAY</strong>: Alipay</li>
     * <li><strong>TIKTOK</strong>: TikTok</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ReturnPicCount")
    public Long returnPicCount;

    @NameInMap("ReturnVideoLength")
    public Long returnVideoLength;

    /**
     * <p>Scene name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试场景</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>Whether to deliver the files generated from the authentication to the customer\&quot;s OSS:</p>
     * <ul>
     * <li><strong>Y</strong>: Yes</li>
     * <li><strong>N</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StoreImage")
    public String storeImage;

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

}
