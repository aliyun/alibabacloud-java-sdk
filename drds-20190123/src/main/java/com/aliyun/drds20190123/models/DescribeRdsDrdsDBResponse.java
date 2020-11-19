// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsDrdsDBResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RdsDrdsDbs")
    @Validation(required = true)
    public DescribeRdsDrdsDBResponseRdsDrdsDbs rdsDrdsDbs;

    public static DescribeRdsDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsDrdsDBResponse self = new DescribeRdsDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsDrdsDBResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsDrdsDBResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRdsDrdsDBResponse setRdsDrdsDbs(DescribeRdsDrdsDBResponseRdsDrdsDbs rdsDrdsDbs) {
        this.rdsDrdsDbs = rdsDrdsDbs;
        return this;
    }
    public DescribeRdsDrdsDBResponseRdsDrdsDbs getRdsDrdsDbs() {
        return this.rdsDrdsDbs;
    }

    public static class DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList extends TeaModel {
        // DB
        @NameInMap("DB")
        @Validation(required = true)
        public java.util.List<String> DB;

        public static DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList self = new DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList setDB(java.util.List<String> DB) {
            this.DB = DB;
            return this;
        }
        public java.util.List<String> getDB() {
            return this.DB;
        }

    }

    public static class DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb extends TeaModel {
        @NameInMap("RdsId")
        @Validation(required = true)
        public String rdsId;

        @NameInMap("DBList")
        @Validation(required = true)
        public DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList DBList;

        public static DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb self = new DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb setRdsId(String rdsId) {
            this.rdsId = rdsId;
            return this;
        }
        public String getRdsId() {
            return this.rdsId;
        }

        public DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb setDBList(DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList DBList) {
            this.DBList = DBList;
            return this;
        }
        public DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDbDBList getDBList() {
            return this.DBList;
        }

    }

    public static class DescribeRdsDrdsDBResponseRdsDrdsDbs extends TeaModel {
        @NameInMap("RdsDrdsDb")
        @Validation(required = true)
        public java.util.List<DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb> rdsDrdsDb;

        public static DescribeRdsDrdsDBResponseRdsDrdsDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsDrdsDBResponseRdsDrdsDbs self = new DescribeRdsDrdsDBResponseRdsDrdsDbs();
            return TeaModel.build(map, self);
        }

        public DescribeRdsDrdsDBResponseRdsDrdsDbs setRdsDrdsDb(java.util.List<DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb> rdsDrdsDb) {
            this.rdsDrdsDb = rdsDrdsDb;
            return this;
        }
        public java.util.List<DescribeRdsDrdsDBResponseRdsDrdsDbsRdsDrdsDb> getRdsDrdsDb() {
            return this.rdsDrdsDb;
        }

    }

}
