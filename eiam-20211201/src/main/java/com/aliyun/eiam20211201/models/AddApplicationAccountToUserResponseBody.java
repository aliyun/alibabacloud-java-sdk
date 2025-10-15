// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddApplicationAccountToUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aac_m6z7awz5kresi2ezgajsbkxxxx</p>
     */
    @NameInMap("ApplicationAccountId")
    public String applicationAccountId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddApplicationAccountToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddApplicationAccountToUserResponseBody self = new AddApplicationAccountToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddApplicationAccountToUserResponseBody setApplicationAccountId(String applicationAccountId) {
        this.applicationAccountId = applicationAccountId;
        return this;
    }
    public String getApplicationAccountId() {
        return this.applicationAccountId;
    }

    public AddApplicationAccountToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
