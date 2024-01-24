// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description or a part of the description of the protocol service.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The description must be 2 to 128 characters in length.</p>
     * <p>*   The description must start with a letter and cannot start with `http://` or `https://`.</p>
     * <p>*   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of results for each query.</p>
     * <br>
     * <p>*   Maximum value: 100.</p>
     * <p>*   Minimum value: 10.</p>
     * <p>*   Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If not all dataflows are returned in a query, the return value of the NextToken parameter is not empty. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the protocol service.</p>
     * <br>
     * <p>*   Format: CSV.</p>
     * <p>*   Limit: You can specify a maximum of 10 protocol service IDs.</p>
     */
    @NameInMap("ProtocolServiceIds")
    public String protocolServiceIds;

    /**
     * <p>The status of the protocol service.</p>
     * <br>
     * <p>Format: CSV.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Creating: The protocol service is being created.</p>
     * <p>*   Starting: The protocol service is being started.</p>
     * <p>*   Running: The protocol service is running.</p>
     * <p>*   Updating: The protocol service is being updated.</p>
     * <p>*   Deleting: The protocol service is being deleted.</p>
     * <p>*   Stopping: The protocol service is being stopped.</p>
     * <p>*   Stopped: The protocol service is stopped.</p>
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
