// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SetSparkAppLogRootPathResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SetSparkAppLogRootPathResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetSparkAppLogRootPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSparkAppLogRootPathResponseBody self = new SetSparkAppLogRootPathResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSparkAppLogRootPathResponseBody setData(SetSparkAppLogRootPathResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetSparkAppLogRootPathResponseBodyData getData() {
        return this.data;
    }

    public SetSparkAppLogRootPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetSparkAppLogRootPathResponseBodyData extends TeaModel {
        /**
         * <p>The recommended default OSS log path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://path/to/log</p>
         */
        @NameInMap("DefaultLogPath")
        public String defaultLogPath;

        /**
         * <p>Indicates whether an OSS log path exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLogPathExists")
        public Boolean isLogPathExists;

        /**
         * <p>The time when the modification was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1675236908</p>
         */
        @NameInMap("ModifiedTimestamp")
        public String modifiedTimestamp;

        /**
         * <p>The modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111</p>
         */
        @NameInMap("ModifiedUid")
        public String modifiedUid;

        /**
         * <p>The OSS log path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://path/to/log</p>
         */
        @NameInMap("RecordedLogPath")
        public String recordedLogPath;

        public static SetSparkAppLogRootPathResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetSparkAppLogRootPathResponseBodyData self = new SetSparkAppLogRootPathResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetSparkAppLogRootPathResponseBodyData setDefaultLogPath(String defaultLogPath) {
            this.defaultLogPath = defaultLogPath;
            return this;
        }
        public String getDefaultLogPath() {
            return this.defaultLogPath;
        }

        public SetSparkAppLogRootPathResponseBodyData setIsLogPathExists(Boolean isLogPathExists) {
            this.isLogPathExists = isLogPathExists;
            return this;
        }
        public Boolean getIsLogPathExists() {
            return this.isLogPathExists;
        }

        public SetSparkAppLogRootPathResponseBodyData setModifiedTimestamp(String modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public String getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SetSparkAppLogRootPathResponseBodyData setModifiedUid(String modifiedUid) {
            this.modifiedUid = modifiedUid;
            return this;
        }
        public String getModifiedUid() {
            return this.modifiedUid;
        }

        public SetSparkAppLogRootPathResponseBodyData setRecordedLogPath(String recordedLogPath) {
            this.recordedLogPath = recordedLogPath;
            return this;
        }
        public String getRecordedLogPath() {
            return this.recordedLogPath;
        }

    }

}
