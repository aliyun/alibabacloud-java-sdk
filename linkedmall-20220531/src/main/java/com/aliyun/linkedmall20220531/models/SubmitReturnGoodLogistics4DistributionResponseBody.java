// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogistics4DistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

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

    public static SubmitReturnGoodLogistics4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogistics4DistributionResponseBody self = new SubmitReturnGoodLogistics4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitReturnGoodLogistics4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
