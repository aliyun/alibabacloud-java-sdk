// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetDomainForBackendResponseBody extends TeaModel {
    @NameInMap("DomainBindingStatus")
    public String domainBindingStatus;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubDomain")
    public String subDomain;

    public static SetDomainForBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainForBackendResponseBody self = new SetDomainForBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainForBackendResponseBody setDomainBindingStatus(String domainBindingStatus) {
        this.domainBindingStatus = domainBindingStatus;
        return this;
    }
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    public SetDomainForBackendResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainForBackendResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainForBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDomainForBackendResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

}
