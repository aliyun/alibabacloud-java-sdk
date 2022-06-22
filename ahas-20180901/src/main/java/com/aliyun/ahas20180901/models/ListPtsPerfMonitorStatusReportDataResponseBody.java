// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfMonitorStatusReportDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPtsPerfMonitorStatusReportDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPtsPerfMonitorStatusReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfMonitorStatusReportDataResponseBody self = new ListPtsPerfMonitorStatusReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfMonitorStatusReportDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsPerfMonitorStatusReportDataResponseBody setData(java.util.List<ListPtsPerfMonitorStatusReportDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPtsPerfMonitorStatusReportDataResponseBodyData> getData() {
        return this.data;
    }

    public ListPtsPerfMonitorStatusReportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsPerfMonitorStatusReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsPerfMonitorStatusReportDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss self = new ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPtsPerfMonitorStatusReportDataResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("PtsInstanceItemStatuss")
        public java.util.List<ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss> ptsInstanceItemStatuss;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListPtsPerfMonitorStatusReportDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfMonitorStatusReportDataResponseBodyData self = new ListPtsPerfMonitorStatusReportDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyData setPtsInstanceItemStatuss(java.util.List<ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss> ptsInstanceItemStatuss) {
            this.ptsInstanceItemStatuss = ptsInstanceItemStatuss;
            return this;
        }
        public java.util.List<ListPtsPerfMonitorStatusReportDataResponseBodyDataPtsInstanceItemStatuss> getPtsInstanceItemStatuss() {
            return this.ptsInstanceItemStatuss;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPtsPerfMonitorStatusReportDataResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
