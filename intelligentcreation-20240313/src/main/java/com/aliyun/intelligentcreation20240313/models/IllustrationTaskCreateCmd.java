// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class IllustrationTaskCreateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0-不换背景，1-换背景</p>
     */
    @NameInMap("backgroundType")
    public Integer backgroundType;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("dstHeight")
    public Integer dstHeight;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("dstWidth")
    public Integer dstWidth;

    /**
     * <strong>example:</strong>
     * <p>28274623764834</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("nums")
    public Integer nums;

    @NameInMap("ossPaths")
    public java.util.List<String> ossPaths;

    @NameInMap("stickerText")
    public String stickerText;

    public static IllustrationTaskCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        IllustrationTaskCreateCmd self = new IllustrationTaskCreateCmd();
        return TeaModel.build(map, self);
    }

    public IllustrationTaskCreateCmd setBackgroundType(Integer backgroundType) {
        this.backgroundType = backgroundType;
        return this;
    }
    public Integer getBackgroundType() {
        return this.backgroundType;
    }

    public IllustrationTaskCreateCmd setDstHeight(Integer dstHeight) {
        this.dstHeight = dstHeight;
        return this;
    }
    public Integer getDstHeight() {
        return this.dstHeight;
    }

    public IllustrationTaskCreateCmd setDstWidth(Integer dstWidth) {
        this.dstWidth = dstWidth;
        return this;
    }
    public Integer getDstWidth() {
        return this.dstWidth;
    }

    public IllustrationTaskCreateCmd setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public IllustrationTaskCreateCmd setNums(Integer nums) {
        this.nums = nums;
        return this;
    }
    public Integer getNums() {
        return this.nums;
    }

    public IllustrationTaskCreateCmd setOssPaths(java.util.List<String> ossPaths) {
        this.ossPaths = ossPaths;
        return this;
    }
    public java.util.List<String> getOssPaths() {
        return this.ossPaths;
    }

    public IllustrationTaskCreateCmd setStickerText(String stickerText) {
        this.stickerText = stickerText;
        return this;
    }
    public String getStickerText() {
        return this.stickerText;
    }

}
