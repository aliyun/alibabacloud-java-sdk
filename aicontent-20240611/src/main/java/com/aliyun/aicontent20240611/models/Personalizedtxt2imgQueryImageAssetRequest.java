// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryImageAssetRequest extends TeaModel {
    /**
     * <p>The encoding format of the image. If this parameter is set to <code>base64</code>, the image is returned as a Base64-encoded string. If this parameter is omitted, the raw binary data of the image is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("encodeFormat")
    public String encodeFormat;

    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0000.png</p>
     */
    @NameInMap("imageId")
    public String imageId;

    /**
     * <p>The ID of the model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>girl-xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>The ID of the prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("promptId")
    public String promptId;

    public static Personalizedtxt2imgQueryImageAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryImageAssetRequest self = new Personalizedtxt2imgQueryImageAssetRequest();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryImageAssetRequest setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
        return this;
    }
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    public Personalizedtxt2imgQueryImageAssetRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public Personalizedtxt2imgQueryImageAssetRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Personalizedtxt2imgQueryImageAssetRequest setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

}
