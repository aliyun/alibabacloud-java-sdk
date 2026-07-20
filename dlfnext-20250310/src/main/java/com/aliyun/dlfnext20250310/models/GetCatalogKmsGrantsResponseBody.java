// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogKmsGrantsResponseBody extends TeaModel {
    @NameInMap("dataAccessRoleArn")
    public String dataAccessRoleArn;

    @NameInMap("keyPolicyStatement")
    public String keyPolicyStatement;

    @NameInMap("region")
    public String region;

    @NameInMap("workflowRoleArn")
    public String workflowRoleArn;

    public static GetCatalogKmsGrantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogKmsGrantsResponseBody self = new GetCatalogKmsGrantsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogKmsGrantsResponseBody setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }
    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    public GetCatalogKmsGrantsResponseBody setKeyPolicyStatement(String keyPolicyStatement) {
        this.keyPolicyStatement = keyPolicyStatement;
        return this;
    }
    public String getKeyPolicyStatement() {
        return this.keyPolicyStatement;
    }

    public GetCatalogKmsGrantsResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetCatalogKmsGrantsResponseBody setWorkflowRoleArn(String workflowRoleArn) {
        this.workflowRoleArn = workflowRoleArn;
        return this;
    }
    public String getWorkflowRoleArn() {
        return this.workflowRoleArn;
    }

}
