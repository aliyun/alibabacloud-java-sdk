// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateCurrentItemResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateCurrentItemResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateCurrentItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCurrentItemResponseBody self = new UpdateCurrentItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCurrentItemResponseBody setData(UpdateCurrentItemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCurrentItemResponseBodyData getData() {
        return this.data;
    }

    public UpdateCurrentItemResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateCurrentItemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateCurrentItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCurrentItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateCurrentItemResponseBodyDataItemBackground extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ResourceUuid")
        public String resourceUuid;

        @NameInMap("Scope")
        public String scope;

        public static UpdateCurrentItemResponseBodyDataItemBackground build(java.util.Map<String, ?> map) throws Exception {
            UpdateCurrentItemResponseBodyDataItemBackground self = new UpdateCurrentItemResponseBodyDataItemBackground();
            return TeaModel.build(map, self);
        }

        public UpdateCurrentItemResponseBodyDataItemBackground setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public UpdateCurrentItemResponseBodyDataItemBackground setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public UpdateCurrentItemResponseBodyDataItemBackground setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public UpdateCurrentItemResponseBodyDataItemBackground setResourceUuid(String resourceUuid) {
            this.resourceUuid = resourceUuid;
            return this;
        }
        public String getResourceUuid() {
            return this.resourceUuid;
        }

        public UpdateCurrentItemResponseBodyDataItemBackground setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class UpdateCurrentItemResponseBodyData extends TeaModel {
        @NameInMap("ItemBackground")
        public UpdateCurrentItemResponseBodyDataItemBackground itemBackground;

        public static UpdateCurrentItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCurrentItemResponseBodyData self = new UpdateCurrentItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCurrentItemResponseBodyData setItemBackground(UpdateCurrentItemResponseBodyDataItemBackground itemBackground) {
            this.itemBackground = itemBackground;
            return this;
        }
        public UpdateCurrentItemResponseBodyDataItemBackground getItemBackground() {
            return this.itemBackground;
        }

    }

}
