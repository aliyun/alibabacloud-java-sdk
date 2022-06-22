// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfRealDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPtsPerfRealDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPtsPerfRealDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfRealDataResponseBody self = new ListPtsPerfRealDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfRealDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsPerfRealDataResponseBody setData(java.util.List<ListPtsPerfRealDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPtsPerfRealDataResponseBodyData> getData() {
        return this.data;
    }

    public ListPtsPerfRealDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsPerfRealDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsPerfRealDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss self = new ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPtsPerfRealDataResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("PtsInstanceItemStatuss")
        public java.util.List<ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss> ptsInstanceItemStatuss;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListPtsPerfRealDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfRealDataResponseBodyData self = new ListPtsPerfRealDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfRealDataResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListPtsPerfRealDataResponseBodyData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListPtsPerfRealDataResponseBodyData setPtsInstanceItemStatuss(java.util.List<ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss> ptsInstanceItemStatuss) {
            this.ptsInstanceItemStatuss = ptsInstanceItemStatuss;
            return this;
        }
        public java.util.List<ListPtsPerfRealDataResponseBodyDataPtsInstanceItemStatuss> getPtsInstanceItemStatuss() {
            return this.ptsInstanceItemStatuss;
        }

        public ListPtsPerfRealDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPtsPerfRealDataResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
