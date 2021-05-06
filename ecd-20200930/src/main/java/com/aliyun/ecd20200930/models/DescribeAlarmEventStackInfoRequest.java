// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DesktopId")
    @Validation(required = true)
    public String desktopId;

    @NameInMap("EventName")
    @Validation(required = true)
    public String eventName;

    @NameInMap("UniqueInfo")
    @Validation(required = true)
    public String uniqueInfo;

    @NameInMap("Lang")
    public String lang;

    public static DescribeAlarmEventStackInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoRequest self = new DescribeAlarmEventStackInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeAlarmEventStackInfoRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public DescribeAlarmEventStackInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
