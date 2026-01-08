// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListPageAdAccountResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPageAdAccountResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>39**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPageAdAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPageAdAccountResponseBody self = new ListPageAdAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPageAdAccountResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListPageAdAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPageAdAccountResponseBody setData(java.util.List<ListPageAdAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPageAdAccountResponseBodyData> getData() {
        return this.data;
    }

    public ListPageAdAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPageAdAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPageAdAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPageAdAccountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>29393****</p>
         */
        @NameInMap("AdAccountId")
        public String adAccountId;

        /**
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("AdAccountName")
        public String adAccountName;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>2030***</p>
         */
        @NameInMap("PageId")
        public String pageId;

        public static ListPageAdAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPageAdAccountResponseBodyData self = new ListPageAdAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPageAdAccountResponseBodyData setAdAccountId(String adAccountId) {
            this.adAccountId = adAccountId;
            return this;
        }
        public String getAdAccountId() {
            return this.adAccountId;
        }

        public ListPageAdAccountResponseBodyData setAdAccountName(String adAccountName) {
            this.adAccountName = adAccountName;
            return this;
        }
        public String getAdAccountName() {
            return this.adAccountName;
        }

        public ListPageAdAccountResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ListPageAdAccountResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

    }

}
