// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductInstancesResponseBodyData data;

    public static ListProductInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstancesResponseBody self = new ListProductInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductInstancesResponseBody setData(ListProductInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class ListProductInstancesResponseBodyDataList extends TeaModel {
        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public String uid;

        public static ListProductInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstancesResponseBodyDataList self = new ListProductInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductInstancesResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductInstancesResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListProductInstancesResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListProductInstancesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductInstancesResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListProductInstancesResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductInstancesResponseBodyDataList> list;

        public static ListProductInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstancesResponseBodyData self = new ListProductInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductInstancesResponseBodyData setList(java.util.List<ListProductInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductInstancesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
