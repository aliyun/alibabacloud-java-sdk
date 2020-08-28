// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFoldersResponse extends TeaModel {
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
    public ListFoldersResponseData data;

    public static ListFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersResponse self = new ListFoldersResponse();
        return TeaModel.build(map, self);
    }

    public static class ListFoldersResponseDataFolders extends TeaModel {
        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderPath")
        @Validation(required = true)
        public String folderPath;

        public static ListFoldersResponseDataFolders build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersResponseDataFolders self = new ListFoldersResponseDataFolders();
            return TeaModel.build(map, self);
        }

    }

    public static class ListFoldersResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Folders")
        @Validation(required = true)
        public java.util.List<ListFoldersResponseDataFolders> folders;

        public static ListFoldersResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersResponseData self = new ListFoldersResponseData();
            return TeaModel.build(map, self);
        }

    }

}
