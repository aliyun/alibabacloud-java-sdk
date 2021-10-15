// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateEslDeviceLightRequest extends TeaModel {
    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("LedColor")
    public String ledColor;

    @NameInMap("LightUpTime")
    public Integer lightUpTime;

    @NameInMap("StoreId")
    public String storeId;

    public static UpdateEslDeviceLightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEslDeviceLightRequest self = new UpdateEslDeviceLightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEslDeviceLightRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public UpdateEslDeviceLightRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UpdateEslDeviceLightRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public UpdateEslDeviceLightRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public UpdateEslDeviceLightRequest setLedColor(String ledColor) {
        this.ledColor = ledColor;
        return this;
    }
    public String getLedColor() {
        return this.ledColor;
    }

    public UpdateEslDeviceLightRequest setLightUpTime(Integer lightUpTime) {
        this.lightUpTime = lightUpTime;
        return this;
    }
    public Integer getLightUpTime() {
        return this.lightUpTime;
    }

    public UpdateEslDeviceLightRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
