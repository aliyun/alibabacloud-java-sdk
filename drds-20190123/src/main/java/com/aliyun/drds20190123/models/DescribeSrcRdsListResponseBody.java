// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSrcRdsListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSrcRdsListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSrcRdsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSrcRdsListResponseBody self = new DescribeSrcRdsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSrcRdsListResponseBody setData(DescribeSrcRdsListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSrcRdsListResponseBodyData getData() {
        return this.data;
    }

    public DescribeSrcRdsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSrcRdsListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSrcRdsListResponseBodyDataData extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Rds")
        public String rds;

        public static DescribeSrcRdsListResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSrcRdsListResponseBodyDataData self = new DescribeSrcRdsListResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DescribeSrcRdsListResponseBodyDataData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSrcRdsListResponseBodyDataData setRds(String rds) {
            this.rds = rds;
            return this;
        }
        public String getRds() {
            return this.rds;
        }

    }

    public static class DescribeSrcRdsListResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeSrcRdsListResponseBodyDataData> data;

        public static DescribeSrcRdsListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSrcRdsListResponseBodyData self = new DescribeSrcRdsListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSrcRdsListResponseBodyData setData(java.util.List<DescribeSrcRdsListResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeSrcRdsListResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
