// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListInspectRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInspectRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListInspectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectRuleResponseBody self = new ListInspectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInspectRuleResponseBody setData(ListInspectRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInspectRuleResponseBodyData getData() {
        return this.data;
    }

    public ListInspectRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInspectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInspectRuleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListInspectRuleResponseBodyDataResult extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Matcher")
        public String matcher;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Type")
        public String type;

        public static ListInspectRuleResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListInspectRuleResponseBodyDataResult self = new ListInspectRuleResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListInspectRuleResponseBodyDataResult setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListInspectRuleResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInspectRuleResponseBodyDataResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListInspectRuleResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListInspectRuleResponseBodyDataResult setMatcher(String matcher) {
            this.matcher = matcher;
            return this;
        }
        public String getMatcher() {
            return this.matcher;
        }

        public ListInspectRuleResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInspectRuleResponseBodyDataResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListInspectRuleResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInspectRuleResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListInspectRuleResponseBodyDataResult> result;

        @NameInMap("TotalItem")
        public Integer totalItem;

        public static ListInspectRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInspectRuleResponseBodyData self = new ListInspectRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInspectRuleResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListInspectRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInspectRuleResponseBodyData setResult(java.util.List<ListInspectRuleResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListInspectRuleResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListInspectRuleResponseBodyData setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}
