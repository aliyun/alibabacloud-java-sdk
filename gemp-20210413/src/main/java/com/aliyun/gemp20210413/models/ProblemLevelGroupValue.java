// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ProblemLevelGroupValue extends TeaModel {
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

    public static ProblemLevelGroupValue build(java.util.Map<String, ?> map) throws Exception {
        ProblemLevelGroupValue self = new ProblemLevelGroupValue();
        return TeaModel.build(map, self);
    }

    public ProblemLevelGroupValue setChildRuleRelation(Integer childRuleRelation) {
        this.childRuleRelation = childRuleRelation;
        return this;
    }
    public Integer getChildRuleRelation() {
        return this.childRuleRelation;
    }

    public ProblemLevelGroupValue setMatchCount(Long matchCount) {
        this.matchCount = matchCount;
        return this;
    }
    public Long getMatchCount() {
        return this.matchCount;
    }

    public ProblemLevelGroupValue setTimeWindow(Long timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public ProblemLevelGroupValue setTimeWindowUnit(String timeWindowUnit) {
        this.timeWindowUnit = timeWindowUnit;
        return this;
    }
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public ProblemLevelGroupValue setEnableUpgrade(Boolean enableUpgrade) {
        this.enableUpgrade = enableUpgrade;
        return this;
    }
    public Boolean getEnableUpgrade() {
        return this.enableUpgrade;
    }

    public ProblemLevelGroupValue setUpgradeTimeWindow(Long upgradeTimeWindow) {
        this.upgradeTimeWindow = upgradeTimeWindow;
        return this;
    }
    public Long getUpgradeTimeWindow() {
        return this.upgradeTimeWindow;
    }

    public ProblemLevelGroupValue setUpgradeTimeWindowUnit(String upgradeTimeWindowUnit) {
        this.upgradeTimeWindowUnit = upgradeTimeWindowUnit;
        return this;
    }
    public String getUpgradeTimeWindowUnit() {
        return this.upgradeTimeWindowUnit;
    }

}
