// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAppImageResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppImageResponseBody self = new GetAppImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppImageResponseBody setData(java.util.List<GetAppImageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAppImageResponseBodyData> getData() {
        return this.data;
    }

    public GetAppImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppImageResponseBodyData extends TeaModel {
        @NameInMap("Adaptor")
        public String adaptor;

        @NameInMap("AdaptorId")
        public Long adaptorId;

        @NameInMap("AliyunImageId")
        public String aliyunImageId;

        @NameInMap("Apps")
        public String apps;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("DistributeStatus")
        public Integer distributeStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uid")
        public String uid;

        public static GetAppImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppImageResponseBodyData self = new GetAppImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppImageResponseBodyData setAdaptor(String adaptor) {
            this.adaptor = adaptor;
            return this;
        }
        public String getAdaptor() {
            return this.adaptor;
        }

        public GetAppImageResponseBodyData setAdaptorId(Long adaptorId) {
            this.adaptorId = adaptorId;
            return this;
        }
        public Long getAdaptorId() {
            return this.adaptorId;
        }

        public GetAppImageResponseBodyData setAliyunImageId(String aliyunImageId) {
            this.aliyunImageId = aliyunImageId;
            return this;
        }
        public String getAliyunImageId() {
            return this.aliyunImageId;
        }

        public GetAppImageResponseBodyData setApps(String apps) {
            this.apps = apps;
            return this;
        }
        public String getApps() {
            return this.apps;
        }

        public GetAppImageResponseBodyData setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public GetAppImageResponseBodyData setDistributeStatus(Integer distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }
        public Integer getDistributeStatus() {
            return this.distributeStatus;
        }

        public GetAppImageResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppImageResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppImageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppImageResponseBodyData setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public GetAppImageResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAppImageResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
