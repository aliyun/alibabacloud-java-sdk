// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MemberApiKeyDTO extends TeaModel {
    /**
     * <p>The parent department information.</p>
     */
    @NameInMap("client")
    public ClientDTO client;

    /**
     * <p>The ID of the parent department. Member keys are mapped to their parent departments.</p>
     * 
     * <strong>example:</strong>
     * <p>438</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The deletion tag. A value of 0 indicates that the key is enabled, and a non-zero value indicates that the key is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <p>The expiration time. A null value indicates that the key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12-31T00:00:00Z</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-03T18:41:40+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-03T18:41:40+08:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The API key ID. This ID can be used to query the bound group by API key.</p>
     * 
     * <strong>example:</strong>
     * <p>502</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The full key. This field is not returned in the member list and is always empty.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The masked preview of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-us****9876</p>
     */
    @NameInMap("keyPreview")
    public String keyPreview;

    /**
     * <p>The ID of the department member to whom the key belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>304</p>
     */
    @NameInMap("memberUserId")
    public Long memberUserId;

    /**
     * <p>The member name.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("memberUserName")
    public String memberUserName;

    /**
     * <p>The API key name.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San\&quot;s key</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The status. Valid values: active: Enabled. disabled: Disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    public static MemberApiKeyDTO build(java.util.Map<String, ?> map) throws Exception {
        MemberApiKeyDTO self = new MemberApiKeyDTO();
        return TeaModel.build(map, self);
    }

    public MemberApiKeyDTO setClient(ClientDTO client) {
        this.client = client;
        return this;
    }
    public ClientDTO getClient() {
        return this.client;
    }

    public MemberApiKeyDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public MemberApiKeyDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public MemberApiKeyDTO setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public MemberApiKeyDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MemberApiKeyDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MemberApiKeyDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MemberApiKeyDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MemberApiKeyDTO setKeyPreview(String keyPreview) {
        this.keyPreview = keyPreview;
        return this;
    }
    public String getKeyPreview() {
        return this.keyPreview;
    }

    public MemberApiKeyDTO setMemberUserId(Long memberUserId) {
        this.memberUserId = memberUserId;
        return this;
    }
    public Long getMemberUserId() {
        return this.memberUserId;
    }

    public MemberApiKeyDTO setMemberUserName(String memberUserName) {
        this.memberUserName = memberUserName;
        return this;
    }
    public String getMemberUserName() {
        return this.memberUserName;
    }

    public MemberApiKeyDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MemberApiKeyDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
