// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the health check configuration.&lt;props=&quot;china&quot;&gt; For more information, see <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspool?spm=a2c4g.11186623.help-menu-29697.d_0_5_1_3_9_6.7db77000nMCPI1">DescribeDnsGtmInstanceAddressPool</a>.&lt;props=&quot;intl&quot;&gt; For more information, see <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspool?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDnsGtmInstanceAddressPool</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Moni*******</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    public static DescribeDnsGtmMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorConfigRequest self = new DescribeDnsGtmMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsGtmMonitorConfigRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
