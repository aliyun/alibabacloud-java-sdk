// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileVersionsResponse extends TeaModel {
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
    public ListFileVersionsResponseData data;

    public static ListFileVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsResponse self = new ListFileVersionsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListFileVersionsResponseDataFileVersions extends TeaModel {
        @NameInMap("FileVersion")
        @Validation(required = true)
        public Integer fileVersion;

        @NameInMap("FileContent")
        @Validation(required = true)
        public String fileContent;

        @NameInMap("CommitTime")
        @Validation(required = true)
        public Long commitTime;

        @NameInMap("CommitUser")
        @Validation(required = true)
        public String commitUser;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ChangeType")
        @Validation(required = true)
        public String changeType;

        @NameInMap("IsCurrentProd")
        @Validation(required = true)
        public Boolean isCurrentProd;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("NodeContent")
        @Validation(required = true)
        public String nodeContent;

        @NameInMap("FilePropertyContent")
        @Validation(required = true)
        public String filePropertyContent;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static ListFileVersionsResponseDataFileVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseDataFileVersions self = new ListFileVersionsResponseDataFileVersions();
            return TeaModel.build(map, self);
        }

    }

    public static class ListFileVersionsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("FileVersions")
        @Validation(required = true)
        public java.util.List<ListFileVersionsResponseDataFileVersions> fileVersions;

        public static ListFileVersionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseData self = new ListFileVersionsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
