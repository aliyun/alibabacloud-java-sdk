// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListLgfResponseBody extends TeaModel {
    @NameInMap("Lgfs")
    public java.util.List<ListLgfResponseBodyLgfs> lgfs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>34fg57h2gh5783</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLgfResponseBody self = new ListLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLgfResponseBody setLgfs(java.util.List<ListLgfResponseBodyLgfs> lgfs) {
        this.lgfs = lgfs;
        return this;
    }
    public java.util.List<ListLgfResponseBodyLgfs> getLgfs() {
        return this.lgfs;
    }

    public ListLgfResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLgfResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLgfResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLgfResponseBodyLgfs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>256756734345</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>LGF ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LgfId")
        public Long lgfId;

        /**
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("RuleText")
        public String ruleText;

        public static ListLgfResponseBodyLgfs build(java.util.Map<String, ?> map) throws Exception {
            ListLgfResponseBodyLgfs self = new ListLgfResponseBodyLgfs();
            return TeaModel.build(map, self);
        }

        public ListLgfResponseBodyLgfs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLgfResponseBodyLgfs setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListLgfResponseBodyLgfs setLgfId(Long lgfId) {
            this.lgfId = lgfId;
            return this;
        }
        public Long getLgfId() {
            return this.lgfId;
        }

        public ListLgfResponseBodyLgfs setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListLgfResponseBodyLgfs setRuleText(String ruleText) {
            this.ruleText = ruleText;
            return this;
        }
        public String getRuleText() {
            return this.ruleText;
        }

    }

}
