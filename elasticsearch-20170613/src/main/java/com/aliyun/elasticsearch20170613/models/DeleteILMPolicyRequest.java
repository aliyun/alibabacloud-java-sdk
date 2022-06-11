// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteILMPolicyRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DeleteILMPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteILMPolicyRequest self = new DeleteILMPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteILMPolicyRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
