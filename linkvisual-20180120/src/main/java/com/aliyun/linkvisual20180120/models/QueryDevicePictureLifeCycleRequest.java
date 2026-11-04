// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureLifeCycleRequest extends TeaModel {
    /**
     * <p>The ID of the IPC device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    public static QueryDevicePictureLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureLifeCycleRequest self = new QueryDevicePictureLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureLifeCycleRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

}
