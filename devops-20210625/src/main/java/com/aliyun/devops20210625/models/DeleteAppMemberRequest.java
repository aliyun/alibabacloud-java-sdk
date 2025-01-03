// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteAppMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>1332695887xxxxxx</p>
     */
    @NameInMap("subjectId")
    public String subjectId;

    /**
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("subjectType")
    public String subjectType;

    public static DeleteAppMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppMemberRequest self = new DeleteAppMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DeleteAppMemberRequest setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }
    public String getSubjectId() {
        return this.subjectId;
    }

    public DeleteAppMemberRequest setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

}
