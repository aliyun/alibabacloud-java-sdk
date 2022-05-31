// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallResponseBody extends TeaModel {
    // 渠道公共数据
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    // 返回的执行结果码， 正确为字符串 0000
    @NameInMap("Code")
    public String code;

    // 每次请求操作对应的操作日志号，由系统自动生成，返回给租户，可用于排查问题，双方日志中统一透出此标识
    @NameInMap("LogsId")
    public String logsId;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求结果数据
    @NameInMap("Model")
    public QueryDistributionMallResponseBodyModel model;

    // 当前页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // POP请求流水号，建议租户日志中也输出此流水号，双方排查问题方便
    @NameInMap("RequestId")
    public String requestId;

    // 错误子代码。一般用于显示业务类的错误代码，一般建议关注此类错误
    @NameInMap("SubCode")
    public String subCode;

    // 业务处理相关的错误信息，一般建议关注此类错误
    @NameInMap("SubMessage")
    public String subMessage;

    // 本次执行的结果成功与否
    @NameInMap("Success")
    public Boolean success;

    // 总数量
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
        // 渠道供应商id
        @NameInMap("ChannelSupplerId")
        public String channelSupplerId;

        // 分销商城id
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        // 分销商城名称
        @NameInMap("DistributionMallName")
        public String distributionMallName;

        // 商城模式
        @NameInMap("DistributionMallType")
        public String distributionMallType;

        // 分销商id
        @NameInMap("DistributorId")
        public String distributorId;

        // 结束时间
        @NameInMap("EndDate")
        public String endDate;

        // 开始时间
        @NameInMap("StartDate")
        public String startDate;

        // 分销商城状态
        @NameInMap("Status")
        public String status;

        public static QueryDistributionMallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryDistributionMallResponseBodyModel self = new QueryDistributionMallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryDistributionMallResponseBodyModel setChannelSupplerId(String channelSupplerId) {
            this.channelSupplerId = channelSupplerId;
            return this;
        }
        public String getChannelSupplerId() {
            return this.channelSupplerId;
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
