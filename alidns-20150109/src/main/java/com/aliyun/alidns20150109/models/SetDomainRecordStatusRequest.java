// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusRequest extends TeaModel {
    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The state of the DNS record. Valid values:</p>
     * <br>
     * <p>*   **Enable**: enables the DNS record.</p>
     * <p>*   **Disable**: disables the DNS record.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SetDomainRecordStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRecordStatusRequest self = new SetDomainRecordStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainRecordStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDomainRecordStatusRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public SetDomainRecordStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetDomainRecordStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
