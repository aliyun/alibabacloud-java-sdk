// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9999985</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The state of the DNS record. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enables the DNS record.</li>
     * <li><strong>Disable</strong>: disables the DNS record.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.0</p>
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
