// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsResponse extends TeaModel {
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
    public DescribeDomainRecordsResponseDomainRecords domainRecords;

    public static DescribeDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsResponse self = new DescribeDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainRecordsResponseDomainRecordsRecord extends TeaModel {
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

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        public static DescribeDomainRecordsResponseDomainRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseDomainRecordsRecord self = new DescribeDomainRecordsResponseDomainRecordsRecord();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainRecordsResponseDomainRecords extends TeaModel {
        @NameInMap("Record")
        @Validation(required = true)
        public java.util.List<DescribeDomainRecordsResponseDomainRecordsRecord> record;

        public static DescribeDomainRecordsResponseDomainRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRecordsResponseDomainRecords self = new DescribeDomainRecordsResponseDomainRecords();
            return TeaModel.build(map, self);
        }

    }

}
