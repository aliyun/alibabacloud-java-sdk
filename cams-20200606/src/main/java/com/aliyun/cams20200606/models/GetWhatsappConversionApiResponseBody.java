// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappConversionApiResponseBody extends TeaModel {
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
    public java.util.List<GetWhatsappConversionApiResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWhatsappConversionApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappConversionApiResponseBody self = new GetWhatsappConversionApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWhatsappConversionApiResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetWhatsappConversionApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWhatsappConversionApiResponseBody setData(java.util.List<GetWhatsappConversionApiResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetWhatsappConversionApiResponseBodyData> getData() {
        return this.data;
    }

    public GetWhatsappConversionApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWhatsappConversionApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWhatsappConversionApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWhatsappConversionApiResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>7832312</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("PageName")
        public String pageName;

        public static GetWhatsappConversionApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWhatsappConversionApiResponseBodyData self = new GetWhatsappConversionApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWhatsappConversionApiResponseBodyData setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetWhatsappConversionApiResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public GetWhatsappConversionApiResponseBodyData setPageName(String pageName) {
            this.pageName = pageName;
            return this;
        }
        public String getPageName() {
            return this.pageName;
        }

    }

}
