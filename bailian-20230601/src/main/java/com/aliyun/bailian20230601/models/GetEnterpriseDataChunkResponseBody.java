// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataChunkResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetEnterpriseDataChunkResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEnterpriseDataChunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataChunkResponseBody self = new GetEnterpriseDataChunkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataChunkResponseBody setData(java.util.List<GetEnterpriseDataChunkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetEnterpriseDataChunkResponseBodyData> getData() {
        return this.data;
    }

    public GetEnterpriseDataChunkResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEnterpriseDataChunkResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetEnterpriseDataChunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseDataChunkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnterpriseDataChunkResponseBodyData extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Title")
        public String title;

        @NameInMap("TitlePath")
        public String titlePath;

        public static GetEnterpriseDataChunkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseDataChunkResponseBodyData self = new GetEnterpriseDataChunkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseDataChunkResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetEnterpriseDataChunkResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetEnterpriseDataChunkResponseBodyData setTitlePath(String titlePath) {
            this.titlePath = titlePath;
            return this;
        }
        public String getTitlePath() {
            return this.titlePath;
        }

    }

}
