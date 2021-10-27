// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCanExpandInstanceDetailListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCanExpandInstanceDetailListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCanExpandInstanceDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanExpandInstanceDetailListResponseBody self = new DescribeCanExpandInstanceDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCanExpandInstanceDetailListResponseBody setData(DescribeCanExpandInstanceDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCanExpandInstanceDetailListResponseBodyData getData() {
        return this.data;
    }

    public DescribeCanExpandInstanceDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCanExpandInstanceDetailListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList extends TeaModel {
        @NameInMap("db")
        public java.util.List<String> db;

        public static DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList self = new DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList();
            return TeaModel.build(map, self);
        }

        public DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList setDb(java.util.List<String> db) {
            this.db = db;
            return this;
        }
        public java.util.List<String> getDb() {
            return this.db;
        }

    }

    public static class DescribeCanExpandInstanceDetailListResponseBodyDataItemData extends TeaModel {
        @NameInMap("DbList")
        public DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList dbList;

        @NameInMap("SrcInstance")
        public String srcInstance;

        public static DescribeCanExpandInstanceDetailListResponseBodyDataItemData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCanExpandInstanceDetailListResponseBodyDataItemData self = new DescribeCanExpandInstanceDetailListResponseBodyDataItemData();
            return TeaModel.build(map, self);
        }

        public DescribeCanExpandInstanceDetailListResponseBodyDataItemData setDbList(DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList dbList) {
            this.dbList = dbList;
            return this;
        }
        public DescribeCanExpandInstanceDetailListResponseBodyDataItemDataDbList getDbList() {
            return this.dbList;
        }

        public DescribeCanExpandInstanceDetailListResponseBodyDataItemData setSrcInstance(String srcInstance) {
            this.srcInstance = srcInstance;
            return this;
        }
        public String getSrcInstance() {
            return this.srcInstance;
        }

    }

    public static class DescribeCanExpandInstanceDetailListResponseBodyData extends TeaModel {
        @NameInMap("itemData")
        public java.util.List<DescribeCanExpandInstanceDetailListResponseBodyDataItemData> itemData;

        public static DescribeCanExpandInstanceDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCanExpandInstanceDetailListResponseBodyData self = new DescribeCanExpandInstanceDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCanExpandInstanceDetailListResponseBodyData setItemData(java.util.List<DescribeCanExpandInstanceDetailListResponseBodyDataItemData> itemData) {
            this.itemData = itemData;
            return this;
        }
        public java.util.List<DescribeCanExpandInstanceDetailListResponseBodyDataItemData> getItemData() {
            return this.itemData;
        }

    }

}
