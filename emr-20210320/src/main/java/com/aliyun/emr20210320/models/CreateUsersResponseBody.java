// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersResponseBody self = new CreateUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUsersResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
