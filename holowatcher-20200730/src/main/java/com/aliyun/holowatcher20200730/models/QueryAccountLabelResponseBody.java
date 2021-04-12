// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryAccountLabelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<QueryAccountLabelResponseBodyData> data;

    public static QueryAccountLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountLabelResponseBody self = new QueryAccountLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAccountLabelResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryAccountLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountLabelResponseBody setData(java.util.List<QueryAccountLabelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAccountLabelResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryAccountLabelResponseBodyData extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("LabelSeries")
        public String labelSeries;

        public static QueryAccountLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountLabelResponseBodyData self = new QueryAccountLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountLabelResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryAccountLabelResponseBodyData setLabelSeries(String labelSeries) {
            this.labelSeries = labelSeries;
            return this;
        }
        public String getLabelSeries() {
            return this.labelSeries;
        }

    }

}
