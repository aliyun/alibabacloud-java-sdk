// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainLegalStatus")
    public String domainLegalStatus;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainBindingStatus")
    public String domainBindingStatus;

    @NameInMap("DomainRemark")
    public String domainRemark;

    @NameInMap("DomainWebSocketStatus")
    public String domainWebSocketStatus;

    public static SetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainResponseBody self = new SetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDomainResponseBody setDomainLegalStatus(String domainLegalStatus) {
        this.domainLegalStatus = domainLegalStatus;
        return this;
    }
    public String getDomainLegalStatus() {
        return this.domainLegalStatus;
    }

    public SetDomainResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public SetDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainResponseBody setDomainBindingStatus(String domainBindingStatus) {
        this.domainBindingStatus = domainBindingStatus;
        return this;
    }
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    public SetDomainResponseBody setDomainRemark(String domainRemark) {
        this.domainRemark = domainRemark;
        return this;
    }
    public String getDomainRemark() {
        return this.domainRemark;
    }

    public SetDomainResponseBody setDomainWebSocketStatus(String domainWebSocketStatus) {
        this.domainWebSocketStatus = domainWebSocketStatus;
        return this;
    }
    public String getDomainWebSocketStatus() {
        return this.domainWebSocketStatus;
    }

}
