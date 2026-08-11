// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailTopoRequest extends TeaModel {
    /**
     * <p>The application ID that identifies a specific AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time query.</p>
     */
    @NameInMap("TimeQuery")
    public GetAiAppDetailTopoRequestTimeQuery timeQuery;

    public static GetAiAppDetailTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailTopoRequest self = new GetAiAppDetailTopoRequest();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailTopoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppDetailTopoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAiAppDetailTopoRequest setTimeQuery(GetAiAppDetailTopoRequestTimeQuery timeQuery) {
        this.timeQuery = timeQuery;
        return this;
    }
    public GetAiAppDetailTopoRequestTimeQuery getTimeQuery() {
        return this.timeQuery;
    }

    public static class GetAiAppDetailTopoRequestTimeQuery extends TeaModel {
        /**
         * <p>The dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-28 17:04:08</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-22 17:04:08</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetAiAppDetailTopoRequestTimeQuery build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppDetailTopoRequestTimeQuery self = new GetAiAppDetailTopoRequestTimeQuery();
            return TeaModel.build(map, self);
        }

        public GetAiAppDetailTopoRequestTimeQuery setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public GetAiAppDetailTopoRequestTimeQuery setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAiAppDetailTopoRequestTimeQuery setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
