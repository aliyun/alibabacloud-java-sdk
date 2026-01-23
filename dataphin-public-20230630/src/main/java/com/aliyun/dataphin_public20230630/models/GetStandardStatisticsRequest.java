// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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

    public GetStandardStatisticsRequest setStatisticsQuery(GetStandardStatisticsRequestStatisticsQuery statisticsQuery) {
        this.statisticsQuery = statisticsQuery;
        return this;
    }
    public GetStandardStatisticsRequestStatisticsQuery getStatisticsQuery() {
        return this.statisticsQuery;
    }

    public static class GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IncludeEndTime")
        public Boolean includeEndTime;

        /**
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
        @NameInMap("CreateTimePeriod")
        public GetStandardStatisticsRequestStatisticsQueryCreateTimePeriod createTimePeriod;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

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
