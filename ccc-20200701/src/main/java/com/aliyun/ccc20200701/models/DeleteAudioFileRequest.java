// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteAudioFileRequest extends TeaModel {
    /**
     * <p>Audio resource ID, which is the UUID of the audio file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d5cd7a94-3b6a-47d2-b7fd-0b1cd839bf77</p>
     */
    @NameInMap("AudioResourceId")
    public String audioResourceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
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
