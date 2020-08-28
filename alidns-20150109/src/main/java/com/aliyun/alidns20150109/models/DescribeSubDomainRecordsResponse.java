// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsResponse extends TeaModel {
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

    @NameInMap("DomainRecords")
    @Validation(required = true)
    public DescribeSubDomainRecordsResponseDomainRecords domainRecords;

    public static DescribeSubDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsResponse self = new DescribeSubDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSubDomainRecordsResponseDomainRecordsRecord extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("RR")
        @Validation(required = true)
        public String RR;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("TTL")
        @Validation(required = true)
        public Long TTL;

        @NameInMap("Priority")
        @Validation(required = true)
        public Long priority;

        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Locked")
        @Validation(required = true)
        public Boolean locked;

        @NameInMap("Weight")
        @Validation(required = true)
        public Integer weight;

        public static DescribeSubDomainRecordsResponseDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseDomainRecordsRecord self = new DescribeSubDomainRecordsResponseDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSubDomainRecordsResponseDomainRecords extends TeaModel {
        @NameInMap("Record")
        @Validation(required = true)
        public java.util.List<DescribeSubDomainRecordsResponseDomainRecordsRecord> record;

        public static DescribeSubDomainRecordsResponseDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubDomainRecordsResponseDomainRecords self = new DescribeSubDomainRecordsResponseDomainRecords();
            return TeaModel.build(map, self);
        }

    }

}
