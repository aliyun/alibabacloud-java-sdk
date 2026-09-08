// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSecureSkillIdentitiesResponseBody extends TeaModel {
    /**
     * <p>The list of resource information.</p>
     */
    @NameInMap("Identities")
    public java.util.List<String> identities;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSecureSkillIdentitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecureSkillIdentitiesResponseBody self = new ListSecureSkillIdentitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecureSkillIdentitiesResponseBody setIdentities(java.util.List<String> identities) {
        this.identities = identities;
        return this;
    }
    public java.util.List<String> getIdentities() {
        return this.identities;
    }

    public ListSecureSkillIdentitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecureSkillIdentitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
