// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableIntroWikiResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTableIntroWikiResponseData data;

    public static GetMetaTableIntroWikiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableIntroWikiResponse self = new GetMetaTableIntroWikiResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableIntroWikiResponseData extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("Version")
        @Validation(required = true)
        public Long version;

        @NameInMap("CreatorName")
        @Validation(required = true)
        public String creatorName;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static GetMetaTableIntroWikiResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableIntroWikiResponseData self = new GetMetaTableIntroWikiResponseData();
            return TeaModel.build(map, self);
        }

    }

}
