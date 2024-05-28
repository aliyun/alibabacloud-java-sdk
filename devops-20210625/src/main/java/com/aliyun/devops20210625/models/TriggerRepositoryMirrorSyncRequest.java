// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("account")
    public String account;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

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
