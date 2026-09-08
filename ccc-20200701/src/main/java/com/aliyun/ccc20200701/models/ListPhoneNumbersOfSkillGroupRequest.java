// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersOfSkillGroupRequest extends TeaModel {
    /**
     * <p>Indicates whether the phone number is active. This parameter is optional. The default value is empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Active")
    public Boolean active;

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
     * <p>Indicates whether the phone numbers are associated with the skill group. If true, the API queries the list of phone numbers already associated with the specified SkillGroupId. If false, the API queries the list of phone numbers that can be associated with the specified SkillGroupId but are not currently associated. This parameter is typically used together with the AddNumbersToSkillGroup API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMember")
    public Boolean isMember;

    /**
     * <p>Page number for paging. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size for paging. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Performs Fuzzy Matching on phone numbers. This parameter is optional. The default value is empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>0833</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>Skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ListPhoneNumbersOfSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersOfSkillGroupRequest self = new ListPhoneNumbersOfSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersOfSkillGroupRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ListPhoneNumbersOfSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPhoneNumbersOfSkillGroupRequest setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return this.isMember;
    }

    public ListPhoneNumbersOfSkillGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPhoneNumbersOfSkillGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPhoneNumbersOfSkillGroupRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListPhoneNumbersOfSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
