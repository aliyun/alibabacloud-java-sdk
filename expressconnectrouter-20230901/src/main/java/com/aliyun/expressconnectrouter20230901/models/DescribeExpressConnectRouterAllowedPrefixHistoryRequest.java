// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAllowedPrefixHistoryRequest extends TeaModel {
    /**
     * <p>The instance ID of the VPC or transit router (TR) associated with the Express Connect Router (ECR) for forward routing.</p>
     * <blockquote>
     * <p>You must specify either the <strong>InstanceId</strong> parameter or the <strong>AssociationId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecr-assoc-9p2qxx5phpca2m****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client to ensure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether it is only a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run for the request without modifying EPS resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The instance ID to load into the Express Connect Router (ECR).</p>
     * <blockquote>
     * <p>You must specify either the <strong>InstanceId</strong> parameter or the <strong>AssociationId</strong> parameter.</p>
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
     * <li><strong>VPC</strong>: VPC instance.</li>
     * <li><strong>TR</strong>: Transit router instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Version")
    public String version;

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

    public DescribeExpressConnectRouterAllowedPrefixHistoryRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
