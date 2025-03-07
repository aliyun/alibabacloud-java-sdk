// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaLiveInputSecurityGroupRequest extends TeaModel {
    /**
     * <p>The ID of the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static DeleteMediaLiveInputSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaLiveInputSecurityGroupRequest self = new DeleteMediaLiveInputSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaLiveInputSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
