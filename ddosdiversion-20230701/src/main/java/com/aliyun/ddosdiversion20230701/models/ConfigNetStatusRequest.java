// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ConfigNetStatusRequest extends TeaModel {
    /**
     * <p>The CIDR block of the anti-DDoS diversion instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX/22</p>
     */
    @NameInMap("Net")
    public String net;

    /**
     * <p>The regions in which the CIDR block needs to be advertised or withdrawn from advertising. If you leave this parameter empty, the CIDR blocks in all regions are configured.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2639086.html">QueryNetList</a> operation to obtain the regions of the CIDR blocks.</p>
     * </blockquote>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The ID of the anti-DDoS diversion instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx</p>
     */
    @NameInMap("SaleId")
    public String saleId;

    /**
     * <p>The status of the CIDR block. Valid values:</p>
     * <ul>
     * <li>enable: advertises the CIDR block.</li>
     * <li>disable: withdraws the advertising of the CIDR block.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The subnet CIDR blocks of the CIDR block.</p>
     */
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
