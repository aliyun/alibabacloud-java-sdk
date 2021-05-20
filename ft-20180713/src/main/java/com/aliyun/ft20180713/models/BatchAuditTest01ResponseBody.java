// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class BatchAuditTest01ResponseBody extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Demo01")
    public BatchAuditTest01ResponseBodyDemo01 demo01;

    public static BatchAuditTest01ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAuditTest01ResponseBody self = new BatchAuditTest01ResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAuditTest01ResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BatchAuditTest01ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchAuditTest01ResponseBody setDemo01(BatchAuditTest01ResponseBodyDemo01 demo01) {
        this.demo01 = demo01;
        return this;
    }
    public BatchAuditTest01ResponseBodyDemo01 getDemo01() {
        return this.demo01;
    }

    public static class BatchAuditTest01ResponseBodyDemo01Demo011Demo011 extends TeaModel {
        @NameInMap("Demo0111")
        public String demo0111;

        public static BatchAuditTest01ResponseBodyDemo01Demo011Demo011 build(java.util.Map<String, ?> map) throws Exception {
            BatchAuditTest01ResponseBodyDemo01Demo011Demo011 self = new BatchAuditTest01ResponseBodyDemo01Demo011Demo011();
            return TeaModel.build(map, self);
        }

        public BatchAuditTest01ResponseBodyDemo01Demo011Demo011 setDemo0111(String demo0111) {
            this.demo0111 = demo0111;
            return this;
        }
        public String getDemo0111() {
            return this.demo0111;
        }

    }

    public static class BatchAuditTest01ResponseBodyDemo01Demo011 extends TeaModel {
        @NameInMap("Demo011")
        public java.util.List<BatchAuditTest01ResponseBodyDemo01Demo011Demo011> demo011;

        public static BatchAuditTest01ResponseBodyDemo01Demo011 build(java.util.Map<String, ?> map) throws Exception {
            BatchAuditTest01ResponseBodyDemo01Demo011 self = new BatchAuditTest01ResponseBodyDemo01Demo011();
            return TeaModel.build(map, self);
        }

        public BatchAuditTest01ResponseBodyDemo01Demo011 setDemo011(java.util.List<BatchAuditTest01ResponseBodyDemo01Demo011Demo011> demo011) {
            this.demo011 = demo011;
            return this;
        }
        public java.util.List<BatchAuditTest01ResponseBodyDemo01Demo011Demo011> getDemo011() {
            return this.demo011;
        }

    }

    public static class BatchAuditTest01ResponseBodyDemo01 extends TeaModel {
        @NameInMap("Demo011")
        public BatchAuditTest01ResponseBodyDemo01Demo011 demo011;

        public static BatchAuditTest01ResponseBodyDemo01 build(java.util.Map<String, ?> map) throws Exception {
            BatchAuditTest01ResponseBodyDemo01 self = new BatchAuditTest01ResponseBodyDemo01();
            return TeaModel.build(map, self);
        }

        public BatchAuditTest01ResponseBodyDemo01 setDemo011(BatchAuditTest01ResponseBodyDemo01Demo011 demo011) {
            this.demo011 = demo011;
            return this;
        }
        public BatchAuditTest01ResponseBodyDemo01Demo011 getDemo011() {
            return this.demo011;
        }

    }

}
