// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataPageImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetEnterpriseDataPageImageResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEnterpriseDataPageImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataPageImageResponseBody self = new GetEnterpriseDataPageImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataPageImageResponseBody setData(java.util.List<GetEnterpriseDataPageImageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetEnterpriseDataPageImageResponseBodyData> getData() {
        return this.data;
    }

    public GetEnterpriseDataPageImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEnterpriseDataPageImageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetEnterpriseDataPageImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseDataPageImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnterpriseDataPageImageResponseBodyData extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("PageId")
        public String pageId;

        @NameInMap("Width")
        public Integer width;

        public static GetEnterpriseDataPageImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseDataPageImageResponseBodyData self = new GetEnterpriseDataPageImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseDataPageImageResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetEnterpriseDataPageImageResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetEnterpriseDataPageImageResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public GetEnterpriseDataPageImageResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
