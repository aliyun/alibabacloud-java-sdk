// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateSkillDraftResponseBody extends TeaModel {
    /**
     * <p>The Skill version.</p>
     * 
     * <strong>example:</strong>
     * <p>3aa3fb14dddd4bdb941cf4536e4e918b</p>
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

    public static CreateSkillDraftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillDraftResponseBody self = new CreateSkillDraftResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillDraftResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSkillDraftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
