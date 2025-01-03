// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("account")
    public String account;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>asd12e44827fe2444f952e931e51xxxx</p>
     */
    @NameInMap("token")
    public String token;

    public static TriggerRepositoryMirrorSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerRepositoryMirrorSyncRequest self = new TriggerRepositoryMirrorSyncRequest();
        return TeaModel.build(map, self);
    }

    public TriggerRepositoryMirrorSyncRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public TriggerRepositoryMirrorSyncRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public TriggerRepositoryMirrorSyncRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public TriggerRepositoryMirrorSyncRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
