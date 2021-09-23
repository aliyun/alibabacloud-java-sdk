// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersRequest extends TeaModel {
    @NameInMap("organizationMemberName")
    public String organizationMemberName;

    @NameInMap("provider")
    public String provider;

    @NameInMap("externUid")
    public String externUid;

    @NameInMap("state")
    public String state;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("joinTimeFrom")
    public Long joinTimeFrom;

    @NameInMap("joinTimeTo")
    public Long joinTimeTo;

    public static ListOrganizationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersRequest self = new ListOrganizationMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersRequest setOrganizationMemberName(String organizationMemberName) {
        this.organizationMemberName = organizationMemberName;
        return this;
    }
    public String getOrganizationMemberName() {
        return this.organizationMemberName;
    }

    public ListOrganizationMembersRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListOrganizationMembersRequest setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
    }

    public ListOrganizationMembersRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListOrganizationMembersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrganizationMembersRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListOrganizationMembersRequest setJoinTimeFrom(Long joinTimeFrom) {
        this.joinTimeFrom = joinTimeFrom;
        return this;
    }
    public Long getJoinTimeFrom() {
        return this.joinTimeFrom;
    }

    public ListOrganizationMembersRequest setJoinTimeTo(Long joinTimeTo) {
        this.joinTimeTo = joinTimeTo;
        return this;
    }
    public Long getJoinTimeTo() {
        return this.joinTimeTo;
    }

}
