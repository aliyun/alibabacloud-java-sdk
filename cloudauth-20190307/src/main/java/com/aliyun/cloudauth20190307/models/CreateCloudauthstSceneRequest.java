// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateCloudauthstSceneRequest extends TeaModel {
    /**
     * <p>Product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMART_COMPARE</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

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
     * <li><strong>Y</strong>: Enable</li>
     * <li><strong>N</strong>: Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StoreImage")
    public String storeImage;

    public static CreateCloudauthstSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudauthstSceneRequest self = new CreateCloudauthstSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudauthstSceneRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateCloudauthstSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public CreateCloudauthstSceneRequest setStoreImage(String storeImage) {
        this.storeImage = storeImage;
        return this;
    }
    public String getStoreImage() {
        return this.storeImage;
    }

}
