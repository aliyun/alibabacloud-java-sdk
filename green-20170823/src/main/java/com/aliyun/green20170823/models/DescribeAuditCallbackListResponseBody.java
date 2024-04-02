// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditCallbackListResponseBody extends TeaModel {
    @NameInMap("CallbackList")
    public java.util.List<DescribeAuditCallbackListResponseBodyCallbackList> callbackList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuditCallbackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditCallbackListResponseBody self = new DescribeAuditCallbackListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditCallbackListResponseBody setCallbackList(java.util.List<DescribeAuditCallbackListResponseBodyCallbackList> callbackList) {
        this.callbackList = callbackList;
        return this;
    }
    public java.util.List<DescribeAuditCallbackListResponseBodyCallbackList> getCallbackList() {
        return this.callbackList;
    }

    public DescribeAuditCallbackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditCallbackListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuditCallbackListResponseBodyCallbackList extends TeaModel {
        @NameInMap("CallbackSuggestions")
        public java.util.List<String> callbackSuggestions;

        @NameInMap("CallbackTypes")
        public java.util.List<String> callbackTypes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CryptType")
        public String cryptType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Seed")
        public String seed;

        @NameInMap("Url")
        public String url;

        public static DescribeAuditCallbackListResponseBodyCallbackList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditCallbackListResponseBodyCallbackList self = new DescribeAuditCallbackListResponseBodyCallbackList();
            return TeaModel.build(map, self);
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setCallbackSuggestions(java.util.List<String> callbackSuggestions) {
            this.callbackSuggestions = callbackSuggestions;
            return this;
        }
        public java.util.List<String> getCallbackSuggestions() {
            return this.callbackSuggestions;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setCallbackTypes(java.util.List<String> callbackTypes) {
            this.callbackTypes = callbackTypes;
            return this;
        }
        public java.util.List<String> getCallbackTypes() {
            return this.callbackTypes;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setCryptType(String cryptType) {
            this.cryptType = cryptType;
            return this;
        }
        public String getCryptType() {
            return this.cryptType;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setSeed(String seed) {
            this.seed = seed;
            return this;
        }
        public String getSeed() {
            return this.seed;
        }

        public DescribeAuditCallbackListResponseBodyCallbackList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
