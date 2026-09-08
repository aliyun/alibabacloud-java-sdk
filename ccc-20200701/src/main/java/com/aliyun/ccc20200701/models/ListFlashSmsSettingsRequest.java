// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsSettingsRequest extends TeaModel {
    /**
     * <p>The ID of the CC instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value ranges from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value ranges from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A list of skill group IDs.</p>
     */
    @NameInMap("SkillGroupIdList")
    public java.util.List<String> skillGroupIdList;

    /**
     * <p>The name of the skill group.</p>
     * 
     * <strong>example:</strong>
     * <p>闪信测试技能组</p>
     */
    @NameInMap("SkillGroupName")
    public String skillGroupName;

    public static ListFlashSmsSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsSettingsRequest self = new ListFlashSmsSettingsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsSettingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFlashSmsSettingsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlashSmsSettingsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlashSmsSettingsRequest setSkillGroupIdList(java.util.List<String> skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public java.util.List<String> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public ListFlashSmsSettingsRequest setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
        return this;
    }
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

}
