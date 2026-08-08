// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListCrossAccountsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123***7890</p>
     */
    @NameInMap("CrossAccountOwnerId")
    public Long crossAccountOwnerId;

    /**
     * <strong>example:</strong>
     * <p>MANUAL</p>
     */
    @NameInMap("ManagementMode")
    public String managementMode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>123***7890</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <strong>example:</strong>
     * <p>ACCOUNT</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListCrossAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrossAccountsRequest self = new ListCrossAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListCrossAccountsRequest setCrossAccountOwnerId(Long crossAccountOwnerId) {
        this.crossAccountOwnerId = crossAccountOwnerId;
        return this;
    }
    public Long getCrossAccountOwnerId() {
        return this.crossAccountOwnerId;
    }

    public ListCrossAccountsRequest setManagementMode(String managementMode) {
        this.managementMode = managementMode;
        return this;
    }
    public String getManagementMode() {
        return this.managementMode;
    }

    public ListCrossAccountsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCrossAccountsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCrossAccountsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListCrossAccountsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
