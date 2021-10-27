// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsDrdsDBResponseBody extends TeaModel {
    @NameInMap("RdsDrdsDbs")
    public DescribeRdsDrdsDBResponseBodyRdsDrdsDbs rdsDrdsDbs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsDrdsDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsDrdsDBResponseBody self = new DescribeRdsDrdsDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsDrdsDBResponseBody setRdsDrdsDbs(DescribeRdsDrdsDBResponseBodyRdsDrdsDbs rdsDrdsDbs) {
        this.rdsDrdsDbs = rdsDrdsDbs;
        return this;
    }
    public DescribeRdsDrdsDBResponseBodyRdsDrdsDbs getRdsDrdsDbs() {
        return this.rdsDrdsDbs;
    }

    public DescribeRdsDrdsDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsDrdsDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList extends TeaModel {
        @NameInMap("DB")
        public java.util.List<String> DB;

        public static DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList self = new DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList setDB(java.util.List<String> DB) {
            this.DB = DB;
            return this;
        }
        public java.util.List<String> getDB() {
            return this.DB;
        }

    }

    public static class DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb extends TeaModel {
        @NameInMap("DBList")
        public DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList DBList;

        @NameInMap("RdsId")
        public String rdsId;

        public static DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb self = new DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb setDBList(DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList DBList) {
            this.DBList = DBList;
            return this;
        }
        public DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDbDBList getDBList() {
            return this.DBList;
        }

        public DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb setRdsId(String rdsId) {
            this.rdsId = rdsId;
            return this;
        }
        public String getRdsId() {
            return this.rdsId;
        }

    }

    public static class DescribeRdsDrdsDBResponseBodyRdsDrdsDbs extends TeaModel {
        @NameInMap("RdsDrdsDb")
        public java.util.List<DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb> rdsDrdsDb;

        public static DescribeRdsDrdsDBResponseBodyRdsDrdsDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDrdsDBResponseBodyRdsDrdsDbs self = new DescribeRdsDrdsDBResponseBodyRdsDrdsDbs();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDrdsDBResponseBodyRdsDrdsDbs setRdsDrdsDb(java.util.List<DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb> rdsDrdsDb) {
            this.rdsDrdsDb = rdsDrdsDb;
            return this;
        }
        public java.util.List<DescribeRdsDrdsDBResponseBodyRdsDrdsDbsRdsDrdsDb> getRdsDrdsDb() {
            return this.rdsDrdsDb;
        }

    }

}
