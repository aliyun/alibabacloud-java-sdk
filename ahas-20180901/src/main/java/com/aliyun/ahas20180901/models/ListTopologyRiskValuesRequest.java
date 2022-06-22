// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyRiskValuesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("Size")
    public Long size;

    @NameInMap("ViewId")
    public String viewId;

    public static ListTopologyRiskValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyRiskValuesRequest self = new ListTopologyRiskValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListTopologyRiskValuesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListTopologyRiskValuesRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public ListTopologyRiskValuesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTopologyRiskValuesRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public ListTopologyRiskValuesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListTopologyRiskValuesRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
