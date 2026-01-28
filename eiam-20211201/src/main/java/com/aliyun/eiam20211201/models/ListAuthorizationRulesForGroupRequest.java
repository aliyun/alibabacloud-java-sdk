// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesForGroupRequest extends TeaModel {
    /**
     * <p>组标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAuthorizationRulesForGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesForGroupRequest self = new ListAuthorizationRulesForGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesForGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListAuthorizationRulesForGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAuthorizationRulesForGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesForGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
