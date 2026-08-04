// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class InstallDataAgentMcpRequest extends TeaModel {
    /**
     * <p>The brief description of the artifact. This parameter can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>query user information by user ID</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The endpoint of the MCP instance.</p>
     * 
     * <strong>example:</strong>
     * <p>http://***.com/mcp</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The JSON used to create the MCP.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mcpServers&quot;: {
     *     &quot;sse-server-name&quot;: {
     *       &quot;description&quot;: &quot;describe sse mcp server&quot;,
     *       &quot;type&quot;: &quot;sse&quot;,
     *       &quot;netType&quot;: &quot;vpc&quot;,
     *       &quot;vpcId&quot;: &quot;vpc-xxxx&quot;,
     *       &quot;url&quot;: &quot;<a href="http://sse-in-vpc.com/sse">http://sse-in-vpc.com/sse</a>&quot;,
     *       &quot;needUidInHeader&quot;: true,
     *       &quot;headers&quot;: {
     *         &quot;Authorization&quot;: &quot;Bearer <token>&quot;
     *       }
     *     }
     *   }
     * }</p>
     */
    @NameInMap("FromJson")
    public String fromJson;

    /**
     * <p>The request header settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Authorization&quot;:&quot;Bearer ***&quot;}</p>
     */
    @NameInMap("Headers")
    public String headers;

    /**
     * <p>The MCP name.</p>
     * 
     * <strong>example:</strong>
     * <p>query_tool</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to include the Alibaba Cloud UID in the request header.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedUidInHeader")
    public Boolean needUidInHeader;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><code>vpc</code>: virtual private cloud.</li>
     * <li><code>public</code>: public network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The transport channel type. Valid values: streamablehttp and sse.</p>
     * 
     * <strong>example:</strong>
     * <p>sse</p>
     */
    @NameInMap("TransportType")
    public String transportType;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf63***o5</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vb5j***6h</p>
     */
    @NameInMap("VswId")
    public String vswId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static InstallDataAgentMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallDataAgentMcpRequest self = new InstallDataAgentMcpRequest();
        return TeaModel.build(map, self);
    }

    public InstallDataAgentMcpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InstallDataAgentMcpRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public InstallDataAgentMcpRequest setFromJson(String fromJson) {
        this.fromJson = fromJson;
        return this;
    }
    public String getFromJson() {
        return this.fromJson;
    }

    public InstallDataAgentMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public InstallDataAgentMcpRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InstallDataAgentMcpRequest setNeedUidInHeader(Boolean needUidInHeader) {
        this.needUidInHeader = needUidInHeader;
        return this;
    }
    public Boolean getNeedUidInHeader() {
        return this.needUidInHeader;
    }

    public InstallDataAgentMcpRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public InstallDataAgentMcpRequest setTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    public String getTransportType() {
        return this.transportType;
    }

    public InstallDataAgentMcpRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public InstallDataAgentMcpRequest setVswId(String vswId) {
        this.vswId = vswId;
        return this;
    }
    public String getVswId() {
        return this.vswId;
    }

    public InstallDataAgentMcpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
