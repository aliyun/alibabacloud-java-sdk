// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("TagGroupList")
    @Validation(required = true)
    public DescribeDynamicTagRuleListResponseTagGroupList tagGroupList;

    public static DescribeDynamicTagRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListResponse self = new DescribeDynamicTagRuleListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpressMatchExpress extends TeaModel {
        @NameInMap("TagValueMatchFunction")
        @Validation(required = true)
        public String tagValueMatchFunction;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpressMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpressMatchExpress self = new DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpressMatchExpress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpress extends TeaModel {
        @NameInMap("MatchExpress")
        @Validation(required = true)
        public java.util.List<DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpressMatchExpress> matchExpress;

        public static DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpress self = new DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDynamicTagRuleListResponseTagGroupListTagGroupTemplateIdList extends TeaModel {
        @NameInMap("TemplateIdList")
        @Validation(required = true)
        public java.util.List<String> templateIdList;

        public static DescribeDynamicTagRuleListResponseTagGroupListTagGroupTemplateIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseTagGroupListTagGroupTemplateIdList self = new DescribeDynamicTagRuleListResponseTagGroupListTagGroupTemplateIdList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDynamicTagRuleListResponseTagGroupListTagGroup extends TeaModel {
        @NameInMap("DynamicTagRuleId")
        @Validation(required = true)
        public String dynamicTagRuleId;

        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("MatchExpressFilterRelation")
        @Validation(required = true)
        public String matchExpressFilterRelation;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("MatchExpress")
        @Validation(required = true)
        public DescribeDynamicTagRuleListResponseTagGroupListTagGroupMatchExpress matchExpress;

        @NameInMap("TemplateIdList")
        @Validation(required = true)
        public DescribeDynamicTagRuleListResponseTagGroupListTagGroupTemplateIdList templateIdList;

        public static DescribeDynamicTagRuleListResponseTagGroupListTagGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseTagGroupListTagGroup self = new DescribeDynamicTagRuleListResponseTagGroupListTagGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDynamicTagRuleListResponseTagGroupList extends TeaModel {
        @NameInMap("TagGroup")
        @Validation(required = true)
        public java.util.List<DescribeDynamicTagRuleListResponseTagGroupListTagGroup> tagGroup;

        public static DescribeDynamicTagRuleListResponseTagGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDynamicTagRuleListResponseTagGroupList self = new DescribeDynamicTagRuleListResponseTagGroupList();
            return TeaModel.build(map, self);
        }

    }

}
