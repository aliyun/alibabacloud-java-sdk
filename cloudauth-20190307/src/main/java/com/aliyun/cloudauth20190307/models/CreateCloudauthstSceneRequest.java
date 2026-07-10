// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateCloudauthstSceneRequest extends TeaModel {
    /**
     * <p>The product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMART_COMPARE</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The scenario name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试场景</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>Specifies whether to deliver files generated during authentication to the customer\&quot;s OSS. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Enabled.</li>
     * <li><strong>N</strong>: Disabled.</li>
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
