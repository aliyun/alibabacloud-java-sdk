// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The statistics query instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StatisticsQuery")
    public GetStandardStatisticsRequestStatisticsQuery statisticsQuery;

    public static GetStandardStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardStatisticsRequest self = new GetStandardStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardStatisticsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStandardStatisticsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetStandardStatisticsRequest setStatisticsQuery(GetStandardStatisticsRequestStatisticsQuery statisticsQuery) {
        this.statisticsQuery = statisticsQuery;
        return this;
    }
    public GetStandardStatisticsRequestStatisticsQuery getStatisticsQuery() {
        return this.statisticsQuery;
    }

    public static class GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod extends TeaModel {
        /**
         * <p>The end time, in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Specifies whether to include the end time. Default: false.</p>
         */
        @NameInMap("IncludeEndTime")
        public Boolean includeEndTime;

        /**
         * <p>The start time, in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod build(java.util.Map<String, ?> map) throws Exception {
            GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod self = new GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod();
            return TeaModel.build(map, self);
        }

        public GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod setIncludeEndTime(Boolean includeEndTime) {
            this.includeEndTime = includeEndTime;
            return this;
        }
        public Boolean getIncludeEndTime() {
            return this.includeEndTime;
        }

        public GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetStandardStatisticsRequestStatisticsQuery extends TeaModel {
        /**
         * <p>The time period during which the standards were created.</p>
         */
        @NameInMap("CreateTimePeriod")
        public GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod createTimePeriod;

        /**
         * <p>The directory to query. Standards in this directory and all its subdirectories are included in the statistics.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The list of stages to which the standards belong.</p>
         */
        @NameInMap("StandardStageList")
        public java.util.List<String> standardStageList;

        public static GetStandardStatisticsRequestStatisticsQuery build(java.util.Map<String, ?> map) throws Exception {
            GetStandardStatisticsRequestStatisticsQuery self = new GetStandardStatisticsRequestStatisticsQuery();
            return TeaModel.build(map, self);
        }

        public GetStandardStatisticsRequestStatisticsQuery setCreateTimePeriod(GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod createTimePeriod) {
            this.createTimePeriod = createTimePeriod;
            return this;
        }
        public GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod getCreateTimePeriod() {
            return this.createTimePeriod;
        }

        public GetStandardStatisticsRequestStatisticsQuery setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetStandardStatisticsRequestStatisticsQuery setStandardStageList(java.util.List<String> standardStageList) {
            this.standardStageList = standardStageList;
            return this;
        }
        public java.util.List<String> getStandardStageList() {
            return this.standardStageList;
        }

    }

}
