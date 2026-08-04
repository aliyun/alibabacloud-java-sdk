// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MemberApiKeyDTO extends TeaModel {
    @NameInMap("client")
    public ClientDTO client;

    /**
     * <strong>example:</strong>
     * <p>438</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <strong>example:</strong>
     * <p>2026-12-31T00:00:00Z</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    /**
     * <strong>example:</strong>
     * <p>2026-08-03T18:41:40+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2026-08-03T18:41:40+08:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>502</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>sk-us****9876</p>
     */
    @NameInMap("keyPreview")
    public String keyPreview;

    /**
     * <strong>example:</strong>
     * <p>304</p>
     */
    @NameInMap("memberUserId")
    public Long memberUserId;

    /**
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("memberUserName")
    public String memberUserName;

    /**
     * <strong>example:</strong>
     * <p>John\&quot;s Key</p>
     */
    @NameInMap("name")
    public String name;

    /**
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
