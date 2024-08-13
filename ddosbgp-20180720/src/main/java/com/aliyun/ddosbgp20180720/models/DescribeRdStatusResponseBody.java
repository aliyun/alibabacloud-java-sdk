// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeRdStatusResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>125085778340****</p>
     */
    @NameInMap("CurrentUid")
    public String currentUid;

    /**
     * <p>The type of the Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><strong>MasterAccount</strong>: management account</li>
     * <li><strong>DelegatedAdminAccount</strong>: delegated administrator account</li>
     * <li><strong>MasterAccount</strong>: member</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MemberAccount</p>
     */
    @NameInMap("CurrentUidType")
    public String currentUidType;

    /**
     * <p>Indicates whether the multi-account management feature is enabled for Anti-DDoS Origin.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Indicates whether the multi-account management feature is enabled for the current account in Anti-DDoS Origin.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LocalEnable")
    public Boolean localEnable;

    /**
     * <p>The Alibaba Cloud account ID of the management account in the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>125085778340****</p>
     */
    @NameInMap("MasterUid")
    public String masterUid;

    /**
     * <p>Indicates whether Resource Directory is enabled in the <a href="https://resourcemanager.console.aliyun.com">Resource Management console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoteEnable")
    public Boolean remoteEnable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B0F7EC6-51D7-4D70-B0EC-CD8A9E998D86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud account ID of the management account for which the multi-account management feature is enabled in Anti-DDoS Origin.</p>
     * 
     * <strong>example:</strong>
     * <p>125085778340****</p>
     */
    @NameInMap("RootUid")
    public String rootUid;

    /**
     * <p>Indicates whether the trusted service is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServicePrincipalEnabled")
    public Boolean servicePrincipalEnabled;

    public static DescribeRdStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdStatusResponseBody self = new DescribeRdStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdStatusResponseBody setCurrentUid(String currentUid) {
        this.currentUid = currentUid;
        return this;
    }
    public String getCurrentUid() {
        return this.currentUid;
    }

    public DescribeRdStatusResponseBody setCurrentUidType(String currentUidType) {
        this.currentUidType = currentUidType;
        return this;
    }
    public String getCurrentUidType() {
        return this.currentUidType;
    }

    public DescribeRdStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeRdStatusResponseBody setLocalEnable(Boolean localEnable) {
        this.localEnable = localEnable;
        return this;
    }
    public Boolean getLocalEnable() {
        return this.localEnable;
    }

    public DescribeRdStatusResponseBody setMasterUid(String masterUid) {
        this.masterUid = masterUid;
        return this;
    }
    public String getMasterUid() {
        return this.masterUid;
    }

    public DescribeRdStatusResponseBody setRemoteEnable(Boolean remoteEnable) {
        this.remoteEnable = remoteEnable;
        return this;
    }
    public Boolean getRemoteEnable() {
        return this.remoteEnable;
    }

    public DescribeRdStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdStatusResponseBody setRootUid(String rootUid) {
        this.rootUid = rootUid;
        return this;
    }
    public String getRootUid() {
        return this.rootUid;
    }

    public DescribeRdStatusResponseBody setServicePrincipalEnabled(Boolean servicePrincipalEnabled) {
        this.servicePrincipalEnabled = servicePrincipalEnabled;
        return this;
    }
    public Boolean getServicePrincipalEnabled() {
        return this.servicePrincipalEnabled;
    }

}
