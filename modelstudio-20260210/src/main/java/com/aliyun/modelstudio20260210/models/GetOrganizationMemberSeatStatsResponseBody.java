// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetOrganizationMemberSeatStatsResponseBody extends TeaModel {
    /**
     * <p>The number of administrators (ORG_ADMIN role).</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AdminRoleUserCount")
    public Integer adminRoleUserCount;

    /**
     * <p>The number of regular members (ORG_MEMBER role).</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MemberRoleUserCount")
    public Integer memberRoleUserCount;

    /**
     * <p>The organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5ffd468b1e45db3c1cc26ad6</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The number of owner accounts (ORG_OWNER role).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerRoleUserCount")
    public Integer ownerRoleUserCount;

    /**
     * <p>The number of members with assigned seats.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SeatedMemberCount")
    public Integer seatedMemberCount;

    /**
     * <p>The total number of members.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalMemberCount")
    public Integer totalMemberCount;

    /**
     * <p>The number of members without assigned seats.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UnseatedMemberCount")
    public Integer unseatedMemberCount;

    public static GetOrganizationMemberSeatStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationMemberSeatStatsResponseBody self = new GetOrganizationMemberSeatStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationMemberSeatStatsResponseBody setAdminRoleUserCount(Integer adminRoleUserCount) {
        this.adminRoleUserCount = adminRoleUserCount;
        return this;
    }
    public Integer getAdminRoleUserCount() {
        return this.adminRoleUserCount;
    }

    public GetOrganizationMemberSeatStatsResponseBody setMemberRoleUserCount(Integer memberRoleUserCount) {
        this.memberRoleUserCount = memberRoleUserCount;
        return this;
    }
    public Integer getMemberRoleUserCount() {
        return this.memberRoleUserCount;
    }

    public GetOrganizationMemberSeatStatsResponseBody setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetOrganizationMemberSeatStatsResponseBody setOwnerRoleUserCount(Integer ownerRoleUserCount) {
        this.ownerRoleUserCount = ownerRoleUserCount;
        return this;
    }
    public Integer getOwnerRoleUserCount() {
        return this.ownerRoleUserCount;
    }

    public GetOrganizationMemberSeatStatsResponseBody setSeatedMemberCount(Integer seatedMemberCount) {
        this.seatedMemberCount = seatedMemberCount;
        return this;
    }
    public Integer getSeatedMemberCount() {
        return this.seatedMemberCount;
    }

    public GetOrganizationMemberSeatStatsResponseBody setTotalMemberCount(Integer totalMemberCount) {
        this.totalMemberCount = totalMemberCount;
        return this;
    }
    public Integer getTotalMemberCount() {
        return this.totalMemberCount;
    }

    public GetOrganizationMemberSeatStatsResponseBody setUnseatedMemberCount(Integer unseatedMemberCount) {
        this.unseatedMemberCount = unseatedMemberCount;
        return this;
    }
    public Integer getUnseatedMemberCount() {
        return this.unseatedMemberCount;
    }

}
