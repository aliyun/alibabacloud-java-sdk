// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("DomainRecordInfo")
    @Validation(required = true)
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo;

    public static OperateBatchDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBatchDomainRequest self = new OperateBatchDomainRequest();
        return TeaModel.build(map, self);
    }

    public static class OperateBatchDomainRequestDomainRecordInfo extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Type")
        public String type;

        @NameInMap("Rr")
        public String rr;

        @NameInMap("Value")
        public String value;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Line")
        public String line;

        @NameInMap("NewRr")
        public String newRr;

        @NameInMap("NewType")
        public String newType;

        @NameInMap("NewValue")
        public String newValue;

        public static OperateBatchDomainRequestDomainRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            OperateBatchDomainRequestDomainRecordInfo self = new OperateBatchDomainRequestDomainRecordInfo();
            return TeaModel.build(map, self);
        }

    }

}
