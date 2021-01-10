// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupDumpTimesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupDumpTimes")
    public java.util.List<QueryDBBackupDumpTimesResponseBodyBackupDumpTimes> backupDumpTimes;

    public static QueryDBBackupDumpTimesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupDumpTimesResponseBody self = new QueryDBBackupDumpTimesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupDumpTimesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDBBackupDumpTimesResponseBody setBackupDumpTimes(java.util.List<QueryDBBackupDumpTimesResponseBodyBackupDumpTimes> backupDumpTimes) {
        this.backupDumpTimes = backupDumpTimes;
        return this;
    }
    public java.util.List<QueryDBBackupDumpTimesResponseBodyBackupDumpTimes> getBackupDumpTimes() {
        return this.backupDumpTimes;
    }

    public static class QueryDBBackupDumpTimesResponseBodyBackupDumpTimes extends TeaModel {
        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("DumpTime")
        public String dumpTime;

        public static QueryDBBackupDumpTimesResponseBodyBackupDumpTimes build(java.util.Map<String, ?> map) throws Exception {
            QueryDBBackupDumpTimesResponseBodyBackupDumpTimes self = new QueryDBBackupDumpTimesResponseBodyBackupDumpTimes();
            return TeaModel.build(map, self);
        }

        public QueryDBBackupDumpTimesResponseBodyBackupDumpTimes setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public QueryDBBackupDumpTimesResponseBodyBackupDumpTimes setDumpTime(String dumpTime) {
            this.dumpTime = dumpTime;
            return this;
        }
        public String getDumpTime() {
            return this.dumpTime;
        }

    }

}
