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

    public BatchAuditTest01Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BatchAuditTest01Request setBatchAuditTest01(String batchAuditTest01) {
        this.batchAuditTest01 = batchAuditTest01;
        return this;
    }
    public String getBatchAuditTest01() {
        return this.batchAuditTest01;
    }

    public BatchAuditTest01Request setDemo01(String demo01) {
        this.demo01 = demo01;
        return this;
    }
    public String getDemo01() {
        return this.demo01;
    }

    public BatchAuditTest01Request setTest010101(Boolean test010101) {
        this.test010101 = test010101;
        return this;
    }
    public Boolean getTest010101() {
        return this.test010101;
    }

}
