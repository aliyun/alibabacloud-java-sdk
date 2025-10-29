// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBackgroundPicRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1.jpg</p>
     */
    @NameInMap("filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>material/INPUT_CHAT_BACKGROUND_PIC/Mt.CN2VNOPRC5QU2</p>
     */
    @NameInMap("ossKey")
    public String ossKey;

    public static CreateBackgroundPicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackgroundPicRequest self = new CreateBackgroundPicRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackgroundPicRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateBackgroundPicRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
