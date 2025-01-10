// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListUserResourcesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListUserResourcesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("endDate")
        public String endDate;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("region")
        public String region;

        @NameInMap("startDate")
        public String startDate;

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
