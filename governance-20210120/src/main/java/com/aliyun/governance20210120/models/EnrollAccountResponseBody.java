// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the enrolled account.</p>
     * <p>colspan=&quot;1&quot; rowspan=&quot;1&quot;&gt;</p>
     * <p>143165363236\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>143165363236****</p>
     */
    @NameInMap("AccountUid")
    public Long accountUid;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7071E5FA-515E-5F53-B335-B87D619C6A66</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnrollAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnrollAccountResponseBody self = new EnrollAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public EnrollAccountResponseBody setAccountUid(Long accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public Long getAccountUid() {
        return this.accountUid;
    }

    public EnrollAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
