// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetNetworkBlacklistResponseBody extends TeaModel {
    @NameInMap("NetworkBlacklistModel")
    public GetNetworkBlacklistResponseBodyNetworkBlacklistModel networkBlacklistModel;

    /**
     * <strong>example:</strong>
     * <p>A578AD3A-8E7C-54FE-A09F-B060941*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkBlacklistResponseBody self = new GetNetworkBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkBlacklistResponseBody setNetworkBlacklistModel(GetNetworkBlacklistResponseBodyNetworkBlacklistModel networkBlacklistModel) {
        this.networkBlacklistModel = networkBlacklistModel;
        return this;
    }
    public GetNetworkBlacklistResponseBodyNetworkBlacklistModel getNetworkBlacklistModel() {
        return this.networkBlacklistModel;
    }

    public GetNetworkBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNetworkBlacklistResponseBodyNetworkBlacklistModel extends TeaModel {
        @NameInMap("DomainBlacklist")
        public java.util.List<String> domainBlacklist;

        @NameInMap("IpBlacklist")
        public java.util.List<String> ipBlacklist;

        public static GetNetworkBlacklistResponseBodyNetworkBlacklistModel build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkBlacklistResponseBodyNetworkBlacklistModel self = new GetNetworkBlacklistResponseBodyNetworkBlacklistModel();
            return TeaModel.build(map, self);
        }

        public GetNetworkBlacklistResponseBodyNetworkBlacklistModel setDomainBlacklist(java.util.List<String> domainBlacklist) {
            this.domainBlacklist = domainBlacklist;
            return this;
        }
        public java.util.List<String> getDomainBlacklist() {
            return this.domainBlacklist;
        }

        public GetNetworkBlacklistResponseBodyNetworkBlacklistModel setIpBlacklist(java.util.List<String> ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }
        public java.util.List<String> getIpBlacklist() {
            return this.ipBlacklist;
        }

    }

}
