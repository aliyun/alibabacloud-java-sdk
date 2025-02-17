// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAllowedPrefixHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the association between the ECR and the virtual private cloud (VPC) or transit router (TR).</p>
     * <blockquote>
     * <p> You must specify either <strong>InstanceId</strong> or <strong>AssociationId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecr-assoc-9p2qxx5phpca2m****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ECR ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The ID of the network instance that is associated with the ECR.</p>
     * <blockquote>
     * <p> You must specify either <strong>InstanceId</strong> or <strong>AssociationId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vbr-j6cwxhgg0s5nuephp****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong></li>
     * <li><strong>TR</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeExpressConnectRouterAllowedPrefixHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterAllowedPrefixHistoryRequest self = new DescribeExpressConnectRouterAllowedPrefixHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
