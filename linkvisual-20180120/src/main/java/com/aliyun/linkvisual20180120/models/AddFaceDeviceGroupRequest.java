// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceGroupRequest extends TeaModel {
    /**
     * <p>The name of the device group. You can customize the value. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDeviceGroup</p>
     */
    @NameInMap("DeviceGroupName")
    public String deviceGroupName;

    /**
     * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account. It supports uppercase and lowercase English letters and digits.</p>
     * <p>For example, if you have face recognition businesses in Region A and Region B, you can set different business isolation IDs to distinguish the face recognition businesses in Region A and Region B.</p>
     * <blockquote>
     * <p>Notice: 
     * Save the business isolation ID properly for use when you call other API operations in this business isolation zone.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    public static AddFaceDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceGroupRequest self = new AddFaceDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceGroupRequest setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
        return this;
    }
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    public AddFaceDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

}
