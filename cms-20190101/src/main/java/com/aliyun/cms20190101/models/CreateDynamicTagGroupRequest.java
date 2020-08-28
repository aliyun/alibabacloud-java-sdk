// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateDynamicTagGroupRequest extends TeaModel {
    @NameInMap("TagKey")
    @Validation(required = true)
    public String tagKey;

    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("MatchExpress")
    public java.util.List<CreateDynamicTagGroupRequestMatchExpress> matchExpress;

    @NameInMap("ContactGroupList")
    @Validation(required = true)
    public java.util.List<String> contactGroupList;

    @NameInMap("TemplateIdList")
    public java.util.List<String> templateIdList;

    public static CreateDynamicTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicTagGroupRequest self = new CreateDynamicTagGroupRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateDynamicTagGroupRequestMatchExpress extends TeaModel {
        @NameInMap("TagValueMatchFunction")
        public String tagValueMatchFunction;

        @NameInMap("TagValue")
        public String tagValue;

        public static CreateDynamicTagGroupRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateDynamicTagGroupRequestMatchExpress self = new CreateDynamicTagGroupRequestMatchExpress();
            return TeaModel.build(map, self);
        }

    }

}
