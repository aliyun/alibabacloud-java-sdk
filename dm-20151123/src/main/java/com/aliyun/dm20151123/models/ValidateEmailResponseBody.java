// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ValidateEmailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>yyy.com</p>
     */
    @NameInMap("DomainPart")
    public String domainPart;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFreeMail")
    public Boolean isFreeMail;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("LocalPart")
    public String localPart;

    /**
     * <strong>example:</strong>
     * <p>Gmail</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSPECIFIED</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    public static ValidateEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateEmailResponseBody self = new ValidateEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateEmailResponseBody setDomainPart(String domainPart) {
        this.domainPart = domainPart;
        return this;
    }
    public String getDomainPart() {
        return this.domainPart;
    }

    public ValidateEmailResponseBody setIsFreeMail(Boolean isFreeMail) {
        this.isFreeMail = isFreeMail;
        return this;
    }
    public Boolean getIsFreeMail() {
        return this.isFreeMail;
    }

    public ValidateEmailResponseBody setLocalPart(String localPart) {
        this.localPart = localPart;
        return this;
    }
    public String getLocalPart() {
        return this.localPart;
    }

    public ValidateEmailResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ValidateEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateEmailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ValidateEmailResponseBody setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

}
