// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentDeliveryInstanceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnvironmentDeliveryInstanceResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentDeliveryInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentDeliveryInstanceResponseBody self = new GetEnvironmentDeliveryInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentDeliveryInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentDeliveryInstanceResponseBody setData(GetEnvironmentDeliveryInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentDeliveryInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentDeliveryInstanceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetEnvironmentDeliveryInstanceResponseBodyData extends TeaModel {
        @NameInMap("clusterUID")
        public String clusterUID;

        @NameInMap("deliverableConfigUID")
        public String deliverableConfigUID;

        @NameInMap("deliverableUID")
        public String deliverableUID;

        @NameInMap("envUID")
        public String envUID;

        @NameInMap("uid")
        public String uid;

        public static GetEnvironmentDeliveryInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentDeliveryInstanceResponseBodyData self = new GetEnvironmentDeliveryInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentDeliveryInstanceResponseBodyData setClusterUID(String clusterUID) {
            this.clusterUID = clusterUID;
            return this;
        }
        public String getClusterUID() {
            return this.clusterUID;
        }

        public GetEnvironmentDeliveryInstanceResponseBodyData setDeliverableConfigUID(String deliverableConfigUID) {
            this.deliverableConfigUID = deliverableConfigUID;
            return this;
        }
        public String getDeliverableConfigUID() {
            return this.deliverableConfigUID;
        }

        public GetEnvironmentDeliveryInstanceResponseBodyData setDeliverableUID(String deliverableUID) {
            this.deliverableUID = deliverableUID;
            return this;
        }
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        public GetEnvironmentDeliveryInstanceResponseBodyData setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public GetEnvironmentDeliveryInstanceResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
