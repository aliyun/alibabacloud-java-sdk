// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeMemberInfoResponseBody extends TeaModel {
    @NameInMap("AdminName")
    public String adminName;

    /**
     * <strong>example:</strong>
     * <p>164705101205****</p>
     */
    @NameInMap("AdminUid")
    public String adminUid;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMember")
    public Boolean isMember;

    /**
     * <strong>example:</strong>
     * <p>128720273643****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <strong>example:</strong>
     * <p>F2665618-3C41-51A4-8DAF-586FB68****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMemberInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberInfoResponseBody self = new DescribeMemberInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberInfoResponseBody setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public DescribeMemberInfoResponseBody setAdminUid(String adminUid) {
        this.adminUid = adminUid;
        return this;
    }
    public String getAdminUid() {
        return this.adminUid;
    }

    public DescribeMemberInfoResponseBody setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return this.isMember;
    }

    public DescribeMemberInfoResponseBody setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeMemberInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
