// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastAudioRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>audio.mp3</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>material/INPUT_BROADCAST_INFER_AUDIO/Mt.CPRLVQRR27YU2</p>
     */
    @NameInMap("ossKey")
    public String ossKey;

    public static CreateBroadcastAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastAudioRequest self = new CreateBroadcastAudioRequest();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastAudioRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateBroadcastAudioRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
