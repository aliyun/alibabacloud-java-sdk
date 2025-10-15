// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateDomainIcpNumberRequest extends TeaModel {
    /**
     * <p>域名ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dm_examplexxxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>域名关联的备案号，长度最大限制64。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>浙xx-xxxxxx</p>
     */
    @NameInMap("IcpNumber")
    public String icpNumber;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateDomainIcpNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainIcpNumberRequest self = new UpdateDomainIcpNumberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainIcpNumberRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public UpdateDomainIcpNumberRequest setIcpNumber(String icpNumber) {
        this.icpNumber = icpNumber;
        return this;
    }
    public String getIcpNumber() {
        return this.icpNumber;
    }

    public UpdateDomainIcpNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
