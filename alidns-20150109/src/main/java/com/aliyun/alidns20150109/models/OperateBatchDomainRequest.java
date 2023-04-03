// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainRequest extends TeaModel {
    @NameInMap("DomainRecordInfo")
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo;

    /**
     * <p>The language type.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <br>
     * <p>*   **DOMAIN_ADD**: adds domain names in batches.</p>
     * <p>*   **DOMAIN_DEL**: deletes domain names in batches.</p>
     * <p>*   **RR_ADD**: adds DNS records in batches.</p>
     * <p>*   **RR_DEL**: deletes DNS records in batches. (If RR or VALUE exists, DNS records corresponding to the specified RR or VALUE are deleted. If both of them exist, DNS records corresponding to the specified RR and VALUE are deleted. If no RR or VALUE is specified, the DNS records corresponding to the DomainName parameter are deleted.)</p>
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
         * <p>The domain name corresponding to DNS record N.</p>
         * <br>
         * <p>>  N is specified by users. **N** starts from **1**. The maximum value of N is **1000**. Extra data entries are ignored.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The resolution line of DNS record N. Default value: default.</p>
         * <br>
         * <p>For more information, see [Resolution line enumeration](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm).</p>
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
         * <p>The priority of MX-type DNS record N.</p>
         * <br>
         * <p>This parameter must be specified if the type of the DNS record is MX. Default value: 10.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The host record corresponding to DNS record N.</p>
         * <br>
         * <p>>  If you set the Type parameter to **RR_ADD**, you must also specify this parameter.</p>
         */
        @NameInMap("Rr")
        public String rr;

        /**
         * <p>The TTL of DNS record N. Unit: seconds. Default value: **600**.</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The type of DNS record N. For the DNS record types supported by Alibaba Cloud DNS, see [Resolution record type formats](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm).</p>
         * <br>
         * <p>>  If you set the Type parameter to **RR_ADD**, you must also specify this parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of DNS record N.</p>
         * <br>
         * <p>>  If you set the Type parameter to **RR_ADD**, you must also specify this parameter.</p>
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
