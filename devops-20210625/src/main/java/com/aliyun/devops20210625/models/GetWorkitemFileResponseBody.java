// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemFileResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    @NameInMap("workitemFile")
    public GetWorkitemFileResponseBodyWorkitemFile workitemFile;

    public static GetWorkitemFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemFileResponseBody self = new GetWorkitemFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkitemFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkitemFileResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetWorkitemFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkitemFileResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetWorkitemFileResponseBody setWorkitemFile(GetWorkitemFileResponseBodyWorkitemFile workitemFile) {
        this.workitemFile = workitemFile;
        return this;
    }
    public GetWorkitemFileResponseBodyWorkitemFile getWorkitemFile() {
        return this.workitemFile;
    }

    public static class GetWorkitemFileResponseBodyWorkitemFile extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public Integer size;

        @NameInMap("suffix")
        public String suffix;

        @NameInMap("url")
        public String url;

        public static GetWorkitemFileResponseBodyWorkitemFile build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemFileResponseBodyWorkitemFile self = new GetWorkitemFileResponseBodyWorkitemFile();
            return TeaModel.build(map, self);
        }

        public GetWorkitemFileResponseBodyWorkitemFile setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkitemFileResponseBodyWorkitemFile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkitemFileResponseBodyWorkitemFile setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetWorkitemFileResponseBodyWorkitemFile setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public GetWorkitemFileResponseBodyWorkitemFile setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
