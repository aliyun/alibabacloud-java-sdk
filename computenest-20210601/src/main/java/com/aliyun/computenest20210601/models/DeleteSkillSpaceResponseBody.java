// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeleteSkillSpaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSkillSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillSpaceResponseBody self = new DeleteSkillSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSkillSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
