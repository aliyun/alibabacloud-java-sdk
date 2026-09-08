// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatesRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Media type. The default is audio (AUDIO).</p>
     * 
     * <strong>example:</strong>
     * <p>AUDIO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    public static GetRealtimeInstanceStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatesRequest self = new GetRealtimeInstanceStatesRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRealtimeInstanceStatesRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

}
