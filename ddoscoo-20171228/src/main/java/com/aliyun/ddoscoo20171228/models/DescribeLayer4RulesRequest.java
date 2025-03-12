// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulesRequest extends TeaModel {
    /**
     * <p>The type of forwarding protocol. Values:</p>
     * <ul>
     * <li><strong>tcp</strong>: Indicates TCP protocol.</li>
     * <li><strong>udp</strong>: Indicates UDP protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    /**
     * <p>The forwarding port.</p>
     * 
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("FrontendPort")
    public Integer frontendPort;

    /**
     * <p>The ID of the DDoS protection instance to be queried.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/91478.html">DescribeInstances</a> to query all DDoS protection instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zvp2ay9b****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>In paginated queries, specifies which page of data to return. The minimum value is <strong>1</strong>, indicating the first page of data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>In paginated queries, specifies the number of results per page. The maximum value is <strong>50</strong>, indicating that each page can contain up to 50 results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The source IP address of the request. You do not need to fill this in; it is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeLayer4RulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulesRequest self = new DescribeLayer4RulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulesRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public DescribeLayer4RulesRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public DescribeLayer4RulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeLayer4RulesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeLayer4RulesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLayer4RulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
