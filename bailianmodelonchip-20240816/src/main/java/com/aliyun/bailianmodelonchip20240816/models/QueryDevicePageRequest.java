// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryDevicePageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
     */
    @NameInMap("deviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("disableStatus")
    public Integer disableStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>el3SzmCU2p0x4RBc</p>
     */
    @NameInMap("productKey")
    public String productKey;

    @NameInMap("productName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static QueryDevicePageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePageRequest self = new QueryDevicePageRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePageRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePageRequest setDisableStatus(Integer disableStatus) {
        this.disableStatus = disableStatus;
        return this;
    }
    public Integer getDisableStatus() {
        return this.disableStatus;
    }

    public QueryDevicePageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryDevicePageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDevicePageRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePageRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryDevicePageRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
