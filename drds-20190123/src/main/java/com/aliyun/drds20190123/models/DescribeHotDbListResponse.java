// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHotDbListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeHotDbListResponseData data;

    public static DescribeHotDbListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotDbListResponse self = new DescribeHotDbListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHotDbListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHotDbListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHotDbListResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeHotDbListResponse setData(DescribeHotDbListResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeHotDbListResponseData getData() {
        return this.data;
    }

    public static class DescribeHotDbListResponseDataListInstanceDbHotDbList extends TeaModel {
        // data
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<String> data;

        public static DescribeHotDbListResponseDataListInstanceDbHotDbList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseDataListInstanceDbHotDbList self = new DescribeHotDbListResponseDataListInstanceDbHotDbList();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseDataListInstanceDbHotDbList setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeHotDbListResponseDataListInstanceDb extends TeaModel {
        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("HotDbList")
        @Validation(required = true)
        public DescribeHotDbListResponseDataListInstanceDbHotDbList hotDbList;

        public static DescribeHotDbListResponseDataListInstanceDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseDataListInstanceDb self = new DescribeHotDbListResponseDataListInstanceDb();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseDataListInstanceDb setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHotDbListResponseDataListInstanceDb setHotDbList(DescribeHotDbListResponseDataListInstanceDbHotDbList hotDbList) {
            this.hotDbList = hotDbList;
            return this;
        }
        public DescribeHotDbListResponseDataListInstanceDbHotDbList getHotDbList() {
            return this.hotDbList;
        }

    }

    public static class DescribeHotDbListResponseDataList extends TeaModel {
        @NameInMap("InstanceDb")
        @Validation(required = true)
        public java.util.List<DescribeHotDbListResponseDataListInstanceDb> instanceDb;

        public static DescribeHotDbListResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseDataList self = new DescribeHotDbListResponseDataList();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseDataList setInstanceDb(java.util.List<DescribeHotDbListResponseDataListInstanceDb> instanceDb) {
            this.instanceDb = instanceDb;
            return this;
        }
        public java.util.List<DescribeHotDbListResponseDataListInstanceDb> getInstanceDb() {
            return this.instanceDb;
        }

    }

    public static class DescribeHotDbListResponseData extends TeaModel {
        @NameInMap("RandomCode")
        @Validation(required = true)
        public String randomCode;

        @NameInMap("List")
        @Validation(required = true)
        public DescribeHotDbListResponseDataList list;

        public static DescribeHotDbListResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotDbListResponseData self = new DescribeHotDbListResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeHotDbListResponseData setRandomCode(String randomCode) {
            this.randomCode = randomCode;
            return this;
        }
        public String getRandomCode() {
            return this.randomCode;
        }

        public DescribeHotDbListResponseData setList(DescribeHotDbListResponseDataList list) {
            this.list = list;
            return this;
        }
        public DescribeHotDbListResponseDataList getList() {
            return this.list;
        }

    }

}
