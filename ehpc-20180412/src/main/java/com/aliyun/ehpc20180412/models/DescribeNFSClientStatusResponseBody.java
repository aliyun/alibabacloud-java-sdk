// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeNFSClientStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeNFSClientStatusResponseBodyResult result;

    @NameInMap("Status")
    public String status;

    public static DescribeNFSClientStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNFSClientStatusResponseBody self = new DescribeNFSClientStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNFSClientStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNFSClientStatusResponseBody setResult(DescribeNFSClientStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeNFSClientStatusResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeNFSClientStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeNFSClientStatusResponseBodyResult extends TeaModel {
        @NameInMap("ExitCode")
        public Integer exitCode;

        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        @NameInMap("Output")
        public String output;

        public static DescribeNFSClientStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeNFSClientStatusResponseBodyResult self = new DescribeNFSClientStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeNFSClientStatusResponseBodyResult setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeNFSClientStatusResponseBodyResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public DescribeNFSClientStatusResponseBodyResult setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

}
