// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDataEventSelectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
     */
    @NameInMap("DataEventSelectors")
    public String dataEventSelectors;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTrailAllRegion")
    public Boolean isTrailAllRegion;

    /**
     * <strong>example:</strong>
     * <p>90771C32-635B-529C-950C-75A9607D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SlsDeliveryConfigs")
    public java.util.List<GetDataEventSelectorResponseBodySlsDeliveryConfigs> slsDeliveryConfigs;

    /**
     * <strong>example:</strong>
     * <p>acs:actiontrail:cn-shanghai:159498693826****:trail/trail-name</p>
     */
    @NameInMap("TrailArn")
    public String trailArn;

    public static GetDataEventSelectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataEventSelectorResponseBody self = new GetDataEventSelectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataEventSelectorResponseBody setDataEventSelectors(String dataEventSelectors) {
        this.dataEventSelectors = dataEventSelectors;
        return this;
    }
    public String getDataEventSelectors() {
        return this.dataEventSelectors;
    }

    public GetDataEventSelectorResponseBody setIsTrailAllRegion(Boolean isTrailAllRegion) {
        this.isTrailAllRegion = isTrailAllRegion;
        return this;
    }
    public Boolean getIsTrailAllRegion() {
        return this.isTrailAllRegion;
    }

    public GetDataEventSelectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataEventSelectorResponseBody setSlsDeliveryConfigs(java.util.List<GetDataEventSelectorResponseBodySlsDeliveryConfigs> slsDeliveryConfigs) {
        this.slsDeliveryConfigs = slsDeliveryConfigs;
        return this;
    }
    public java.util.List<GetDataEventSelectorResponseBodySlsDeliveryConfigs> getSlsDeliveryConfigs() {
        return this.slsDeliveryConfigs;
    }

    public GetDataEventSelectorResponseBody setTrailArn(String trailArn) {
        this.trailArn = trailArn;
        return this;
    }
    public String getTrailArn() {
        return this.trailArn;
    }

    public static class GetDataEventSelectorResponseBodySlsDeliveryConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-12-18T03:25:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>LogServiceException</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>acs:log:cn-shanghai:159498693826****:project/actiontrail-log-159498693826****-cn-shanghai</p>
         */
        @NameInMap("RegionSlsProjectArn")
        public String regionSlsProjectArn;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("TrailRegion")
        public String trailRegion;

        public static GetDataEventSelectorResponseBodySlsDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetDataEventSelectorResponseBodySlsDeliveryConfigs self = new GetDataEventSelectorResponseBodySlsDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public GetDataEventSelectorResponseBodySlsDeliveryConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataEventSelectorResponseBodySlsDeliveryConfigs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataEventSelectorResponseBodySlsDeliveryConfigs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataEventSelectorResponseBodySlsDeliveryConfigs setRegionSlsProjectArn(String regionSlsProjectArn) {
            this.regionSlsProjectArn = regionSlsProjectArn;
            return this;
        }
        public String getRegionSlsProjectArn() {
            return this.regionSlsProjectArn;
        }

        public GetDataEventSelectorResponseBodySlsDeliveryConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataEventSelectorResponseBodySlsDeliveryConfigs setTrailRegion(String trailRegion) {
            this.trailRegion = trailRegion;
            return this;
        }
        public String getTrailRegion() {
            return this.trailRegion;
        }

    }

}
