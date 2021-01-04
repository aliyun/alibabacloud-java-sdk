// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyElasticBandwidthRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ElasticBandwidth")
    public Integer elasticBandwidth;

    @NameInMap("Ip")
    public String ip;

    public static ModifyElasticBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandwidthRequest self = new ModifyElasticBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandwidthRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyElasticBandwidthRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyElasticBandwidthRequest setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

    public ModifyElasticBandwidthRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
