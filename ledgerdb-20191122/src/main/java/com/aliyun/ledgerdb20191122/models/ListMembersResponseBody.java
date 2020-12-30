// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListMembersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Members")
    public java.util.List<ListMembersResponseBodyMembers> members;

    public static ListMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMembersResponseBody self = new ListMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMembersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMembersResponseBody setMembers(java.util.List<ListMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public static class ListMembersResponseBodyMembers extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PublicKey")
        public String publicKey;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("LedgerId")
        public String ledgerId;

        @NameInMap("Role")
        public String role;

        public static ListMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListMembersResponseBodyMembers self = new ListMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListMembersResponseBodyMembers setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListMembersResponseBodyMembers setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public ListMembersResponseBodyMembers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMembersResponseBodyMembers setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMembersResponseBodyMembers setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public ListMembersResponseBodyMembers setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListMembersResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListMembersResponseBodyMembers setLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }
        public String getLedgerId() {
            return this.ledgerId;
        }

        public ListMembersResponseBodyMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
