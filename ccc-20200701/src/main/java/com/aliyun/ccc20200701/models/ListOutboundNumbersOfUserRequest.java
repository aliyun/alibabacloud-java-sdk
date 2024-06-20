// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListOutboundNumbersOfUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>[&quot;skillgroup1@ccc-test&quot;,&quot;skillgroup2@ccc-test&quot;]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListOutboundNumbersOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundNumbersOfUserRequest self = new ListOutboundNumbersOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ListOutboundNumbersOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOutboundNumbersOfUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOutboundNumbersOfUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOutboundNumbersOfUserRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public ListOutboundNumbersOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
