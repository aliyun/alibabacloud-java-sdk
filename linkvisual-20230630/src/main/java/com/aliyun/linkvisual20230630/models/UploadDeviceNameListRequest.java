// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UploadDeviceNameListRequest extends TeaModel {
    @NameInMap("DeviceNames")
    public java.util.List<String> deviceNames;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static UploadDeviceNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceNameListRequest self = new UploadDeviceNameListRequest();
        return TeaModel.build(map, self);
    }

    public UploadDeviceNameListRequest setDeviceNames(java.util.List<String> deviceNames) {
        this.deviceNames = deviceNames;
        return this;
    }
    public java.util.List<String> getDeviceNames() {
        return this.deviceNames;
    }

    public UploadDeviceNameListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UploadDeviceNameListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
