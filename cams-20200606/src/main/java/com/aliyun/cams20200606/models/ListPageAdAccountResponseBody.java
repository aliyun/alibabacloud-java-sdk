// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListPageAdAccountResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, refer to <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPageAdAccountResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The Meta ad account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29393****</p>
         */
        @NameInMap("AdAccountId")
        public String adAccountId;

        /**
         * <p>The name of the ad account.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("AdAccountName")
        public String adAccountName;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The PageId of Messenger.</p>
         * 
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
