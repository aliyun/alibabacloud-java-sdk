// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeInstanceOpsRecordsResponseBody extends TeaModel {
    /**
     * <p>The details of the queried O\&amp;M tasks.</p>
     */
    @NameInMap("Records")
    public java.util.List<Records> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceOpsRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceOpsRecordsResponseBody self = new DescribeInstanceOpsRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceOpsRecordsResponseBody setRecords(java.util.List<Records> records) {
        this.records = records;
        return this;
    }
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    public DescribeInstanceOpsRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Records extends TeaModel {
        /**
         * <p>The time when the O\&amp;M task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T15:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the O\&amp;M task expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-29T15:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status of the O\&amp;M task.</p>
         * <ul>
         * <li>Ready</li>
         * <li>Failed</li>
         * <li>Expired</li>
         * <li>Closed</li>
         * <li>Success</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("OpsStatus")
        public String opsStatus;

        /**
         * <p>The type of the O\&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>coredump</p>
         */
        @NameInMap("OpsType")
        public String opsType;

        /**
         * <p>The content of the O\&amp;M result. The value is the download URL of the files that are generated for the O\&amp;M task. This parameter is returned only when the value of the OpsStatus parameter is Success.</p>
         * 
         * <strong>example:</strong>
         * <p>https://******</p>
         */
        @NameInMap("ResultContent")
        public String resultContent;

        /**
         * <p>The type of the O\&amp;M result. This parameter is returned only when the value of the OpsStatus parameter is Success.\
         * The only value of the parameter is Oss. The value indicates that the files generated for the O\&amp;M task are saved to Object Storage Service (OSS) buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ResultType")
        public String resultType;

        public static Records build(java.util.Map<String, ?> map) throws Exception {
            Records self = new Records();
            return TeaModel.build(map, self);
        }

        public Records setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Records setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public Records setOpsStatus(String opsStatus) {
            this.opsStatus = opsStatus;
            return this;
        }
        public String getOpsStatus() {
            return this.opsStatus;
        }

        public Records setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public Records setResultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }
        public String getResultContent() {
            return this.resultContent;
        }

        public Records setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

    }

}
