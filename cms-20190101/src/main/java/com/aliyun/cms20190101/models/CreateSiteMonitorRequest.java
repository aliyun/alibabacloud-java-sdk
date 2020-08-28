// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorRequest extends TeaModel {
    @NameInMap("Address")
    @Validation(required = true)
    public String address;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("IspCities")
    public String ispCities;

    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("AlertIds")
    public String alertIds;

    public static CreateSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorRequest self = new CreateSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

}
