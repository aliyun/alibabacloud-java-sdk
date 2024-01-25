// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslDevicesRequest extends TeaModel {
    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("EslStatus")
    public String eslStatus;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("FromBatteryLevel")
    public Integer fromBatteryLevel;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("ToBatteryLevel")
    public Integer toBatteryLevel;

    @NameInMap("Type")
    public String type;

    @NameInMap("TypeEncode")
    public String typeEncode;

    public static DescribeEslDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslDevicesRequest self = new DescribeEslDevicesRequest();
        return TeaModel.build(map, self);
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

    public DescribeEslDevicesRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeEslDevicesRequest setFromBatteryLevel(Integer fromBatteryLevel) {
        this.fromBatteryLevel = fromBatteryLevel;
        return this;
    }
    public Integer getFromBatteryLevel() {
        return this.fromBatteryLevel;
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

    public DescribeEslDevicesRequest setTypeEncode(String typeEncode) {
        this.typeEncode = typeEncode;
        return this;
    }
    public String getTypeEncode() {
        return this.typeEncode;
    }

}
