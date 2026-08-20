// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobResultsResponseBody extends TeaModel {
    /**
     * <p>The exit code of the command.</p>
     * <ul>
     * <li>For Linux instances, this is the exit code of the shell command.</li>
     * <li>For Windows instances, this is the exit code of the Bat or PowerShell command.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExitCode")
    public Long exitCode;

    /**
     * <p>The output of the command execution. If ContentEncoding is set to PlainText, the original output is returned. If ContentEncoding is set to Base64, the Base64-encoded output is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>MTU6MzA6MDEK</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BABC742E-04D7-5BA5-8A5F-7D9461D37B19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeJobResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResultsResponseBody self = new DescribeJobResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobResultsResponseBody setExitCode(Long exitCode) {
        this.exitCode = exitCode;
        return this;
    }
    public Long getExitCode() {
        return this.exitCode;
    }

    public DescribeJobResultsResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DescribeJobResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
