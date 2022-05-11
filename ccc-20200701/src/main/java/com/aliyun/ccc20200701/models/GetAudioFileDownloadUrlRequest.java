// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileDownloadUrlRequest extends TeaModel {
    @NameInMap("AudioResourceId")
    public String audioResourceId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAudioFileDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileDownloadUrlRequest self = new GetAudioFileDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioFileDownloadUrlRequest setAudioResourceId(String audioResourceId) {
        this.audioResourceId = audioResourceId;
        return this;
    }
    public String getAudioResourceId() {
        return this.audioResourceId;
    }

    public GetAudioFileDownloadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
