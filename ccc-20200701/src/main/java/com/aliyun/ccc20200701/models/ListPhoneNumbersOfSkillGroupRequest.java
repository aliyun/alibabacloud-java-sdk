// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersOfSkillGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Active")
    public Boolean active;

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
     * <p>true</p>
     */
    @NameInMap("IsMember")
    public Boolean isMember;

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
     * <p>0833</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
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
