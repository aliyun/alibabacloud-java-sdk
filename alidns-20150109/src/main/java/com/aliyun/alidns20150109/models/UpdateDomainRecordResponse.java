// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static UpdateDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordResponse self = new UpdateDomainRecordResponse();
        return TeaModel.build(map, self);
    }

}
