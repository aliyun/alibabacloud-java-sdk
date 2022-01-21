// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TagGroupList")
    public DescribeDynamicTagRuleListResponseBodyTagGroupList tagGroupList;

    @NameInMap("Total")
    public Integer total;

    public static DescribeDynamicTagRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListResponseBody self = new DescribeDynamicTagRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicTagRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDynamicTagRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDynamicTagRuleListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDynamicTagRuleListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDynamicTagRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDynamicTagRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDynamicTagRuleListResponseBody setTagGroupList(DescribeDynamicTagRuleListResponseBodyTagGroupList tagGroupList) {
        this.tagGroupList = tagGroupList;
        return this;
    }
    public DescribeDynamicTagRuleListResponseBodyTagGroupList getTagGroupList() {
        return this.tagGroupList;
    }

    public DescribeDynamicTagRuleListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList extends TeaModel {
        @NameInMap("ContactGroupList")
        public java.util.List<String> contactGroupList;

        public static DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList self = new DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList setContactGroupList(java.util.List<String> contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }
        public java.util.List<String> getContactGroupList() {
            return this.contactGroupList;
        }

    }

    public static class DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagValueMatchFunction")
        public String tagValueMatchFunction;

        public static DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress self = new DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress();
            return TeaModel.build(map, self);
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress setTagValueMatchFunction(String tagValueMatchFunction) {
            this.tagValueMatchFunction = tagValueMatchFunction;
            return this;
        }
        public String getTagValueMatchFunction() {
            return this.tagValueMatchFunction;
        }

    }

    public static class DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress extends TeaModel {
        @NameInMap("MatchExpress")
        public java.util.List<DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress> matchExpress;

        public static DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress self = new DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress();
            return TeaModel.build(map, self);
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress setMatchExpress(java.util.List<DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress> matchExpress) {
            this.matchExpress = matchExpress;
            return this;
        }
        public java.util.List<DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpressMatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

    }

    public static class DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList extends TeaModel {
        @NameInMap("TemplateIdList")
        public java.util.List<String> templateIdList;

        public static DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList self = new DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList();
            return TeaModel.build(map, self);
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList setTemplateIdList(java.util.List<String> templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public java.util.List<String> getTemplateIdList() {
            return this.templateIdList;
        }

    }

    public static class DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup extends TeaModel {
        @NameInMap("ContactGroupList")
        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList contactGroupList;

        @NameInMap("DynamicTagRuleId")
        public String dynamicTagRuleId;

        @NameInMap("MatchExpress")
        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress matchExpress;

        @NameInMap("MatchExpressFilterRelation")
        public String matchExpressFilterRelation;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TemplateIdList")
        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList templateIdList;

        public static DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup self = new DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setContactGroupList(DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }
        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupContactGroupList getContactGroupList() {
            return this.contactGroupList;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setDynamicTagRuleId(String dynamicTagRuleId) {
            this.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }
        public String getDynamicTagRuleId() {
            return this.dynamicTagRuleId;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setMatchExpress(DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress matchExpress) {
            this.matchExpress = matchExpress;
            return this;
        }
        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupMatchExpress getMatchExpress() {
            return this.matchExpress;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setMatchExpressFilterRelation(String matchExpressFilterRelation) {
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }
        public String getMatchExpressFilterRelation() {
            return this.matchExpressFilterRelation;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup setTemplateIdList(DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroupTemplateIdList getTemplateIdList() {
            return this.templateIdList;
        }

    }

    public static class DescribeDynamicTagRuleListResponseBodyTagGroupList extends TeaModel {
        @NameInMap("TagGroup")
        public java.util.List<DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup> tagGroup;

        public static DescribeDynamicTagRuleListResponseBodyTagGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseBodyTagGroupList self = new DescribeDynamicTagRuleListResponseBodyTagGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeDynamicTagRuleListResponseBodyTagGroupList setTagGroup(java.util.List<DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup> tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public java.util.List<DescribeDynamicTagRuleListResponseBodyTagGroupListTagGroup> getTagGroup() {
            return this.tagGroup;
        }

    }

}
