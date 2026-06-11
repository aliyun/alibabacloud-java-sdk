// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UploadSkillViaOssResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadSkillViaOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadSkillViaOssResponseBody self = new UploadSkillViaOssResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadSkillViaOssResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadSkillViaOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
