// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveVerifyContentResponseBody extends TeaModel {
    /**
     * <p>The verification content.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413******</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveVerifyContentResponseBody self = new DescribeLiveVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeLiveVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
