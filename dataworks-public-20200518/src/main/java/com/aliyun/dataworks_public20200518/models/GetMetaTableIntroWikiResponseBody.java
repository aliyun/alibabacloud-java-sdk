// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableIntroWikiResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetMetaTableIntroWikiResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableIntroWikiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableIntroWikiResponseBody self = new GetMetaTableIntroWikiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableIntroWikiResponseBody setData(GetMetaTableIntroWikiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableIntroWikiResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableIntroWikiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableIntroWikiResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableIntroWikiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class GetMetaTableIntroWikiResponseBodyData extends TeaModel {
        /**
         * <p>The description of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>\# Business requirements\n\n\&lt;a name=\&quot;xiw5n\&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the metatable was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1584444247000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The name of the user who creates the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The time when the metatable was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1584444247000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static GetMetaTableIntroWikiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableIntroWikiResponseBodyData self = new GetMetaTableIntroWikiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableIntroWikiResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMetaTableIntroWikiResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableIntroWikiResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetMetaTableIntroWikiResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
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

    }

}
