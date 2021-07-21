// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvChangeRecordsResponseBodyData data;

    public static ListEnvChangeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordsResponseBody self = new ListEnvChangeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordsResponseBody setData(ListEnvChangeRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvChangeRecordsResponseBodyData getData() {
        return this.data;
    }

    public static class ListEnvChangeRecordsResponseBodyDataList extends TeaModel {
        // 交付产品版本
        @NameInMap("deliveried_product_version")
        public String deliveriedProductVersion;

        // 源版本
        @NameInMap("origin_product_version")
        public String originProductVersion;

        // 交付时间
        @NameInMap("deliveried_at")
        public String deliveriedAt;

        // 底座版本
        @NameInMap("foundation_version")
        public String foundationVersion;

        // 交付描述
        @NameInMap("description")
        public String description;

        public static ListEnvChangeRecordsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeRecordsResponseBodyDataList self = new ListEnvChangeRecordsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeRecordsResponseBodyDataList setDeliveriedProductVersion(String deliveriedProductVersion) {
            this.deliveriedProductVersion = deliveriedProductVersion;
            return this;
        }
        public String getDeliveriedProductVersion() {
            return this.deliveriedProductVersion;
        }

        public ListEnvChangeRecordsResponseBodyDataList setOriginProductVersion(String originProductVersion) {
            this.originProductVersion = originProductVersion;
            return this;
        }
        public String getOriginProductVersion() {
            return this.originProductVersion;
        }

        public ListEnvChangeRecordsResponseBodyDataList setDeliveriedAt(String deliveriedAt) {
            this.deliveriedAt = deliveriedAt;
            return this;
        }
        public String getDeliveriedAt() {
            return this.deliveriedAt;
        }

        public ListEnvChangeRecordsResponseBodyDataList setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public ListEnvChangeRecordsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListEnvChangeRecordsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvChangeRecordsResponseBodyDataList> list;

        public static ListEnvChangeRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeRecordsResponseBodyData self = new ListEnvChangeRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeRecordsResponseBodyData setList(java.util.List<ListEnvChangeRecordsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvChangeRecordsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
