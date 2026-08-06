// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class SubmitSkillVersionResponseBody extends TeaModel {
    /**
     * <p>The skill version.</p>
     * 
     * <strong>example:</strong>
     * <p>ba9b5c2466dc408c9fcd9df72bcd762a</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE66410A-37F8-55C5-8471-589CA195760C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSkillVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSkillVersionResponseBody self = new SubmitSkillVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSkillVersionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitSkillVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
