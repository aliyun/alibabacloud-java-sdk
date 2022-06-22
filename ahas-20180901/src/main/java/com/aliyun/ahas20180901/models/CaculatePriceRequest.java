// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CaculatePriceRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Days")
    public Integer days;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NumNodes")
    public Integer numNodes;

    public static CaculatePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        CaculatePriceRequest self = new CaculatePriceRequest();
        return TeaModel.build(map, self);
    }

    public CaculatePriceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CaculatePriceRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public CaculatePriceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CaculatePriceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CaculatePriceRequest setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
        return this;
    }
    public Integer getNumNodes() {
        return this.numNodes;
    }

}
