// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineActiveProcessResponseBody extends TeaModel {
    /**
     * <p>The activation progress list.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;content&quot;:&quot;步骤 &quot;颁发激活凭证&quot; 执行开始&quot;,&quot;id&quot;:0,&quot;level&quot;:3,&quot;timestamp&quot;:1625994913000},{&quot;content&quot;:&quot;步骤 &quot;颁发激活凭证&quot; 执行成功&quot;,&quot;id&quot;:1,&quot;level&quot;:3,&quot;timestamp&quot;:1625994914000},{&quot;content&quot;:&quot;步骤 &quot;初始化主机配置&quot; 执行开始&quot;,&quot;id&quot;:2,&quot;level&quot;:3,&quot;timestamp&quot;:1625994975000},{&quot;content&quot;:&quot;步骤 &quot;初始化主机配置&quot; 执行成功&quot;,&quot;id&quot;:3,&quot;level&quot;:3,&quot;timestamp&quot;:1625994975000}]</p>
     */
    @NameInMap("logs")
    public String logs;

    /**
     * <p>The activation progress.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("progress")
    public Long progress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b62796a8-c5a6-4d3f-beb2-7650e4309cb1</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The activation status.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATED</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The activation step.</p>
     * 
     * <strong>example:</strong>
     * <p>步骤 &quot;初始化主机配置&quot; 执行成功</p>
     */
    @NameInMap("step")
    public String step;

    public static DescribeEdgeMachineActiveProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineActiveProcessResponseBody self = new DescribeEdgeMachineActiveProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineActiveProcessResponseBody setLogs(String logs) {
        this.logs = logs;
        return this;
    }
    public String getLogs() {
        return this.logs;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

}
