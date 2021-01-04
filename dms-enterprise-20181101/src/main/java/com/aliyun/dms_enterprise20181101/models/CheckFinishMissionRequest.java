// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckFinishMissionRequest extends TeaModel {
    @NameInMap("MissionType")
    public String missionType;

    public static CheckFinishMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFinishMissionRequest self = new CheckFinishMissionRequest();
        return TeaModel.build(map, self);
    }

    public CheckFinishMissionRequest setMissionType(String missionType) {
        this.missionType = missionType;
        return this;
    }
    public String getMissionType() {
        return this.missionType;
    }

}
