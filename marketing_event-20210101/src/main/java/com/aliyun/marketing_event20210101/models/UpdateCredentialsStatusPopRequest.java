// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class UpdateCredentialsStatusPopRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4546-100000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("ProxyRecipientName")
    public String proxyRecipientName;

    /**
     * <strong>example:</strong>
     * <p>14787627188</p>
     */
    @NameInMap("ProxyRecipientPhoneNumber")
    public String proxyRecipientPhoneNumber;

    /**
     * <strong>example:</strong>
     * <p>Z30</p>
     */
    @NameInMap("ReceiptLocation")
    public String receiptLocation;

    /**
     * <strong>example:</strong>
     * <p>429005111100000</p>
     */
    @NameInMap("Time")
    public String time;

    public static UpdateCredentialsStatusPopRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialsStatusPopRequest self = new UpdateCredentialsStatusPopRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialsStatusPopRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCredentialsStatusPopRequest setProxyRecipientName(String proxyRecipientName) {
        this.proxyRecipientName = proxyRecipientName;
        return this;
    }
    public String getProxyRecipientName() {
        return this.proxyRecipientName;
    }

    public UpdateCredentialsStatusPopRequest setProxyRecipientPhoneNumber(String proxyRecipientPhoneNumber) {
        this.proxyRecipientPhoneNumber = proxyRecipientPhoneNumber;
        return this;
    }
    public String getProxyRecipientPhoneNumber() {
        return this.proxyRecipientPhoneNumber;
    }

    public UpdateCredentialsStatusPopRequest setReceiptLocation(String receiptLocation) {
        this.receiptLocation = receiptLocation;
        return this;
    }
    public String getReceiptLocation() {
        return this.receiptLocation;
    }

    public UpdateCredentialsStatusPopRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
