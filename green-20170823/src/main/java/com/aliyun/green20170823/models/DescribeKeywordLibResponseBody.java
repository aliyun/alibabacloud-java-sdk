// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeKeywordLibResponseBody extends TeaModel {
    @NameInMap("KeywordLibList")
    public java.util.List<DescribeKeywordLibResponseBodyKeywordLibList> keywordLibList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKeywordLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeywordLibResponseBody self = new DescribeKeywordLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeywordLibResponseBody setKeywordLibList(java.util.List<DescribeKeywordLibResponseBodyKeywordLibList> keywordLibList) {
        this.keywordLibList = keywordLibList;
        return this;
    }
    public java.util.List<DescribeKeywordLibResponseBodyKeywordLibList> getKeywordLibList() {
        return this.keywordLibList;
    }

    public DescribeKeywordLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeywordLibResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeKeywordLibResponseBodyKeywordLibList extends TeaModel {
        @NameInMap("BizTypes")
        public java.util.List<String> bizTypes;

        @NameInMap("Category")
        public String category;

        @NameInMap("Code")
        public String code;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Language")
        public String language;

        @NameInMap("LibType")
        public String libType;

        @NameInMap("MatchMode")
        public String matchMode;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ServiceModule")
        public String serviceModule;

        @NameInMap("Source")
        public String source;

        public static DescribeKeywordLibResponseBodyKeywordLibList build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeywordLibResponseBodyKeywordLibList self = new DescribeKeywordLibResponseBodyKeywordLibList();
            return TeaModel.build(map, self);
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setBizTypes(java.util.List<String> bizTypes) {
            this.bizTypes = bizTypes;
            return this;
        }
        public java.util.List<String> getBizTypes() {
            return this.bizTypes;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setLibType(String libType) {
            this.libType = libType;
            return this;
        }
        public String getLibType() {
            return this.libType;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setServiceModule(String serviceModule) {
            this.serviceModule = serviceModule;
            return this;
        }
        public String getServiceModule() {
            return this.serviceModule;
        }

        public DescribeKeywordLibResponseBodyKeywordLibList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
