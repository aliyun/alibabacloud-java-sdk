// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceRecordLifeCycleRequest extends TeaModel {
    /**
     * <p>The list of IoT IDs of the IPC devices. An IoT ID is a unique identifier issued by IoT Platform for a device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the IoT ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;C47T6xwp6ms4bNlkHRWCg4****&quot;, &quot;d7XmBoJhAr88C6PelXDF00****&quot;]</p>
     */
    @NameInMap("DeviceList")
    public java.util.List<String> deviceList;

    public static QueryDeviceRecordLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRecordLifeCycleRequest self = new QueryDeviceRecordLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRecordLifeCycleRequest setDeviceList(java.util.List<String> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<String> getDeviceList() {
        return this.deviceList;
    }

}
