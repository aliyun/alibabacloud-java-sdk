// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFbMessengerPagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetFbMessengerPagesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>sd2dsd-33*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFbMessengerPagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFbMessengerPagesResponseBody self = new GetFbMessengerPagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFbMessengerPagesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetFbMessengerPagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFbMessengerPagesResponseBody setData(java.util.List<GetFbMessengerPagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFbMessengerPagesResponseBodyData> getData() {
        return this.data;
    }

    public GetFbMessengerPagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFbMessengerPagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFbMessengerPagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFbMessengerPagesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17433243434</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>iwhalecloud-2</p>
         */
        @NameInMap("PageName")
        public String pageName;

        public static GetFbMessengerPagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFbMessengerPagesResponseBodyData self = new GetFbMessengerPagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFbMessengerPagesResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public GetFbMessengerPagesResponseBodyData setPageName(String pageName) {
            this.pageName = pageName;
            return this;
        }
        public String getPageName() {
            return this.pageName;
        }

    }

}
