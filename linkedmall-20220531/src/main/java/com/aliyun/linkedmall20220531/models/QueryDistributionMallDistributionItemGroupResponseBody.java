// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallDistributionItemGroupResponseBody extends TeaModel {
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
    public QueryDistributionMallDistributionItemGroupResponseBodyModel model;

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

    public static QueryDistributionMallDistributionItemGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionMallDistributionItemGroupResponseBody self = new QueryDistributionMallDistributionItemGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setModel(QueryDistributionMallDistributionItemGroupResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryDistributionMallDistributionItemGroupResponseBodyModel getModel() {
        return this.model;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDistributionMallDistributionItemGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDistributionMallDistributionItemGroupResponseBodyModel extends TeaModel {
        // 业务号
        @NameInMap("BizId")
        public String bizId;

        // 客户ID
        @NameInMap("CustomerId")
        public String customerId;

        // 分销商商城id
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        // 分销商id
        @NameInMap("DistributorId")
        public String distributorId;

        // 结束时间
        @NameInMap("EndDate")
        public String endDate;

        // 分销商品库名称
        @NameInMap("Name")
        public String name;

        // 开始时间
        @NameInMap("StartDate")
        public String startDate;

        // 状态
        @NameInMap("Status")
        public Long status;

        // 分销商品库编码
        @NameInMap("SubBizCode")
        public String subBizCode;

        public static QueryDistributionMallDistributionItemGroupResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryDistributionMallDistributionItemGroupResponseBodyModel self = new QueryDistributionMallDistributionItemGroupResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryDistributionMallDistributionItemGroupResponseBodyModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

}
