// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallResponseBody extends TeaModel {
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryDistributionMallResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryDistributionMallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionMallResponseBody self = new QueryDistributionMallResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDistributionMallResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryDistributionMallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDistributionMallResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryDistributionMallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDistributionMallResponseBody setModel(QueryDistributionMallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryDistributionMallResponseBodyModel getModel() {
        return this.model;
    }

    public QueryDistributionMallResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributionMallResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionMallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDistributionMallResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryDistributionMallResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryDistributionMallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDistributionMallResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDistributionMallResponseBodyModel extends TeaModel {
        @NameInMap("ChannelSupplierId")
        public String channelSupplierId;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("DistributionMallName")
        public String distributionMallName;

        @NameInMap("DistributionMallType")
        public String distributionMallType;

        @NameInMap("DistributorId")
        public String distributorId;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        public static QueryDistributionMallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryDistributionMallResponseBodyModel self = new QueryDistributionMallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryDistributionMallResponseBodyModel setChannelSupplierId(String channelSupplierId) {
            this.channelSupplierId = channelSupplierId;
            return this;
        }
        public String getChannelSupplierId() {
            return this.channelSupplierId;
        }

        public QueryDistributionMallResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryDistributionMallResponseBodyModel setDistributionMallName(String distributionMallName) {
            this.distributionMallName = distributionMallName;
            return this;
        }
        public String getDistributionMallName() {
            return this.distributionMallName;
        }

        public QueryDistributionMallResponseBodyModel setDistributionMallType(String distributionMallType) {
            this.distributionMallType = distributionMallType;
            return this;
        }
        public String getDistributionMallType() {
            return this.distributionMallType;
        }

        public QueryDistributionMallResponseBodyModel setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public QueryDistributionMallResponseBodyModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryDistributionMallResponseBodyModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryDistributionMallResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
