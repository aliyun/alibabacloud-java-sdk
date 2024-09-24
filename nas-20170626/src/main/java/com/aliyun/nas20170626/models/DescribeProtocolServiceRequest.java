// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description or a part of the description of the protocol service.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of results for each query.</p>
     * <ul>
     * <li>Maximum value: 100.</li>
     * <li>Minimum value: 10.</li>
     * <li>Default value: 20.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>aBcdg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the protocol service.</p>
     * <ul>
     * <li>Format: CSV.</li>
     * <li>Limit: You can specify a maximum of 10 protocol service IDs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ptc-197ed6a00f2b****,ptc-196ed6a00f2b****</p>
     */
    @NameInMap("ProtocolServiceIds")
    public String protocolServiceIds;

    /**
     * <p>The status of the protocol service.</p>
     * <p>Format: CSV.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Creating: The protocol service is being created.</li>
     * <li>Starting: The protocol service is being started.</li>
     * <li>Running: The protocol service is running.</li>
     * <li>Updating: The protocol service is being updated.</li>
     * <li>Deleting: The protocol service is being deleted.</li>
     * <li>Stopping: The protocol service is being stopped.</li>
     * <li>Stopped: The protocol service is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running,Updating</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeProtocolServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtocolServiceRequest self = new DescribeProtocolServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProtocolServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeProtocolServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeProtocolServiceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeProtocolServiceRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeProtocolServiceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProtocolServiceRequest setProtocolServiceIds(String protocolServiceIds) {
        this.protocolServiceIds = protocolServiceIds;
        return this;
    }
    public String getProtocolServiceIds() {
        return this.protocolServiceIds;
    }

    public DescribeProtocolServiceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
