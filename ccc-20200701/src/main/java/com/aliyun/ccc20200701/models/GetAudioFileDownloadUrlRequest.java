// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileDownloadUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acc300c4-75c9-41ba-ba5e-2a365c96c248</p>
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
