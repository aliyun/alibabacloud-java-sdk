// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeColdStorageResponseBody extends TeaModel {
    @NameInMap("ColdStorageUsePercent")
    public String coldStorageUsePercent;

    @NameInMap("ColdStorageSize")
    public String coldStorageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("OpenStatus")
    public String openStatus;

    public static DescribeColdStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageResponseBody self = new DescribeColdStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageResponseBody setColdStorageUsePercent(String coldStorageUsePercent) {
        this.coldStorageUsePercent = coldStorageUsePercent;
        return this;
    }
    public String getColdStorageUsePercent() {
        return this.coldStorageUsePercent;
    }

    public DescribeColdStorageResponseBody setColdStorageSize(String coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    public DescribeColdStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColdStorageResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeColdStorageResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeColdStorageResponseBody setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public String getOpenStatus() {
        return this.openStatus;
    }

}
