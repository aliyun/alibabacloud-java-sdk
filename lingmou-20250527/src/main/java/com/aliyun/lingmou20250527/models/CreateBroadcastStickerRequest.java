// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastStickerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sticker.png</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>material/INPUT_BROADCAST_STICKER/Mt.CPRLVQRR27YU2</p>
     */
    @NameInMap("ossKey")
    public String ossKey;

    public static CreateBroadcastStickerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastStickerRequest self = new CreateBroadcastStickerRequest();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastStickerRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateBroadcastStickerRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
