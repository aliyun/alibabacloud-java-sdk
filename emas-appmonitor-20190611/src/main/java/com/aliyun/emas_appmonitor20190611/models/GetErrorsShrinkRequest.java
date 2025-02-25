// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorsShrinkRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crash</p>
     */
    @NameInMap("BizModule")
    public String bizModule;

    /**
     * <strong>example:</strong>
     * <p>-3481243636390427020</p>
     */
    @NameInMap("DigestHash")
    public String digestHash;

    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeRange")
    public GetErrorsShrinkRequestTimeRange timeRange;

    /**
     * <p>utdid</p>
     * 
     * <strong>example:</strong>
     * <p>Z70g6V/MXJ8DABtD53eHzn4X</p>
     */
    @NameInMap("Utdid")
    public String utdid;

    public static GetErrorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErrorsShrinkRequest self = new GetErrorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetErrorsShrinkRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetErrorsShrinkRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetErrorsShrinkRequest setDigestHash(String digestHash) {
        this.digestHash = digestHash;
        return this;
    }
    public String getDigestHash() {
        return this.digestHash;
    }

    public GetErrorsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetErrorsShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetErrorsShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetErrorsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetErrorsShrinkRequest setTimeRange(GetErrorsShrinkRequestTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetErrorsShrinkRequestTimeRange getTimeRange() {
        return this.timeRange;
    }

    public GetErrorsShrinkRequest setUtdid(String utdid) {
        this.utdid = utdid;
        return this;
    }
    public String getUtdid() {
        return this.utdid;
    }

    public static class GetErrorsShrinkRequestTimeRange extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1740499200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1739894400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetErrorsShrinkRequestTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetErrorsShrinkRequestTimeRange self = new GetErrorsShrinkRequestTimeRange();
            return TeaModel.build(map, self);
        }

        public GetErrorsShrinkRequestTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetErrorsShrinkRequestTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
