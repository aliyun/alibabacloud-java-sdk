// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionMallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListDistributionMallResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public static ListDistributionMallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionMallResponseBody self = new ListDistributionMallResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributionMallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributionMallResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ListDistributionMallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributionMallResponseBody setModel(java.util.List<ListDistributionMallResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListDistributionMallResponseBodyModel> getModel() {
        return this.model;
    }

    public ListDistributionMallResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionMallResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributionMallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributionMallResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ListDistributionMallResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ListDistributionMallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributionMallResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDistributionMallResponseBodyModel extends TeaModel {
        @NameInMap("ChannelSupplierId")
        public String channelSupplierId;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("DistributionMallName")
        public String distributionMallName;

        @NameInMap("DistributionMallType")
        public String distributionMallType;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        public static ListDistributionMallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionMallResponseBodyModel self = new ListDistributionMallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListDistributionMallResponseBodyModel setChannelSupplierId(String channelSupplierId) {
            this.channelSupplierId = channelSupplierId;
            return this;
        }
        public String getChannelSupplierId() {
            return this.channelSupplierId;
        }

        public ListDistributionMallResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ListDistributionMallResponseBodyModel setDistributionMallName(String distributionMallName) {
            this.distributionMallName = distributionMallName;
            return this;
        }
        public String getDistributionMallName() {
            return this.distributionMallName;
        }

        public ListDistributionMallResponseBodyModel setDistributionMallType(String distributionMallType) {
            this.distributionMallType = distributionMallType;
            return this;
        }
        public String getDistributionMallType() {
            return this.distributionMallType;
        }

        public ListDistributionMallResponseBodyModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListDistributionMallResponseBodyModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListDistributionMallResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
