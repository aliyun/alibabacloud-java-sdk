// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHotDbListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeHotDbListResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeHotDbListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotDbListResponseBody self = new DescribeHotDbListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHotDbListResponseBody setData(DescribeHotDbListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeHotDbListResponseBodyData getData() {
        return this.data;
    }

    public DescribeHotDbListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeHotDbListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHotDbListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeHotDbListResponseBodyDataListInstanceDbHotDbList extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeHotDbListResponseBodyDataListInstanceDbHotDbList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseBodyDataListInstanceDbHotDbList self = new DescribeHotDbListResponseBodyDataListInstanceDbHotDbList();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseBodyDataListInstanceDbHotDbList setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeHotDbListResponseBodyDataListInstanceDb extends TeaModel {
        @NameInMap("HotDbList")
        public DescribeHotDbListResponseBodyDataListInstanceDbHotDbList hotDbList;

        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeHotDbListResponseBodyDataListInstanceDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseBodyDataListInstanceDb self = new DescribeHotDbListResponseBodyDataListInstanceDb();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseBodyDataListInstanceDb setHotDbList(DescribeHotDbListResponseBodyDataListInstanceDbHotDbList hotDbList) {
            this.hotDbList = hotDbList;
            return this;
        }
        public DescribeHotDbListResponseBodyDataListInstanceDbHotDbList getHotDbList() {
            return this.hotDbList;
        }

        public DescribeHotDbListResponseBodyDataListInstanceDb setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class DescribeHotDbListResponseBodyDataList extends TeaModel {
        @NameInMap("InstanceDb")
        public java.util.List<DescribeHotDbListResponseBodyDataListInstanceDb> instanceDb;

        public static DescribeHotDbListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseBodyDataList self = new DescribeHotDbListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseBodyDataList setInstanceDb(java.util.List<DescribeHotDbListResponseBodyDataListInstanceDb> instanceDb) {
            this.instanceDb = instanceDb;
            return this;
        }
        public java.util.List<DescribeHotDbListResponseBodyDataListInstanceDb> getInstanceDb() {
            return this.instanceDb;
        }

    }

    public static class DescribeHotDbListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public DescribeHotDbListResponseBodyDataList list;

        @NameInMap("RandomCode")
        public String randomCode;

        public static DescribeHotDbListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseBodyData self = new DescribeHotDbListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseBodyData setList(DescribeHotDbListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public DescribeHotDbListResponseBodyDataList getList() {
            return this.list;
        }

        public DescribeHotDbListResponseBodyData setRandomCode(String randomCode) {
            this.randomCode = randomCode;
            return this;
        }
        public String getRandomCode() {
            return this.randomCode;
        }

    }

}
