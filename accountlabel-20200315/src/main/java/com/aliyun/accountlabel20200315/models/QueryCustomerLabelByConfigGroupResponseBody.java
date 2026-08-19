// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class QueryCustomerLabelByConfigGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryCustomerLabelByConfigGroupResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomerLabelByConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerLabelByConfigGroupResponseBody self = new QueryCustomerLabelByConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomerLabelByConfigGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustomerLabelByConfigGroupResponseBody setData(java.util.List<QueryCustomerLabelByConfigGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCustomerLabelByConfigGroupResponseBodyData> getData() {
        return this.data;
    }

    public QueryCustomerLabelByConfigGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomerLabelByConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomerLabelByConfigGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomerLabelByConfigGroupResponseBodyData extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("LabelSeries")
        public String labelSeries;

        public static QueryCustomerLabelByConfigGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerLabelByConfigGroupResponseBodyData self = new QueryCustomerLabelByConfigGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomerLabelByConfigGroupResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCustomerLabelByConfigGroupResponseBodyData setLabelSeries(String labelSeries) {
            this.labelSeries = labelSeries;
            return this;
        }
        public String getLabelSeries() {
            return this.labelSeries;
        }

    }

}
