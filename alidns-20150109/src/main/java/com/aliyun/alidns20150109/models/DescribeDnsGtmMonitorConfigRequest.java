// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
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
