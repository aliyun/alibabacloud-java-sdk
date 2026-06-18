// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetConfigNumListRequest extends TeaModel {
    /**
     * <p>The agent account name. It is unique within the instance (logon name).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@123.com">123@123.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DepartmentId")
    public Long departmentId;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetConfigNumListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigNumListRequest self = new GetConfigNumListRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigNumListRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetConfigNumListRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public GetConfigNumListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
