// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryAccountsInfoRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PksJson")
    public String pksJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    public static EnterpriseAccountQueryAccountsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryAccountsInfoRequest self = new EnterpriseAccountQueryAccountsInfoRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryAccountsInfoRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setPksJson(String pksJson) {
        this.pksJson = pksJson;
        return this;
    }
    public String getPksJson() {
        return this.pksJson;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountQueryAccountsInfoRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

}
