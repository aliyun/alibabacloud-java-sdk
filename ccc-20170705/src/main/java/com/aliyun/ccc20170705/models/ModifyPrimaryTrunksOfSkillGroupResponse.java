// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPrimaryTrunksOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPrimaryTrunksOfSkillGroupResponseBody body;

    public static ModifyPrimaryTrunksOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrimaryTrunksOfSkillGroupResponse self = new ModifyPrimaryTrunksOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrimaryTrunksOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrimaryTrunksOfSkillGroupResponse setBody(ModifyPrimaryTrunksOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrimaryTrunksOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
