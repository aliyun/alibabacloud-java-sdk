// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileUploadParametersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-file.wav</p>
     */
    @NameInMap("AudioFileName")
    public String audioFileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAudioFileUploadParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileUploadParametersRequest self = new GetAudioFileUploadParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioFileUploadParametersRequest setAudioFileName(String audioFileName) {
        this.audioFileName = audioFileName;
        return this;
    }
    public String getAudioFileName() {
        return this.audioFileName;
    }

    public GetAudioFileUploadParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
