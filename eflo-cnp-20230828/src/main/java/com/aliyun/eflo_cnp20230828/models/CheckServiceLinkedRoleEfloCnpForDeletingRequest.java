// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleEfloCnpForDeletingRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>345678901234</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The ID of the deletion task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-003</p>
     */
    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
     * <p>The trusted entity of the RAM role is an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/93691.html">Create a RAM role for a trusted Alibaba Cloud account</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</p>
     * <p>Format: <code>acs:ram::&lt;account_id&gt;:role/&lt;role_name&gt;</code>.</p>
     * <p>You can view the ARN in the RAM console or by calling operations. The following items describe the validity periods of storage addresses:</p>
     * <ul>
     * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I find the ARN of the RAM role?</a></li>
     * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>arn:aws:iam::345678901234:role/eflo-cnp-role</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SPIRegionId")
    public String SPIRegionId;

    /**
     * <p>The Service Name.</p>
     * 
     * <strong>example:</strong>
     * <p>eflo-cnp</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static CheckServiceLinkedRoleEfloCnpForDeletingRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleEfloCnpForDeletingRequest self = new CheckServiceLinkedRoleEfloCnpForDeletingRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingRequest setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingRequest setSPIRegionId(String SPIRegionId) {
        this.SPIRegionId = SPIRegionId;
        return this;
    }
    public String getSPIRegionId() {
        return this.SPIRegionId;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
