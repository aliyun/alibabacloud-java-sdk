// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQARequest extends TeaModel {
    @NameInMap("Question")
    @Validation(required = true)
    public String question;

    @NameInMap("OrgId")
    @Validation(required = true)
    public String orgId;

    @NameInMap("OrgName")
    @Validation(required = true)
    public String orgName;

    public static RunMedQARequest build(java.util.Map<String, ?> map) throws Exception {
        RunMedQARequest self = new RunMedQARequest();
        return TeaModel.build(map, self);
    }

    public RunMedQARequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public RunMedQARequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public RunMedQARequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

}
