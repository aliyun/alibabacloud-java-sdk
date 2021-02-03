// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Type")
    public String type;

    @NameInMap("DomainRecordInfo")
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo;

    public static OperateBatchDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBatchDomainRequest self = new OperateBatchDomainRequest();
        return TeaModel.build(map, self);
    }

    public OperateBatchDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateBatchDomainRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public OperateBatchDomainRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OperateBatchDomainRequest setDomainRecordInfo(java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo) {
        this.domainRecordInfo = domainRecordInfo;
        return this;
    }
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> getDomainRecordInfo() {
        return this.domainRecordInfo;
    }

    public static class OperateBatchDomainRequestDomainRecordInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Line")
        public String line;

        @NameInMap("NewRr")
        public String newRr;

        @NameInMap("Rr")
        public String rr;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("NewType")
        public String newType;

        @NameInMap("NewValue")
        public String newValue;

        public static OperateBatchDomainRequestDomainRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            OperateBatchDomainRequestDomainRecordInfo self = new OperateBatchDomainRequestDomainRecordInfo();
            return TeaModel.build(map, self);
        }

        public OperateBatchDomainRequestDomainRecordInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public OperateBatchDomainRequestDomainRecordInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public OperateBatchDomainRequestDomainRecordInfo setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public OperateBatchDomainRequestDomainRecordInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public OperateBatchDomainRequestDomainRecordInfo setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public OperateBatchDomainRequestDomainRecordInfo setNewRr(String newRr) {
            this.newRr = newRr;
            return this;
        }
        public String getNewRr() {
            return this.newRr;
        }

        public OperateBatchDomainRequestDomainRecordInfo setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public OperateBatchDomainRequestDomainRecordInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public OperateBatchDomainRequestDomainRecordInfo setNewType(String newType) {
            this.newType = newType;
            return this;
        }
        public String getNewType() {
            return this.newType;
        }

        public OperateBatchDomainRequestDomainRecordInfo setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

    }

}
