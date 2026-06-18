// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>The encoding mode of the <code>CommandContent</code> and <code>Output</code> fields in the response. Valid values:</p>
     * <ul>
     * <li><p>PlainText: Returns the original command content and output.</p>
     * </li>
     * <li><p>Base64 (default): Returns the Base64-encoded command content and output.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to include the command output in the response.</p>
     * <ul>
     * <li><p>true: Returns the output. You must specify the <code>InvokeId</code> or <code>NodeId</code> parameter.</p>
     * </li>
     * <li><p>false (default): Does not return the output.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The ID of the command execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-cd03crwys0lrls0</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The ID of the instance.</p>
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
