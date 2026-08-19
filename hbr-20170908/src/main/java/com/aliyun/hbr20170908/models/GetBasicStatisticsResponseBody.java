// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetBasicStatisticsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The Backup statistics for all regions.</p>
     */
    @NameInMap("GlobalStatistics")
    public GetBasicStatisticsResponseBodyGlobalStatistics globalStatistics;

    /**
     * <p>The response message. If the request is successful, <code>successful</code> is returned. If the request fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The Backup statistics for each region.</p>
     */
    @NameInMap("RegionStatistics")
    public java.util.List<GetBasicStatisticsResponseBodyRegionStatistics> regionStatistics;

    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB526A5D-1FE2-51C1-B790-1732C1DBA969</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data source type. The valid value is:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: ECS File Backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The backed-up data size, in bytes.</p>
         * <ul>
         * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the total capacity of backed-up Cloud Disks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <p>The number of backed-up resources.</p>
         * <ul>
         * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the number of backed-up ECS instances.</li>
         * </ul>
         * 
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
         * <p>The backed-up data size, in bytes.</p>
         * <ul>
         * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the total capacity of backed-up Cloud Disks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <p>The number of backed-up resources.</p>
         * <ul>
         * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the number of backed-up ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProtectedResourceCount")
        public Integer protectedResourceCount;

        /**
         * <p>The Region ID.</p>
         * 
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
