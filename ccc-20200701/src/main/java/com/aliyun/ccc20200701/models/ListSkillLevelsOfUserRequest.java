// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillLevelsOfUserRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether to associate with the specified agent. If true, retrieves the skill levels of skill groups associated with the agent. If false, retrieves the list of skill groups that the agent can be associated with but is not currently associated with. The default value is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMember")
    public Boolean isMember;

    /**
     * <p>Page number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Perform fuzzy matching based on skill group name or display name. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>Agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListSkillLevelsOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillLevelsOfUserRequest self = new ListSkillLevelsOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillLevelsOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillLevelsOfUserRequest setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return this.isMember;
    }

    public ListSkillLevelsOfUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillLevelsOfUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillLevelsOfUserRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListSkillLevelsOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
