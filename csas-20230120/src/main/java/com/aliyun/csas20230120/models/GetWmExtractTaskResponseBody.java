// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetWmExtractTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetWmExtractTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWmExtractTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWmExtractTaskResponseBody self = new GetWmExtractTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWmExtractTaskResponseBody setData(GetWmExtractTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWmExtractTaskResponseBodyData getData() {
        return this.data;
    }

    public GetWmExtractTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWmExtractTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-01-01 11:22:33</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test-****.pdf</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>wmt-9648c22d2eb2cb57bb855dcae7898464********</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>aGVsbG8gc2Fz****</p>
         */
        @NameInMap("WmInfoBytesB64")
        public String wmInfoBytesB64;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("WmInfoSize")
        public Long wmInfoSize;

        /**
         * <strong>example:</strong>
         * <p>123**</p>
         */
        @NameInMap("WmInfoUint")
        public Long wmInfoUint;

        /**
         * <strong>example:</strong>
         * <p>PureDocument</p>
         */
        @NameInMap("WmType")
        public String wmType;

        public static GetWmExtractTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWmExtractTaskResponseBodyData self = new GetWmExtractTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWmExtractTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWmExtractTaskResponseBodyData setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public GetWmExtractTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWmExtractTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetWmExtractTaskResponseBodyData setWmInfoBytesB64(String wmInfoBytesB64) {
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }
        public String getWmInfoBytesB64() {
            return this.wmInfoBytesB64;
        }

        public GetWmExtractTaskResponseBodyData setWmInfoSize(Long wmInfoSize) {
            this.wmInfoSize = wmInfoSize;
            return this;
        }
        public Long getWmInfoSize() {
            return this.wmInfoSize;
        }

        public GetWmExtractTaskResponseBodyData setWmInfoUint(Long wmInfoUint) {
            this.wmInfoUint = wmInfoUint;
            return this;
        }
        public Long getWmInfoUint() {
            return this.wmInfoUint;
        }

        public GetWmExtractTaskResponseBodyData setWmType(String wmType) {
            this.wmType = wmType;
            return this;
        }
        public String getWmType() {
            return this.wmType;
        }

    }

}
