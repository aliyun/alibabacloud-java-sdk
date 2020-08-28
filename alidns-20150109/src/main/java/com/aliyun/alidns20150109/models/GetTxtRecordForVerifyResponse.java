// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("Value")
    @Validation(required = true)
    public String value;

    public static GetTxtRecordForVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyResponse self = new GetTxtRecordForVerifyResponse();
        return TeaModel.build(map, self);
    }

}
