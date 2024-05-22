// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeEslDevicesRequest extends TeaModel {
    @NameInMap("BeBind")
    public Boolean beBind;

    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("EslStatus")
    public String eslStatus;

    @NameInMap("FromBatteryLevel")
    public Integer fromBatteryLevel;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShelfCode")
    public String shelfCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("ToBatteryLevel")
    public Integer toBatteryLevel;

    @NameInMap("Type")
    public String type;

    @NameInMap("Vendor")
    public String vendor;

    public static DescribeEslDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslDevicesRequest self = new DescribeEslDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEslDevicesRequest setBeBind(Boolean beBind) {
        this.beBind = beBind;
        return this;
    }
    public Boolean getBeBind() {
        return this.beBind;
    }

    public DescribeEslDevicesRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public DescribeEslDevicesRequest setEslStatus(String eslStatus) {
        this.eslStatus = eslStatus;
        return this;
    }
    public String getEslStatus() {
        return this.eslStatus;
    }

    public DescribeEslDevicesRequest setFromBatteryLevel(Integer fromBatteryLevel) {
        this.fromBatteryLevel = fromBatteryLevel;
        return this;
    }
    public Integer getFromBatteryLevel() {
        return this.fromBatteryLevel;
    }

    public DescribeEslDevicesRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public DescribeEslDevicesRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public DescribeEslDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEslDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEslDevicesRequest setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode;
        return this;
    }
    public String getShelfCode() {
        return this.shelfCode;
    }

    public DescribeEslDevicesRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DescribeEslDevicesRequest setToBatteryLevel(Integer toBatteryLevel) {
        this.toBatteryLevel = toBatteryLevel;
        return this;
    }
    public Integer getToBatteryLevel() {
        return this.toBatteryLevel;
    }

    public DescribeEslDevicesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeEslDevicesRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
