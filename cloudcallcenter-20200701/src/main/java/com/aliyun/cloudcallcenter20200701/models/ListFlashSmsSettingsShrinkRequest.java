// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsSettingsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroupIdList")
    public String skillGroupIdListShrink;

    @NameInMap("SkillGroupName")
    public String skillGroupName;

    public static ListFlashSmsSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsSettingsShrinkRequest self = new ListFlashSmsSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsSettingsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFlashSmsSettingsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlashSmsSettingsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlashSmsSettingsShrinkRequest setSkillGroupIdListShrink(String skillGroupIdListShrink) {
        this.skillGroupIdListShrink = skillGroupIdListShrink;
        return this;
    }
    public String getSkillGroupIdListShrink() {
        return this.skillGroupIdListShrink;
    }

    public ListFlashSmsSettingsShrinkRequest setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
        return this;
    }
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

}
