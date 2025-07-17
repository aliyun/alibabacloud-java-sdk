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
     * <p>The response message.</p>
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
        /**
         * <p>Thread stack details.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;0  libsystem_platform.dylib + 0x1ab5\n    rax = 0x0000000000000001   rdx = 0x0000000000000064\n    rcx = 0xffffffffffffffff   rbx = 0x0000000107701bd0\n    rsi = 0x0101010101010101   rdi = 0x0000000000000001\n    rbp = 0x00007ff7b8d64300   rsp = 0x00007ff7b8d64300\n     r8 = 0x000000000000000a    r9 = 0x0000000000000000\n    r10 = 0x0000000000000001   r11 = 0x0000000000000247\n    r12 = 0x00007ff7b8d64390   r13 = 0x0000000000000000\n    r14 = 0x000000010719d770   r15 = 0x00007ff7b8d64500\n    rip = 0x00007ff807a40ab5\n    Found by: given as instruction pointer in context\n 1  alibabacloud_rum_example + 0x2ad1\n    rbp = 0x00007ff7b8d64310   rsp = 0x00007ff7b8d64310\n    rip = 0x000000010719dad1\n    Found by: previous frame\&quot;s frame pointer\n 2  alibabacloud_rum_example + 0x2a3b\n    rbp = 0x00007ff7b8d64360   rsp = 0x00007ff7b8d64320\n    rip = 0x000000010719da3b\n    Found by: previous frame\&quot;s frame pointer\n 3  0x7ff807688345\n    rbp = 0x00007ff7b8d64580   rsp = 0x00007ff7b8d64370\n    rip = 0x00007ff807688345\n    Found by: previous frame\&quot;s frame pointer&quot;</p>
         */
        @NameInMap("ThreadDetail")
        public String threadDetail;

        /**
         * <p>The thread tag, including the thread number and name.</p>
         * 
         * <strong>example:</strong>
         * <p>Thread 0 (crashed)</p>
         */
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
        /**
         * <p>The name and UUID of the symbol table required for parsing the exception stack. This parameter is exposed during the parsing of PC errors.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;04B5B216682E40BF9BBE9698E3F98CAA0,libcurl.4.dylib;7878DB3CF21A3C13A203B7E3B0FA66250,libalibabacloud_rum.dylib;0F9F96FE6B1C3253A33AC9E4A0C2A3860,libsystem_kernel.dylib;3DF3256F466E37BCB995A5A9956E14150,libsystem_pthread.dylib;000000000000000000000000000000000,Security;EA4B83A319EB3E15B22CDF035DBD49250,alibabacloud_rum_example;710BB12EEEC744BAB41D1849CA3AD8021,LTSDK.pdb;EE330BA9C49E4730AA15A2B7C0BB2CAE1,JBLive.pdb&quot;</p>
         */
        @NameInMap("BinaryImages")
        public String binaryImages;

        /**
         * <p>The crash address. This parameter is exposed during the parsing of PC errors.</p>
         * 
         * <strong>example:</strong>
         * <p>0x1</p>
         */
        @NameInMap("CrashAddress")
        public String crashAddress;

        /**
         * <p>The cause of the exception. This parameter is exposed during the parsing of PC errors.</p>
         * 
         * <strong>example:</strong>
         * <p>EXC_BAD_ACCESS / KERN_INVALID_ADDRESS</p>
         */
        @NameInMap("CrashReason")
        public String crashReason;

        /**
         * <p>The list of stacks.</p>
         */
        @NameInMap("Lines")
        public java.util.List<String> lines;

        /**
         * <p>The name of the crash parsing module. This parameter is exposed during the parsing of PC errors.</p>
         * 
         * <strong>example:</strong>
         * <p>alibabacloud_rum_example</p>
         */
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

        /**
         * <p>The thread stack information captured during PC crashes.</p>
         */
        @NameInMap("ThreadInfoList")
        public java.util.List<GetRumExceptionStackResponseBodyDataThreadInfoList> threadInfoList;

        /**
         * <p>The UUID of the symbol table required for parsing the stack. This parameter is exposed during the parsing of PC errors.</p>
         * 
         * <strong>example:</strong>
         * <p>9032259CEB9130E780C6DE8FDECCD7990</p>
         */
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
