// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeAlarmEventStackInfo.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The natural language of the request and response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the alert event.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack information of the alert details.</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    public static DescribeAlarmEventStackInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoRequest self = new DescribeAlarmEventStackInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeAlarmEventStackInfoRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeAlarmEventStackInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAlarmEventStackInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlarmEventStackInfoRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

}
