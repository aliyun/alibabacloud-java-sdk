// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryAccountForRoleGrantByPageRequest extends TeaModel {
    @NameInMap("BizRoleCode")
    public String bizRoleCode;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrgId")
    public String orgId;

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

    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    public static EnterpriseRoleQueryAccountForRoleGrantByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryAccountForRoleGrantByPageRequest self = new EnterpriseRoleQueryAccountForRoleGrantByPageRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setBizRoleCode(String bizRoleCode) {
        this.bizRoleCode = bizRoleCode;
        return this;
    }
    public String getBizRoleCode() {
        return this.bizRoleCode;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

}
