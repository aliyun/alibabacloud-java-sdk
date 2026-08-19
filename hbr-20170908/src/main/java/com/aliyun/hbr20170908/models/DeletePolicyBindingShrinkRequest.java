// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeletePolicyBindingShrinkRequest extends TeaModel {
    /**
     * <p>The list of data source IDs to dissociate from the policy.</p>
     */
    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************hgp</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
     * <li><strong>OSS</strong>: OSS backup.</li>
     * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
     * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
     * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
     * <li><strong>File</strong>: On-premises file backup.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
     * <li><strong>OTS</strong>: Tablestore backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DeletePolicyBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyBindingShrinkRequest self = new DeletePolicyBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyBindingShrinkRequest setDataSourceIdsShrink(String dataSourceIdsShrink) {
        this.dataSourceIdsShrink = dataSourceIdsShrink;
        return this;
    }
    public String getDataSourceIdsShrink() {
        return this.dataSourceIdsShrink;
    }

    public DeletePolicyBindingShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DeletePolicyBindingShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
