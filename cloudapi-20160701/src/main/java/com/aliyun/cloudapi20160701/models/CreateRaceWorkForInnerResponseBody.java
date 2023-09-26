// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateRaceWorkForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRaceWorkForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRaceWorkForInnerResponseBody self = new CreateRaceWorkForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRaceWorkForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
