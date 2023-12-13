// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeInstanceOpsRecordsResponseBody extends TeaModel {
    /**
     * <p>The details of the O\&M tasks.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeInstanceOpsRecordsResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceOpsRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceOpsRecordsResponseBody self = new DescribeInstanceOpsRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceOpsRecordsResponseBody setRecords(java.util.List<DescribeInstanceOpsRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeInstanceOpsRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeInstanceOpsRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceOpsRecordsResponseBodyRecords extends TeaModel {
        /**
         * <p>The time when the O\&M task was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the O\&M task expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status of the O\&M task.</p>
         */
        @NameInMap("OpsStatus")
        public String opsStatus;

        /**
         * <p>The type of the O\&M task.</p>
         */
        @NameInMap("OpsType")
        public String opsType;

        /**
         * <p>The content of the O\&M result. The content is the download URL of the files that are generated for the O\&M task.</p>
         */
        @NameInMap("ResultContent")
        public String resultContent;

        /**
         * <p>The type of the O\&M result. Valid value: OSS. This value indicates that the files generated for the O\&M task are saved to Object Storage Service (OSS) buckets.</p>
         */
        @NameInMap("ResultType")
        public String resultType;

        public static DescribeInstanceOpsRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceOpsRecordsResponseBodyRecords self = new DescribeInstanceOpsRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceOpsRecordsResponseBodyRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceOpsRecordsResponseBodyRecords setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceOpsRecordsResponseBodyRecords setOpsStatus(String opsStatus) {
            this.opsStatus = opsStatus;
            return this;
        }
        public String getOpsStatus() {
            return this.opsStatus;
        }

        public DescribeInstanceOpsRecordsResponseBodyRecords setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public DescribeInstanceOpsRecordsResponseBodyRecords setResultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }
        public String getResultContent() {
            return this.resultContent;
        }

        public DescribeInstanceOpsRecordsResponseBodyRecords setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

    }

}
