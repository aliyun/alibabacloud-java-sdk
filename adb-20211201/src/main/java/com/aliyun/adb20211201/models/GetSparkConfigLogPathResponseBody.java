// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkConfigLogPathResponseBody extends TeaModel {
    /**
     * <p>The queried Spark log configuration.</p>
     */
    @NameInMap("Data")
    public GetSparkConfigLogPathResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1919-xxx-ssdfsdff</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkConfigLogPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkConfigLogPathResponseBody self = new GetSparkConfigLogPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkConfigLogPathResponseBody setData(GetSparkConfigLogPathResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkConfigLogPathResponseBodyData getData() {
        return this.data;
    }

    public GetSparkConfigLogPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkConfigLogPathResponseBodyData extends TeaModel {
        /**
         * <p>The default log path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://aliyun-oa-adb-spark-1111-oss-cn-hanghzou/spark-logs</p>
         */
        @NameInMap("DefaultLogPath")
        public String defaultLogPath;

        /**
         * <p>Indicates whether a log path exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLogPathExists")
        public Boolean isLogPathExists;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1675654361000</p>
         */
        @NameInMap("ModifiedTimestamp")
        public String modifiedTimestamp;

        /**
         * <p>The account ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>10130223128xxx</p>
         */
        @NameInMap("ModifiedUid")
        public String modifiedUid;

        /**
         * <p>The recorded log path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test/spark-logs/</p>
         */
        @NameInMap("RecordedLogPath")
        public String recordedLogPath;

        public static GetSparkConfigLogPathResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkConfigLogPathResponseBodyData self = new GetSparkConfigLogPathResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkConfigLogPathResponseBodyData setDefaultLogPath(String defaultLogPath) {
            this.defaultLogPath = defaultLogPath;
            return this;
        }
        public String getDefaultLogPath() {
            return this.defaultLogPath;
        }

        public GetSparkConfigLogPathResponseBodyData setIsLogPathExists(Boolean isLogPathExists) {
            this.isLogPathExists = isLogPathExists;
            return this;
        }
        public Boolean getIsLogPathExists() {
            return this.isLogPathExists;
        }

        public GetSparkConfigLogPathResponseBodyData setModifiedTimestamp(String modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public String getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public GetSparkConfigLogPathResponseBodyData setModifiedUid(String modifiedUid) {
            this.modifiedUid = modifiedUid;
            return this;
        }
        public String getModifiedUid() {
            return this.modifiedUid;
        }

        public GetSparkConfigLogPathResponseBodyData setRecordedLogPath(String recordedLogPath) {
            this.recordedLogPath = recordedLogPath;
            return this;
        }
        public String getRecordedLogPath() {
            return this.recordedLogPath;
        }

    }

}
