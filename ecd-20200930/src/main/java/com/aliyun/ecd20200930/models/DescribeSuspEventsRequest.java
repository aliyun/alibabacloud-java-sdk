// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    // The ID of the alert event to which the exception is related.
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    // The number of the page to return. Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The processing status of the exception. Valid values:
    // 
    // *   N: not processed
    // *   Y: processed
    @NameInMap("Dealed")
    public String dealed;

    // The natural language of the request and response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("Lang")
    public String lang;

    // The severity level of the exception. Valid values:
    // 
    // *   serious
    // *   suspicious
    // *   remind
    @NameInMap("Levels")
    public String levels;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The maximum number of entries to return on each page. Default value: 20.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The type of the alert event to which the exception is related.
    @NameInMap("ParentEventType")
    public String parentEventType;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSuspEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsRequest self = new DescribeSuspEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public DescribeSuspEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeSuspEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeSuspEventsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeSuspEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsRequest setParentEventType(String parentEventType) {
        this.parentEventType = parentEventType;
        return this;
    }
    public String getParentEventType() {
        return this.parentEventType;
    }

    public DescribeSuspEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
