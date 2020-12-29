// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeDVOrderResultResponseBody extends TeaModel {
    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("CheckName")
    public String checkName;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CheckType")
    public String checkType;

    @NameInMap("CheckValue")
    public String checkValue;

    @NameInMap("Certificate")
    public String certificate;

    public static DescribeDVOrderResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDVOrderResultResponseBody self = new DescribeDVOrderResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDVOrderResultResponseBody setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public DescribeDVOrderResultResponseBody setCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }
    public String getCheckName() {
        return this.checkName;
    }

    public DescribeDVOrderResultResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeDVOrderResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDVOrderResultResponseBody setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public DescribeDVOrderResultResponseBody setCheckValue(String checkValue) {
        this.checkValue = checkValue;
        return this;
    }
    public String getCheckValue() {
        return this.checkValue;
    }

    public DescribeDVOrderResultResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

}
