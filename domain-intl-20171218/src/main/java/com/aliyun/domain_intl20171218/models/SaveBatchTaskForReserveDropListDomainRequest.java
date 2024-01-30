// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForReserveDropListDomainRequest extends TeaModel {
    @NameInMap("ContactTemplateId")
    public String contactTemplateId;

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
        @NameInMap("DomainName")
        public String domainName;

        public static SaveBatchTaskForReserveDropListDomainRequestDomains build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForReserveDropListDomainRequestDomains self = new SaveBatchTaskForReserveDropListDomainRequestDomains();
            return TeaModel.build(map, self);
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
