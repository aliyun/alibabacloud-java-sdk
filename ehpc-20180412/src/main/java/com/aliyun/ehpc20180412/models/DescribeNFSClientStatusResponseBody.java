// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeNFSClientStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of results.</p>
     */
    @NameInMap("Result")
    public DescribeNFSClientStatusResponseBodyResult result;

    /**
     * <p>The deployment status of the NFS client. Valid values:</p>
     * <br>
     * <p>*   NotInstalled: The client is not installed.</p>
     * <p>*   Running: The client is being installed.</p>
     * <p>*   Finished: The client is installed on the instance.</p>
     */
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
        /**
         * <p>The Base64-decoded Output parameter value. A True in the last line indicates successful installation. Otherwise, the installation fails.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The status of the invocation record, which is the same as the value of the Status parameter.</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The execution result of the command.</p>
         */
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
