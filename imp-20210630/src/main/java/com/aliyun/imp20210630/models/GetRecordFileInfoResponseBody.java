// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetRecordFileInfoResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRecordFileInfoResponseBodyResult result;

    public static GetRecordFileInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordFileInfoResponseBody self = new GetRecordFileInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordFileInfoResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetRecordFileInfoResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetRecordFileInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetRecordFileInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordFileInfoResponseBody setResult(GetRecordFileInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRecordFileInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRecordFileInfoResponseBodyResult extends TeaModel {
        @NameInMap("ETag")
        public String ETag;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FileName")
        public String fileName;

        public static GetRecordFileInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRecordFileInfoResponseBodyResult self = new GetRecordFileInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRecordFileInfoResponseBodyResult setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public GetRecordFileInfoResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetRecordFileInfoResponseBodyResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
