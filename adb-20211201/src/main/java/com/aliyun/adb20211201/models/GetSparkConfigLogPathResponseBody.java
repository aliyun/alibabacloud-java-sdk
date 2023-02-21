// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkConfigLogPathResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkConfigLogPathResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
