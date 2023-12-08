// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ConfigNetStatusRequest extends TeaModel {
    @NameInMap("Net")
    public String net;

    @NameInMap("Regions")
    public java.util.List<String> regions;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubNets")
    public java.util.List<String> subNets;

    public static ConfigNetStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetStatusRequest self = new ConfigNetStatusRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetStatusRequest setNet(String net) {
        this.net = net;
        return this;
    }
    public String getNet() {
        return this.net;
    }

    public ConfigNetStatusRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public ConfigNetStatusRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public ConfigNetStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConfigNetStatusRequest setSubNets(java.util.List<String> subNets) {
        this.subNets = subNets;
        return this;
    }
    public java.util.List<String> getSubNets() {
        return this.subNets;
    }

}
