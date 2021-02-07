// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceRequest extends TeaModel {
    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static DeleteVirtualMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualMFADeviceRequest self = new DeleteVirtualMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualMFADeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DeleteVirtualMFADeviceRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
