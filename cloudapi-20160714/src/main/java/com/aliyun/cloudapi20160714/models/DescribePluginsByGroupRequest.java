// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsByGroupRequest extends TeaModel {
    /**
     * <p>Group ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>08ae4aa0f95e4321849ee57f4e0b3077</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Pagination parameter: current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Pagination parameter: number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies the environment of the API to operate on.</p>
     * <ul>
     * <li><strong>RELEASE</strong>: Production</li>
     * <li><strong>PRE</strong>: Pre-release</li>
     * <li><strong>TEST</strong>: Test</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribePluginsByGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsByGroupRequest self = new DescribePluginsByGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginsByGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePluginsByGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginsByGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginsByGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePluginsByGroupRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
