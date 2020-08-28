// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static SetDomainRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRecordStatusResponse self = new SetDomainRecordStatusResponse();
        return TeaModel.build(map, self);
    }

}
