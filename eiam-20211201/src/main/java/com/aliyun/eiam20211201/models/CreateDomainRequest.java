// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>域名。最大长度限制255，格式由数字、字母、横线（-）点（.）组成;</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>备案信息参数。</p>
     */
    @NameInMap("Filing")
    public CreateDomainRequestFiling filing;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setFiling(CreateDomainRequestFiling filing) {
        this.filing = filing;
        return this;
    }
    public CreateDomainRequestFiling getFiling() {
        return this.filing;
    }

    public CreateDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class CreateDomainRequestFiling extends TeaModel {
        /**
         * <p>域名关联的备案号，长度最大限制64。</p>
         */
        @NameInMap("IcpNumber")
        public String icpNumber;

        public static CreateDomainRequestFiling build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestFiling self = new CreateDomainRequestFiling();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestFiling setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

    }

}
