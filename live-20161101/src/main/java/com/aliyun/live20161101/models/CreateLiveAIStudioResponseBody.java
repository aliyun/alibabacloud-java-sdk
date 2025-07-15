// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveAIStudioResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17D7526C-69AD-5761-8037-071C27358345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the virtual studio template.</p>
     * 
     * <strong>example:</strong>
     * <p>369ced1f-c33a-49e5-91da-bdaae3d6c1c2</p>
     */
    @NameInMap("StudioId")
    public String studioId;

    public static CreateLiveAIStudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveAIStudioResponseBody self = new CreateLiveAIStudioResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveAIStudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveAIStudioResponseBody setStudioId(String studioId) {
        this.studioId = studioId;
        return this;
    }
    public String getStudioId() {
        return this.studioId;
    }

}
