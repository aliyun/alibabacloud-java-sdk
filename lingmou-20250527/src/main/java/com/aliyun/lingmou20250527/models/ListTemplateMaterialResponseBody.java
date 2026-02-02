// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListTemplateMaterialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListTemplateMaterialResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>M1Ti7gfj7VGDQgD588hxReiw</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListTemplateMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateMaterialResponseBody self = new ListTemplateMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateMaterialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTemplateMaterialResponseBody setData(java.util.List<ListTemplateMaterialResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTemplateMaterialResponseBodyData> getData() {
        return this.data;
    }

    public ListTemplateMaterialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTemplateMaterialResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateMaterialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTemplateMaterialResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateMaterialResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListTemplateMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateMaterialResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListTemplateMaterialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTemplateMaterialResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListTemplateMaterialResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplateMaterialResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BROADCAST</p>
         */
        @NameInMap("bizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>M1Ti7gfj7VGDQgD588hxReiw</p>
         */
        @NameInMap("templateId")
        public String templateId;

        @NameInMap("templateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>//daily-avatar-property.oss-cn-beijing.aliyuncs.com/material/INPUT_TRAIN_TEMPLATE_UGC_BODY/Mt.CNYEA3CV25QU2/%E5%BA%95%E6%9D%BF3%E6%9B%BF%E6%8D%A2.mp4?Expires=1764326111&amp;OSSAccessKeyId=LTAI5tBRPnF5JkRCid******&amp;Signature=3WU2%2FV2XDaQdt00lkAInK6yr9uk%3D</p>
         */
        @NameInMap("templateURL")
        public String templateURL;

        public static ListTemplateMaterialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateMaterialResponseBodyData self = new ListTemplateMaterialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTemplateMaterialResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListTemplateMaterialResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplateMaterialResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplateMaterialResponseBodyData setTemplateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }
        public String getTemplateURL() {
            return this.templateURL;
        }

    }

}
