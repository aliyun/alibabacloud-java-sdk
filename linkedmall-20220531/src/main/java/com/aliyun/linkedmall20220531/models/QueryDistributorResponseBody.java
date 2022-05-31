// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributorResponseBody extends TeaModel {
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
    public QueryDistributorResponseBodyModel model;

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

    public static QueryDistributorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributorResponseBody self = new QueryDistributorResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDistributorResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryDistributorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDistributorResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryDistributorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDistributorResponseBody setModel(QueryDistributorResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryDistributorResponseBodyModel getModel() {
        return this.model;
    }

    public QueryDistributorResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributorResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDistributorResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryDistributorResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryDistributorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDistributorResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDistributorResponseBodyModel extends TeaModel {
        // 联系人
        @NameInMap("Contractor")
        public String contractor;

        // 分销商id
        @NameInMap("DistributorId")
        public String distributorId;

        // 分销商名称
        @NameInMap("DistributorName")
        public String distributorName;

        // 所属行业
        @NameInMap("Industry")
        public String industry;

        // 联系电话
        @NameInMap("Phone")
        public String phone;

        // 客群偏好
        @NameInMap("Preference")
        public String preference;

        // 客户体量
        @NameInMap("Scale")
        public String scale;

        public static QueryDistributorResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryDistributorResponseBodyModel self = new QueryDistributorResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryDistributorResponseBodyModel setContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }
        public String getContractor() {
            return this.contractor;
        }

        public QueryDistributorResponseBodyModel setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public QueryDistributorResponseBodyModel setDistributorName(String distributorName) {
            this.distributorName = distributorName;
            return this;
        }
        public String getDistributorName() {
            return this.distributorName;
        }

        public QueryDistributorResponseBodyModel setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public QueryDistributorResponseBodyModel setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryDistributorResponseBodyModel setPreference(String preference) {
            this.preference = preference;
            return this;
        }
        public String getPreference() {
            return this.preference;
        }

        public QueryDistributorResponseBodyModel setScale(String scale) {
            this.scale = scale;
            return this;
        }
        public String getScale() {
            return this.scale;
        }

    }

}
