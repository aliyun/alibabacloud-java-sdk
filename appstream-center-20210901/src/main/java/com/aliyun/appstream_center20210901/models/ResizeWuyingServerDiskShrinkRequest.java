// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ResizeWuyingServerDiskShrinkRequest extends TeaModel {
    /**
     * <p>The size and specifications of the data cloud disks.</p>
     */
    @NameInMap("DataDiskList")
    public String dataDiskListShrink;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The new capacity of the system cloud disk, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>220</p>
     */
    @NameInMap("SystemDiskNewSize")
    public Integer systemDiskNewSize;

    /**
     * <p>The workstation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static ResizeWuyingServerDiskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeWuyingServerDiskShrinkRequest self = new ResizeWuyingServerDiskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResizeWuyingServerDiskShrinkRequest setDataDiskListShrink(String dataDiskListShrink) {
        this.dataDiskListShrink = dataDiskListShrink;
        return this;
    }
    public String getDataDiskListShrink() {
        return this.dataDiskListShrink;
    }

    public ResizeWuyingServerDiskShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ResizeWuyingServerDiskShrinkRequest setSystemDiskNewSize(Integer systemDiskNewSize) {
        this.systemDiskNewSize = systemDiskNewSize;
        return this;
    }
    public Integer getSystemDiskNewSize() {
        return this.systemDiskNewSize;
    }

    public ResizeWuyingServerDiskShrinkRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
