// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class QueryInterconnectionCidMappingRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 查询请求体
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
        // 会话ID
        @NameInMap("SrcCid")
        public String srcCid;

        // 会话ID类型; 1: AIM会话ID 2: 钉钉会话ID
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
