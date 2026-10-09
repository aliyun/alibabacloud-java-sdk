// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseBackupJobsResponseBody extends TeaModel {
    /**
     * <p>The list of backup tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSupabaseBackupJobsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page, which can be used as the NextToken parameter in the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSupabaseBackupJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseBackupJobsResponseBody self = new ListSupabaseBackupJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupabaseBackupJobsResponseBody setItems(java.util.List<ListSupabaseBackupJobsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSupabaseBackupJobsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSupabaseBackupJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupabaseBackupJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupabaseBackupJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSupabaseBackupJobsResponseBodyItems extends TeaModel {
        /**
         * <p>The ID of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BackupJobId")
        public String backupJobId;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong>: automatic backup</li>
         * <li><strong>Manual</strong>: manual backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The status of the backup task. Valid statuses include: schedule (waiting to be scheduled) and backup (in progress).</p>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The progress percentage of the backup task, such as 0%. This value may be an empty string when the task is in the schedule (waiting to be scheduled) state.</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The start time of the backup task. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format. This value may be an empty string when the task is in the schedule (waiting to be scheduled) state.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09T04:37:01Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListSupabaseBackupJobsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSupabaseBackupJobsResponseBodyItems self = new ListSupabaseBackupJobsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSupabaseBackupJobsResponseBodyItems setBackupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public String getBackupJobId() {
            return this.backupJobId;
        }

        public ListSupabaseBackupJobsResponseBodyItems setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public ListSupabaseBackupJobsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public ListSupabaseBackupJobsResponseBodyItems setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public ListSupabaseBackupJobsResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
