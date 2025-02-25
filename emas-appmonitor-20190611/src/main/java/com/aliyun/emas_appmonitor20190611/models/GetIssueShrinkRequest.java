// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssueShrinkRequest extends TeaModel {
    /**
     * <p>AppKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h5Resource</p>
     */
    @NameInMap("BizModule")
    public String bizModule;

    /**
     * <strong>example:</strong>
     * <p>2963475858785631</p>
     */
    @NameInMap("DigestHash")
    public String digestHash;

    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h5</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeRange")
    public GetIssueShrinkRequestTimeRange timeRange;

    public static GetIssueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssueShrinkRequest self = new GetIssueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetIssueShrinkRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetIssueShrinkRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetIssueShrinkRequest setDigestHash(String digestHash) {
        this.digestHash = digestHash;
        return this;
    }
    public String getDigestHash() {
        return this.digestHash;
    }

    public GetIssueShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetIssueShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetIssueShrinkRequest setTimeRange(GetIssueShrinkRequestTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetIssueShrinkRequestTimeRange getTimeRange() {
        return this.timeRange;
    }

    public static class GetIssueShrinkRequestTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-08-23T02:12:00Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Granularity")
        public Integer granularity;

        /**
         * <strong>example:</strong>
         * <p>minute</p>
         */
        @NameInMap("GranularityUnit")
        public String granularityUnit;

        /**
         * <strong>example:</strong>
         * <p>2024-12-18 00:00:00</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetIssueShrinkRequestTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetIssueShrinkRequestTimeRange self = new GetIssueShrinkRequestTimeRange();
            return TeaModel.build(map, self);
        }

        public GetIssueShrinkRequestTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetIssueShrinkRequestTimeRange setGranularity(Integer granularity) {
            this.granularity = granularity;
            return this;
        }
        public Integer getGranularity() {
            return this.granularity;
        }

        public GetIssueShrinkRequestTimeRange setGranularityUnit(String granularityUnit) {
            this.granularityUnit = granularityUnit;
            return this;
        }
        public String getGranularityUnit() {
            return this.granularityUnit;
        }

        public GetIssueShrinkRequestTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
