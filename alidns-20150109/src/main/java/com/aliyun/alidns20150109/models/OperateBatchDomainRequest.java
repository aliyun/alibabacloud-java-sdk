// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainRequest extends TeaModel {
    /**
     * <p>The DNS records. You can submit up to 1000 DNS records.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainRecordInfo")
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <br>
     * <p>*   **DOMAIN_ADD**: adds domain names in batches.</p>
     * <p>*   **DOMAIN_DEL**: deletes domain names in batches.</p>
     * <p>*   **RR_ADD**: adds DNS records in batches.</p>
     * <p>*   **RR_DEL**: deletes DNS records in batches. This operation deletes the DNS records with the specified hostname or record value. If you do not specify the Rr and Value parameters, this operation deletes the DNS records that are added for the specified domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static OperateBatchDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBatchDomainRequest self = new OperateBatchDomainRequest();
        return TeaModel.build(map, self);
    }

    public OperateBatchDomainRequest setDomainRecordInfo(java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo) {
        this.domainRecordInfo = domainRecordInfo;
        return this;
    }
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> getDomainRecordInfo() {
        return this.domainRecordInfo;
    }

    public OperateBatchDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateBatchDomainRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class OperateBatchDomainRequestDomainRecordInfo extends TeaModel {
        /**
         * <p>The domain name.</p>
         * <br>
         * <p>>  You can submit 1 to 1,000 domain names. Due to the limit on the length of HTTP request headers, excessive domain names are ignored. Do not enter more than 1,000 domain names.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The resolution line. Default value: default.</p>
         */
        @NameInMap("Line")
        public String line;

        @NameInMap("NewRr")
        public String newRr;

        @NameInMap("NewType")
        public String newType;

        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The priority of the mail exchanger (MX) record.</p>
         * <br>
         * <p>This parameter is required if the type of the DNS record is MX. Default value: 10.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The hostname.</p>
         * <br>
         * <p>>  This parameter is required if you set Type to **RR_ADD** or **RR_DEL**.</p>
         */
        @NameInMap("Rr")
        public String rr;

        /**
         * <p>The time-to-live (TTL) value of the cached DNS record. Unit: seconds. Default value: ***600***.</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The type of the DNS record. Valid values: A, AAAA, TXT, MX, and CNAME.</p>
         * <br>
         * <p>>  This parameter is required if you set Type to **RR_ADD** or **RR_DEL**.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The record value.</p>
         * <br>
         * <p>>  This parameter is required if you set Type to **RR_ADD** or **RR_DEL**.</p>
         */
        @NameInMap("Value")
        public String value;

        public static OperateBatchDomainRequestDomainRecordInfo build(java.util.Map<String, ?> map) throws Exception {
            OperateBatchDomainRequestDomainRecordInfo self = new OperateBatchDomainRequestDomainRecordInfo();
            return TeaModel.build(map, self);
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

        public OperateBatchDomainRequestDomainRecordInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public OperateBatchDomainRequestDomainRecordInfo setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public OperateBatchDomainRequestDomainRecordInfo setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
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

    }

}
