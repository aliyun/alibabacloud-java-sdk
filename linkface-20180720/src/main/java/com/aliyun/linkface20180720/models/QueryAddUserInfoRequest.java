// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryAddUserInfoRequest extends TeaModel {
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
     * <p>mjgfPDJtjpPieDeK7HJn001015af00</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <strong>example:</strong>
     * <p>testproduct</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryAddUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAddUserInfoRequest self = new QueryAddUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAddUserInfoRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryAddUserInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryAddUserInfoRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryAddUserInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
