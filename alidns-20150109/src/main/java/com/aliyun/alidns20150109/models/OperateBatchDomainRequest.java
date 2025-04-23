// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainRequest extends TeaModel {
    /**
     * <p>The DNS records. You can submit up to 1,000 DNS records.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainRecordInfo")
    public java.util.List<OperateBatchDomainRequestDomainRecordInfo> domainRecordInfo;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: zh</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the batch operation. Valid values:</p>
     * <ul>
     * <li><strong>DOMAIN_ADD</strong>: adds domain names in batches.</li>
     * <li><strong>DOMAIN_DEL</strong>: deletes domain names in batches.</li>
     * <li><strong>RR_ADD</strong>: adds DNS records in batches.</li>
     * <li><strong>RR_DEL</strong>: deletes DNS records in batches. This operation deletes the DNS records with the specified hostname or record value. If you do not specify the Rr and Value parameters, this operation deletes the DNS records that are added for the specified domain names.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RR_ADD</p>
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
         * <blockquote>
         * <p> You can submit 1 to 1,000 domain names. Due to the limit on the length of HTTP request headers, excessive domain names are ignored. Do not enter more than 1,000 domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The DNS request source. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The new hostname (used only for modification operations, not for external users).</p>
         * 
         * <strong>example:</strong>
         * <p>mail</p>
         */
        @NameInMap("NewRr")
        public String newRr;

        /**
         * <p>The new type of the DNS record (used only for modification operations, not for external users).</p>
         * 
         * <strong>example:</strong>
         * <p>AAAA</p>
         */
        @NameInMap("NewType")
        public String newType;

        /**
         * <p>The new value of the DNS record (used only for modification operations, not for external users).</p>
         * 
         * <strong>example:</strong>
         * <p>114.92.XX.XX</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The priority of the mail exchanger (MX) record.</p>
         * <p>This parameter is required if the type of the DNS record is MX. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The hostname.</p>
         * <blockquote>
         * <p> This parameter is required if you set Type to <strong>RR_ADD</strong> or <strong>RR_DEL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zhaohui</p>
         */
        @NameInMap("Rr")
        public String rr;

        /**
         * <p>The time-to-live (TTL) value of the cached DNS record. Unit: seconds. Default value: <em><strong>600</strong></em>.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The type of the DNS record. Valid values: A, AAAA, TXT, MX, and CNAME.</p>
         * <blockquote>
         * <p> This parameter is required if you set Type to <strong>RR_ADD</strong> or <strong>RR_DEL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MX</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the DNS record.</p>
         * <blockquote>
         * <p> This parameter is required if you set Type to <strong>RR_ADD</strong> or <strong>RR_DEL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fd87da3c4528844d45af39200155a905</p>
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
