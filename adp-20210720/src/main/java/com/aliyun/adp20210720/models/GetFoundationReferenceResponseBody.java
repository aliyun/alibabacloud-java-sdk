// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetFoundationReferenceResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetFoundationReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationReferenceResponseBody self = new GetFoundationReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationReferenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoundationReferenceResponseBody setData(GetFoundationReferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFoundationReferenceResponseBodyData getData() {
        return this.data;
    }

    public GetFoundationReferenceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetFoundationReferenceResponseBodyData extends TeaModel {
        @NameInMap("clusterConfig")
        public String clusterConfig;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        // foundation reference uid
        @NameInMap("uid")
        public String uid;

        public static GetFoundationReferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFoundationReferenceResponseBodyData self = new GetFoundationReferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFoundationReferenceResponseBodyData setClusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        public GetFoundationReferenceResponseBodyData setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public GetFoundationReferenceResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
