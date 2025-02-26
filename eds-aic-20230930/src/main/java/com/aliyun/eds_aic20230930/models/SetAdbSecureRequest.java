// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SetAdbSecureRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances. You can specify a maximum of 50 cloud phone instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The status of the ADB authentication feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: The ADB authentication feature is disabled.</li>
     * <li>1: The ADB authentication feature is enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static SetAdbSecureRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAdbSecureRequest self = new SetAdbSecureRequest();
        return TeaModel.build(map, self);
    }

    public SetAdbSecureRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public SetAdbSecureRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
