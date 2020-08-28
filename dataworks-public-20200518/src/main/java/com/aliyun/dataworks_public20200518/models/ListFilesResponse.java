// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFilesResponse extends TeaModel {
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
    public ListFilesResponseData data;

    public static ListFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFilesResponse self = new ListFilesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListFilesResponseDataFiles extends TeaModel {
        @NameInMap("ConnectionName")
        @Validation(required = true)
        public String connectionName;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("IsMaxCompute")
        @Validation(required = true)
        public Boolean isMaxCompute;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("CreateUser")
        @Validation(required = true)
        public String createUser;

        @NameInMap("BizId")
        @Validation(required = true)
        public Long bizId;

        @NameInMap("FileFolderId")
        @Validation(required = true)
        public String fileFolderId;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public Integer fileType;

        @NameInMap("UseType")
        @Validation(required = true)
        public Integer useType;

        @NameInMap("FileDescription")
        @Validation(required = true)
        public String fileDescription;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("CurrentVersion")
        @Validation(required = true)
        public Integer currentVersion;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("LastEditUser")
        @Validation(required = true)
        public String lastEditUser;

        @NameInMap("LastEditTime")
        @Validation(required = true)
        public Long lastEditTime;

        @NameInMap("CommitStatus")
        @Validation(required = true)
        public Integer commitStatus;

        public static ListFilesResponseDataFiles build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseDataFiles self = new ListFilesResponseDataFiles();
            return TeaModel.build(map, self);
        }

    }

    public static class ListFilesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Files")
        @Validation(required = true)
        public java.util.List<ListFilesResponseDataFiles> files;

        public static ListFilesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseData self = new ListFilesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
