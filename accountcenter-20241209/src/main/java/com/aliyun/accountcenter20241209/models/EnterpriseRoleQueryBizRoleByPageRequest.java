// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryBizRoleByPageRequest extends TeaModel {
    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SrcType")
    public String srcType;

    public static EnterpriseRoleQueryBizRoleByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryBizRoleByPageRequest self = new EnterpriseRoleQueryBizRoleByPageRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public EnterpriseRoleQueryBizRoleByPageRequest setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }
    public String getSrcType() {
        return this.srcType;
    }

}
