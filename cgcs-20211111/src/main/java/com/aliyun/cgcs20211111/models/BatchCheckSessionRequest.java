// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class BatchCheckSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public java.util.List<BatchCheckSessionRequestRecords> records;

    public static BatchCheckSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckSessionRequest self = new BatchCheckSessionRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckSessionRequest setRecords(java.util.List<BatchCheckSessionRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<BatchCheckSessionRequestRecords> getRecords() {
        return this.records;
    }

    public static class BatchCheckSessionRequestRecords extends TeaModel {
        @NameInMap("CustomSessionId")
        public String customSessionId;

        @NameInMap("PlatformSessionId")
        public String platformSessionId;

        @NameInMap("ReferenceInfo")
        public java.util.Map<String, ?> referenceInfo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static BatchCheckSessionRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckSessionRequestRecords self = new BatchCheckSessionRequestRecords();
            return TeaModel.build(map, self);
        }

        public BatchCheckSessionRequestRecords setCustomSessionId(String customSessionId) {
            this.customSessionId = customSessionId;
            return this;
        }
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        public BatchCheckSessionRequestRecords setPlatformSessionId(String platformSessionId) {
            this.platformSessionId = platformSessionId;
            return this;
        }
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

        public BatchCheckSessionRequestRecords setReferenceInfo(java.util.Map<String, ?> referenceInfo) {
            this.referenceInfo = referenceInfo;
            return this;
        }
        public java.util.Map<String, ?> getReferenceInfo() {
            return this.referenceInfo;
        }

        public BatchCheckSessionRequestRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
