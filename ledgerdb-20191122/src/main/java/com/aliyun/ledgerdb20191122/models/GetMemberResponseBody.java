// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetMemberResponseBody extends TeaModel {
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("KeyType")
    public String keyType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("KeySource")
    public String keySource;

    @NameInMap("Role")
    public String role;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("State")
    public String state;

    @NameInMap("UpdateTime")
    public Long updateTime;

    @NameInMap("KMSKeyVersion")
    public String KMSKeyVersion;

    @NameInMap("KeyMeta")
    public String keyMeta;

    @NameInMap("AliUid")
    public String aliUid;

    public static GetMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemberResponseBody self = new GetMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemberResponseBody setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public GetMemberResponseBody setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public GetMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemberResponseBody setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public GetMemberResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetMemberResponseBody setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public GetMemberResponseBody setKeySource(String keySource) {
        this.keySource = keySource;
        return this;
    }
    public String getKeySource() {
        return this.keySource;
    }

    public GetMemberResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetMemberResponseBody setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public GetMemberResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetMemberResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public GetMemberResponseBody setKMSKeyVersion(String KMSKeyVersion) {
        this.KMSKeyVersion = KMSKeyVersion;
        return this;
    }
    public String getKMSKeyVersion() {
        return this.KMSKeyVersion;
    }

    public GetMemberResponseBody setKeyMeta(String keyMeta) {
        this.keyMeta = keyMeta;
        return this;
    }
    public String getKeyMeta() {
        return this.keyMeta;
    }

    public GetMemberResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

}
