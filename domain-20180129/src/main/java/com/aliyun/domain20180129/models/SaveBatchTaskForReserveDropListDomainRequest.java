// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForReserveDropListDomainRequest extends TeaModel {
    /**
     * <p>The contact template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("ContactTemplateId")
    public String contactTemplateId;

    /**
     * <p>The domain list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<SaveBatchTaskForReserveDropListDomainRequestDomains> domains;

    public static SaveBatchTaskForReserveDropListDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForReserveDropListDomainRequest self = new SaveBatchTaskForReserveDropListDomainRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForReserveDropListDomainRequest setContactTemplateId(String contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public String getContactTemplateId() {
        return this.contactTemplateId;
    }

    public SaveBatchTaskForReserveDropListDomainRequest setDomains(java.util.List<SaveBatchTaskForReserveDropListDomainRequestDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<SaveBatchTaskForReserveDropListDomainRequestDomains> getDomains() {
        return this.domains;
    }

    public static class SaveBatchTaskForReserveDropListDomainRequestDomains extends TeaModel {
        /**
         * <p>The first custom DNS server.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only if you set <strong>AliyunDns</strong> to <strong>false</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Make sure that your custom DNS servers are valid. Otherwise, the domain reservation may fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ns11.big<a href="http://www.com">www.com</a></p>
         */
        @NameInMap("Dns1")
        public String dns1;

        /**
         * <p>The second custom DNS server.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only if you set <strong>AliyunDns</strong> to <strong>false</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Make sure that your custom DNS servers are valid. Otherwise, the domain reservation may fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nsb.263idc.net</p>
         */
        @NameInMap("Dns2")
        public String dns2;

        /**
         * <p>The domain name to reserve.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static SaveBatchTaskForReserveDropListDomainRequestDomains build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForReserveDropListDomainRequestDomains self = new SaveBatchTaskForReserveDropListDomainRequestDomains();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForReserveDropListDomainRequestDomains setDns1(String dns1) {
            this.dns1 = dns1;
            return this;
        }
        public String getDns1() {
            return this.dns1;
        }

        public SaveBatchTaskForReserveDropListDomainRequestDomains setDns2(String dns2) {
            this.dns2 = dns2;
            return this;
        }
        public String getDns2() {
            return this.dns2;
        }

        public SaveBatchTaskForReserveDropListDomainRequestDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
