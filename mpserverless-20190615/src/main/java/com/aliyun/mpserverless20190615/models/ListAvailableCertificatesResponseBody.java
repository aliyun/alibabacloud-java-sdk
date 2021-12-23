// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListAvailableCertificatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAvailableCertificatesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAvailableCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableCertificatesResponseBody self = new ListAvailableCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableCertificatesResponseBody setData(java.util.List<ListAvailableCertificatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAvailableCertificatesResponseBodyData> getData() {
        return this.data;
    }

    public ListAvailableCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvailableCertificatesResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("StatusCode")
        public String statusCode;

        public static ListAvailableCertificatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableCertificatesResponseBodyData self = new ListAvailableCertificatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvailableCertificatesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAvailableCertificatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAvailableCertificatesResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

    }

}
