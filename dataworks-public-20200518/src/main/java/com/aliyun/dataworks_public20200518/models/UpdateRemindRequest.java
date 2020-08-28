// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateRemindRequest extends TeaModel {
    @NameInMap("RemindId")
    @Validation(required = true)
    public Long remindId;

    @NameInMap("RemindName")
    public String remindName;

    @NameInMap("DndEnd")
    public String dndEnd;

    @NameInMap("RemindUnit")
    public String remindUnit;

    @NameInMap("NodeIds")
    public String nodeIds;

    @NameInMap("BaselineIds")
    public String baselineIds;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    @NameInMap("RemindType")
    public String remindType;

    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("AlertUnit")
    public String alertUnit;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertTargets")
    public String alertTargets;

    @NameInMap("UseFlag")
    public Boolean useFlag;

    @NameInMap("RobotUrls")
    public String robotUrls;

    public static UpdateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemindRequest self = new UpdateRemindRequest();
        return TeaModel.build(map, self);
    }

}
