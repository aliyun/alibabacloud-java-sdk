// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UserQueryRequest extends TeaModel {
    @NameInMap("modified_time_greater_or_equal_than")
    public String modifiedTimeGreaterOrEqualThan;

    @NameInMap("third_part_corp_id")
    public String thirdPartCorpId;

    @NameInMap("third_part_job_no")
    public String thirdPartJobNo;

    @NameInMap("top_app_key_owner_id")
    public String topAppKeyOwnerId;

    @NameInMap("top_authorized_havana_id")
    public String topAuthorizedHavanaId;

    @NameInMap("top_authorized_user_nick")
    public String topAuthorizedUserNick;

    public static UserQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        UserQueryRequest self = new UserQueryRequest();
        return TeaModel.build(map, self);
    }

    public UserQueryRequest setModifiedTimeGreaterOrEqualThan(String modifiedTimeGreaterOrEqualThan) {
        this.modifiedTimeGreaterOrEqualThan = modifiedTimeGreaterOrEqualThan;
        return this;
    }
    public String getModifiedTimeGreaterOrEqualThan() {
        return this.modifiedTimeGreaterOrEqualThan;
    }

    public UserQueryRequest setThirdPartCorpId(String thirdPartCorpId) {
        this.thirdPartCorpId = thirdPartCorpId;
        return this;
    }
    public String getThirdPartCorpId() {
        return this.thirdPartCorpId;
    }

    public UserQueryRequest setThirdPartJobNo(String thirdPartJobNo) {
        this.thirdPartJobNo = thirdPartJobNo;
        return this;
    }
    public String getThirdPartJobNo() {
        return this.thirdPartJobNo;
    }

    public UserQueryRequest setTopAppKeyOwnerId(String topAppKeyOwnerId) {
        this.topAppKeyOwnerId = topAppKeyOwnerId;
        return this;
    }
    public String getTopAppKeyOwnerId() {
        return this.topAppKeyOwnerId;
    }

    public UserQueryRequest setTopAuthorizedHavanaId(String topAuthorizedHavanaId) {
        this.topAuthorizedHavanaId = topAuthorizedHavanaId;
        return this;
    }
    public String getTopAuthorizedHavanaId() {
        return this.topAuthorizedHavanaId;
    }

    public UserQueryRequest setTopAuthorizedUserNick(String topAuthorizedUserNick) {
        this.topAuthorizedUserNick = topAuthorizedUserNick;
        return this;
    }
    public String getTopAuthorizedUserNick() {
        return this.topAuthorizedUserNick;
    }

}
