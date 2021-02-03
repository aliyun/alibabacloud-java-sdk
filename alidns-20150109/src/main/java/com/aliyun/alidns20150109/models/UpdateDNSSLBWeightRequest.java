// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RecordId")
    public String recordId;

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

    public UpdateDNSSLBWeightRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateDNSSLBWeightRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDNSSLBWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
