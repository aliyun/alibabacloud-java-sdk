// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionEnvironmentResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductVersionEnvironmentResponseBodyData data;

    public static ListProductVersionEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionEnvironmentResponseBody self = new ListProductVersionEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionEnvironmentResponseBody setData(ListProductVersionEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductVersionEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public static class ListProductVersionEnvironmentResponseBodyDataList extends TeaModel {
        // uid
        @NameInMap("uid")
        public String uid;

        // env_uid
        @NameInMap("envUID")
        public String envUID;

        // product_version_uid
        @NameInMap("productVersionUID")
        public String productVersionUID;

        public static ListProductVersionEnvironmentResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionEnvironmentResponseBodyDataList self = new ListProductVersionEnvironmentResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductVersionEnvironmentResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProductVersionEnvironmentResponseBodyDataList setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public ListProductVersionEnvironmentResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

    }

    public static class ListProductVersionEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductVersionEnvironmentResponseBodyDataList> list;

        public static ListProductVersionEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionEnvironmentResponseBodyData self = new ListProductVersionEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductVersionEnvironmentResponseBodyData setList(java.util.List<ListProductVersionEnvironmentResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductVersionEnvironmentResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
