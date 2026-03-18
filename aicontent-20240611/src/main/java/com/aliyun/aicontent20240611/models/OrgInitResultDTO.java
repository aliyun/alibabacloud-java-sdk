// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OrgInitResultDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>st-xxxx</p>
     */
    @NameInMap("clientUuid")
    public String clientUuid;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isNew")
    public Boolean isNew;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static OrgInitResultDTO build(java.util.Map<String, ?> map) throws Exception {
        OrgInitResultDTO self = new OrgInitResultDTO();
        return TeaModel.build(map, self);
    }

    public OrgInitResultDTO setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public OrgInitResultDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public OrgInitResultDTO setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
        return this;
    }
    public String getClientUuid() {
        return this.clientUuid;
    }

    public OrgInitResultDTO setIsNew(Boolean isNew) {
        this.isNew = isNew;
        return this;
    }
    public Boolean getIsNew() {
        return this.isNew;
    }

    public OrgInitResultDTO setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public OrgInitResultDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
