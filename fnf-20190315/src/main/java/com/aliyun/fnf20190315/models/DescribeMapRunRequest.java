// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeMapRunRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_exec_name</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_flow_name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c39142f1345b196d678333c41f113200</p>
     */
    @NameInMap("MapRunName")
    public String mapRunName;

    /**
     * <strong>example:</strong>
     * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMapRunRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMapRunRequest self = new DescribeMapRunRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMapRunRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public DescribeMapRunRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribeMapRunRequest setMapRunName(String mapRunName) {
        this.mapRunName = mapRunName;
        return this;
    }
    public String getMapRunName() {
        return this.mapRunName;
    }

    public DescribeMapRunRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
