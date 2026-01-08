// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListDmTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
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
    public java.util.List<ListDmTagResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>hgfh77-gfh55***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListDmTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDmTagResponseBody self = new ListDmTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDmTagResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListDmTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDmTagResponseBody setData(java.util.List<ListDmTagResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDmTagResponseBodyData> getData() {
        return this.data;
    }

    public ListDmTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDmTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDmTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDmTagResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListDmTagResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TagDescription")
        public String tagDescription;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static ListDmTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDmTagResponseBodyData self = new ListDmTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDmTagResponseBodyData setTagDescription(String tagDescription) {
            this.tagDescription = tagDescription;
            return this;
        }
        public String getTagDescription() {
            return this.tagDescription;
        }

        public ListDmTagResponseBodyData setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListDmTagResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
