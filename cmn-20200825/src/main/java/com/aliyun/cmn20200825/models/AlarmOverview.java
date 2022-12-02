// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AlarmOverview extends TeaModel {
    @NameInMap("AlarmOverviewId")
    public String alarmOverviewId;

    @NameInMap("AlarmOverviewName")
    public String alarmOverviewName;

    @NameInMap("ConditionList")
    public java.util.List<AlarmOverviewConditionList> conditionList;

    @NameInMap("SerialNumber")
    public Integer serialNumber;

    public static AlarmOverview build(java.util.Map<String, ?> map) throws Exception {
        AlarmOverview self = new AlarmOverview();
        return TeaModel.build(map, self);
    }

    public AlarmOverview setAlarmOverviewId(String alarmOverviewId) {
        this.alarmOverviewId = alarmOverviewId;
        return this;
    }
    public String getAlarmOverviewId() {
        return this.alarmOverviewId;
    }

    public AlarmOverview setAlarmOverviewName(String alarmOverviewName) {
        this.alarmOverviewName = alarmOverviewName;
        return this;
    }
    public String getAlarmOverviewName() {
        return this.alarmOverviewName;
    }

    public AlarmOverview setConditionList(java.util.List<AlarmOverviewConditionList> conditionList) {
        this.conditionList = conditionList;
        return this;
    }
    public java.util.List<AlarmOverviewConditionList> getConditionList() {
        return this.conditionList;
    }

    public AlarmOverview setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public static class AlarmOverviewConditionList extends TeaModel {
        @NameInMap("ConditionName")
        public String conditionName;

        @NameInMap("ConditionValue")
        public String conditionValue;

        public static AlarmOverviewConditionList build(java.util.Map<String, ?> map) throws Exception {
            AlarmOverviewConditionList self = new AlarmOverviewConditionList();
            return TeaModel.build(map, self);
        }

        public AlarmOverviewConditionList setConditionName(String conditionName) {
            this.conditionName = conditionName;
            return this;
        }
        public String getConditionName() {
            return this.conditionName;
        }

        public AlarmOverviewConditionList setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

    }

}
