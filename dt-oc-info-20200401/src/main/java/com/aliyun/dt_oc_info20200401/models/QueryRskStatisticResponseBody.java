// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryRskStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryRskStatisticResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static QueryRskStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRskStatisticResponseBody self = new QueryRskStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRskStatisticResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRskStatisticResponseBody setData(java.util.List<QueryRskStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRskStatisticResponseBodyData> getData() {
        return this.data;
    }

    public QueryRskStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRskStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRskStatisticResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryRskStatisticResponseBodyData extends TeaModel {
        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("Count")
        public Long count;

        @NameInMap("OcId")
        public String ocId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static QueryRskStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRskStatisticResponseBodyData self = new QueryRskStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRskStatisticResponseBodyData setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public QueryRskStatisticResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryRskStatisticResponseBodyData setOcId(String ocId) {
            this.ocId = ocId;
            return this;
        }
        public String getOcId() {
            return this.ocId;
        }

        public QueryRskStatisticResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryRskStatisticResponseBodyData setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
