// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class BatchAuditTest01Request extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("BatchAuditTest01")
    public String batchAuditTest01;

    @NameInMap("Demo01")
    public String demo01;

    @NameInMap("Test010101")
    public Boolean test010101;

    public static BatchAuditTest01Request build(java.util.Map<String, ?> map) throws Exception {
        BatchAuditTest01Request self = new BatchAuditTest01Request();
        return TeaModel.build(map, self);
    }

}
