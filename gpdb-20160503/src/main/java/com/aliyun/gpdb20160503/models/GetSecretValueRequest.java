// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the access credential for the created Data API account. Format: <code>acs:gpdb:{{region}}:{{accountId}}:secret/{{secretName}}-{{32 digits random string}</code>.</p>
     * <blockquote>
     * <p> You must specify one of the SecretArn and SecretName parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
     */
    @NameInMap("SecretArn")
    public String secretArn;

    /**
     * <p>The name of the access credential.</p>
     * <blockquote>
     * <p> You must specify one of the SecretArn and SecretName parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testsecret</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueRequest self = new GetSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretValueRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public GetSecretValueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSecretValueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretValueRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public GetSecretValueRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public GetSecretValueRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
