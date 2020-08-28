// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("BatchResultDetails")
    @Validation(required = true)
    public DescribeBatchResultDetailResponseBatchResultDetails batchResultDetails;

    public static DescribeBatchResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailResponse self = new DescribeBatchResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Rr")
        @Validation(required = true)
        public String rr;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("NewRr")
        @Validation(required = true)
        public String newRr;

        @NameInMap("NewValue")
        @Validation(required = true)
        public String newValue;

        @NameInMap("BatchType")
        @Validation(required = true)
        public String batchType;

        @NameInMap("OperateDateStr")
        @Validation(required = true)
        public String operateDateStr;

        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        @NameInMap("Ttl")
        @Validation(required = true)
        public String ttl;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("RrStatus")
        @Validation(required = true)
        public String rrStatus;

        public static DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail self = new DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeBatchResultDetailResponseBatchResultDetails extends TeaModel {
        @NameInMap("BatchResultDetail")
        @Validation(required = true)
        public java.util.List<DescribeBatchResultDetailResponseBatchResultDetailsBatchResultDetail> batchResultDetail;

        public static DescribeBatchResultDetailResponseBatchResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchResultDetailResponseBatchResultDetails self = new DescribeBatchResultDetailResponseBatchResultDetails();
            return TeaModel.build(map, self);
        }

    }

}
