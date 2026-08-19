// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class QueryCustomerLabelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCustomerLabelResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomerLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerLabelResponseBody self = new QueryCustomerLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomerLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustomerLabelResponseBody setData(QueryCustomerLabelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustomerLabelResponseBodyData getData() {
        return this.data;
    }

    public QueryCustomerLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomerLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomerLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomerLabelResponseBodyDataCustomerLabel extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("EndTimeStr")
        public String endTimeStr;

        @NameInMap("GmtCreatedStr")
        public String gmtCreatedStr;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("Id")
        public String id;

        @NameInMap("Label")
        public String label;

        @NameInMap("LabelSeries")
        public String labelSeries;

        @NameInMap("StartTimeStr")
        public String startTimeStr;

        public static QueryCustomerLabelResponseBodyDataCustomerLabel build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerLabelResponseBodyDataCustomerLabel self = new QueryCustomerLabelResponseBodyDataCustomerLabel();
            return TeaModel.build(map, self);
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setEndTimeStr(String endTimeStr) {
            this.endTimeStr = endTimeStr;
            return this;
        }
        public String getEndTimeStr() {
            return this.endTimeStr;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setGmtCreatedStr(String gmtCreatedStr) {
            this.gmtCreatedStr = gmtCreatedStr;
            return this;
        }
        public String getGmtCreatedStr() {
            return this.gmtCreatedStr;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setLabelSeries(String labelSeries) {
            this.labelSeries = labelSeries;
            return this;
        }
        public String getLabelSeries() {
            return this.labelSeries;
        }

        public QueryCustomerLabelResponseBodyDataCustomerLabel setStartTimeStr(String startTimeStr) {
            this.startTimeStr = startTimeStr;
            return this;
        }
        public String getStartTimeStr() {
            return this.startTimeStr;
        }

    }

    public static class QueryCustomerLabelResponseBodyData extends TeaModel {
        @NameInMap("CustomerLabel")
        public java.util.List<QueryCustomerLabelResponseBodyDataCustomerLabel> customerLabel;

        public static QueryCustomerLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerLabelResponseBodyData self = new QueryCustomerLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomerLabelResponseBodyData setCustomerLabel(java.util.List<QueryCustomerLabelResponseBodyDataCustomerLabel> customerLabel) {
            this.customerLabel = customerLabel;
            return this;
        }
        public java.util.List<QueryCustomerLabelResponseBodyDataCustomerLabel> getCustomerLabel() {
            return this.customerLabel;
        }

    }

}
