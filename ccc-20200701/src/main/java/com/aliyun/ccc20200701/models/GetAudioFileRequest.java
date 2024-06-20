// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c1a06b46-302a-4c6e-928b-a43c0df485cf</p>
     */
    @NameInMap("AudioResourceId")
    public String audioResourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAudioFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileRequest self = new GetAudioFileRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioFileRequest setAudioResourceId(String audioResourceId) {
        this.audioResourceId = audioResourceId;
        return this;
    }
    public String getAudioResourceId() {
        return this.audioResourceId;
    }

    public GetAudioFileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
