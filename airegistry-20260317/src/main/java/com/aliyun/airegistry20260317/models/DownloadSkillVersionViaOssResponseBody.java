// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DownloadSkillVersionViaOssResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadSkillVersionViaOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSkillVersionViaOssResponseBody self = new DownloadSkillVersionViaOssResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSkillVersionViaOssResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DownloadSkillVersionViaOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
