// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumExceptionStackResponseBody extends TeaModel {
    /**
     * <p>The responses code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Data")
    public GetRumExceptionStackResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B6A00968-82A8-4F14-9D1B-B53827DB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetRumExceptionStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumExceptionStackResponseBody self = new GetRumExceptionStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumExceptionStackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRumExceptionStackResponseBody setData(GetRumExceptionStackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRumExceptionStackResponseBodyData getData() {
        return this.data;
    }

    public GetRumExceptionStackResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRumExceptionStackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumExceptionStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumExceptionStackResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRumExceptionStackResponseBodyDataThreadInfoList extends TeaModel {
        @NameInMap("ThreadDetail")
        public String threadDetail;

        @NameInMap("ThreadTag")
        public String threadTag;

        public static GetRumExceptionStackResponseBodyDataThreadInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetRumExceptionStackResponseBodyDataThreadInfoList self = new GetRumExceptionStackResponseBodyDataThreadInfoList();
            return TeaModel.build(map, self);
        }

        public GetRumExceptionStackResponseBodyDataThreadInfoList setThreadDetail(String threadDetail) {
            this.threadDetail = threadDetail;
            return this;
        }
        public String getThreadDetail() {
            return this.threadDetail;
        }

        public GetRumExceptionStackResponseBodyDataThreadInfoList setThreadTag(String threadTag) {
            this.threadTag = threadTag;
            return this;
        }
        public String getThreadTag() {
            return this.threadTag;
        }

    }

    public static class GetRumExceptionStackResponseBodyData extends TeaModel {
        @NameInMap("BinaryImages")
        public String binaryImages;

        @NameInMap("CrashAddress")
        public String crashAddress;

        @NameInMap("CrashReason")
        public String crashReason;

        /**
         * <p>The list of stacks.</p>
         */
        @NameInMap("Lines")
        public java.util.List<String> lines;

        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The thread ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16643</p>
         */
        @NameInMap("ThreadId")
        public String threadId;

        @NameInMap("ThreadInfoList")
        public java.util.List<GetRumExceptionStackResponseBodyDataThreadInfoList> threadInfoList;

        @NameInMap("Uuid")
        public String uuid;

        public static GetRumExceptionStackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumExceptionStackResponseBodyData self = new GetRumExceptionStackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumExceptionStackResponseBodyData setBinaryImages(String binaryImages) {
            this.binaryImages = binaryImages;
            return this;
        }
        public String getBinaryImages() {
            return this.binaryImages;
        }

        public GetRumExceptionStackResponseBodyData setCrashAddress(String crashAddress) {
            this.crashAddress = crashAddress;
            return this;
        }
        public String getCrashAddress() {
            return this.crashAddress;
        }

        public GetRumExceptionStackResponseBodyData setCrashReason(String crashReason) {
            this.crashReason = crashReason;
            return this;
        }
        public String getCrashReason() {
            return this.crashReason;
        }

        public GetRumExceptionStackResponseBodyData setLines(java.util.List<String> lines) {
            this.lines = lines;
            return this;
        }
        public java.util.List<String> getLines() {
            return this.lines;
        }

        public GetRumExceptionStackResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetRumExceptionStackResponseBodyData setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public GetRumExceptionStackResponseBodyData setThreadInfoList(java.util.List<GetRumExceptionStackResponseBodyDataThreadInfoList> threadInfoList) {
            this.threadInfoList = threadInfoList;
            return this;
        }
        public java.util.List<GetRumExceptionStackResponseBodyDataThreadInfoList> getThreadInfoList() {
            return this.threadInfoList;
        }

        public GetRumExceptionStackResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
