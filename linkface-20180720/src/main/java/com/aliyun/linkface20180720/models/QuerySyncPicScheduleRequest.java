// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QuerySyncPicScheduleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testdevice</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>ztxEorNjU5I4PYVlW4Jr0010374d00</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <strong>example:</strong>
     * <p>testproduct</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QuerySyncPicScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncPicScheduleRequest self = new QuerySyncPicScheduleRequest();
        return TeaModel.build(map, self);
    }

    public QuerySyncPicScheduleRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QuerySyncPicScheduleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QuerySyncPicScheduleRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QuerySyncPicScheduleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
