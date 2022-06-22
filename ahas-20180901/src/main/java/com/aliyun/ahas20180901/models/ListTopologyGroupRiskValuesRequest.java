// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyGroupRiskValuesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Type")
    public String type;

    @NameInMap("ViewId")
    public String viewId;

    @NameInMap("Zone")
    public String zone;

    public static ListTopologyGroupRiskValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyGroupRiskValuesRequest self = new ListTopologyGroupRiskValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListTopologyGroupRiskValuesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListTopologyGroupRiskValuesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTopologyGroupRiskValuesRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public ListTopologyGroupRiskValuesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListTopologyGroupRiskValuesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListTopologyGroupRiskValuesRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

    public ListTopologyGroupRiskValuesRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
