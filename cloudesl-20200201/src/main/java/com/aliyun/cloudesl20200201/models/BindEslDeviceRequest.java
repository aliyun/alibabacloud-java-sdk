// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BindEslDeviceRequest extends TeaModel {
    @NameInMap("Column")
    public String column;

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
