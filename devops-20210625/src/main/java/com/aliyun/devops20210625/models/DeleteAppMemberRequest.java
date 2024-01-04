// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteAppMemberRequest extends TeaModel {
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("subjectId")
    public String subjectId;

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
