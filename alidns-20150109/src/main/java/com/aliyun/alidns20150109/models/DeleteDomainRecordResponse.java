// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static DeleteDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRecordResponse self = new DeleteDomainRecordResponse();
        return TeaModel.build(map, self);
    }

}
