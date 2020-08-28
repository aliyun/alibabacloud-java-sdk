// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("IspCities")
    public String ispCities;

    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("AlertIds")
    public String alertIds;

    public static ModifySiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteMonitorRequest self = new ModifySiteMonitorRequest();
        return TeaModel.build(map, self);
    }

}
