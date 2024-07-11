// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeColdStorageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ld-bp1uoihlf82e8****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorageSize")
    public String coldStorageSize;

    /**
     * <strong>example:</strong>
     * <p>BdsColdStorage</p>
     */
    @NameInMap("ColdStorageType")
    public String coldStorageType;

    /**
     * <strong>example:</strong>
     * <p>20.00</p>
     */
    @NameInMap("ColdStorageUseAmount")
    public String coldStorageUseAmount;

    /**
     * <strong>example:</strong>
     * <p>20.00</p>
     */
    @NameInMap("ColdStorageUsePercent")
    public String coldStorageUsePercent;

    /**
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("OpenStatus")
    public String openStatus;

    /**
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>DCB9479E-F05F-4D1C-AFB7-C639B87764B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeColdStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageResponseBody self = new DescribeColdStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeColdStorageResponseBody setColdStorageSize(String coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    public DescribeColdStorageResponseBody setColdStorageType(String coldStorageType) {
        this.coldStorageType = coldStorageType;
        return this;
    }
    public String getColdStorageType() {
        return this.coldStorageType;
    }

    public DescribeColdStorageResponseBody setColdStorageUseAmount(String coldStorageUseAmount) {
        this.coldStorageUseAmount = coldStorageUseAmount;
        return this;
    }
    public String getColdStorageUseAmount() {
        return this.coldStorageUseAmount;
    }

    public DescribeColdStorageResponseBody setColdStorageUsePercent(String coldStorageUsePercent) {
        this.coldStorageUsePercent = coldStorageUsePercent;
        return this;
    }
    public String getColdStorageUsePercent() {
        return this.coldStorageUsePercent;
    }

    public DescribeColdStorageResponseBody setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public String getOpenStatus() {
        return this.openStatus;
    }

    public DescribeColdStorageResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeColdStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
