// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetRtcTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Module")
    @Validation(required = true)
    public String module;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static GetRtcTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRtcTokenResponse self = new GetRtcTokenResponse();
        return TeaModel.build(map, self);
    }

}
