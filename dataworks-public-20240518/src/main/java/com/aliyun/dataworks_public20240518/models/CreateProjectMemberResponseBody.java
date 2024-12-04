// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2B2F0B26-9253-5780-B6DB-F1A886D44D6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberResponseBody self = new CreateProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
