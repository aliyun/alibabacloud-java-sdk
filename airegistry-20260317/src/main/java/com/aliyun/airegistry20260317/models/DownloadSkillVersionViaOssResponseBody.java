// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DownloadSkillVersionViaOssResponseBody extends TeaModel {
    /**
     * <p>The OSS URL for downloading the skill.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://sample-bucket.oss-region.aliyuncs.com/xxxxxx">https://sample-bucket.oss-region.aliyuncs.com/xxxxxx</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
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
