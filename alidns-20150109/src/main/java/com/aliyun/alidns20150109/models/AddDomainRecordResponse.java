// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static AddDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordResponse self = new AddDomainRecordResponse();
        return TeaModel.build(map, self);
    }

}
