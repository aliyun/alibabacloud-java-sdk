// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetBasicStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("GlobalStatistics")
    public GetBasicStatisticsResponseBodyGlobalStatistics globalStatistics;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RegionStatistics")
    public java.util.List<GetBasicStatisticsResponseBodyRegionStatistics> regionStatistics;

    /**
     * <strong>example:</strong>
     * <p>EB526A5D-1FE2-51C1-B790-1732C1DBA969</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBasicStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicStatisticsResponseBody self = new GetBasicStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBasicStatisticsResponseBody setGlobalStatistics(GetBasicStatisticsResponseBodyGlobalStatistics globalStatistics) {
        this.globalStatistics = globalStatistics;
        return this;
    }
    public GetBasicStatisticsResponseBodyGlobalStatistics getGlobalStatistics() {
        return this.globalStatistics;
    }

    public GetBasicStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBasicStatisticsResponseBody setRegionStatistics(java.util.List<GetBasicStatisticsResponseBodyRegionStatistics> regionStatistics) {
        this.regionStatistics = regionStatistics;
        return this;
    }
    public java.util.List<GetBasicStatisticsResponseBodyRegionStatistics> getRegionStatistics() {
        return this.regionStatistics;
    }

    public GetBasicStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicStatisticsResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetBasicStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBasicStatisticsResponseBodyGlobalStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProtectedResourceCount")
        public Integer protectedResourceCount;

        public static GetBasicStatisticsResponseBodyGlobalStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetBasicStatisticsResponseBodyGlobalStatistics self = new GetBasicStatisticsResponseBodyGlobalStatistics();
            return TeaModel.build(map, self);
        }

        public GetBasicStatisticsResponseBodyGlobalStatistics setProtectedDataSize(Long protectedDataSize) {
            this.protectedDataSize = protectedDataSize;
            return this;
        }
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        public GetBasicStatisticsResponseBodyGlobalStatistics setProtectedResourceCount(Integer protectedResourceCount) {
            this.protectedResourceCount = protectedResourceCount;
            return this;
        }
        public Integer getProtectedResourceCount() {
            return this.protectedResourceCount;
        }

    }

    public static class GetBasicStatisticsResponseBodyRegionStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProtectedResourceCount")
        public Integer protectedResourceCount;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetBasicStatisticsResponseBodyRegionStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetBasicStatisticsResponseBodyRegionStatistics self = new GetBasicStatisticsResponseBodyRegionStatistics();
            return TeaModel.build(map, self);
        }

        public GetBasicStatisticsResponseBodyRegionStatistics setProtectedDataSize(Long protectedDataSize) {
            this.protectedDataSize = protectedDataSize;
            return this;
        }
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        public GetBasicStatisticsResponseBodyRegionStatistics setProtectedResourceCount(Integer protectedResourceCount) {
            this.protectedResourceCount = protectedResourceCount;
            return this;
        }
        public Integer getProtectedResourceCount() {
            return this.protectedResourceCount;
        }

        public GetBasicStatisticsResponseBodyRegionStatistics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
