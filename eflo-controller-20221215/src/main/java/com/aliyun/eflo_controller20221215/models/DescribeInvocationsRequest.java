// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-cd03crwys0lrls0</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsRequest self = new DescribeInvocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeInvocationsRequest setIncludeOutput(Boolean includeOutput) {
        this.includeOutput = includeOutput;
        return this;
    }
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    public DescribeInvocationsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
