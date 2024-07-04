// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class HealthSummary extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BadCount")
    public Long badCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GoodCount")
    public Long goodCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoneCount")
    public Long noneCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StoppedCount")
    public Long stoppedCount;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UnknownCount")
    public Long unknownCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WarningCount")
    public Long warningCount;

    public static HealthSummary build(java.util.Map<String, ?> map) throws Exception {
        HealthSummary self = new HealthSummary();
        return TeaModel.build(map, self);
    }

    public HealthSummary setBadCount(Long badCount) {
        this.badCount = badCount;
        return this;
    }
    public Long getBadCount() {
        return this.badCount;
    }

    public HealthSummary setGoodCount(Long goodCount) {
        this.goodCount = goodCount;
        return this;
    }
    public Long getGoodCount() {
        return this.goodCount;
    }

    public HealthSummary setNoneCount(Long noneCount) {
        this.noneCount = noneCount;
        return this;
    }
    public Long getNoneCount() {
        return this.noneCount;
    }

    public HealthSummary setStoppedCount(Long stoppedCount) {
        this.stoppedCount = stoppedCount;
        return this;
    }
    public Long getStoppedCount() {
        return this.stoppedCount;
    }

    public HealthSummary setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public HealthSummary setUnknownCount(Long unknownCount) {
        this.unknownCount = unknownCount;
        return this;
    }
    public Long getUnknownCount() {
        return this.unknownCount;
    }

    public HealthSummary setWarningCount(Long warningCount) {
        this.warningCount = warningCount;
        return this;
    }
    public Long getWarningCount() {
        return this.warningCount;
    }

}
