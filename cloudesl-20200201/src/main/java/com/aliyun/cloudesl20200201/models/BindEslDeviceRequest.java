// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BindEslDeviceRequest extends TeaModel {
    @NameInMap("Column")
    public String column;

    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("Layer")
    public Integer layer;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("LayoutName")
    public String layoutName;

    @NameInMap("Shelf")
    public String shelf;

    @NameInMap("StoreId")
    public String storeId;

    public static BindEslDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEslDeviceRequest self = new BindEslDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindEslDeviceRequest setColumn(String column) {
        this.column = column;
        return this;
    }
    public String getColumn() {
        return this.column;
    }

    public BindEslDeviceRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public BindEslDeviceRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public BindEslDeviceRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public BindEslDeviceRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public BindEslDeviceRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public BindEslDeviceRequest setLayer(Integer layer) {
        this.layer = layer;
        return this;
    }
    public Integer getLayer() {
        return this.layer;
    }

    public BindEslDeviceRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public BindEslDeviceRequest setLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }
    public String getLayoutName() {
        return this.layoutName;
    }

    public BindEslDeviceRequest setShelf(String shelf) {
        this.shelf = shelf;
        return this;
    }
    public String getShelf() {
        return this.shelf;
    }

    public BindEslDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
