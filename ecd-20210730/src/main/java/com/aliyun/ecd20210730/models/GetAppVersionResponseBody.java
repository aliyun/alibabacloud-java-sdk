// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppVersionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionResponseBody self = new GetAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppVersionResponseBody setData(GetAppVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppVersionResponseBodyData getData() {
        return this.data;
    }

    public GetAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppVersionResponseBodyData extends TeaModel {
        @NameInMap("AdaptorComplishCount")
        public Long adaptorComplishCount;

        @NameInMap("AdaptorCount")
        public Long adaptorCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ListAdaptor")
        public String listAdaptor;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Uid")
        public String uid;

        public static GetAppVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppVersionResponseBodyData self = new GetAppVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppVersionResponseBodyData setAdaptorComplishCount(Long adaptorComplishCount) {
            this.adaptorComplishCount = adaptorComplishCount;
            return this;
        }
        public Long getAdaptorComplishCount() {
            return this.adaptorComplishCount;
        }

        public GetAppVersionResponseBodyData setAdaptorCount(Long adaptorCount) {
            this.adaptorCount = adaptorCount;
            return this;
        }
        public Long getAdaptorCount() {
            return this.adaptorCount;
        }

        public GetAppVersionResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppVersionResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppVersionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppVersionResponseBodyData setListAdaptor(String listAdaptor) {
            this.listAdaptor = listAdaptor;
            return this;
        }
        public String getListAdaptor() {
            return this.listAdaptor;
        }

        public GetAppVersionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppVersionResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetAppVersionResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetAppVersionResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetAppVersionResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetAppVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
