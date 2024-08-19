// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E7F94C7-781F-5192-86CF-DB085013C810</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteControlPolicyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyTemplateResponseBody self = new DeleteControlPolicyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
