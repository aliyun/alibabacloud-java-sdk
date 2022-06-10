// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListLgfResponseBody extends TeaModel {
    @NameInMap("Lgfs")
    public java.util.List<ListLgfResponseBodyLgfs> lgfs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 意图ID
        @NameInMap("IntentId")
        public Long intentId;

        // LGF ID
        @NameInMap("LgfId")
        public Long lgfId;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // LGF规则
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
