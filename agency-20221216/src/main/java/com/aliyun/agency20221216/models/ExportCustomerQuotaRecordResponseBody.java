// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ExportCustomerQuotaRecordResponseBody extends TeaModel {
    /**
     * <p>Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public ExportCustomerQuotaRecordResponseBodyData data;

    /**
     * <p>Description</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID of the Request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportCustomerQuotaRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomerQuotaRecordResponseBody self = new ExportCustomerQuotaRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportCustomerQuotaRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportCustomerQuotaRecordResponseBody setData(ExportCustomerQuotaRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportCustomerQuotaRecordResponseBodyData getData() {
        return this.data;
    }

    public ExportCustomerQuotaRecordResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ExportCustomerQuotaRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExportCustomerQuotaRecordResponseBodyData extends TeaModel {
        /**
         * <p>Estimated duration, in minutes.</p>
         */
        @NameInMap("Cost")
        public Integer cost;

        /**
         * <p>ID of Export task</p>
         */
        @NameInMap("Id")
        public Long id;

        public static ExportCustomerQuotaRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportCustomerQuotaRecordResponseBodyData self = new ExportCustomerQuotaRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportCustomerQuotaRecordResponseBodyData setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public ExportCustomerQuotaRecordResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
