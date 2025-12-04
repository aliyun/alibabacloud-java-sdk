// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVmsRealNumberCallConnectionRateInfoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>95B86652-B234-5387-BAC6-E441FR49399F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryVmsRealNumberCallConnectionRateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVmsRealNumberCallConnectionRateInfoResponseBody self = new QueryVmsRealNumberCallConnectionRateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponseBody setModel(QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel getModel() {
        return this.model;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel extends TeaModel {
        /**
         * <p>接通率</p>
         * 
         * <strong>example:</strong>
         * <p>6.71672</p>
         */
        @NameInMap("CallConnectionRate")
        public Double callConnectionRate;

        /**
         * <p>接通数</p>
         * 
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("CompleteCount")
        public Long completeCount;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>请求通话数</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>EcsInstance, EcsDisk, EcsImage, EcsSnapshot, EcsSecurityGroup, EcsEip, EcsVpc, EcsVRouter, EcsVSwitch, EcsVRouteTable, EcsAuthImage, EcsAll, SlbLoadbalancer, SlbVm, RdsInstance, RdsAllInstance, KvsInstance, OcsInstance, OdpsInstance</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>响铃数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RingingCount")
        public Long ringingCount;

        /**
         * <p>响铃率</p>
         * 
         * <strong>example:</strong>
         * <p>25.4222</p>
         */
        @NameInMap("RingingRate")
        public Double ringingRate;

        public static QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel self = new QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setCallConnectionRate(Double callConnectionRate) {
            this.callConnectionRate = callConnectionRate;
            return this;
        }
        public Double getCallConnectionRate() {
            return this.callConnectionRate;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setCompleteCount(Long completeCount) {
            this.completeCount = completeCount;
            return this;
        }
        public Long getCompleteCount() {
            return this.completeCount;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setRingingCount(Long ringingCount) {
            this.ringingCount = ringingCount;
            return this;
        }
        public Long getRingingCount() {
            return this.ringingCount;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBodyModel setRingingRate(Double ringingRate) {
            this.ringingRate = ringingRate;
            return this;
        }
        public Double getRingingRate() {
            return this.ringingRate;
        }

    }

}
