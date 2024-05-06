// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeColdStorageResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ColdStorageSize")
    public String coldStorageSize;

    @NameInMap("ColdStorageUsePercent")
    public String coldStorageUsePercent;

    @NameInMap("OpenStatus")
    public String openStatus;

    @NameInMap("PayType")
    public String payType;

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
