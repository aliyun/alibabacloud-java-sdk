// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMeasureDataRequest extends TeaModel {
    /**
     * <p>The measurement component. Valid values:</p>
     * <ul>
     * <li>Count: phone call-based alerts and text message-based alerts</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Count</p>
     */
    @NameInMap("ComponentCode")
    public String componentCode;

    /**
     * <p>The measurement item. Valid values:</p>
     * <ul>
     * <li>DideAlarmPhone: phone call-based alerts</li>
     * <li>DideAlarmSms: text message-based alerts</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DideAlarmPhone</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <p>The end timestamp of the measurement period, in milliseconds. The measurement period is calculated in days. You can query only the data within the previous 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The start timestamp of the measurement period, in milliseconds. The measurement period is calculated in days. You can query only the data within the previous 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1717344000000</p>
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
