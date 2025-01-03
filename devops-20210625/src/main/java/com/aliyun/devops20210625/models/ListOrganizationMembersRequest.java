// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersRequest extends TeaModel {
    /**
     * <p>返回信息中是否包含第三方信息，默认不包含。</p>
     */
    @NameInMap("containsExternInfo")
    public Boolean containsExternInfo;

    /**
     * <strong>example:</strong>
     * <p>1236666</p>
     */
    @NameInMap("externUid")
    public String externUid;

    /**
     * <strong>example:</strong>
     * <p>1631845101798</p>
     */
    @NameInMap("joinTimeFrom")
    public Long joinTimeFrom;

    /**
     * <strong>example:</strong>
     * <p>1631845101798</p>
     */
    @NameInMap("joinTimeTo")
    public Long joinTimeTo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("organizationMemberName")
    public String organizationMemberName;

    /**
     * <strong>example:</strong>
     * <p>Dingtalk</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("state")
    public String state;

    public static ListOrganizationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersRequest self = new ListOrganizationMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersRequest setContainsExternInfo(Boolean containsExternInfo) {
        this.containsExternInfo = containsExternInfo;
        return this;
    }
    public Boolean getContainsExternInfo() {
        return this.containsExternInfo;
    }

    public ListOrganizationMembersRequest setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
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

    public ListOrganizationMembersRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListOrganizationMembersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public ListOrganizationMembersRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
