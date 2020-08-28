// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SignStatus")
    @Validation(required = true)
    public Integer signStatus;

    @NameInMap("Reason")
    @Validation(required = true)
    public String reason;

    @NameInMap("SignName")
    @Validation(required = true)
    public String signName;

    @NameInMap("CreateDate")
    @Validation(required = true)
    public String createDate;

    public static QuerySmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignResponse self = new QuerySmsSignResponse();
        return TeaModel.build(map, self);
    }

}
