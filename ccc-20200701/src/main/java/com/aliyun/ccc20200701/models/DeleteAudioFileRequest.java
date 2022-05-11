// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteAudioFileRequest extends TeaModel {
    @NameInMap("AudioResourceId")
    public String audioResourceId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteAudioFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAudioFileRequest self = new DeleteAudioFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAudioFileRequest setAudioResourceId(String audioResourceId) {
        this.audioResourceId = audioResourceId;
        return this;
    }
    public String getAudioResourceId() {
        return this.audioResourceId;
    }

    public DeleteAudioFileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
