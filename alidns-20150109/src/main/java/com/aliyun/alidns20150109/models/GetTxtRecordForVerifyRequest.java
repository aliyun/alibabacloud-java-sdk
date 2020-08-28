// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static GetTxtRecordForVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyRequest self = new GetTxtRecordForVerifyRequest();
        return TeaModel.build(map, self);
    }

}
