// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFolderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetFolderResponseData data;

    public static GetFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponse self = new GetFolderResponse();
        return TeaModel.build(map, self);
    }

    public static class GetFolderResponseData extends TeaModel {
        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderPath")
        @Validation(required = true)
        public String folderPath;

        public static GetFolderResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseData self = new GetFolderResponseData();
            return TeaModel.build(map, self);
        }

    }

}
