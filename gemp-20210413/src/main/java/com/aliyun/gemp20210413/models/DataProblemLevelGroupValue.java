// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DataProblemLevelGroupValue extends TeaModel {
    @NameInMap("childRuleRelation")
    public Integer childRuleRelation;

    @NameInMap("matchCount")
    public Long matchCount;

    @NameInMap("timeWindow")
    public Long timeWindow;

    @NameInMap("timeWindowUnit")
    public String timeWindowUnit;

    @NameInMap("enableUpgrade")
    public Boolean enableUpgrade;

    @NameInMap("upgradeTimeWindow")
    public Long upgradeTimeWindow;

    @NameInMap("upgradeTimeWindowUnit")
    public String upgradeTimeWindowUnit;

    public static DataProblemLevelGroupValue build(java.util.Map<String, ?> map) throws Exception {
        DataProblemLevelGroupValue self = new DataProblemLevelGroupValue();
        return TeaModel.build(map, self);
    }

    public DataProblemLevelGroupValue setChildRuleRelation(Integer childRuleRelation) {
        this.childRuleRelation = childRuleRelation;
        return this;
    }
    public Integer getChildRuleRelation() {
        return this.childRuleRelation;
    }

    public DataProblemLevelGroupValue setMatchCount(Long matchCount) {
        this.matchCount = matchCount;
        return this;
    }
    public Long getMatchCount() {
        return this.matchCount;
    }

    public DataProblemLevelGroupValue setTimeWindow(Long timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public DataProblemLevelGroupValue setTimeWindowUnit(String timeWindowUnit) {
        this.timeWindowUnit = timeWindowUnit;
        return this;
    }
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public DataProblemLevelGroupValue setEnableUpgrade(Boolean enableUpgrade) {
        this.enableUpgrade = enableUpgrade;
        return this;
    }
    public Boolean getEnableUpgrade() {
        return this.enableUpgrade;
    }

    public DataProblemLevelGroupValue setUpgradeTimeWindow(Long upgradeTimeWindow) {
        this.upgradeTimeWindow = upgradeTimeWindow;
        return this;
    }
    public Long getUpgradeTimeWindow() {
        return this.upgradeTimeWindow;
    }

    public DataProblemLevelGroupValue setUpgradeTimeWindowUnit(String upgradeTimeWindowUnit) {
        this.upgradeTimeWindowUnit = upgradeTimeWindowUnit;
        return this;
    }
    public String getUpgradeTimeWindowUnit() {
        return this.upgradeTimeWindowUnit;
    }

}
