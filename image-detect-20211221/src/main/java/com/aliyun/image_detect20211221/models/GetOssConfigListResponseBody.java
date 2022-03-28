// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetOssConfigListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public GetOssConfigListResponseBodyResponse response;

    @NameInMap("Success")
    public String success;

    public static GetOssConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssConfigListResponseBody self = new GetOssConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssConfigListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssConfigListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssConfigListResponseBody setResponse(GetOssConfigListResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetOssConfigListResponseBodyResponse getResponse() {
        return this.response;
    }

    public GetOssConfigListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetOssConfigListResponseBodyResponseList extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("Uid")
        public String uid;

        public static GetOssConfigListResponseBodyResponseList build(java.util.Map<String, ?> map) throws Exception {
            GetOssConfigListResponseBodyResponseList self = new GetOssConfigListResponseBodyResponseList();
            return TeaModel.build(map, self);
        }

        public GetOssConfigListResponseBodyResponseList setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssConfigListResponseBodyResponseList setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetOssConfigListResponseBodyResponseList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetOssConfigListResponseBodyResponseList setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetOssConfigListResponseBodyResponseList setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public GetOssConfigListResponseBodyResponseList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class GetOssConfigListResponseBodyResponse extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetOssConfigListResponseBodyResponseList> list;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetOssConfigListResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetOssConfigListResponseBodyResponse self = new GetOssConfigListResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetOssConfigListResponseBodyResponse setList(java.util.List<GetOssConfigListResponseBodyResponseList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetOssConfigListResponseBodyResponseList> getList() {
            return this.list;
        }

        public GetOssConfigListResponseBodyResponse setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public GetOssConfigListResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetOssConfigListResponseBodyResponse setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
