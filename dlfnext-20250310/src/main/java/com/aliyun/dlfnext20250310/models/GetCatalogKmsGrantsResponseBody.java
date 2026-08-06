// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogKmsGrantsResponseBody extends TeaModel {
    /**
     * <p>The ARN of the RAM role used by DLF to access catalog data. When configuring the KMS key policy, you must grant this role permissions to use the customer master key.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/AliyunDlfNextDataAccessRole</p>
     */
    @NameInMap("dataAccessRoleArn")
    public String dataAccessRoleArn;

    /**
     * <p>The authorization statement that must be added to the customer master key policy. This statement grants the DLF data access role corresponding to dataAccessRoleArn the KMS permissions required for data encryption and decryption.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Sid&quot;:&quot;AllowDLFDataAccess&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::123456789012****:role/
     *   AliyunDlfNextDataAccessRole&quot;]},&quot;Action&quot;:[&quot;kms:Decrypt&quot;,&quot;kms:GenerateDataKey&quot;],&quot;Resource&quot;:[&quot;*&quot;]}</p>
     */
    @NameInMap("keyPolicyStatement")
    public String keyPolicyStatement;

    /**
     * <p>The region ID to which the catalog belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The DLF workflow role ARN. In the current version, the workflow role is not granted customer master key access permissions based on the least privilege principle. Therefore, this field returns an empty value.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
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
