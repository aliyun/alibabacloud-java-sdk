// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindRequest extends TeaModel {
    @NameInMap("RemindName")
    @Validation(required = true)
    public String remindName;

    @NameInMap("DndEnd")
    public String dndEnd;

    @NameInMap("RemindUnit")
    @Validation(required = true)
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
    @Validation(required = true)
    public String remindType;

    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("AlertUnit")
    @Validation(required = true)
    public String alertUnit;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertTargets")
    public String alertTargets;

    @NameInMap("RobotUrls")
    public String robotUrls;

    public static CreateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemindRequest self = new CreateRemindRequest();
        return TeaModel.build(map, self);
    }

}
