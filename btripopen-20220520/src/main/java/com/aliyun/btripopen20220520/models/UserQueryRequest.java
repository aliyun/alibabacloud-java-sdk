// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UserQueryRequest extends TeaModel {
    @NameInMap("modified_time_greater_or_equal_than")
    public String modifiedTimeGreaterOrEqualThan;

    @NameInMap("third_part_job_no")
    public String thirdPartJobNo;

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

    public UserQueryRequest setThirdPartJobNo(String thirdPartJobNo) {
        this.thirdPartJobNo = thirdPartJobNo;
        return this;
    }
    public String getThirdPartJobNo() {
        return this.thirdPartJobNo;
    }

}
