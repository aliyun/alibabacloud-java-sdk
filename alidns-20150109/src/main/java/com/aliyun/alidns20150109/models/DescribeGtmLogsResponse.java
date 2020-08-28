// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Logs")
    @Validation(required = true)
    public DescribeGtmLogsResponseLogs logs;

    public static DescribeGtmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsResponse self = new DescribeGtmLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmLogsResponseLogsLog extends TeaModel {
        @NameInMap("OperTime")
        @Validation(required = true)
        public String operTime;

        @NameInMap("OperAction")
        @Validation(required = true)
        public String operAction;

        @NameInMap("EntityType")
        @Validation(required = true)
        public String entityType;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("EntityName")
        @Validation(required = true)
        public String entityName;

        @NameInMap("OperIp")
        @Validation(required = true)
        public String operIp;

        @NameInMap("OperTimestamp")
        @Validation(required = true)
        public Long operTimestamp;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static DescribeGtmLogsResponseLogsLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseLogsLog self = new DescribeGtmLogsResponseLogsLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmLogsResponseLogs extends TeaModel {
        @NameInMap("Log")
        @Validation(required = true)
        public java.util.List<DescribeGtmLogsResponseLogsLog> log;

        public static DescribeGtmLogsResponseLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseLogs self = new DescribeGtmLogsResponseLogs();
            return TeaModel.build(map, self);
        }

    }

}
