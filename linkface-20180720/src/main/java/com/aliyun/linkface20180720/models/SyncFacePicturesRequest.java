// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class SyncFacePicturesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testdevice</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun,alibaba</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>ztxEorNjU5I4PYVlW4Jr0010374d003</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <strong>example:</strong>
     * <p>testproduct</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static SyncFacePicturesRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFacePicturesRequest self = new SyncFacePicturesRequest();
        return TeaModel.build(map, self);
    }

    public SyncFacePicturesRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SyncFacePicturesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SyncFacePicturesRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SyncFacePicturesRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
