// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ExportReversedDeductionHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExportReversedDeductionHistoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>asfasd123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportReversedDeductionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportReversedDeductionHistoryResponseBody self = new ExportReversedDeductionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportReversedDeductionHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportReversedDeductionHistoryResponseBody setData(ExportReversedDeductionHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportReversedDeductionHistoryResponseBodyData getData() {
        return this.data;
    }

    public ExportReversedDeductionHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportReversedDeductionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExportReversedDeductionHistoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>2131</p>
         */
        @NameInMap("Id")
        public Long id;

        public static ExportReversedDeductionHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportReversedDeductionHistoryResponseBodyData self = new ExportReversedDeductionHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportReversedDeductionHistoryResponseBodyData setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public ExportReversedDeductionHistoryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
