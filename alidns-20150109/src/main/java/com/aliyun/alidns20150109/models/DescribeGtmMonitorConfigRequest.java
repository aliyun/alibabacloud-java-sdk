// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    public static DescribeGtmMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigRequest self = new DescribeGtmMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmMonitorConfigRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
