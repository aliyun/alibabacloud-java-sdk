// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UnbindEslDeviceRequest extends TeaModel {
    @NameInMap("Column")
    public String column;

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

    @NameInMap("Shelf")
    public String shelf;

    @NameInMap("StoreId")
    public String storeId;

    public static UnbindEslDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindEslDeviceRequest self = new UnbindEslDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindEslDeviceRequest setColumn(String column) {
        this.column = column;
        return this;
    }
    public String getColumn() {
        return this.column;
    }

    public UnbindEslDeviceRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public UnbindEslDeviceRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public UnbindEslDeviceRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UnbindEslDeviceRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public UnbindEslDeviceRequest setLayer(Integer layer) {
        this.layer = layer;
        return this;
    }
    public Integer getLayer() {
        return this.layer;
    }

    public UnbindEslDeviceRequest setShelf(String shelf) {
        this.shelf = shelf;
        return this;
    }
    public String getShelf() {
        return this.shelf;
    }

    public UnbindEslDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
