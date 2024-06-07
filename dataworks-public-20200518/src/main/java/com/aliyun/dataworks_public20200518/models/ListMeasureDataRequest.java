// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMeasureDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ComponentCode")
    public String componentCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListMeasureDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMeasureDataRequest self = new ListMeasureDataRequest();
        return TeaModel.build(map, self);
    }

    public ListMeasureDataRequest setComponentCode(String componentCode) {
        this.componentCode = componentCode;
        return this;
    }
    public String getComponentCode() {
        return this.componentCode;
    }

    public ListMeasureDataRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public ListMeasureDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMeasureDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
