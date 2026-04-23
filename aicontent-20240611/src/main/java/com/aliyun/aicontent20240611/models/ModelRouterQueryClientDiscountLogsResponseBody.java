// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryClientDiscountLogsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ModelRouterQueryClientDiscountLogsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryClientDiscountLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryClientDiscountLogsResponseBody self = new ModelRouterQueryClientDiscountLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setData(java.util.List<ModelRouterQueryClientDiscountLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModelRouterQueryClientDiscountLogsResponseBodyData> getData() {
        return this.data;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryClientDiscountLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryClientDiscountLogsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("clientId")
        public Long clientId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("deleteTag")
        public Long deleteTag;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("discount")
        public Float discount;

        /**
         * <strong>example:</strong>
         * <p>2025-09-01 00:00:00</p>
         */
        @NameInMap("effectiveTime")
        public String effectiveTime;

        /**
         * <strong>example:</strong>
         * <p>2025-09-10 00:00:00</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("remark")
        public String remark;

        public static ModelRouterQueryClientDiscountLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryClientDiscountLogsResponseBodyData self = new ModelRouterQueryClientDiscountLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setClientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }
        public Long getClientId() {
            return this.clientId;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setDeleteTag(Long deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }
        public Long getDeleteTag() {
            return this.deleteTag;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setDiscount(Float discount) {
            this.discount = discount;
            return this;
        }
        public Float getDiscount() {
            return this.discount;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterQueryClientDiscountLogsResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
