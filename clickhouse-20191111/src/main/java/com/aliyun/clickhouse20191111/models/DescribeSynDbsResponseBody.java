// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynDbs")
    public java.util.List<DescribeSynDbsResponseBodySynDbs> synDbs;

    public static DescribeSynDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynDbsResponseBody self = new DescribeSynDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynDbsResponseBody setSynDbs(java.util.List<DescribeSynDbsResponseBodySynDbs> synDbs) {
        this.synDbs = synDbs;
        return this;
    }
    public java.util.List<DescribeSynDbsResponseBodySynDbs> getSynDbs() {
        return this.synDbs;
    }

    public static class DescribeSynDbsResponseBodySynDbs extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("RdsId")
        public String rdsId;

        @NameInMap("RdsPassword")
        public String rdsPassword;

        @NameInMap("RdsUserName")
        public String rdsUserName;

        @NameInMap("SynDb")
        public String synDb;

        @NameInMap("SynStatus")
        public Boolean synStatus;

        public static DescribeSynDbsResponseBodySynDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynDbsResponseBodySynDbs self = new DescribeSynDbsResponseBodySynDbs();
            return TeaModel.build(map, self);
        }

        public DescribeSynDbsResponseBodySynDbs setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeSynDbsResponseBodySynDbs setRdsId(String rdsId) {
            this.rdsId = rdsId;
            return this;
        }
        public String getRdsId() {
            return this.rdsId;
        }

        public DescribeSynDbsResponseBodySynDbs setRdsPassword(String rdsPassword) {
            this.rdsPassword = rdsPassword;
            return this;
        }
        public String getRdsPassword() {
            return this.rdsPassword;
        }

        public DescribeSynDbsResponseBodySynDbs setRdsUserName(String rdsUserName) {
            this.rdsUserName = rdsUserName;
            return this;
        }
        public String getRdsUserName() {
            return this.rdsUserName;
        }

        public DescribeSynDbsResponseBodySynDbs setSynDb(String synDb) {
            this.synDb = synDb;
            return this;
        }
        public String getSynDb() {
            return this.synDb;
        }

        public DescribeSynDbsResponseBodySynDbs setSynStatus(Boolean synStatus) {
            this.synStatus = synStatus;
            return this;
        }
        public Boolean getSynStatus() {
            return this.synStatus;
        }

    }

}
