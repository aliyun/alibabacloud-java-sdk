// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileVersionResponse extends TeaModel {
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
    public GetFileVersionResponseData data;

    public static GetFileVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionResponse self = new GetFileVersionResponse();
        return TeaModel.build(map, self);
    }

    public static class GetFileVersionResponseData extends TeaModel {
        @NameInMap("FileVersion")
        @Validation(required = true)
        public Integer fileVersion;

        @NameInMap("FileContent")
        @Validation(required = true)
        public String fileContent;

        @NameInMap("FilePropertyContent")
        @Validation(required = true)
        public String filePropertyContent;

        @NameInMap("NodeContent")
        @Validation(required = true)
        public String nodeContent;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("IsCurrentProd")
        @Validation(required = true)
        public Boolean isCurrentProd;

        @NameInMap("ChangeType")
        @Validation(required = true)
        public String changeType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("CommitUser")
        @Validation(required = true)
        public String commitUser;

        @NameInMap("CommitTime")
        @Validation(required = true)
        public Long commitTime;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static GetFileVersionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFileVersionResponseData self = new GetFileVersionResponseData();
            return TeaModel.build(map, self);
        }

    }

}
