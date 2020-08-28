// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("RecordLogs")
    @Validation(required = true)
    public DescribeRecordLogsResponseRecordLogs recordLogs;

    public static DescribeRecordLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordLogsResponse self = new DescribeRecordLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRecordLogsResponseRecordLogsRecordLog extends TeaModel {
        @NameInMap("ActionTime")
        @Validation(required = true)
        public String actionTime;

        @NameInMap("ActionTimestamp")
        @Validation(required = true)
        public Long actionTimestamp;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("ClientIp")
        @Validation(required = true)
        public String clientIp;

        public static DescribeRecordLogsResponseRecordLogsRecordLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordLogsResponseRecordLogsRecordLog self = new DescribeRecordLogsResponseRecordLogsRecordLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRecordLogsResponseRecordLogs extends TeaModel {
        @NameInMap("RecordLog")
        @Validation(required = true)
        public java.util.List<DescribeRecordLogsResponseRecordLogsRecordLog> recordLog;

        public static DescribeRecordLogsResponseRecordLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordLogsResponseRecordLogs self = new DescribeRecordLogsResponseRecordLogs();
            return TeaModel.build(map, self);
        }

    }

}
