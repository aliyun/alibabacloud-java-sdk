// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningsRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request. If this is your first time to call this operation, you do not need to specify the <code>NextToken</code> parameter.</p>
     * <p>When you call this operation for the first time, if the total number of entries to return is larger than the value of <code>MaxResults</code>, the entries are truncated. The system returns entries based on the value of <code>MaxResults</code>, and does not return the excess entries. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and <code>NextToken</code> is returned. In the next call, you can use the value of <code>NextToken</code> and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of <code>IsTruncated</code> becomes <code>false</code>. This way, all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>27EbL9j4ZgZjsMZFqbZFgbwQ1VXFU1Khcpx9e2vrW1zwzTBmTGWaM7ixHhRin8SCsxaJdazYVCzeKc2UF2QkyGb83cPhr8ZxrzoaiTd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The identity ID of the RAM user provisioning. Valid values:</p>
     * <ul>
     * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user group (g-\<em>\</em>\<em>\</em>\<em>\</em>\<em>\</em>).</li>
     * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user (u-\<em>\</em>\<em>\</em>\<em>\</em>\<em>\</em>).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>u-88d73u*****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The identity type of the RAM user provisioning. Valid values:</p>
     * <ul>
     * <li>User: The identity of the RAM user provisioning is a CloudSSO user.</li>
     * <li>Group: The identity of the RAM user provisioning is a CloudSSO user group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1743382******</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The object for which you create the RAM user provisioning. The value is fixed as <code>RD-Account</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListUserProvisioningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningsRequest self = new ListUserProvisioningsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListUserProvisioningsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserProvisioningsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserProvisioningsRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public ListUserProvisioningsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public ListUserProvisioningsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListUserProvisioningsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
