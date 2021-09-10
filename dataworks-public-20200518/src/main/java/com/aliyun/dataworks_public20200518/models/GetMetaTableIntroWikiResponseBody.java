// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableIntroWikiResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public GetMetaTableIntroWikiResponseBodyData data;

    public static GetMetaTableIntroWikiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableIntroWikiResponseBody self = new GetMetaTableIntroWikiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableIntroWikiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableIntroWikiResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableIntroWikiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableIntroWikiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableIntroWikiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableIntroWikiResponseBody setData(GetMetaTableIntroWikiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableIntroWikiResponseBodyData getData() {
        return this.data;
    }

    public static class GetMetaTableIntroWikiResponseBodyData extends TeaModel {
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Version")
        public Long version;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("Content")
        public String content;

        @NameInMap("Creator")
        public String creator;

        public static GetMetaTableIntroWikiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableIntroWikiResponseBodyData self = new GetMetaTableIntroWikiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableIntroWikiResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaTableIntroWikiResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public GetMetaTableIntroWikiResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableIntroWikiResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetMetaTableIntroWikiResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMetaTableIntroWikiResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

}
