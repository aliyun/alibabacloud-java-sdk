// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class UpdateDistributorResponseBody extends TeaModel {
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

    public static UpdateDistributorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDistributorResponseBody self = new UpdateDistributorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDistributorResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public UpdateDistributorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDistributorResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public UpdateDistributorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDistributorResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public UpdateDistributorResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public UpdateDistributorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDistributorResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public UpdateDistributorResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public UpdateDistributorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateDistributorResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
