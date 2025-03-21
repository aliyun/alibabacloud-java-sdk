// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListUserResourcesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListUserResourcesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>65308A66-8764-53EE-8D4A-201E86CA88C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListUserResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserResourcesResponseBody self = new ListUserResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserResourcesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListUserResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserResourcesResponseBody setData(java.util.List<ListUserResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserResourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListUserResourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUserResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserResourcesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListUserResourcesResponseBodyData extends TeaModel {
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>brainindustrial_simupostpaid_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2024-12-21</p>
         */
        @NameInMap("endDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>12345ea3cff446e8837078c2baffbe83</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>20240902</p>
         */
        @NameInMap("startDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("statusMsg")
        public String statusMsg;

        public static ListUserResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyData self = new ListUserResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListUserResourcesResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListUserResourcesResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListUserResourcesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserResourcesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListUserResourcesResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListUserResourcesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserResourcesResponseBodyData setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

}
