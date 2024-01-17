// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAccessPageSessionRequest extends TeaModel {
    @NameInMap("AccessPageId")
    public String accessPageId;

    @NameInMap("AccessPageToken")
    public String accessPageToken;

    @NameInMap("ExternalUserId")
    public String externalUserId;

    public static GetAccessPageSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPageSessionRequest self = new GetAccessPageSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessPageSessionRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

    public GetAccessPageSessionRequest setAccessPageToken(String accessPageToken) {
        this.accessPageToken = accessPageToken;
        return this;
    }
    public String getAccessPageToken() {
        return this.accessPageToken;
    }

    public GetAccessPageSessionRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

}
