// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribePlanogramRailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanogramRailInfos")
    public java.util.List<DescribePlanogramRailsResponseBodyPlanogramRailInfos> planogramRailInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePlanogramRailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanogramRailsResponseBody self = new DescribePlanogramRailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlanogramRailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePlanogramRailsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribePlanogramRailsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribePlanogramRailsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribePlanogramRailsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribePlanogramRailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePlanogramRailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePlanogramRailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlanogramRailsResponseBody setPlanogramRailInfos(java.util.List<DescribePlanogramRailsResponseBodyPlanogramRailInfos> planogramRailInfos) {
        this.planogramRailInfos = planogramRailInfos;
        return this;
    }
    public java.util.List<DescribePlanogramRailsResponseBodyPlanogramRailInfos> getPlanogramRailInfos() {
        return this.planogramRailInfos;
    }

    public DescribePlanogramRailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlanogramRailsResponseBody setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DescribePlanogramRailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePlanogramRailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePlanogramRailsResponseBodyPlanogramRailInfos extends TeaModel {
        @NameInMap("GapUnit")
        public Integer gapUnit;

        @NameInMap("Layer")
        public String layer;

        @NameInMap("RailCode")
        public String railCode;

        @NameInMap("Shelf")
        public String shelf;

        public static DescribePlanogramRailsResponseBodyPlanogramRailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanogramRailsResponseBodyPlanogramRailInfos self = new DescribePlanogramRailsResponseBodyPlanogramRailInfos();
            return TeaModel.build(map, self);
        }

        public DescribePlanogramRailsResponseBodyPlanogramRailInfos setGapUnit(Integer gapUnit) {
            this.gapUnit = gapUnit;
            return this;
        }
        public Integer getGapUnit() {
            return this.gapUnit;
        }

        public DescribePlanogramRailsResponseBodyPlanogramRailInfos setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribePlanogramRailsResponseBodyPlanogramRailInfos setRailCode(String railCode) {
            this.railCode = railCode;
            return this;
        }
        public String getRailCode() {
            return this.railCode;
        }

        public DescribePlanogramRailsResponseBodyPlanogramRailInfos setShelf(String shelf) {
            this.shelf = shelf;
            return this;
        }
        public String getShelf() {
            return this.shelf;
        }

    }

}
