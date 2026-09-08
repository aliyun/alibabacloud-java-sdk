// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPersonalNumbersOfUserRequest extends TeaModel {
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
     * <p>Indicates whether the phone numbers are associated with the agent. If true, the API queries the list of personal outbound phone numbers associated with the UserId. If false, it queries the list of personal outbound phone numbers that can be associated with but are not currently associated with the UserId. This parameter is typically used together with the AddPersonalNumbersToUser API.</p>
     * <p>This parameter is required.</p>
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
     * <p>Fuzzy matching based on phone number. Optional. Default value is empty if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>0833</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>Agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user-test@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListPersonalNumbersOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalNumbersOfUserRequest self = new ListPersonalNumbersOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonalNumbersOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPersonalNumbersOfUserRequest setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return this.isMember;
    }

    public ListPersonalNumbersOfUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonalNumbersOfUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersonalNumbersOfUserRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListPersonalNumbersOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
