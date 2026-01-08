// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListCustomAudienceResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCustomAudienceResponseBodyData> data;

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

    /**
     * <strong>example:</strong>
     * <p>69</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListCustomAudienceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAudienceResponseBody self = new ListCustomAudienceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAudienceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListCustomAudienceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomAudienceResponseBody setData(java.util.List<ListCustomAudienceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCustomAudienceResponseBodyData> getData() {
        return this.data;
    }

    public ListCustomAudienceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomAudienceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAudienceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCustomAudienceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCustomAudienceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>339**</p>
         */
        @NameInMap("AdAccountId")
        public String adAccountId;

        /**
         * <strong>example:</strong>
         * <p>1720356898</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>339**</p>
         */
        @NameInMap("CustomAudienceId")
        public String customAudienceId;

        /**
         * <strong>example:</strong>
         * <p>custom audience name</p>
         */
        @NameInMap("CustomAudienceName")
        public String customAudienceName;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>239**</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("TokenTotal")
        public Long tokenTotal;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TokenType")
        public String tokenType;

        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <strong>example:</strong>
         * <p>excel</p>
         */
        @NameInMap("UploadType")
        public String uploadType;

        public static ListCustomAudienceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAudienceResponseBodyData self = new ListCustomAudienceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomAudienceResponseBodyData setAdAccountId(String adAccountId) {
            this.adAccountId = adAccountId;
            return this;
        }
        public String getAdAccountId() {
            return this.adAccountId;
        }

        public ListCustomAudienceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCustomAudienceResponseBodyData setCustomAudienceId(String customAudienceId) {
            this.customAudienceId = customAudienceId;
            return this;
        }
        public String getCustomAudienceId() {
            return this.customAudienceId;
        }

        public ListCustomAudienceResponseBodyData setCustomAudienceName(String customAudienceName) {
            this.customAudienceName = customAudienceName;
            return this;
        }
        public String getCustomAudienceName() {
            return this.customAudienceName;
        }

        public ListCustomAudienceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAudienceResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public ListCustomAudienceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomAudienceResponseBodyData setTokenTotal(Long tokenTotal) {
            this.tokenTotal = tokenTotal;
            return this;
        }
        public Long getTokenTotal() {
            return this.tokenTotal;
        }

        public ListCustomAudienceResponseBodyData setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

        public ListCustomAudienceResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListCustomAudienceResponseBodyData setUploadType(String uploadType) {
            this.uploadType = uploadType;
            return this;
        }
        public String getUploadType() {
            return this.uploadType;
        }

    }

}
