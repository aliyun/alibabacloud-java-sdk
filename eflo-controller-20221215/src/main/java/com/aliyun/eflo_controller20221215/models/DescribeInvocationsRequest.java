// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>Sets the encoding method for the <code>CommandContent</code> and <code>Output</code> fields in the returned data. Possible values:</p>
     * <ul>
     * <li>PlainText: Returns the original command content and output information.</li>
     * <li>Base64: Returns the Base64-encoded command content and output information.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Indicates whether to return the output information of the command execution in the result.</p>
     * <ul>
     * <li>true: Return. In this case, you must specify at least the <code>InvokeId</code> or <code>InstanceId</code> parameter.</li>
     * <li>false: Do not return.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>Command execution ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-cd03crwys0lrls0</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>Instance ID</p>
     * 
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
