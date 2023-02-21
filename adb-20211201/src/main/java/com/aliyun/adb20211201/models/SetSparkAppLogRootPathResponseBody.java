// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SetSparkAppLogRootPathResponseBody extends TeaModel {
    @NameInMap("Data")
    public SetSparkAppLogRootPathResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("DefaultLogPath")
        public String defaultLogPath;

        @NameInMap("IsLogPathExists")
        public Boolean isLogPathExists;

        @NameInMap("ModifiedTimestamp")
        public String modifiedTimestamp;

        @NameInMap("ModifiedUid")
        public String modifiedUid;

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
