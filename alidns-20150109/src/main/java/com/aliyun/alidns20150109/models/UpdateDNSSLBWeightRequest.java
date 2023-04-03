// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightRequest extends TeaModel {
    /**
     * <p>The language of the domain name.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The IP address of the client that you use to change the weight.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The updated weight of the DNS record. Valid values: `1 to 100`.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateDNSSLBWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSSLBWeightRequest self = new UpdateDNSSLBWeightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDNSSLBWeightRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDNSSLBWeightRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDNSSLBWeightRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateDNSSLBWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
