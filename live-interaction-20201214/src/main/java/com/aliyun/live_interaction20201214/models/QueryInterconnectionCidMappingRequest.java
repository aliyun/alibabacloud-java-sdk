// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class QueryInterconnectionCidMappingRequest extends TeaModel {
    /**
     * <p>AppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public QueryInterconnectionCidMappingRequestRequestParams requestParams;

    public static QueryInterconnectionCidMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInterconnectionCidMappingRequest self = new QueryInterconnectionCidMappingRequest();
        return TeaModel.build(map, self);
    }

    public QueryInterconnectionCidMappingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryInterconnectionCidMappingRequest setRequestParams(QueryInterconnectionCidMappingRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public QueryInterconnectionCidMappingRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class QueryInterconnectionCidMappingRequestRequestParams extends TeaModel {
        @NameInMap("SrcCid")
        public String srcCid;

        @NameInMap("Type")
        public Long type;

        public static QueryInterconnectionCidMappingRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            QueryInterconnectionCidMappingRequestRequestParams self = new QueryInterconnectionCidMappingRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public QueryInterconnectionCidMappingRequestRequestParams setSrcCid(String srcCid) {
            this.srcCid = srcCid;
            return this;
        }
        public String getSrcCid() {
            return this.srcCid;
        }

        public QueryInterconnectionCidMappingRequestRequestParams setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
