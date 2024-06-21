// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeRdStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>125085778340****</p>
     */
    @NameInMap("CurrentUid")
    public String currentUid;

    /**
     * <strong>example:</strong>
     * <p>MemberAccount</p>
     */
    @NameInMap("CurrentUidType")
    public String currentUidType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LocalEnable")
    public Boolean localEnable;

    /**
     * <strong>example:</strong>
     * <p>125085778340****</p>
     */
    @NameInMap("MasterUid")
    public String masterUid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoteEnable")
    public Boolean remoteEnable;

    /**
     * <strong>example:</strong>
     * <p>1B0F7EC6-51D7-4D70-B0EC-CD8A9E998D86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>125085778340****</p>
     */
    @NameInMap("RootUid")
    public String rootUid;

    /**
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
