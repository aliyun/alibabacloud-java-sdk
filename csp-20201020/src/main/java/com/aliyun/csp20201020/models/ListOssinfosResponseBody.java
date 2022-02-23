// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListOssinfosResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOssinfosResponseBodyData> data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListOssinfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOssinfosResponseBody self = new ListOssinfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOssinfosResponseBody setData(java.util.List<ListOssinfosResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOssinfosResponseBodyData> getData() {
        return this.data;
    }

    public ListOssinfosResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListOssinfosResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListOssinfosResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOssinfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOssinfosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOssinfosResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOssinfosResponseBodyData extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("OxsEndpoint")
        public String oxsEndpoint;

        @NameInMap("VpcEndpoint")
        public String vpcEndpoint;

        public static ListOssinfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOssinfosResponseBodyData self = new ListOssinfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOssinfosResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListOssinfosResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListOssinfosResponseBodyData setOxsEndpoint(String oxsEndpoint) {
            this.oxsEndpoint = oxsEndpoint;
            return this;
        }
        public String getOxsEndpoint() {
            return this.oxsEndpoint;
        }

        public ListOssinfosResponseBodyData setVpcEndpoint(String vpcEndpoint) {
            this.vpcEndpoint = vpcEndpoint;
            return this;
        }
        public String getVpcEndpoint() {
            return this.vpcEndpoint;
        }

    }

}
