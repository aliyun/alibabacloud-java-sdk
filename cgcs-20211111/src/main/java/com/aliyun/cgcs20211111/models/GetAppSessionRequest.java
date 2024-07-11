// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1ADE0XXXX</p>
     */
    @NameInMap("CustomSessionId")
    public String customSessionId;

    /**
     * <strong>example:</strong>
     * <p>100XXXX</p>
     */
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    public static GetAppSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSessionRequest self = new GetAppSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSessionRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public GetAppSessionRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

}
