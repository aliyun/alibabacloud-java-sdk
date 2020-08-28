// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class BatchAuditTest01Response extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Demo01")
    @Validation(required = true)
    public BatchAuditTest01ResponseDemo01 demo01;

    public static BatchAuditTest01Response build(java.util.Map<String, ?> map) throws Exception {
        BatchAuditTest01Response self = new BatchAuditTest01Response();
        return TeaModel.build(map, self);
    }

    public static class BatchAuditTest01ResponseDemo01Demo011Demo011 extends TeaModel {
        @NameInMap("Demo0111")
        @Validation(required = true)
        public String demo0111;

        public static BatchAuditTest01ResponseDemo01Demo011Demo011 build(java.util.Map<String, ?> map) throws Exception {
            BatchAuditTest01ResponseDemo01Demo011Demo011 self = new BatchAuditTest01ResponseDemo01Demo011Demo011();
            return TeaModel.build(map, self);
        }

    }

    public static class BatchAuditTest01ResponseDemo01Demo011 extends TeaModel {
        @NameInMap("Demo011")
        @Validation(required = true)
        public java.util.List<BatchAuditTest01ResponseDemo01Demo011Demo011> demo011;

        public static BatchAuditTest01ResponseDemo01Demo011 build(java.util.Map<String, ?> map) throws Exception {
            BatchAuditTest01ResponseDemo01Demo011 self = new BatchAuditTest01ResponseDemo01Demo011();
            return TeaModel.build(map, self);
        }

    }

    public static class BatchAuditTest01ResponseDemo01 extends TeaModel {
        @NameInMap("Demo011")
        @Validation(required = true)
        public BatchAuditTest01ResponseDemo01Demo011 demo011;

        public static BatchAuditTest01ResponseDemo01 build(java.util.Map<String, ?> map) throws Exception {
            BatchAuditTest01ResponseDemo01 self = new BatchAuditTest01ResponseDemo01();
            return TeaModel.build(map, self);
        }

    }

}
