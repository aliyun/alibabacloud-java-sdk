// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyDistributionMallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ApplyDistributionMallResponseBodyModel model;

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

    public static ApplyDistributionMallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributionMallResponseBody self = new ApplyDistributionMallResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyDistributionMallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyDistributionMallResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ApplyDistributionMallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyDistributionMallResponseBody setModel(ApplyDistributionMallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ApplyDistributionMallResponseBodyModel getModel() {
        return this.model;
    }

    public ApplyDistributionMallResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ApplyDistributionMallResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ApplyDistributionMallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyDistributionMallResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ApplyDistributionMallResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ApplyDistributionMallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyDistributionMallResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ApplyDistributionMallResponseBodyModel extends TeaModel {
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("DistributionMallName")
        public String distributionMallName;

        @NameInMap("DistributorId")
        public String distributorId;

        public static ApplyDistributionMallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ApplyDistributionMallResponseBodyModel self = new ApplyDistributionMallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ApplyDistributionMallResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ApplyDistributionMallResponseBodyModel setDistributionMallName(String distributionMallName) {
            this.distributionMallName = distributionMallName;
            return this;
        }
        public String getDistributionMallName() {
            return this.distributionMallName;
        }

        public ApplyDistributionMallResponseBodyModel setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

    }

}
