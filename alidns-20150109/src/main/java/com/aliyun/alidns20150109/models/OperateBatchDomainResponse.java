// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static OperateBatchDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBatchDomainResponse self = new OperateBatchDomainResponse();
        return TeaModel.build(map, self);
    }

}
